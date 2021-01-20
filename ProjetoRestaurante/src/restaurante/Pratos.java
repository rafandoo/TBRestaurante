package restaurante;

public class Pratos {
	
	
	// Atributos
	private int primeiroPrato;
	private int ultimoPrato;
	private int[] armazenarPratos;
	private int quantidadePrato;
	
	
	// Declaração do construtor
	public Pratos() {
		
		this.armazenarPratos = new int[17];
		
		this.primeiroPrato = 0;
		this.ultimoPrato = 0;
		this.quantidadePrato = 0;
	}

	
	// Getter e Setter
	public int getQuantidadePrato() {
		return quantidadePrato;
	}


	public void setQuantidadePrato(int quantidadePrato) {
		this.quantidadePrato = quantidadePrato;
	}
	
	
	// Métodos
	public boolean pratoCheio() {
		
		return (this.quantidadePrato == 16);
	}
	
	
	public boolean pratoVazio() {
		
		return (this.quantidadePrato == 0);
	}
	
	
	public int tirarPrato() {
		
		if (this.pratoVazio()) {
			
			System.out.println("Sem pratos!");
			return (0);
			
		} else {
			
			int aux = armazenarPratos [this.primeiroPrato];
			
			this.primeiroPrato = ((this.primeiroPrato + 1) % this.armazenarPratos.length);
			this.quantidadePrato--;
			
			return aux;
		}
	}
	
	
	public void colocarPrato(int num) {
		
		if (this.pratoCheio()) {
			
			System.out.println("Pilha de pratos cheia!");
			
		} else {
			
			this.armazenarPratos [this.ultimoPrato] = num;
			this.ultimoPrato = ((this.ultimoPrato + 1) % this.armazenarPratos.length);
			this.quantidadePrato++;
		}
	}
	
	
}
