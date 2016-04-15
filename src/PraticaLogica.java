
public class PraticaLogica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Q01
		String[] nomes = {"Alex", "Saulo", "Monica", "Isis", "Marina", "Luiz", "Helen", "Tiago", "Pedro", "Mara"};
		double[][] notas = {{7.5, 8.9, 6.5}, {8.2, 7.3, 9.4},
				{10.0, 9.6, 7.1}, {6.8, 7.5, 8.1},
				{8.8, 7.4, 9.2}, {8.3, 7.9, 9.0},
				{7.2, 8.7, 9.8}, {8.3, 7.7, 8.9},
				{7.8, 7.7, 8.5}, {8.0, 7.0, 9.0}};
		
		//Q02
		q02(nomes, notas);
	}
	
	static void q02(String[] vetor, double[][] matriz){
		
		System.out.printf("Aluno\tTrabalho1\tTrabalho2\tTrabalho3\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%s\t ", vetor[i]);
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4.2f\t\t", matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	}

}
