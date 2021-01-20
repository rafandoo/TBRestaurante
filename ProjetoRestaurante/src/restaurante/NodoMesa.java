package restaurante;
public class NodoMesa {
	
	public NodoMesa(Mesa m) {
		this.mesa = m;
		this.proximo = null;
	}
	// Atributos
	private NodoMesa proximo;
	private Mesa mesa;
	
	
	// Getters e Setters
	public NodoMesa getProximoMesa() {
		return proximo;
	}
	
	
	public void setProximoMesa(NodoMesa proximo) {
		this.proximo = proximo;
	}
	
	
	public Mesa getMesa() {
		return mesa;
	}
	
	
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
}
