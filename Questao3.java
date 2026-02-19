import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double a = sc.nextInt();
        System.out.println("digite mais um numero: ");
        double b = sc.nextInt();

        System.out.println("soma: "+ (a + b));
        System.out.println("subtração: "+ (a - b));
        System.out.println("multiplicação: "+ (a*b));
        System.out.println("divisão: "+ (a/b));
    }
    
}
