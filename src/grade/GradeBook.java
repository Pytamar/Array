package grade;

public class GradeBook {
	private String courseName; //Nome do curso que essa gradebook representa
	private int[] grades; //array da nota dos alunos
	
	public GradeBook(String courseName, int[] grade) {
		this.courseName = courseName;
		this.grades = grade;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	//Realiza varias operações dos dados
	public void processGrades() {
		
		//Gera a saida de array de notas
		outputGrades();
		
		//Chama o metodo que verifica a media da classe
		System.out.printf("%nClass avarage is %.2f%n", getAvarage());
		
		//Chama os metodos getMinimum e getMaximum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
		
		//Chama o outputBarChart para imprmir grafico de distribuição de notas
		outputBarChart();
		}
	
	public int getMinimum() {
		int lowGrade = grades[0]; //Supõe que a menor nota é o indice 0.
		
		//faz um loop pelo array
		for(int numero : grades) {
			if(numero < lowGrade) {
				lowGrade = numero; //Nova nota mais baixa
			
		}
	}
		return lowGrade;
			
	}
	
	public int getMaximum() {
		int highGrade = grades[0]; //Supõe que a maior nota é o indice 0
				
		//faz um loop pelo array
		for(int numero : grades) {
			if (numero > highGrade) {
				highGrade = numero;
			}
		}
		return highGrade;
	}

	public double getAvarage() {
		int total = 0;
		
		//Soma a nota dos alunos
		for(int grade : grades) {
			total += grade;
		}
		return (double) total / grades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribution: ");
		
		//Armazena a frequencia das notas em cada intervalo de 10 notas.
		int[] frequency = new int[11];
		
		//para cada nota, acrescenta a frequencai apropriada.
		for(int grade : grades) {
			++frequency[grade/10];
		}
		//para cada frequencia de nota, imprime uma barra no grafico.
		for(int i = 0; i < frequency.length; i++) {
			
			//Gera saida do rotulo de barra ("00-09: ", ..., "90-99: ", "100: ")
			if(i == 10) {
				System.out.printf("%5d: ", 100);
			}else {
				System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
			}
			
			//Imprime a barra de asteriscos
			for(int asteriscos = 0; asteriscos < frequency[i]; asteriscos++) {
				System.out.print("*");
			}
			
		System.out.println();
			
		}
	}

	public void outputGrades() {//Gera a saida do conteudo de arrays da nota.
		System.out.printf("The grades are:%n%n");
		
		//Gera a saida da nota de cada aluno
		for(int studant = 0; studant < grades.length; studant++) {
			System.out.printf("Studant %2d: %3d%n", studant + 1, grades[studant]);
		}
	}
	

}
