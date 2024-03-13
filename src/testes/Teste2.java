package testes;

import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numeroInformado = scanner.nextInt();

        if (verificarPertencimentoFibonacci(numeroInformado)) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarPertencimentoFibonacci(int numeroInformado) {
        int primeiroTermo = 0;
        int segundoTermo = 1;

        while (primeiroTermo <= numeroInformado) {
            if (primeiroTermo == numeroInformado) {
                return true;
            }
            
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        return false;
    }
}
