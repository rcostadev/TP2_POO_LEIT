package tp.app;

import java.time.LocalDate;

import tp.ui.TituloTransporte;

public class PassFuncionario extends PassStandard implements TituloTransporte{

	public PassFuncionario(double saldo, LocalDate dataCarrega, LocalDate dataValida,
			DocumentoID docID, LocalDate ddn, String nome, String email, String CodigoDoc, TipoDocumento tipoDoc,
			String Morada, int Telefone) {
		super(saldo, dataCarrega, dataValida, docID, ddn, nome, email, CodigoDoc, tipoDoc, Morada, Telefone);
		
	}

	@Override
	public void Carregar(double valor) {
		if(valor < 0) {
			System.out.println("Numero invalido");
		}else {
			
			super.setSaldo(getSaldo()+valor);
			System.out.println("Carregamento com sucesso!!");
			System.out.println("Saldo Atual: "+ super.getSaldo());
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

	
	
	
	
	
}
