import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, " | registro pessoal |", "Sistema", JOptionPane.INFORMATION_MESSAGE);

        String nome = JOptionPane.showInputDialog("Digite o nome:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone:");
        String cpf = JOptionPane.showInputDialog("Digite o cpf:");
        
        String cargo = JOptionPane.showInputDialog(
            "Você é aluno, funcionario, responsavel ou professor?\nResponda com > a / f / r / p:"
        );

                                                
        if (nome == null || telefone == null || cpf == null || cargo == null) {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }

        Pessoa pessoa = criarPessoa(nome, telefone, cpf, cargo);
        
        if (pessoa != null) {

            JOptionPane.showMessageDialog(null, pessoa.comprimentar(pessoa), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cargo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static Pessoa criarPessoa(String nome, String telefone, String cpf, String cargo) {
        switch (cargo.toLowerCase()) {
            case "a" -> {
                String mtr1 = JOptionPane.showInputDialog("Digite a matrícula do aluno:");
                String curso = JOptionPane.showInputDialog("Digite o curso do aluno:");
                
                Alunos aluno = new Alunos(mtr1, nome, telefone, cpf, curso);
                JOptionPane.showMessageDialog(null, aluno.comprimentar(aluno));
                return aluno;
            }
            case "f" -> {
                String cod = JOptionPane.showInputDialog("Digite o código do funcionário:");
                String funcao = JOptionPane.showInputDialog("Digite a função do funcionário:");
                
                Funcionario funcionario = new Funcionario(nome, telefone, cpf, cod, funcao);
                JOptionPane.showMessageDialog(null, funcionario.comprimentar(funcionario));
                return funcionario;
            }
            case "p" -> {
                String mtr1P = JOptionPane.showInputDialog("Digite a matrícula do professor:");
                String cursoP = JOptionPane.showInputDialog("Digite o curso do professor:");
                String titulo = JOptionPane.showInputDialog("Digite o título do professor:");
                
                Professor professor = new Professor(mtr1P, nome, telefone, cpf, cursoP, titulo);
                JOptionPane.showMessageDialog(null, professor.comprimentar(professor));
                return professor;
            }
            case "r" -> {
                Responsavel responsavel = new Responsavel(nome, telefone, cpf);
                
                String numAlunosStr = JOptionPane.showInputDialog("Quantos alunos este responsável é responsável?");
                int numAlunos = Integer.parseInt(numAlunosStr);
                
                for (int i = 0; i < numAlunos; i++) {
                    JOptionPane.showMessageDialog(null, "Dados do aluno " + (i + 1) + ":");
                    
                    String nomeAluno = JOptionPane.showInputDialog("Nome do aluno " + (i + 1) + ":");
                    String telAluno = JOptionPane.showInputDialog("Telefone do aluno " + (i + 1) + ":");
                    String cpfAluno = JOptionPane.showInputDialog("CPF do aluno " + (i + 1) + ":");
                    String mtr1 = JOptionPane.showInputDialog("Matrícula do aluno " + (i + 1) + ":");
                    String curso = JOptionPane.showInputDialog("Curso do aluno " + (i + 1) + ":");
                    
                    Alunos aluno = new Alunos(mtr1, nomeAluno, telAluno, cpfAluno, curso);
                    responsavel.addAluno(aluno);
                    
                    JOptionPane.showMessageDialog(null, responsavel.comprimentar(responsavel));
                }
                return responsavel;
            }
            default -> {
                return null;
            }
        }
    }
}