package tp.app;

import java.time.LocalDate;

public class PassTurista extends PassSazonal implements TituloTransporte{
	
	private Duracao duracao;
	
	/*
	 * 		METODOS ESPECIAS
	 * 
	 * */
	
	public PassTurista(double saldo, LocalDate dataCarrega, LocalDate dataValidade, Duracao duracao) {
		super(saldo, dataCarrega, dataValidade);
		
		this.duracao = duracao;
		
		
	}
	
	public PassTurista(double saldo, LocalDate dataCarrega, LocalDate dataValidade, PassTurista outro) {
		super(saldo, dataCarrega, dataValidade);
		
		PassTurista NewPass = outro;
		
	}

	public Duracao getDuracao() {
		return duracao;
	}

	public void setDuracao(Duracao duracao) {
		this.duracao = duracao;
	}

	
	
	
	/*
	 * 		METODOS A SER IMPLEMENTADOS
	 * 
	 * */
	
	@Override
	public void Carregar(double valor) {
		System.out.println("Este tipo de epass não pode ser carregado");
		
	}

	
	
	@Override
	public void PagarViagem() {
		if(super.getSaldo() < 50) {
			System.out.println("Saldo insuficiente");
		}else {
			super.setSaldo(getSaldo()-50);
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
}
