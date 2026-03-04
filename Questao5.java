import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("o resto da divisão do primeiro pelo segundo é: " + (numero1%numero2));
    }
}
