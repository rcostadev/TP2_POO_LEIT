package tp.app;

import java.time.LocalDate;

public class PassTurista extends PassSazonal{
	
	private Duracao duracao;
	
	public PassTurista(double saldo, LocalDate dataCarrega, LocalDate dataValidade, Duracao duracao) {
		super(saldo, dataCarrega, dataValidade);
		
		this.duracao = duracao;
		
	}
	
}
