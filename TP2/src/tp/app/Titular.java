package tp.app;
import java.time.LocalDate;
public class Titular {
	private DocumentoID docID;
	private String nome;
	private LocalDate ddn;
	private String morada;
	private String email;
	private int Telefone;
	
	/*
	 * Construtores
	 * */
	
	public Titular(String CodigoDoc, TipoDocumento TipoDoc, String nome, LocalDate ddn, String email ) {
		docID = new DocumentoID(CodigoDoc,TipoDoc) ;
		this.nome = nome;
		this.ddn = ddn;
		this.email = email;
		
	}
	
	
	
	public Titular(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telefone) {
		super();
		this.docID = docID;
		this.nome = nome;
		this.ddn = ddn;
		this.morada = morada;
		this.email = email;
		Telefone = telefone;
	}
	
	public Titular(DocumentoID docID, String nome, LocalDate ddn, String email) {
		super();
		this.docID = docID;
		this.nome = nome;
		this.ddn = ddn;
		this.email = email;
		
	}
	/*
	 * Metodos especiais
	 * */
	
	public DocumentoID getDocID() {
		return docID;
	}
	public String getNome() {
		return nome;
	}
	public LocalDate getDdn() {
		return ddn;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
}
