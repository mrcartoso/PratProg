
public class Triangulo extends Poligono {

	public double base;
	public double altura;
	
	public Triangulo(double base, double altura) {
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
		return (base*altura)/2;
	}
	@Override
	double perimetro() {
		return 3*base;
	}
}
