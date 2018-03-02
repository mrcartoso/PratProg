import java.util.ArrayList;

public class Geometria {
	public static void main(String args[]) {
		
		
		ArrayList<Figura> lista = new ArrayList<>();
	
		lista.add(new Quadrado(5d,5d));
		lista.add(new Retangulo(5d, 8d));
		lista.add(new Triangulo(5d, 4d));
		lista.add(new Losango(5d,5d));
		lista.add(new Circulo(10d));
		lista.add(new Trapezio(5d, 3d, 4d));
		lista.add(new Cubo(5d,5d,5d));
		lista.add(new Cilindro(5d, 10d));
		lista.add(new Esfera(5d));
		lista.add(new Piramide(4d,5d));

		for(Figura lis:lista) {
				System.out.println(lis.area());				
				
		}
		System.out.println("--------------------------------");
		
		for(Figura lis:lista) {
			System.out.println(lis.perimetro());				
			
		}
		System.out.println("--------------------------------");
		
		for(Figura lis:lista) {
			if(lis instanceof Diagonal) {
				System.out.println(((Diagonal) lis).diagonal());
			}	
		}
		System.out.println("--------------------------------");
		for(Figura lis:lista) {
			if(lis instanceof Volume) {
				System.out.println(((Volume) lis).volume());
			}	
		}
	}
}
