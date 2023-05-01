import java.util.Scanner;

public class ForNumDentroIntervalor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números serão digitados: ");
		int num = sc.nextInt();
		int in = 0;
		int out = 0;
		
		
		for (int i = 0; i<num; i++) {
			System.out.print("Digite um número: ");
			int valor = sc.nextInt();
			
			if (valor<=20 && valor >=10) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println("Os números dentro do intervalo de 10 a 20 são: ");
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}
