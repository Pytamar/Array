package card;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private static final SecureRandom sr = new SecureRandom();
	private Card[] deck; //array do objeto CARD.
	private int currentCard; //indice da proxima carta (1-51)
	private static final int NUMBER_OF_CARDS = 52; //numero constante das cartas
	
	
	
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamond", "Clubs", "Spades"};
		deck = new Card[NUMBER_OF_CARDS]; //Cria array de objeto CARDS.
		currentCard = 0; //Primeira carta a ser distribuida sera o deck[0].
		
		//preenche o baralho com o objeto card
		for(int i = 0; i < deck.length; i++) {
			deck[i] = new Card(faces[i%13], suits[i/13]);
		}
	}
	
	public void shuffle() { //Embaralha as cartas
		currentCard = 0;
		
		for(int i = 0; i < deck.length; i++) {
			
			int second = sr.nextInt(NUMBER_OF_CARDS); //Para cada card, será sorteado um numero de 0 - 51.
			
			//Compara cada carta atual com card aleatoria selecionada
			Card temp = deck[i];
			deck[i] = deck[second];
			deck[second] = temp;
			
		}
	}
	
	// Distribui uma carta
	public Card dealCard() {
		
		//Determina se ainda há cartas a seres distribuidas 
		if(currentCard < deck.length) {
			return deck[currentCard++]; //Retorna o card atual no array.
		}else {
			return null;
		}
	}
	
}
