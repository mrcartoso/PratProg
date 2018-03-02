
public class Losango extends Poligono {

	public double base;
	public double altura;
	
	public Losango(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double area() {
		return base*altura;
	}
	@Override
	double perimetro() {
		return (2*base)+(2*altura);
	}
}
