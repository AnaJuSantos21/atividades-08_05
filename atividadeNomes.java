package curso08_05;

import java.util.Scanner;

public class atividadeNomes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nome [] = new String [5];
		
		for (int i =0; i<5; i++) {
			System.out.println("Informe um nome " + i+ "..:");
			nome[i]= ler.next();
		}
        for (int i =0; i<5; i++) {
        	System.out.println(nome[i]);
        }
        ler.close();
	}

	}
