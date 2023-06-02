package exe001;

public class SomandoTotal {

	public static void main(String[] args) {
		int[] array = {32, 87, 51, 62, 68, 72, 2, 04, 6, 10, 54, 10};
		int total = 0;
		
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		System.out.printf("Total da soma entre os elementos do array: %d%n", total);
		
		

	}

}
