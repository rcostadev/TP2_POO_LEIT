package tp.app;

import java.time.LocalDate;

public class PassFast extends PassSazonal{
	
	private double saldoCartao;
	private String NomeEvento;

	public PassFast(double saldo, LocalDate dataCarrega, LocalDate dataValidade, double saldoCartao, String evento) {
		super(saldo, dataCarrega, dataValidade);
		this.NomeEvento = evento;
		this.saldoCartao = saldoCartao;
	}
	
	public PassFast(double saldo, LocalDate dataCarrega, LocalDate dataValidade,String evento) {
		super(saldo, dataCarrega, dataValidade);
		this.NomeEvento = evento;
		this.saldoCartao = 0;
	}
	
	public PassFast(double saldo, LocalDate dataCarrega, LocalDate dataValidade,PassFast outro) {
		super(saldo, dataCarrega, dataValidade);
		PassFast NovoPass = outro;
	}
	
}
