
public abstract class Animal {

	private int idade;
	private int tamanho; 
	
	public abstract String Som();

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public  void imprimir() {
		
		System.out.println("Dados do animal:");
		System.out.println("Idade do animal:"+ this.getIdade()+ " meses");
		System.out.println("Tamanho do animal:" + this.getTamanho() + " cm" );
		System.out.println("Som do animal:"+ this.Som());
	}
}
