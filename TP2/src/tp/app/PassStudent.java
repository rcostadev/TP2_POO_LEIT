package tp.app;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class PassStudent  extends PassStandard implements TituloTransporte {
	
	private int ano;
	private String escola;
	private ArrayList<Zona> zona;
	private int ViagemGratis;
	
	
	/*
	 * 	METODOS A SEREM IMPLEMENTADOS
	 * */
	
	
	public void viagar() {
		if(super.getSaldo() < 20 && this.ViagemGratis < 0) {
			System.out.println("Por Favor carrega o teu cartão");
		} else {
			System.out.println("Passe estudante OK");
			this.ViagemGratis -=1;
			super.setSaldo(super.getSaldo() - 20);
		}
	}
	

	
	
	@Override
	public void Carregar(double valor) {
		if (valor < 20) {
			System.out.println("Valor Invalido");
		}else {
			super.setSaldo(getSaldo()+ valor);
			super.setDataCarrega(LocalDate.now());
			super.setDataValidade(getDataCarrega().plusDays(30));
			System.out.println(super.getDataValidade());
			System.out.println("Carregamento com sucesso!");
			System.out.println("O seu saldo é de: "+super.getSaldo());
			this.ViagemGratis = 4;
		}
		
	}


	@Override
	public void PagarViagem() {
		int valor = 20;
		if(super.getSaldo() < 20){
			System.out.println("Saldo insuficiete");
			
		}else{
			System.out.println("Saldo "+super.getSaldo());
			super.setSaldo(super.getSaldo() - valor);
			super.setNumeroViagem(getNumeroViagem()+1);
			if(super.getNumeroViagem() == 10) {
				super.setPontos(1);
				super.setNumeroViagem(0);
			}
			System.out.println("Pagamento com sucesso!");
			System.out.println("Pontos "+ super.getPontos());
			System.out.println("Numero de viagem " +super.getNumeroViagem());
			System.out.println("Saldo Atual "+super.getSaldo());
		}
		
	}


	@Override
	public boolean CheckValidade() {
		
		if(super.getDataValidade().isBefore(LocalDate.now())) {
			return false;
		}
		
		return true;
	}


	@Override
	public boolean passarSaldo(PassStandard outro,double valor) {
		if (super.getSaldo() < valor) {
			System.out.println("Valor invalido");
			return false;
		}else {
			super.setSaldo(getSaldo()- valor);
			outro.setSaldo(outro.getSaldo()+ valor);
			System.out.println("Valor Transferido");
			System.out.println("Saldo Quem envia "+ super.getSaldo());
			System.out.println("Saldo Resetor "+ outro.getSaldo());
		}
		
		
		return false;
	}
	
	public boolean viagensFree() {
		
		if(this.getViagemGratis() >0) {
			this.setViagemGratis(getViagemGratis()-1);
			System.out.println("Realizas uma viagem Gratis. Tens: "
								+this.getViagemGratis()+" Viagem gratis");
			return true;
		}
		return false;
	}
	
	public boolean ViagensFreePontos() {
		
		if (super.getPontos() >= 100) {
			super.setPontos(getPontos()-40);
			System.out.println("Realizas uma viagem Gratis com pontos. Tens: "
					+super.getPontos()+" Pontos");
			return true;
		}
		
		return false;
	}
	
	//METODO PARA VERIFICAR AS SONAS
	public boolean verificarZona(String zo){
        boolean verifZona = false;

       for (int i=0; i < zona.size(); i++){

           verifZona = zo.equalsIgnoreCase(zona.get(i).getNome());
       }

        return verifZona;
    }
	
	
	/*
	 *  Construtores
	 *  
	 * */
	
	
	public PassStudent(double saldo, LocalDate dataCarrega, LocalDate dataValidade,int ano,String escola,ArrayList<Zona> zona) {
		super(saldo, dataCarrega, dataValidade);
		this.ano = ano;
		this.escola = escola;
		this.ViagemGratis = 4;
		this.zona = zona;
	}
	
	
public PassStudent(double saldo, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID, 
					LocalDate ddn, String nome, String email, String CodigoDoc, TipoDocumento tipoDoc, 
					String Morada,int Telefone,int ano,String escola,ArrayList<Zona> zona ) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email, CodigoDoc, tipoDoc, Morada, Telefone);
		this.ano = ano;
		this.escola = escola;
		this.ViagemGratis = 4;
		this.zona = zona;
	}

	public PassStudent(double saldo, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID,
						LocalDate ddn, String nome, String email,int ano,String escola, ArrayList<Zona> zona) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email);
		
		this.ano = ano;
		this.escola = escola;
		this.ViagemGratis = 4;
		this.zona = zona;
	}




			/*					*
			 * Metodos especiais*
			 * 					*
			 * */				
	
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public ArrayList getZona() {
		return zona;
	}
	
	public int getViagemGratis() {
		return ViagemGratis;
	}

	public void setViagemGratis(int viagemGratis) {
		ViagemGratis = viagemGratis;
	}




	@Override
	public String toString() {
		return "PassStudent [ano=" + ano + ", escola=" + escola + ", zona=" + zona + "]";
	}

	
}