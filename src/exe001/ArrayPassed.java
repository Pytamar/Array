package exe001;

public class ArrayPassed {

	public static void main(String[] args) {
		
		int [] array = {1, 2, 3, 4, 5};
		System.out.printf("Os valores originais do array são%n ");
		
		for(int numeros : array) {
			System.out.printf("   %d", numeros);
		}
		
		modifyArray(array);
		System.out.printf("%n%n O valor da array modificado é%n");
		for(int num : array) {
			System.out.printf("   %d", num);
		}
		
		System.out.printf("%n%nEfeitos de passar o elemento do array:%n" + 
		"array[3] antes de modificar o elemento: %d%n", array[3]);
		
		modifyElement(array[3]); //Tenta modificar o array[3]
		System.out.printf("Array[3] depois de modificar o elemento: %d%n", array[3]);
		
		

	}

	
	public static void modifyArray(int[] array2) { //Multiplica cada elemento do array por 2
		for(int i = 0; i < array2.length; i++) {
			array2[i] *= 2;
		}
	}
	
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Valor do elemento no metodo modifyElement: %d%n", element);
	}
	
	
	
}
