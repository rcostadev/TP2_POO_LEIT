package tp.app;

import java.time.LocalDate;

public class PassJovem extends PassStandard implements TituloTransporte{

	public PassJovem(double saldo, LocalDate dataCarrega, LocalDate dataValida, DocumentoID docID, LocalDate ddn, String nome, String email) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email);
		
	}
	
	@Override
	public void Carregar(double valor) {
		if(valor < 0) {
			System.out.println("Numero invalido");
		}else {
			
			super.setSaldo(getSaldo()+valor);
			super.setDataCarrega(LocalDate.now());
			super.setDataValidade(getDataCarrega().plusDays(30));
		}
		
		
	}

	@Override
	public void PagarViagem() {
		if(this.CheckValidade() == false) {
			System.out.println("O seu passe ja desativou.");
		}else {
			super.setNumeroViagem(getNumeroViagem()+1);
			if(super.getNumeroViagem() == 10) {
				super.setPontos(getPontos()+1);
				super.setNumeroViagem(0);
			}
		}
		
	}

	@Override
	public boolean CheckValidade() {
		if(super.getDataValidade().isBefore(LocalDate.now())) {
			System.out.println("Inspirou");
			return false;
		}
		System.out.println("Valido");
		return true;
		
	}

	@Override
	public boolean passarSaldo(PassStandard outro, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean ViagensFree() {
		
		if (super.getPontos() >= 100) {
			super.setPontos(getPontos()-40);
			System.out.println("Realizas uma viagem Gratis com pontos. Tens: "
					+super.getPontos()+" Pontos");
			return true;
		}
		
		return false;
	}
	
}
