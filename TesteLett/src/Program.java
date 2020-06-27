public class Program {

	public static void main(String[] args) {
		
		System.out.println("Bem-Vindo ao teste do Alexsander para a Lett!");
		System.out.println(" ");
		System.out.println("Criei construtores que já apresentam dados dos animais");
		System.out.println(" ");
		Animal a = new Vaca();
		Animal b = new Morcego();
		Animal c = new Pato();
		Animal d = new Galinha();
		a.imprimir();
		System.out.println(" ");
		b.imprimir();
		System.out.println(" ");
		c.imprimir();
		System.out.println(" ");
		d.imprimir();
		System.out.println(" ");
		System.out.println("Obrigado!");
		System.exit(0);
	}
}
