package testes;

import java.util.Scanner;

public class Teste5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverterString(entrada);

        System.out.println("String original: " + entrada);
        System.out.println("String invertida: " + stringInvertida);
    }

	private static String inverterString(String original) {
		char[] caracteres = original.toCharArray();
        int inicio = 0;
        int fim = original.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}