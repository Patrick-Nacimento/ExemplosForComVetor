import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a quantidade de nomes que deseja cadastrar: ");
		int quantidadeRegistros = Integer.parseInt(teclado.nextLine());
		int[] idades = new int[quantidadeRegistros];
		String[] nomes = new String[quantidadeRegistros];
		double[] pesos = new double[quantidadeRegistros];
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Nome: ");
			nomes[i] = teclado.nextLine();

			System.out.print("Idade: ");
			idades[i] = Integer.parseInt(teclado.nextLine());

			System.out.print("Peso : ");
			pesos[i] = Double.parseDouble(teclado.nextLine());

		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println("\nNome: " + nomes[i] + "\nIdade: " + idades[i] + "\nPeso: " + pesos[i]);
		}
		int somaIdades = 0;
		for (int i = 0; i < idades.length; i++) {
			somaIdades += idades[i];
		}
		System.out.println("A soma das idades é: " + somaIdades);
		double media = somaIdades / idades.length;

		int menorIdade = Integer.MAX_VALUE;
		for (int i = 0; i < idades.length; i++) {
			int idadeAtual = idades[i];

			if (idadeAtual < menorIdade) {
				menorIdade = idadeAtual;
			}
		}
		System.out.println("Menor idade: " + menorIdade);

		int maiorIdade = Integer.MIN_VALUE;
		for (int i = idades.length - 1; i >= 0; i--) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
			}
		}
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("A média das idades: " + media);
	}

}