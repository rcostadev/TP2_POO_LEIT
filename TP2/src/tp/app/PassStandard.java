package tp.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class PassStandard extends epass {

	private Titular titular;
	private int pontos;
	private int numeroViagem;
	private String ChaveValida;
	
	
	/*
	 * 	CLASSES A SEREM IMPLEMENTADOS
	 * */
	
	public String gerarChave(String nome, LocalDate ddn,long codigo) {
		StringBuilder strB = new StringBuilder(nome);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("uuu-MM-dd");
		
		nome = strB.reverse().toString();
		
		String aux = nome.substring(0, 5);
		String auxUlt = nome.substring(nome.length()- 5, nome.length());
		String strdata = ddn.format(format);
		
		
		this.ChaveValida = auxUlt+aux+strdata+codigo;
		this.ChaveValida = this.ChaveValida.toUpperCase();
		
		return this.ChaveValida;
		
	}
	
	
	/*
	 * Construtor
	 *  
	 * */
	
	
	  public PassStandard(double saldo, LocalDate dataCarrega,LocalDate dataValidade) { 
		  super(saldo, dataCarrega,dataValidade); 
		  
		  this.pontos = 0;
		  this.numeroViagem = 0;
		  
	  
	  }
	  
	  public PassStandard(double saldo, LocalDate dataCarrega,LocalDate dataValida ,DocumentoID docID, LocalDate ddn , String nome ,String email) { 
		  super(saldo, dataCarrega,dataValida);
		  this.pontos = 0;
		  this.numeroViagem = 0;
		  this.titular = new Titular( docID, nome,ddn,email);
		  this.ChaveValida =  gerarChave(nome,ddn,this.getCodigo()); 
	  
	  }
	  
	  public PassStandard(double saldo, LocalDate dataCarrega,LocalDate dataValida , DocumentoID docID, 
			  LocalDate ddn , String nome ,String email, String CodigoDoc, TipoDocumento tipoDoc, String Morada, int Telefone) {
		  super(saldo, dataCarrega,dataValida);
	  
		  this.pontos = 0;
		  this.numeroViagem = 0;
		  this.titular = new Titular(docID, nome, ddn, Morada,email, Telefone);
	  }
	 
	
	/*
	 * Metodos especias
	 * */

	public Titular getTitular() {
		return titular;
	}

	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int ponto) {
		this.pontos = ponto;
	}

	public int getNumeroViagem() {
		return numeroViagem;
	}
	
	public void setNumeroViagem(int NumeroViagem) {
		this.numeroViagem = NumeroViagem;
	}
	

	public String getChaveValida() {
		return ChaveValida;
	}

	public void setChaveValida(String chaveValida) {
		ChaveValida = chaveValida;
	}
	
	
	
	




}
