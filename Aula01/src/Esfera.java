public class Esfera extends Circulo implements Volume {

	public Esfera(double raio) {
		super(raio);
	}

	@Override
	public double volume() {
		return (4*pi*Math.pow(raio, 3))/3;
	}

}
