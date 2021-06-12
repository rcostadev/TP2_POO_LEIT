package tp.app.text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import tp.app.DocumentoID;
import tp.app.PassFuncionario;
import tp.app.TipoDocumento;

public class FuncioText {

	public static void main(String[] args) {
		
		TipoDocumento td = TipoDocumento.CNI;
		
		LocalDate datanasc = null;
		LocalDate dataC = null;
		LocalDate dataV = null;
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuu");
		
		datanasc = LocalDate.parse("10-06-2001",format);
		dataC = LocalDate.parse("10-06-2021",format);
		dataV = LocalDate.parse("10-06-2021",format);
		
		DocumentoID d1 = new DocumentoID("123",td);
		
		
		PassFuncionario f1 = new PassFuncionario(0,dataC,dataV,d1,datanasc,"Ricardo Costa","@gmail","123",td,"Morada",9876);

		f1.Carregar(10);
		f1.CheckValidade();
		
		
		
	}

}
