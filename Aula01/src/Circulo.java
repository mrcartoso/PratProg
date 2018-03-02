
public class Circulo extends Figura {

	static double pi = 3.1456;
	public double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double area() {
		return (pi*Math.pow(raio,2));
	}
	@Override
	double perimetro() {
		return 2*pi*raio;
	}
}
