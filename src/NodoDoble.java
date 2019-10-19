public class NodoDoble{
	int dato;
	NodoDoble siguiente;
	NodoDoble anterior;
	public NodoDoble(int el, NodoDoble s, NodoDoble a) {
		dato= el;
		siguiente = s;
		anterior = a;
	}
	public NodoDoble(int el) {
		this(el,null,null);
		
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public NodoDoble getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}
	public NodoDoble getAnterior() {
		return anterior;
	}
	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}
	
}