
public abstract class Aves extends Animal {

	private boolean temOvos = true;
	private String corPena;
	
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	public String isTemOvos() {
		if(temOvos==true) {
			return "Sim";
		}else return "Não";
	}
public  void imprimir() {
		
		super.imprimir();
		System.out.println("Cor do animal:"+ this.getCorPena());
		System.out.println("Este animal poe ovos? "+ this.isTemOvos());
	}

}
