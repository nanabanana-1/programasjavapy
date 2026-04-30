import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" | registro pessoal |");

            System.out.println("digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("digite o telefone: ");
            String telefone = scanner.nextLine();

            System.out.println("digite o cpf: ");
            String cpf = scanner.nextLine();

            System.out.println("você é aluno, funcionario, responsavel ou professor? responda com > a/f/r/p: ");
            String cargo = scanner.nextLine();

            switch (cargo.toLowerCase()) {
                case "a" -> {
                    System.out.println("digite a matricula: ");
                    String mtr1 = scanner.nextLine();
                    System.out.println("digite o curso: ");
                    String curso = scanner.nextLine();
                    Alunos aluno = new Alunos(mtr1, nome, telefone, cpf, curso);
                    System.out.println(aluno.aprende());
                }
                case "f" -> {
                    System.out.println("digite o codigo: ");
                    String cod = scanner.nextLine();
                    System.out.println("digite a funcao: ");
                    String funcao = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(nome, telefone, cpf, cod, funcao);
                    System.out.println(funcionario.temFuncao());
                }
                case "p" -> {
                    System.out.println("digite a matricula: ");
                    String mtr1P = scanner.nextLine();
                    System.out.println("digite o curso: ");
                    String cursoP = scanner.nextLine();
                    System.out.println("digite o titulo: ");
                    String titulo = scanner.nextLine();
                    Professor professor = new Professor(mtr1P, nome, telefone, cpf, cursoP, titulo);
                    System.out.println(professor.ENSINA());
                }
                case "r" -> {
                    Responsavel responsavel = new Responsavel(nome, telefone, cpf);
                    System.out.println("Quantos alunos este responsavel eh responsavel? ");
                    int numAlunos = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numAlunos; i++) {
                        System.out.println("Dados do aluno " + (i + 1) + ":");
                        System.out.println("Nome: ");
                        String nomeAluno = scanner.nextLine();
                        System.out.println("Telefone: ");
                        String telAluno = scanner.nextLine();
                        System.out.println("CPF: ");
                        String cpfAluno = scanner.nextLine();
                        System.out.println("Matricula: ");
                        String mtr1 = scanner.nextLine();
                        System.out.println("Curso: ");
                        String curso = scanner.nextLine();
                        Alunos aluno = new Alunos(mtr1, nomeAluno, telAluno, cpfAluno, curso);
                        responsavel.alunos.add(aluno);
                    }
                    System.out.println(responsavel.Saudacao());
                }
                default -> System.out.println("Cargo invalido.");
            }
        }
    }
}