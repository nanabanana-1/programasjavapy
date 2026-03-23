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

import java.util.Scanner;
public class Repe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int n = sc.nextInt(); 
        
        while (n<=100){
            System.out.println(n);
            n += 6;

         }
        }
    }

//questao3

public class Repe {
    public static void main(String[] args) {
        int n1 = 1; 
        int n2 = 13;
        
        for(int i = n1; i <= n2; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }

        }
         
        }
    }

//questao4
import java.util.Scanner;
public class Repe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = 1234; 
        System.out.println('digite a SENHA: ');
        
         senhad = sc.nextline();
        
        while(senhad != senha){
            System.out.println('senha incorreta!');
            }
            System.out.println("senha correta!");
            sc.close();
    }

 }

//questao5
public class Repe{
    public static void main(String[] args){
        int somadosp = 0;
        System.out.println("numeros primos entre 1 e 50: ");

        for(int i = 2; i <= 50; i++){
            boolean ehPrimo = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if(ehPrimo){
                System.out.println(i);
                somadosp += i;
            }
        }
        System.out.println("Soma dos primos: " + somadosp);
    }
}