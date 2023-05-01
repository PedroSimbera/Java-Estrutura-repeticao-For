import java.util.Scanner;

public class ForImparesPeriodo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha dois números: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int troca = num1;
			num1 = num2;
			num2 = troca;
		
		int soma = 0;
		
		for(int i=troca; i<=num1; i++){
			if (i % 2 !=0) {
				soma += i;
			}
		}
		
		System.out.println("A soma dos números ímpares no período indicado é: " + soma);
		
		sc.close();
		

	}

}
