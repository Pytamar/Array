package exe001;

public class StudantPool {

	public static void main(String[] args) {
		
		int [] response = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,
				2, 3, 3, 2, 14};
		int [] frequency = new int [6];
		
		for(int i = 0; i < response.length; i++) {
			try{
				++frequency[response[i]];
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf(" responses[%d] = %d%n%n", i, response[i]);
			}
			
			System.out.printf("%s%10s%n", "Rating", "Frequency");
		}
		
		//Gera a saida do valor de cada elemento
		for(int i = 1; i < frequency.length; i++) {
			System.out.printf("%6d%10d%n", i, frequency[i]);
		}
		
		

	}

}
