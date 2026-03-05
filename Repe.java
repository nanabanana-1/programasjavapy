// questao 1
import java.util.Scanner;
public class Repe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = sc.nextInt(); 
        

        for(int i = 1; i<=10; i++){
            int resultado = num * i;
            System.out.println(num + "x"+ i + "=" + resultado);
        }
    }


}

//questao 2