
public class Galinha extends Aves{

	public Galinha() {
		this.setIdade(0);
		this.setTamanho(1);
		this.setCorPena("Vermelha");
	}

	@Override
	public String Som() {
		
		String resp = "Carcarejo";
		return resp;
		
	}
	public  void imprimir() {
		System.out.println("Animal: Galinha");
		super.imprimir();
	}
}
