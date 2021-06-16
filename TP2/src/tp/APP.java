package tp;

import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import tp.app.PassStudent;
import tp.app.DocumentoID;
import tp.app.TipoDocumento;
import tp.app.Zona;


public class APP {
	public static void main(String[] args) {
		Zona z1 = new Zona(1,"Morada");
		ArrayList<Zona> lz1 = new ArrayList();
		TipoDocumento td = TipoDocumento.CNI;
		lz1.add(z1);
		LocalDate datanasc = null;
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuu");
		datanasc = LocalDate.parse("10-06-2001",format);
		DocumentoID d1 = new DocumentoID("123",td);
		LocalDate d3 = LocalDate.of(2021, 07, 3);
		PassStudent p1 = new PassStudent(100,datanasc,d3,10,"Pintim",lz1);
		PassStudent p2 = new PassStudent(100,datanasc,d3,d1,d3,"Ricardo Pires","@gmail",10,"Pintim",lz1);
		
		System.out.println(p2.getChaveValida());
		p1.gerarChave("Ricardo Costa", d3,p1.getCodigo());

		
		
	}
}
