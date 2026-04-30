class Funcionario extends Pessoa {
    public String cod;
    public String funcao;

    public Funcionario(String nome, String telefone, String cpf, String cod, String funcao) {
        super(nome, telefone, cpf);
        this.cod = cod;
        this.funcao = funcao;
    }

    String temFuncao(){
        return "sou funcionario, minha funcao eh:" + this.funcao;
    }
}
