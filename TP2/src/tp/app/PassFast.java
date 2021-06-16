package tp.app;

import java.time.LocalDate;

public class PassFast extends PassSazonal implements TituloTransporte, CartaoPagamento{
	
	private double saldoCartao;
	private String NomeEvento;
	
	/*
	 * 		METODOS ESPECIAIS	
	 * 
	 * */

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

	public double getSaldoCartao() {
		return saldoCartao;
	}

	public void setSaldoCartao(double saldoCartao) {
		this.saldoCartao = saldoCartao;
	}

	public String getNomeEvento() {
		return NomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		NomeEvento = nomeEvento;
	}

	
	/*
	 * 		METODOS A SER IMPLEMENTADOS
	 * 
	 * */
	
	@Override
	public void Carregar(double valor) {
		if (valor < 0) {
			System.out.println("Valor Invalido");
		}else {
			super.setSaldo(valor+getSaldo());
			this.setSaldoCartao(getSaldoCartao()-valor);
		}
		
	}

	@Override
	public void PagarViagem() {
		if(this.CheckValidade() == false) {
			System.out.println("Validade do cartão INSPIROU");
		}else {
			System.out.println("Podes Viajar");
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
	public boolean passarSaldo(PassStandard outro, double valor) {
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

	@Override
	public boolean Pagar(double Valor) {
		if(Valor > this.saldoCartao) {
			System.out.println("Saldo Insuficiente");
			return false;
		}
		this.setSaldoCartao(getSaldoCartao()-Valor);
		return true;
	}

	@Override
	public void Creditar(double Valor) {
		if(Valor<0) {
			System.out.println("Invalido");
		}else {
			this.setSaldoCartao(getSaldoCartao()-Valor);
		}
		
	}
	
	
	
	
	
}
