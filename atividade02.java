package curso08_05;

import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
        int a[] = new int[5];
        int soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor " + i+ "..:");
			a[i]= ler.nextInt();
			soma= soma+a[i];
		}
		if (soma > 15) {
			System.out.println("A soma dos números é :" + soma);
        }
        ler.close();

	}

}
