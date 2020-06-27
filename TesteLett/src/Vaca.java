
public class Vaca extends Mamiferos{

	public Vaca() {
		this.setIdade(0);
		this.setTamanho(100);
		this.setCorPelo("Malhada");
	}

	@Override
	public String Som() {
		
		String resp = "Mugido";
		return resp;
		
	}
	public  void imprimir() {
		System.out.println("Animal: Vaca");
		super.imprimir();
	}
}
