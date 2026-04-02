import java.util.Vector;

public class Vetor{
    public static void main(String[] args){
        
        int vetor[];
        vetor = new int[5];
        System.out.println(vetor);
    }
}

//questao 2

import java.util.Scanner;
import java.util.Arrays;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];

       
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = leitor.nextInt();
        }

        
        double media = Arrays.stream(numeros).average().orElse(0.0);
        int maior = Arrays.stream(numeros).max().getAsInt();
        int menor = Arrays.stream(numeros).min().getAsInt();

        
        System.out.println("\n--- Resultados ---");
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        leitor.close();
    }
}

//questao3
import java.util.Scanner;

public class ContadorConsoantes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine().toLowerCase();
        
        String consoantesEncontradas = "";
        int totalConsoantes = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            
            
            if (Character.isLetter(ch) && "aeiouáéíóúâêîôûãõ".indexOf(ch) == -1) {
                consoantesEncontradas += ch + " ";
                totalConsoantes++;
            }
        }
        
        System.out.println("Total de consoantes: " + totalConsoantes);
        System.out.println("Consoantes encontradas: " + consoantesEncontradas);
        
        leitor.close();
    }
}

//questao4

import java.util.Scanner;
import java.util.Locale;

public class MediaAlunos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Dados do Aluno " + i + " ---");
            System.out.print("Nome: ");
            String nome = sc.next();

            double soma = 0;
            double menorNota = Double.MAX_VALUE; 
            
            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a nota " + j + ": ");
                double notaAtual = sc.nextDouble();

                
                soma += notaAtual;

                
                if (notaAtual < menorNota) {
                    menorNota = notaAtual;
                }
            }

            double media = soma / 4;

           
            System.out.println(">> Aluno: " + nome);
            System.out.println(">> Média: " + media);
            System.out.println(">> Menor Nota: " + menorNota);
        }

        System.out.println("\nProcessamento concluído!");
        sc.close();
    }
}

//questao5

public class JuntaVetores {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[20];
        
        for(int i = 0; i < 10; i++) vetorA[i] = i + 1;
        for(int i = 0; i < 20; i++) vetorB[i] = i + 100;

        int[] vetorC = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.println("Vetor C (resultado):");
        for (int num : vetorC) {
            System.out.print(num + " ");
        }
    }
}