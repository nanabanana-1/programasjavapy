import java.awt.GraphicsEnvironment;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario ui = null;
        try {
            String escolha = pedirModoExecucao();
            ui = "1".equals(escolha) ? new Console() : new Gui();

            ui.mostrarMensagem(" | registro pessoal |", "Sistema", false);

            String nome = pedirNomeValido(ui, "Digite o nome:");
            String telefone = pedirTelefoneValido(ui, "Digite o telefone:");
            String cpf = pedirCpfValido(ui, "Digite o cpf (11 dígitos):");
            String cargo = pedirCargoValido(ui);

            Pessoa pessoa = criarPessoa(ui, nome, telefone, cpf, cargo);
            ui.mostrarMensagem(pessoa.comprimentar(pessoa), "Sucesso", false);
        } catch (DadoInvalidoException e) {
            if (ui == null) {
                ui = new Gui();
            }
            ui.mostrarMensagem("Erro de dado inválido: " + e.getMessage(), "Erro", true);
        }
    }

    private static String pedirModoExecucao() {
        if (!GraphicsEnvironment.isHeadless()) {
            while (true) {
                String escolha = JOptionPane.showInputDialog(
                        null,
                        "Escolha o modo de execução:\n1 - Texto\n2 - GUI",
                        "Modo de execução",
                        JOptionPane.QUESTION_MESSAGE
                );
                if (escolha == null) {
                    JOptionPane.showMessageDialog(null, "Por favor, escolha 1 ou 2.", "Erro", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                escolha = escolha.trim();
                if ("1".equals(escolha) || "2".equals(escolha)) {
                    return escolha;
                }
                JOptionPane.showMessageDialog(null, "Escolha inválida. Digite 1 ou 2.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Escolha o modo de execução: 1 - Texto / 2 - GUI: ");
                String escolha = scanner.nextLine();
                if (escolha != null) {
                    escolha = escolha.trim();
                    if ("1".equals(escolha) || "2".equals(escolha)) {
                        return escolha;
                    }
                }
                System.out.println("Escolha inválida. Digite 1 para texto ou 2 para GUI.");
            }
        }
    }

    private static String pedirTextoNaoVazio(InterfaceUsuario ui, String mensagem) {
        while (true) {
            String texto = ui.pedirTexto(mensagem);
            if (texto != null && !texto.isBlank()) {
                return texto.trim();
            }
            ui.mostrarMensagem("Entrada inválida. Informe um valor não vazio.", "Erro", true);
        }
    }

    private static String pedirNomeValido(InterfaceUsuario ui, String mensagem) {
        while (true) {
            String nome = ui.pedirTexto(mensagem);
            if (nome != null) {
                nome = nome.trim();
                if (!nome.isBlank() && nome.matches(".*[A-Za-zÀ-ÿ].*") && !nome.matches(".*\\d.*")) {
                    return nome;
                }
            }
            ui.mostrarMensagem("Nome inválido. Digite um nome válido sem números.", "Erro", true);
        }
    }

    private static String pedirTelefoneValido(InterfaceUsuario ui, String mensagem) {
        while (true) {
            String telefone = ui.pedirTexto(mensagem);
            if (telefone != null) {
                telefone = telefone.trim();
                if (!telefone.isBlank() && telefone.matches("\\d+")) {
                    return telefone;
                }
            }
            ui.mostrarMensagem("Telefone inválido. Digite apenas números.", "Erro", true);
        }
    }

    private static String pedirCpfValido(InterfaceUsuario ui, String mensagem) {
        while (true) {
            String cpf = ui.pedirTexto(mensagem);
            if (cpf != null) {
                cpf = cpf.replaceAll("\\D", "");
                if (cpf.matches("\\d{11}")) {
                    return cpf;
                }
            }
            ui.mostrarMensagem("CPF inválido. Digite 11 dígitos numéricos.", "Erro", true);
        }
    }

    private static String pedirCargoValido(InterfaceUsuario ui) {
        while (true) {
            String cargo = ui.pedirTexto("Você é aluno, funcionario, responsavel ou professor?\nResponda com > a / f / r / p:");
            if (cargo != null) {
                cargo = cargo.trim().toLowerCase();
                if (cargo.matches("[afrp]")) {
                    return cargo;
                }
            }
            ui.mostrarMensagem("Cargo inválido. Responda com 'a', 'f', 'r' ou 'p'.", "Erro", true);
        }
    }

    private static int pedirInteiroValido(InterfaceUsuario ui, String mensagem) {
        while (true) {
            int valor = ui.pedirInteiro(mensagem);
            if (valor >= 0) {
                return valor;
            }
            ui.mostrarMensagem("Número inválido. Digite um valor inteiro não negativo.", "Erro", true);
        }
    }

    private static Pessoa criarPessoa(InterfaceUsuario ui, String nome, String telefone, String cpf, String cargo) throws DadoInvalidoException {
        switch (cargo.toLowerCase()) {
            case "a" -> {
                String mtr1 = pedirTextoNaoVazio(ui, "Digite a matrícula do aluno:");
                String curso = pedirTextoNaoVazio(ui, "Digite o curso do aluno:");

                Alunos aluno = new Alunos(mtr1, nome, telefone, cpf, curso);
                ui.mostrarMensagem(aluno.comprimentar(aluno), "Aluno", false);
                return aluno;
            }
            case "f" -> {
                String cod = pedirTextoNaoVazio(ui, "Digite o código do funcionário:");
                String funcao = pedirTextoNaoVazio(ui, "Digite a função do funcionário:");

                Funcionario funcionario = new Funcionario(nome, telefone, cpf, cod, funcao);
                ui.mostrarMensagem(funcionario.comprimentar(funcionario), "Funcionário", false);
                return funcionario;
            }
            case "p" -> {
                String mtr1P = pedirTextoNaoVazio(ui, "Digite a matrícula do professor:");
                String cursoP = pedirTextoNaoVazio(ui, "Digite o curso do professor:");
                String titulo = pedirTextoNaoVazio(ui, "Digite o título do professor:");

                Professor professor = new Professor(mtr1P, nome, telefone, cpf, cursoP, titulo);
                ui.mostrarMensagem(professor.comprimentar(professor), "Professor", false);
                return professor;
            }
            case "r" -> {
                Responsavel responsavel = new Responsavel(nome, telefone, cpf);
                int numAlunos = pedirInteiroValido(ui, "Quantos alunos este responsável é responsável?");

                for (int i = 0; i < numAlunos; i++) {
                    ui.mostrarMensagem("Dados do aluno " + (i + 1) + ":", "Cadastro", false);

                    String nomeAluno = pedirNomeValido(ui, "Nome do aluno " + (i + 1) + ":");
                    String telAluno = pedirTelefoneValido(ui, "Telefone do aluno " + (i + 1) + ":");
                    String cpfAluno = pedirCpfValido(ui, "CPF do aluno " + (i + 1) + " (11 dígitos):");
                    String mtr1 = pedirTextoNaoVazio(ui, "Matrícula do aluno " + (i + 1) + ":");
                    String curso = pedirTextoNaoVazio(ui, "Curso do aluno " + (i + 1) + ":");

                    Alunos aluno = new Alunos(mtr1, nomeAluno, telAluno, cpfAluno, curso);
                    responsavel.addAluno(aluno);
                }
                ui.mostrarMensagem(responsavel.comprimentar(responsavel), "Responsável", false);
                return responsavel;
            }
            default -> throw new IllegalStateException("Cargo inesperado: " + cargo);
        }
    }
}
