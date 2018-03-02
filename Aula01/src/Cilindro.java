public class Cilindro extends Circulo implements Volume {

	public double altura;
	
	public Cilindro(double raio,double altura) {
		super(raio);
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double volume() {
		return pi*altura*Math.pow(raio, 3);
	}

}
