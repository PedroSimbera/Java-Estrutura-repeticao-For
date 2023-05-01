import java.util.Scanner;

public class forSomaNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números que serão digitados: ");
		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro número");
			;
			int num = sc.nextInt();
			soma += num;
		}
		System.out.println("A soma dos números digitados é: " + soma);
		sc.close();
	}

}
