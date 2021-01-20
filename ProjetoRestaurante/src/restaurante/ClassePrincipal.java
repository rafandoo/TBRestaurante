package restaurante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClassePrincipal {
	
	
	public static float bebidas() {
		
		int opcao;
		
		System.out.println("****************************************");
		System.out.println("***              BEBIDAS             ***");
		System.out.println("*****                              *****");
		System.out.println("** 1. Água sem gás          ...R$4,00 **");
		System.out.println("** 2. Schwepps Citrus 350ml ...R$5,00 **");
		System.out.println("** 3. Guaraná 600ml         ...R$7,00 **");
		System.out.println("** 4. Sukita 2 litros      ...R$10,00 **");
		System.out.println("*****                              *****");
		System.out.println("****************************************");
		System.out.println("** Digite uma opção: ");
		try (Scanner scanner = new Scanner(System.in)) {
			opcao = scanner.nextInt();
		}
		
		if (opcao == 1) {
			
			return (4.00f);
		}
		
		if (opcao == 2) {
			
			return (5.00f);
		}
		
		if (opcao == 3) {
			
			return (7.00f);
		}
		
		if (opcao == 4) {
			
			return (10.00f);
		}
		return opcao;
	}
	
	
	// Métodos
	private static void clearBuffer(Scanner scanner) {
		
		if (scanner.hasNextLine()) {
			
			scanner.nextLine();
		}
	}
	
	
	private static String number(double n) {
		
		return (new DecimalFormat("#,##0.00").format(n));
	}
	
	
	public static char menu() {
		
		String dados;
		Scanner entrada = new Scanner(System.in);
		tela();
		
		System.out.println("*****************************");
		System.out.println("***    FUNCIONALIDADES    ***");
		System.out.println("*****                   *****");
		System.out.println("** 1. Abrir                **");
		System.out.println("** 2. Buffet               **");
		System.out.println("** 3. Caixa                **");
		System.out.println("** 4. Controle fluxo       **");
		System.out.println("** 5. Administração        **");
		System.out.println("** 6. Sair do programa     **");
		System.out.println("*****                   *****");
		System.out.println("*****************************");
		System.out.println("** Digite uma opção: ");
		dados = entrada.next();
		
		clearBuffer(entrada);
		return dados.charAt(0);
	}
	
	
	private static void tela() {
		
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Filas filaBuffet = new Filas();
		Pratos pratos = new Pratos();
		ListaSimples buffet = new ListaSimples();
		Controle controle = new Controle();
		
		Pedido cliente;
		Mesa mesa;
		
		char escolha;
		boolean abrirRestaurante = false;
		
		
		do {
			
			escolha = menu();
			tela();
			
			switch(escolha) {
				
				case '1':
					
					if (abrirRestaurante == false) {
						
						System.out.println("Abrir restaurante? ...Sim(S)/Não(N)");
						String opcao = entrada.next().toUpperCase();
						
						if (opcao.charAt(0) == 'S') {
							
							controle.setValorDoBuffet(20.00f);
							int x = 1;
							
							while (x != 11) {
								
								if (x == 1) {
									
									mesa = new Mesa();
									mesa.setMesas("1");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 2) {
									
									mesa = new Mesa();
									mesa.setMesas("2");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 3) {
									
									mesa = new Mesa();
									mesa.setMesas("3");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 4) {
									
									mesa = new Mesa();
									mesa.setMesas("4");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 5) {
									
									mesa = new Mesa();
									mesa.setMesas("5");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 6) {
									
									mesa = new Mesa();
									mesa.setMesas("6");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 7) {
									
									mesa = new Mesa();
									mesa.setMesas("7");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 8) {
									
									mesa = new Mesa();
									mesa.setMesas("8");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 9) {
									
									mesa = new Mesa();
									mesa.setMesas("9");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								if (x == 10) {
									
									mesa = new Mesa();
									mesa.setMesas("10");
									buffet.listaInicio(mesa);
									filaBuffet.fimFilaBuffet(x);
									pratos.colocarPrato(x);
									x++;
								}
								
								System.out.println("Restaurante aberto!");
								abrirRestaurante = true;
							}
						} else {
							
							System.out.println("Restaurante fechado!");
						}
					} else {
						
						System.out.println("Restaurante aberto!");
					}
					
					
				case '2':
					
					if (abrirRestaurante) {
						
						cliente = new Pedido();
						mesa = new Mesa();
						
						if (filaBuffet.filaVaziaBuffet()) {
							
							System.out.println("Fila do buffet vazia!");
						} else {
							
							System.out.println("Buffet livre à R$" + number(controle.getValorDoBuffet()) + " por pessoa");
							System.out.println("\nNúmero do pedido: ");
							
							cliente.setPedido(entrada.next());
							
							System.out.println("Pedir bebida? ...Sim(S)/Não(N)");
							String opcao = entrada.next().toUpperCase();
							
							if (opcao.charAt(0) == 'S') {
								
								cliente.setQuantia(bebidas() + controle.getValorDoBuffet());
							} else {
								
								cliente.setQuantia(controle.getValorDoBuffet());
							}
							
							boolean menu = true;
							
							while (menu) {
								
								System.out.println("\nMesas disponíveis no restaurante: ");
								System.out.println(buffet.mostrarMesa());
								
								System.out.println("\nEscolha uma mesa: ");
								String m = entrada.next();
								
								if (buffet.mesaOcupada(m)) {
									
									cliente.setM(m);
									
									System.out.println("Mesa ocupada!");
									menu = false;
									
								} else {
									
									System.out.println("Mesa ocupada!");
								}
								
								controle.setPessoasAtendidas(controle.getPessoasAtendidas() + 1);
								filaBuffet.setTotalDoAlmoco(filaBuffet.getTotalDoAlmoco() + 1);
								
								buffet.listaInicio(cliente);
								filaBuffet.sairFilaBuffet();
							}
							}
						} else {
							
							System.out.println("Restaurante fechado!");
						}
						
						break;
						
					case '3':
						
						if (abrirRestaurante) {
							
							boolean a = true;
							
							if (filaBuffet.filaVaziaCaixa()) {
								
								System.out.println("Fila Vazia!");
							} else {
								
								do {
									
									System.out.print("\nNúmero do pedido: ");
									String numPedido = entrada.next();
									
									double num = buffet.pesquisaQuantia(numPedido);
									
									if (num != 0) {
										
										System.out.print("\nValor a ser cobrado: ");
										System.out.println(number(num));
										
										String mes = buffet.pesquisaMesa(numPedido);
										System.out.println("\nRealizar pagamento? ...Sim(S)Não(N)");
										String op = entrada.next().toUpperCase();
										
										if (op.charAt(0) == 'S') {
											
											mesa = new Mesa();
											buffet.pagamentoPedido(numPedido);
											mesa.setMesas(mes);
											buffet.listaFinal(mesa);
											filaBuffet.sairFilaCaixa();
											controle.setTotal(controle.getTotal() + num);
											
											System.out.println("Pedido pago!");
											a = false;
											
										} else {
											System.out.println("Pedido não pago!");
											a = false;
											
										}
										
									} else {
										
										System.out.println("Pedido não encontrado!");
									}
								} while (a);
							}
						} else {
							
							System.out.println("Restaurante fechado!");
									}
						break;
						
						
						case '4':
							if (abrirRestaurante) {
								
								System.out.println("Emitir relatório sobre o funcionamento do restaurante? ...Sim(S)Não(N)");
								String op = entrada.next().toUpperCase();
								
								if (op.charAt(0) == 'S') {
									
									tela();
									mesa = new Mesa();
									
									System.out.println("Número de pessoas na fila para almoçar: " + filaBuffet.getTotalBuffet());
									System.out.println("Número de pessoas na fila do caixa: " + filaBuffet.getTotalCaixa());
									System.out.println("Número de pessoas no restaurante almoçando: " + filaBuffet.getTotalDoAlmoco());
									System.out.println("Número de pessoas atendidas no restaurante: " + controle.getPessoasAtendidas());
									System.out.println("Número de pratos na pilha: " + pratos.getQuantidadePrato());
									System.out.println("Número de mesas livres: " + buffet.getQuantidadeMesa());
									System.out.println("Total do caixa: " + number(controle.getTotal()));
									clearBuffer (entrada);
								} else {
									System.out.println("Sistema fechado!");
								}
							} else {
								System.out.println("Restaurante fechado!");
							}
							
							break;
							
							
							
						case '5':
							if (abrirRestaurante) {
								
								System.out.println("**************************");
								System.out.println("**       CONTROLE       **");
								System.out.println("*****                *****");
								System.out.println("** 1. Colocar pratos    **");
								System.out.println("** 2. Pessoas na fila   **");
								System.out.println("** 3. Valor Buffet      **");
								System.out.println("** 4. Pessoas no almoço **");
								System.out.println("*****                *****");
								System.out.println("**************************");
								System.out.println("** Digite uma opção: ");
								
								String opc = entrada.next();
								
								switch (opc.charAt(0)) {
								
									case '1':
										
										System.out.println("\n\nQuantidade de pratos para repor: ");
										int quantidade = entrada.nextInt();
										
										for (int aux = 0; aux <= quantidade; aux++) {
											
											pratos.colocarPrato(aux);
										}
										
										break;
										
									case '2':
										
										System.out.println("Quantidade pessoas na fila: ");
										quantidade = entrada.nextInt();
										
										for (int aux = 0; aux < quantidade; aux++) {
											
											filaBuffet.fimFilaBuffet(aux);
										}
										
										break;
										
									case '3':
										
										System.out.println("Novo valor do buffet: ");
										controle.setValorDoBuffet(entrada.nextFloat());
										
										break;
										
									case '4':
										
										System.out.println("Quantidade pessoas almoçando: ");
										System.out.println("Quantidade pessoas que termiram seu almoço: ");
										int c = entrada.nextInt();
										
										if (filaBuffet.getTotalDoAlmoco() < c) {
											
											System.out.println("Quantidade é inválida!");
										} else {
											
											for (int aux = 0; aux < c; aux++) {
												
												filaBuffet.setTotalDoAlmoco(filaBuffet.getTotalDoAlmoco() - 1);
												filaBuffet.fimFilaCaixa(aux);
											}
										}
										
										break;
										
									default:
										System.out.println("Opção incorreta!");
										
										break;
								}
							} else {
								System.out.println("Restaurante fechado!");
							}
							break;
							
							
						default:
							
							System.out.println("");
							
			}
		} while (escolha != '6');
		entrada.close();
		System.exit(0);
							
	}									
								
}