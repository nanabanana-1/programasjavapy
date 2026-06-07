public class Funcionario extends Pessoa {
    private String cod;
    private String funcao;

    public Funcionario(String nome, String telefone, String cpf, String cod, String funcao) throws DadoInvalidoException {
        super(nome, telefone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    
    public String getCod() {
        return cod;
    }

    public String getFuncao() {
        return funcao;
    }

   
    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String Saudacao() {
        return "Bem-vindo, funcionário!";
    }
}