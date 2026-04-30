class Alunos extends Pessoa{
    public String mtr1;
    public String curso;

    public Alunos(String mtr1, String nome, String telefone, String cpf, String curso) {
        super(nome, telefone, cpf);
        this.mtr1 = mtr1;
        this.curso = curso;
    }

    public String aprende(){
        return "o aluno eh:" + this.nome + "   | seu telefone eh: " + this.telefone +  "  | sua matricula " + this.mtr1 + "| ele aprende: " + this.curso;
    }
}
