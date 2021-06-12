package tp.app;

import java.time.LocalDate;

public class PassTerIdade extends PassStandard{

	public PassTerIdade(double saldo, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID, LocalDate ddn, String nome, String email) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email);
	}

		
}
