package tp.app;

import java.time.LocalDate;

public abstract class PassSazonal extends epass {
	private String ChaveValida;
	private int sq;

	public PassSazonal(double saldo, LocalDate dataCarrega, LocalDate dataValidade) {
		super(saldo, dataCarrega, dataValidade);
		
		
	} 
	
	
}
