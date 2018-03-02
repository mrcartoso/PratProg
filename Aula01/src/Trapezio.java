
public class Trapezio extends Figura {
	public double baseM;
	public double base;
	public double altura;
	
	public double getBaseM() {
		return baseM;
	}

	public void setBaseM(double baseM) {
		this.baseM = baseM;
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
	
	public Trapezio(double baseM, double base, double altura) {
		this.baseM = baseM;
		this.base = base;
		this.altura = altura;
	}

	@Override
	double area() {
		
		return ((baseM+base)*altura)/2;
	}

	@Override
	double perimetro() {		
		return ((baseM+base)*altura)/2;

	}

}
