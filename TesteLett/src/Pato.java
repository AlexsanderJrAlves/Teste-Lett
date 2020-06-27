
public class Pato extends Aves implements Voadores {

	public Pato() {
		this.setIdade(0);
		this.setTamanho(1);
		this.setCorPena("Branco");
	}

	@Override
	public String Som() {
		
		String resp = "Grasnido";
		return resp;
		
	}

	@Override
	public int Altitude() {

		int resp = 50;
		return resp;
		
	}
	public  void imprimir() {
		System.out.println("Animal: Pato");
		super.imprimir();
		System.out.println("Qual é a altitude de voo deste animal? "+ this.Altitude()+ " metros" );
	}

}
