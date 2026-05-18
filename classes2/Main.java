public class Main {
    public static void main(String[] args) {
        
        String escolha = JOptionPane.showInputDialog("Escolha o modo de execução:\n1 - Modo Texto (Console)\n2 - Modo Gráfico (GUI)");
        
        InterfaceUser ui;
        if ("1".equals(escolha)) {
            ui = new ConsoleUI();
        } else {
            ui = new Gui(); // Padrão se cancelar ou digitar 2
        }

        ui.mostrarMensagem(" | registro pessoal |", "Sistema", false);

        String nome = ui.pedirTexto("Digite o nome:");
        String telefone = ui.pedirTexto("Digite o telefone:");
        String cpf = ui.pedirTexto("Digite o cpf:");
        String cargo = ui.pedirTexto("Você é aluno, funcionario, responsavel ou professor?\nResponda com > a / f / r / p:");
                                                
        if (nome == null || telefone == null || cpf == null || cargo == null || 
            nome.isEmpty() || telefone.isEmpty() || cpf.isEmpty() || cargo.isEmpty()) {
            ui.mostrarMensagem("Operação cancelada ou dados vazios.", "Aviso", true);
            return;
        }

        Pessoa pessoa = criarPessoa(ui, nome, telefone, cpf, cargo);
        
        if (pessoa != null) {
            ui.mostrarMensagem(pessoa.comprimentar(pessoa), "Sucesso", false);
        } else {
            ui.mostrarMensagem("Cargo inválido.", "Erro", true);
        }
    }

    private static Pessoa criarPessoa(InterfaceUsuario ui, String nome, String telefone, String cpf, String cargo) {
        switch (cargo.toLowerCase()) {
            case "a" -> {
                String mtr1 = ui.pedirTexto("Digite a matrícula do aluno:");
                String curso = ui.pedirTexto("Digite o curso do aluno:");
                
                Alunos aluno = new Alunos(mtr1, nome, telefone, cpf, curso);
                ui.mostrarMensagem(aluno.comprimentar(aluno), "Aluno", false);
                return aluno;
            }
            case "f" -> {
                String cod = ui.pedirTexto("Digite o código do funcionário:");
                String funcao = ui.pedirTexto("Digite a função do funcionário:");
                
                Funcionario funcionario = new Funcionario(nome, telefone, cpf, cod, funcao);
                ui.mostrarMensagem(funcionario.comprimentar(funcionario), "Funcionário", false);
                return funcionario;
            }
            case "p" -> {
                String mtr1P = ui.pedirTexto("Digite a matrícula do professor:");
                String cursoP = ui.pedirTexto("Digite o curso do professor:");
                String titulo = ui.pedirTexto("Digite o título do professor:");
                
                Professor professor = new Professor(mtr1P, nome, telefone, cpf, cursoP, titulo);
                ui.mostrarMensagem(professor.comprimentar(professor), "Professor", false);
                return professor;
            }
            case "r" -> {
                Responsavel responsavel = new Responsavel(nome, telefone, cpf);
                int numAlunos = ui.pedirInteiro("Quantos alunos este responsável é responsável?");
                
                if (numAlunos <= 0) return responsavel;

                for (int i = 0; i < numAlunos; i++) {
                    ui.mostrarMensagem("Dados do aluno " + (i + 1) + ":", "Cadastro", false);
                    
                    String nomeAluno = ui.pedirTexto("Nome do aluno " + (i + 1) + ":");
                    String telAluno = ui.pedirTexto("Telefone do aluno " + (i + 1) + ":");
                    String cpfAluno = ui.pedirTexto("CPF do aluno " + (i + 1) + ":");
                    String mtr1 = ui.pedirTexto("Matrícula do aluno " + (i + 1) + ":");
                    String curso = ui.pedirTexto("Curso do aluno " + (i + 1) + ":");
                    
                    Alunos aluno = new Alunos(mtr1, nomeAluno, telAluno, cpfAluno, curso);
                    responsavel.addAluno(aluno);
                    
                    ui.mostrarMensagem(responsavel.comprimentar(responsavel), "Responsável", false);
                }
                return responsavel;
            }
            default -> {
                return null;
            }
        }
    }