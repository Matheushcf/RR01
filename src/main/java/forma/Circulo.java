package forma;

public class Circulo implements FormaGeometrica {

	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	@Override
	public double area() {
		double a = Math.PI * raio;
		return a;
	}
	
}
