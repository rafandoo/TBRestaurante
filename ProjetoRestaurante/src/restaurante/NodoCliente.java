package restaurante;

public class NodoCliente {
	
	
	// Atributos
	private NodoCliente proximo;
	private Pedido cliente;
	
	
	// Getters e Setters
	public NodoCliente getProximo() {
		return proximo;
	}
	
	
	public void setProximo(NodoCliente proximo) {
		this.proximo = proximo;
	}
	
	
	public Pedido getCliente() {
		return cliente;
	}
	
	
	public void setCliente(Pedido cliente) {
		this.cliente = cliente;
	}
	
}
