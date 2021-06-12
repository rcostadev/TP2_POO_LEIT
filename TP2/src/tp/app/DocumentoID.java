package tp.app;

public class DocumentoID {
	private String codigo;
	private TipoDocumento tipo;
	
	
	/*
	 * Metodos especiais
	 * */
	
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public DocumentoID(String codigo, TipoDocumento tipo) {
		
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}
	
}
