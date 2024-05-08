package curso08_05;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor " + i+ "..:");
			a[i]= ler.nextInt();
		}
		for (int i =0; i<5; i++) {
			System.out.println(a[i]);
		}		

		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor " + i+ "..:");
			b[i]= ler.nextInt();

		}
		for (int i =0; i<5; i++) {
			System.out.println(b[i]);

		}
		
		for (int i =0; i<5; i++) {
			c[i]=a[i];
			c[i+5]=b[i];
					
		}
		for (int i =0; i<10; i++) {
			System.out.println("Vetor c");
			System.out.println(c[i]);
		}

	}
	
}







