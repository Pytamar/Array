package exe001;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom sr = new SecureRandom();
		int[] frequency = new int[7];
		
		//Lança o dado 6.000.000 vezes. Utiliza o valor do dado como indice.
		for(int roll = 1; roll <= 6000000; roll++) {
			++frequency[1 + sr.nextInt(6)];
			}
			
			System.out.printf("%s%10s%n", "Face", "Frequency");
			
			
			//Gera a saida do valor de cada elemento do array.
		for(int face = 1; face <= frequency.length; face++) {
			System.out.printf("%4d%10d%n", face, frequency[face]);
			}
		
			
	}

}
