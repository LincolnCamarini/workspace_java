import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		System.out.println("primeiro programa no eclipse");
		System.out.println("agora vai!!!");
		a = teclado.nextInt();
		System.out.println("Voce digitou = " + a);
		
		teclado.close();
	}
}