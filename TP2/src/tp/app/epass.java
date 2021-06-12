package tp.app;
import java.time.LocalDate;
public abstract class epass {
	private long codigo;
	private double saldo;
	private double precoViagem;
	private LocalDate dataCarrega;
	private LocalDate dataValidade;
	private static long ultCodigo;
	
	
	 static { if (Long.valueOf(ultCodigo) == null) { ultCodigo = 0; } } 
	 
	
	
	/*
	 * Construtores
	 * */
	public epass(double saldo) {
		super();
		this.saldo = saldo;
		this.precoViagem = 0;
		this.dataCarrega = LocalDate.now();
		this.codigo = this.ultCodigo;
	    ultCodigo =+ 1;
	}
	
	
	
	
	public epass(double saldo, LocalDate dataCarrega, LocalDate dataValidade) {
		super();
		this.saldo = saldo;
		this.precoViagem = 0;
		this.dataCarrega = dataCarrega;
		this.dataValidade = dataValidade;
		this.codigo = this.ultCodigo;
	    ultCodigo =+ 1;
	}


	public epass(double saldo, LocalDate dataCarrega) {
		super();
		this.saldo = saldo;
		this.dataCarrega = LocalDate.now();
	}


	/* 						*
	 * Metodos especiais	*
	 * */
	public long getCodigo() {
		return codigo;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getPrecoViagem() {
		return precoViagem;
	}
	public void setPrecoViagem(double precoViagem) {
		this.precoViagem = precoViagem;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
	public LocalDate getDataCarrega() {
		return dataCarrega;
	}
	
	public void setDataCarrega(LocalDate DataCarrega) {
		this.dataCarrega = DataCarrega;
	}
	
	
	
	
	/*
	 * Metodos a serem implementados
	 * */
	
}
