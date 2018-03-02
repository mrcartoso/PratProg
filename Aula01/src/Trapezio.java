public class Trapezio extends Figura {

	public double baseM;
	public double basem;
	public double altura;
	
	public Trapezio(double baseM, double basem, double altura) {
		this.baseM = baseM;
		this.basem = basem;
		this.altura = altura;
	}
	public double getBaseM() {
		return baseM;
	}
	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}

	public double getBasem() {
		return basem;
	}
	public void setBasem(double basem) {
		this.basem = basem;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	double area() {
		return ((baseM+basem)*altura)/2;
	}
	
	@Override
	double perimetro() {
		return ((baseM+basem)*altura)/2;
	}
}
