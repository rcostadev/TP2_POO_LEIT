package tp.app;

public interface TituloTransporte {
	
	public void Carregar(double valor);
	public void PagarViagem();
	public boolean CheckValidade();
	public boolean passarSaldo(PassStandard outro,double valor);
}
