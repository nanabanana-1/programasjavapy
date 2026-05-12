public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String Saudacao() {
        return "Bem-vindo!";
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String comprimentar(Pessoa pessoa) {
        return " | registro pessoal | \n" + pessoa.getNome();
    }

    public String comprimentar(Alunos aluno) {
        return "o aluno chama : "+ aluno.getNome() + "| seu telefone eh: " + aluno.getTelefone() + "| sua matricula eh: " + aluno.getMtr1() + "| seu curso eh: " + aluno.getCurso();
    }

    public String comprimentar(Funcionario funcionario) {
        return "o funcionario chama : "+ funcionario.getNome() + "| seu telefone eh: " + funcionario.getTelefone() + "| seu codigo eh: " + funcionario.getCod() + "| sua funcao eh: " + funcionario.getFuncao();
    }
    
    public String comprimentar(Professor professor) {
        return "o professor chama : "+ professor.getNome() + "| seu telefone eh: " + professor.getTelefone() + "| sua matricula eh: " + professor.getMtr1() + "| seu curso eh: " + professor.getCurso() + "| seu titulo eh: " + professor.getTitulo();
    }

    public String comprimentar(Responsavel responsavel) {
        return "o responsavel chama : "+ responsavel.getNome() + "| seu telefone eh: " + responsavel.getTelefone() + "| seu cpf eh: " + responsavel.getCpf();
    }
 }

