package forma;

public class Main {
	public static void main(String[] args) {
		
		Circulo c = new Circulo(5);
		Retangulo r = new Retangulo(7,4);
		Quadrado q = new Quadrado(7);
		Triangulo t = new Triangulo(7,4);
		
		System.out.println("Area do Circulo: " + c.area());
		System.out.println("Area do Retangulo: " + r.area());
		System.out.println("Area do Quadrado: " + q.area());
		System.out.println("Area do Triangulo: " + t.area());
	}
}
