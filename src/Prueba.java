
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoblementeEnlazada e= new ListaDoblementeEnlazada();
		e.agregarAlInicio(1);
		e.agregarAlInicio(2);
		e.agregarAlInicio(3);
		e.agregarAlInicio(4);
		e.mostrarInicioFin();
		
		System.out.println("==============================");
		
		e.agregarAlFinal(1);
		e.agregarAlFinal(2);
		e.agregarAlFinal(3);
		e.agregarAlFinal(4);
		e.mostrarFinInicio();

	}

}
