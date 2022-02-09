package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("| Programa para informar a posição de um valor em uma matriz e os números a sua volta |");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.print("Informe a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.print("Informe a quantidade de colunas: ");
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		
		System.out.println("-----------------------------------");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Informe o valor na posição [%d][%d]: ", i + 1, j + 1);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-----------------------------------------------");
		System.out.print("Informe um número a ser pesquisado na matriz: ");
		int pesquisaNumero = sc.nextInt();
		
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == pesquisaNumero) {
					System.out.printf("Posição: Linha[%d]Coluna[%d]\n", i + 1, j + 1);
					if (i > 0) {
						System.out.println("Cima: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Baixo: " + mat[i + 1][j]);
					}
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					System.out.println("-----------------");
				}
			}
		}
		
		sc.close();

	}
	
}
