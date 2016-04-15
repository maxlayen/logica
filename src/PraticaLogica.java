import java.util.Scanner;

public class PraticaLogica {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double medias[] = new double[10];

		// Q01
		String[] nomes = { "Alex", "Saulo", "Monica", "Isis", "Marina", "Luiz",
				"Helen", "Tiago", "Pedro", "Mara" };
		double[][] notas = { { 7.5, 8.9, 6.5 }, { 8.2, 7.3, 9.4 },
				{ 10.0, 9.6, 7.1 }, { 6.8, 7.5, 8.1 }, { 8.8, 7.4, 9.2 },
				{ 8.3, 7.9, 9.0 }, { 7.2, 8.7, 9.8 }, { 8.3, 7.7, 8.9 },
				{ 7.8, 7.7, 8.5 }, { 8.0, 7.0, 9.0 } };

		// Q02
		q02(nomes, notas);

		// Q03
		// Construa um vetor com a média de cada aluno.
		for (int i = 0; i < nomes.length; i++) {
			medias[i] = calcularMedia(notas[i][0], notas[i][1], notas[i][2]);
		}

		System.out.println();
		System.out.println("Média:");
		// Q04
		imprimirMedias(nomes, medias);
	}

	static void q02(String[] vetor, double[][] matriz) {

		System.out.printf("Aluno\tTrabalho1\tTrabalho2\tTrabalho3\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%s\t ", vetor[i]);
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4.2f\t\t", matriz[i][j]);
			}
			System.out.println();
		}

	}

	//Q03 - Função que retorna a média de três notas.
	static double calcularMedia(double primeiroValor, double segundoValor,
			double terceiroValor) {

		double media = (primeiroValor + segundoValor + terceiroValor) / 3;

		return media;

	}

	//Q04 - Procedimento que imprime os vetores de nome e média.
	static void imprimirMedias(String[] nomes, double[] vetor) {
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("%s\t ", nomes[i]);
			for (int j = 0; j < 1; j++) {
				System.out.printf("%2.2f\n", vetor[i]);
			}
		}
	}
	
	// Q05.1 - Imprimir todos os elementos de um matriz Anxn
		//Q05 Parte 1
	public static void Matriz12(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, j;
		System.out.printf("Informe o tamanho da matriz: ");
		n = s.nextInt();
		int A[][] = new int[n][n];
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A.length; j++) {
				System.out.printf("Informe o valor da matriz %d %d:", i, j);
				A[i][j] = s.nextInt();
			}
		}
		for (i = 0; i < A.length; i++) {
			System.out.println(" ");
			for (j = 0; j < A.length; j++) {
				System.out.printf("%d \t",A[i][j]);
			}
		}
		//Q05 Parte 2
		for (i = 0; i < A.length; i++) {
			System.out.printf("\n");
			for (j = 0; j < A.length; j++) {
				if(i == j) {
					System.out.printf("%d \t",A[i][j]);
				} else {
					System.out.printf("\t");
				}
			}
		}
	}
	//TODO - Aqui vai o seu código
	
	//Questao 5.5 - imprime todos os elementos exceto a diagonal principal 
	static void q5(int[][] matriz){

		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(i == j){
					System.out.printf("\t");
				}else{
					System.out.printf("\t%d", matriz[i][j]);
				}
			}
			System.out.println("");
		}
	}
	
	
}
