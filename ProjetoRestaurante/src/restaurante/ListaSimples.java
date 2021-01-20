package restaurante;

public class ListaSimples {
	
	
	Mesa mesa = new Mesa();
	
	
	// Atributos
	private int quantidadePedido;
	private NodoCliente primeiro;
	private NodoCliente ultimo;
	
	private int quantidadeMesa;
	private NodoMesa primeiroMesa;
	private NodoMesa ultimoMesa;
	
	
	// Declaração do construtor
	public ListaSimples() {
		
		this.primeiro = null;
		this.ultimo = null;
		
		this.quantidadePedido = 0;
		
		this.primeiroMesa = null;
		this.ultimoMesa = null;
		
		this.quantidadeMesa = 0;
	}

	
	// Getters e Setters
	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public int getQuantidadePedido() {
		return quantidadePedido;
	}


	public void setQuantidadePedido(int quantidadePedido) {
		this.quantidadePedido = quantidadePedido;
	}


	public NodoCliente getPrimeiro() {
		return primeiro;
	}


	public void setPrimeiro(NodoCliente primeiro) {
		this.primeiro = primeiro;
	}


	public NodoCliente getUltimo() {
		return ultimo;
	}


	public void setUltimo(NodoCliente ultimo) {
		this.ultimo = ultimo;
	}


	public int getQuantidadeMesa() {
		return quantidadeMesa;
	}


	public void setQuantidadeMesa(int quantidadeMesa) {
		this.quantidadeMesa = quantidadeMesa;
	}


	public NodoMesa getPrimeiroMesa() {
		return primeiroMesa;
	}


	public void setPrimeiroMesa(NodoMesa primeiroMesa) {
		this.primeiroMesa = primeiroMesa;
	}


	public NodoMesa getUltimoMesa() {
		return ultimoMesa;
	}


	public void setUltimoMesa(NodoMesa ultimoMesa) {
		this.ultimoMesa = ultimoMesa;
	}
	
	
	// Métodos
	public boolean listaVazia() {
		
		return (this.primeiro == null);
	}
	
	
	public void listaInicio(Pedido cliente) {
		
		NodoCliente novoNodo = new NodoCliente();
		
		if (this.listaVazia()) {
			
			this.ultimo = novoNodo;
		}
		
		novoNodo.setProximo(this.primeiro);
		
		this.primeiro = novoNodo;
		this.quantidadePedido++;
	}
	
	
	public double pesquisaQuantia(String numeroCliente) {
		
		NodoCliente recente = this.primeiro;
		
		while ((recente != null) && (!recente.getCliente().getPedido().equals(numeroCliente))) {
			
			recente = recente.getProximo();
		}
		
		return (recente.getCliente().getQuantia());
	}
	
	
	public String pesquisaMesa(String numeroCliente) {
		
		NodoCliente recente = this.primeiro;
		
		while ((recente != null) && (!recente.getCliente().getPedido().equals(numeroCliente))) {
			
			recente = recente.getProximo();
		}
		
		return (recente.getCliente().getM());
	}
	
	
	public boolean pagamentoPedido(String numeroCliente) {
		
		NodoCliente recente = this.primeiro;
		NodoCliente anterior = null;
		
		if (this.listaVazia()) {
			
			return false;
		} else {
			
			while ((recente != null) && (!recente.getCliente().getPedido().equals(numeroCliente))) {
				
				anterior = recente;
				recente = recente.getProximo();
			}
			
			if (recente == this.primeiro) {
				
				if (this.primeiro == this.ultimo) {
					this.ultimo = null;
				}
				
				this.primeiro = this.primeiro.getProximo();
			} else {
				
				if (recente == this.ultimo) {
					
					this.ultimo = anterior;
				}
				
				anterior.setProximo(recente.getProximo());
			}
			
			return true;
		}
	}
	
	
	public String mostrarPedido() {
		
		String dados = "";
		
		if (this.listaVazia()) {
			
			dados = "Lista Vazia!";
		} else {
			
			NodoCliente recente = this.primeiro;
			
			while (recente != null) {
				
				dados += " - " + recente.getCliente().getPedido();	
				recente = recente.getProximo();
				}
		}
		
		return dados;
	}
	
	
	// Métodos para as mesas
	public boolean listaVaziaMesa() {
		
		return (this.primeiroMesa == null);
	}
	
	
	public void listaInicio(Mesa mesa) {
		
		NodoMesa novoNodoMesa = new NodoMesa();
		
		if (this.listaVaziaMesa()) {
			
			this.ultimoMesa = novoNodoMesa;
		}
		
		novoNodoMesa.setProximoMesa(this.primeiroMesa);
		this.primeiroMesa = novoNodoMesa;
		
		novoNodoMesa = null;
		this.quantidadeMesa++;
	}
	
	
	public void listaFinal(Mesa mesa) {
		
		NodoMesa novoNodoMesa = new NodoMesa();
		
		if (this.listaVaziaMesa()) {
			
			this.primeiroMesa = novoNodoMesa;
		} else {
			
			this.ultimoMesa.setProximoMesa(novoNodoMesa);
		}
		
		this.ultimoMesa = novoNodoMesa;
		this.quantidadeMesa++;
	}
	
	
	public boolean mesaOcupada(String numeroMesa) {
		
		NodoMesa recenteMesa = this.primeiroMesa;
		NodoMesa anteriorMesa = null;
		
		if (this.listaVaziaMesa()) {
			
			return false;
		} else {
			
			while ((recenteMesa != null) && (!recenteMesa.getMesa().getMesas().equals(numeroMesa))) {
				
				anteriorMesa = recenteMesa;
				recenteMesa = recenteMesa.getProximoMesa();
			}
			
			if (recenteMesa == this.primeiroMesa) {
				
				if (this.primeiroMesa == this.ultimoMesa) {
					
					this.ultimoMesa = null;
				}
				
				this.primeiroMesa = this.primeiroMesa.getProximoMesa();
			} else {
				
				if (recenteMesa == this.ultimoMesa) {
					
					this.ultimoMesa = anteriorMesa;
				}
				
				anteriorMesa.setProximoMesa(recenteMesa.getProximoMesa());
			}
			
			this.quantidadeMesa--;
			
			return true;
		}
	}
	
	
	public boolean pesquisarPedido(String numeroMesa) {
		
		NodoMesa recenteRR = this.primeiroMesa;
		
		while ((recenteRR != null) && (!recenteRR.getMesa().getMesas().equals(numeroMesa))) {
			
			recenteRR = recenteRR.getProximoMesa();
		}
		
		return true;
	}
	
	
	public String mostrarMesa() {
		
		String dados = "";
		NodoMesa recente = this.primeiroMesa;
		
		while (recente != null) {
			
			dados += recente.getMesa().getMesas() + " - ";
			recente = recente.getProximoMesa();
		}
		
		return dados;
	}
	
}
