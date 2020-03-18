package corona;
import java.util.Random;

public class Cassino extends Thread {
	
	private final int pontos = 5;
	private int id;
	private int dado1;
	private int dado2;
	private int soma;	
	private static int classificacao = 0;
	private int pontuou=0;
	
	
	Random rand = new Random();
	
	public Cassino(int id) {
		this.id = id;
	}
	
	public void run() {
		Jogar();
	}
	
	public void Jogar() {
					
		while (pontuou < pontos) {			
		dado1 = (1 + rand.nextInt(6) );
		dado2 = (1 + rand.nextInt(6) );
		soma = dado1 + dado2;
		if (soma == 7 || soma == 11) {
			System.out.printf("O competidor %d tem %d pontos \n", this.id+1, pontuou+1);
			pontuou++;
			if (pontuou == 5) {
				
				ranking();											
			}
		}
		
	}						
		

		
	}
	
	private void ranking() {
		
		classificacao++;
		if (classificacao == 1) {
			System.out.printf("O competidor %d chegou em %dº lugar e ganhou R$5000,00 \n", this.id+1, classificacao);
			}
		else if (classificacao == 2) {
				System.out.printf("O competidor %d chegou em %dº lugar e ganhou R$4000,00 \n", this.id+1, classificacao);
				}
		else if (classificacao == 3) {
				System.out.printf("O competidor %d chegou em %dº lugar e ganhou R$3000,00 \n", this.id+1, classificacao);
				}
		else if (classificacao > 3) {
				System.out.printf("O competidor %d chegou em %dº lugar e nao ganhou nada\n", this.id+1, classificacao);
			}
				
	}
	
}

