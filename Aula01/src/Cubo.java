public class Cubo extends Quadrado implements Volume {

	public double prof;
	
	public Cubo(double base, double altura,double prof) {
		super(base, altura);
		this.prof = prof;
	}
	
	
	public double getProf() {
		return prof;
	}


	public void setProf(double prof) {
		this.prof = prof;
	}


	@Override
	public double volume() {
		return base*altura*prof;
	}

}
