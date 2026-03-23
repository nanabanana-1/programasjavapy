import java.util.Scanner;
import java.time.LocalTime;

public class Bomdia{
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        
        String nomeUser = leitor.nextLine();
        fazerBomdia(nomeUser);
        
        leitor.close();
    }
    
    public static void fazerBomdia(String nome){
        double hora = LocalTime.now().getHour();
        String saudacao;
        
        if(hora >= 6 && hora < 12){
            saudacao = "bom dia";
        }
        else if(hora >=12 && hora < 18){
            saudacao = "boa tarde";
        }
        else {
            saudacao = "boa noite";
        }
        
        
        System.out.println(saudacao+","+nome);
    }
    
} 