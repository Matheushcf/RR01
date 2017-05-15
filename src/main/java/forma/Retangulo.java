package forma;

public class Retangulo implements FormaGeometrica {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double area() {
		double a = base * altura;
		return a;
	}
	
}
