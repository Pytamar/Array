package bidimensionais;

public class InitArray {

	public static void main(String[] args) {
		int[][] array = {{1, 2, 3}, {4, 5, 6}};
		int[][] array1 = {{1, 2}, {3}, {4,5,6}};
		
		System.out.println("Valores no array por linhas é: ");
		outputArray(array);
		
		System.out.printf("%nValores no array1 por linhas é%n");
		outputArray(array1);
		
	}
	
	public static void outputArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%d ", array[i][j]);
				
				System.out.println();
			}
		}
	}
	
	
}
