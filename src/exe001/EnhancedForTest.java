package exe001;

public class EnhancedForTest {

	public static void main(String[] args) {
		int[] array = {80, 68, 75, 42, 12, 50, 03, 04, 90, 100, 47, 65};
		int total = 0;
		
		for(int numero : array) {
			total += numero;
			System.out.printf("Total de elementos no array: %d%n", total);
		}

	}

}
