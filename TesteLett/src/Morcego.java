
public class Morcego extends Mamiferos implements Voadores  {

	public Morcego() {
		this.setIdade(0);
		this.setTamanho(1);
		this.setCorPelo("Preto");
	}

	@Override
	public String Som() {
		
		String resp = "Farfalho";
		return resp;
		
	}

	@Override
	public int Altitude() {

		int resp = 15;
		return resp;
		
	}
	public  void imprimir() {
		System.out.println("Animal: Morcego");
		super.imprimir();
		System.out.println("Qual é a altitude de voo deste animal? "+ this.Altitude()+ " metros" );
	}

}
