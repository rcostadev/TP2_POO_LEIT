package tp.app;

import java.time.LocalDate;

public class PassJovem extends PassStandard{

	public PassJovem(double saldo, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID, LocalDate ddn, String nome, String email) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email);
		
	}
	
	
}
