package card;

public class Test {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); //Coloca as cartas em ordem aleatoria.
		
		//Imprime todas as 52 cartas.
		for(int i = 1; i <= 52; i++) {
			//Distribui e exibe uma carta.
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if ( i % 4 == 0) { // gera uma nova linha apos cada quatro cartas for lançada no jogo.
				System.out.println( );
			}
		}
		
		
		

	}

}
