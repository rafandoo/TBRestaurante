package restaurante;

public class Filas {
	
	
	// Atributos
	private int primeiroBuffet;
	private int ultimoBuffet;
	private int[] filaBuffet;
	private int totalBuffet;
	
	private int primeiroCaixa;
	private int ultimoCaixa;
	private int[] filaCaixa;
	private int totalCaixa;
	
	private int totalDoAlmoco;
	
	
	// Declaração do construtor
	public Filas() {
		
		this.filaBuffet = new int [10];
		this.primeiroBuffet = 0;
		this.ultimoBuffet = 0;
		this.totalBuffet = 0;
		
		this.filaCaixa = new int [10];
		this.primeiroCaixa = 0;
		this.ultimoCaixa = 0;
		this.totalCaixa = 0;
		
		this.totalDoAlmoco = 0;
	}

	
	// Getters e Setters
	public int getTotalBuffet() {
		return totalBuffet;
	}


	public void setTotalBuffet(int totalBuffet) {
		this.totalBuffet = totalBuffet;
	}


	public int getTotalCaixa() {
		return totalCaixa;
	}


	public void setTotalCaixa(int totalCaixa) {
		this.totalCaixa = totalCaixa;
	}


	public int getTotalDoAlmoco() {
		return totalDoAlmoco;
	}


	public void setTotalDoAlmoco(int totalDoAlmoco) {
		this.totalDoAlmoco = totalDoAlmoco;
	}
	
	
	// Método fila do buffet
	public boolean filaCheiaBuffet() {
		
		return (this.totalBuffet == this.filaBuffet.length);
	}
	
	
	public boolean filaVaziaBuffet() {
		
		return (this.totalBuffet == 0);
	}
	
	
	public void fimFilaBuffet(int num) {
		
		if (this.filaCheiaBuffet()) {
			
			System.out.println("Fila Cheia!");
		} else {
			
			this.filaBuffet [this.ultimoBuffet] = num;
			this.ultimoBuffet = ((this.ultimoBuffet + 1) % this.filaBuffet.length);
			this.totalBuffet++;
		}
	}
	
	
	public int sairFilaBuffet() {
		
		if (this.filaVaziaBuffet()) {
			
			System.out.println("Fila Vazia!");
			return (0);
		} else {
			
			int aux = filaBuffet [this.primeiroBuffet];
			
			this.primeiroBuffet = ((this.primeiroBuffet + 1) % this.filaBuffet.length);
			this.totalBuffet--;
			
			return aux;
		}
	}
	
	
	// Método fila do caixa
	public boolean filaCheiaCaixa() {
		
		return (this.totalCaixa == this.filaCaixa.length);
	}
	
	
	public boolean filaVaziaCaixa() {
		
		return (this.totalCaixa == 0);
	}
	
	
	public void fimFilaCaixa(int num) {
		
		if (this.filaCheiaCaixa()) {
			
			System.out.println("Fila Cheia!");
		} else {
			
			this.filaCaixa [this.ultimoCaixa] = num;
			this.ultimoCaixa = ((this.ultimoCaixa + 1) % this.filaCaixa.length);
			this.totalCaixa++;
		}
	}
	
	
	public int sairFilaCaixa() {
		
		if (this.filaVaziaCaixa()) {
			
			System.out.println("Fila Vazia!");
			return (0);
		} else {
			
			int aux = filaCaixa [this.primeiroCaixa];
			
			this.primeiroCaixa = ((this.primeiroCaixa + 1) % this.filaCaixa.length);
			this.totalCaixa--;
			
			return aux;
		}
	}
}
