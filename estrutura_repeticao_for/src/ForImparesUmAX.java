
import java.util.Scanner;

public class ForImparesUmAX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um número: ");
		int num = sc.nextInt();
		int soma = 0;
		
		for(int i=1; i<=num; i++) {
			if (i % 2 !=0) {
				soma += i;
				System.out.println(i);
			}
		}
		
		System.out.println("A soma dos números ímpares de 1 ao valor indicado é: " + soma);
		
		sc.close();
	}
}