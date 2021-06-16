package tp.app;

public enum Duracao {
	
	Um(1,500),Tres(3,700),Sete(7,1500);
	
	private int valor;
	private int dia;
	Duracao(int dia,int valor) {
		this.valor = valor;
		this.dia = dia;
	}
	
	public int getValor() {
		return valor;
	}
	
	public int getDia() {
		return dia;
	}
	
	
	
	
}
