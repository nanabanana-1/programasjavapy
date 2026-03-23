//questao1

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int dia = teclado.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido!");
        }
        teclado.close();
    }
}

//questao2

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = teclado.nextDouble();

        System.out.println("Escolha: 1-Soma, 2-Subtração, 3-Divisão, 4-Multiplicação");
        int op = teclado.nextInt();

        switch (op) {
            case 1 -> System.out.println("Resultado: " + (n1 + n2));
            case 2 -> System.out.println("Resultado: " + (n1 - n2));
            case 3 -> {
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Erro: Divisão por zero!");
            }
            case 4 -> System.out.println("Resultado: " + (n1 * n2));
            default -> System.out.println("Opção inválida!");
        }
        teclado.close();
    }
}

//questao3

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número (1-100): ");
        int num = teclado.nextInt();

        if (num == 100) {
            System.out.println("Cem");
        } else if (num < 1 || num > 100) {
            System.out.println("Inválido");
        } else if (num >= 10 && num <= 19) {
            switch (num) {
                case 10 -> System.out.println("Dez");
                case 11 -> System.out.println("Onze");
                case 12 -> System.out.println("Doze");
                case 13 -> System.out.println("Treze");
                case 14 -> System.out.println("Quatorze");
                case 15 -> System.out.println("Quinze");
                case 16 -> System.out.println("Dezesseis");
                case 17 -> System.out.println("Dezessete");
                case 18 -> System.out.println("Dezoito");
                case 19 -> System.out.println("Dezenove");
            }
        } else {
            int d = num / 10;
            int u = num % 10;
            String extenso = "";

            extenso += switch (d) {
                case 2 -> "Vinte";
                case 3 -> "Trinta";
                case 4 -> "Quarenta";
                case 5 -> "Cinquenta";
                case 6 -> "Sessenta";
                case 7 -> "Setenta";
                case 8 -> "Oitenta";
                case 9 -> "Noventa";
                default -> "";
            };

            if (d > 0 && u > 0) extenso += " e ";

            extenso += switch (u) {
                case 1 -> "Um";
                case 2 -> "Dois";
                case 3 -> "Três";
                case 4 -> "Quatro";
                case 5 -> "Cinco";
                case 6 -> "Seis";
                case 7 -> "Sete";
                case 8 -> "Oito";
                case 9 -> "Nove";
                default -> "";
            };
            System.out.println(extenso);
        }
        teclado.close();
    }
}