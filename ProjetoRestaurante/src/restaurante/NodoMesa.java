package restaurante;

public class NodoMesa {
	
	
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
