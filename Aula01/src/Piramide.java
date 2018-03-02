public class Piramide extends Triangulo implements Volume {

	public Piramide(double base, double altura) {
		super(base, altura);
	}
	@Override
	double perimetro() {
		return 3*getBase();
	}
	@Override
	public double volume() {
		return (((perimetro()/2)*(base/2))*altura)/3;
	}

}
