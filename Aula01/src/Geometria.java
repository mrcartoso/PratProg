import java.util.ArrayList;

public class Geometria {
	public static void main(String args[]) {
	
		ArrayList<Figura> lista = new ArrayList<>();
	
		lista.add(new Circulo(10));
		lista.add(new Quadrado(5,5));
		lista.add(new Retangulo(7,5));
		lista.add(new Triangulo(5,7));
		lista.add(new Losango(5,6));
		lista.add(new Trapezio(5,3,4));
	    lista.add(new Cubo(4,4,4));
	    lista.add(new Cilindro(5,9));
	    lista.add(new Esfera(6));
	    lista.add(new Piramide(4,5));
		
		for(Figura lis:lista) {
			System.out.println(lis.area());
		}
		
		//Separação dos valores
		System.out.println("---------------------------------");
		
		for(Figura lis:lista) {
			System.out.println(lis.perimetro());
		}
		
		//Separação dos valores
		System.out.println("---------------------------------");
		
		for(Figura lis:lista) {
            if(lis instanceof Diagonal) {
                System.out.println(((Diagonal) lis).diagonal());
            }
		}
		
		//Separação dos valores
		System.out.println("---------------------------------");
		
		for(Figura lis:lista) {
            if(lis instanceof Volume) {
                System.out.println(((Volume) lis).volume());
            }
		}
		
	}
}
