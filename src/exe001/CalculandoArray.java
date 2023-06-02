package exe001;
//Calcula a array de dois em dois. resultando em 20 quando o array chegar no seu ultimo indice
public class CalculandoArray {

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];
		
		for(int i = 0; i<array.length; i++) {
			array[i] = 2 + 2 * i;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
		
		

	}

}
