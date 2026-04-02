import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalTime;
import java.time.LocalDate;

public class Decisao {

    public static void main(String[] args) {
        //questao1
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }

        //questao2

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double maior = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));
        System.out.println(maior + " " + menor);

        //questao3

        int hora = LocalTime.now().getHour();
        if (hora >= 6 && hora < 12) System.out.println("Bom dia");
        else if (hora >= 12 && hora < 18) System.out.println("Boa tarde");
        else if (hora >= 18 && hora < 23) System.out.println("Boa noite");
        else System.out.println("Vai dormir");

        double[] nums = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        sc.nextLine(); 
        String nome = sc.nextLine();
        int ano = sc.nextInt();
        int idade = LocalDate.now().getYear() - ano;
        if (idade >= 18) {
            System.out.println(nome + ": Entrada liberada");
        } else {
            System.out.println(nome + ": Entrada negada");
        }
        //quewstao4

        double numA = sc.nextDouble();
        double numB = sc.nextDouble();
        if (numB > numA) {
            System.out.println(numA + numB);
        } else if (numA > numB) {
            System.out.println(numA - numB);
        }

        sc.close();
    }
}