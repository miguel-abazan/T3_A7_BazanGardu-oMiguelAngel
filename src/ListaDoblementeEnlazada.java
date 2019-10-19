
public class ListaDoblementeEnlazada {
	private NodoDoble inicio;
	private NodoDoble fin;
	
	
	public ListaDoblementeEnlazada() {
		inicio=fin=null;
		
	}
	public boolean estaVacia() {
		return inicio==null;
	}
	public void agregarAlFinal(int el) {
		if(!estaVacia()) {
			fin=new NodoDoble(el, null, fin);
			fin.anterior.siguiente=fin;
			
		}else {
			inicio=fin = new NodoDoble(el);
			
		}
	}
	public void agregarAlInicio(int el) {
		if(!estaVacia()) {
			inicio=new NodoDoble(el, inicio, null);
			inicio.siguiente.anterior=inicio;
			
		}else {
			inicio=fin = new NodoDoble(el);
		}
	}
	public void mostrarInicioFin() {
		if(!estaVacia()) {
			String datos ="<=>";
			NodoDoble aux=inicio;
			while(aux !=null) {
				datos =datos + "["+aux.dato+"]<=>";
				aux = aux.siguiente;
			}
			System.out.println(datos);
		}
	}
	public void mostrarFinInicio() {
		if(!estaVacia()) {
			String datos ="<=>";
			NodoDoble aux=fin;
			while(aux !=null) {
				datos =datos + "["+aux.dato+"]<=>";
				aux = aux.anterior;
			}
			System.out.println(datos);
		}
	}

}
