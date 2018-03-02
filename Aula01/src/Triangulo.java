
public class Triangulo extends Poligono {
	public double base;
	public double altura;
	
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

		
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	double base() {
		
		return getBase();
	}
	double altura() {
		
		return getAltura();
		}	
	
	@Override
	double area() {
		return (base()*altura())/2;
	}
	
    @Override
    double perimetro() {
        
        return 3*base;
    }


}
