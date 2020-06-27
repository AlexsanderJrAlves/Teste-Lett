
public abstract class Mamiferos extends Animal {

	private boolean amamentam = true;
	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	public String isAmamentam() {
		if(amamentam==true) {
			return "Sim";
		}else return "Não";
	}
	public  void imprimir() {
		
		super.imprimir();
		System.out.println("Cor do animal:"+ this.getCorPelo());
		System.out.println("Este animal amanenta? "+ this.isAmamentam());
	}
}