import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("-----registro aluno-----");

       System.out.println("digite o nome do aluno: ");
       String nomedig = scanner.nextLine();

       System.out.println("digite a matricula do aluno: ");
       int mtrDig = scanner.nextInt();

       System.out.println("digite a data de nascimento do aluno: ");
       String dtDig = scanner.nextLine();

       System.out.println("digite o telefone do aluno: ");
       String teleDig = scanner.nextLine();

       System.out.println("digite o nome do responsavel do aluno: ");
       String nomeReponsadig = scanner.nextLine();
      
       Aluno aluno1 = new Aluno(nomedig, mtrDig, dtDig, teleDig, nomeReponsadig);

       System.out.println("/n" + aluno1.Saudacao());
       System.out.println("/n" + aluno1.apresenteSe());

       scanner.close();

    }
}