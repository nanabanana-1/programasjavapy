public class Alunos extends Pessoa {
    private String mtr1;
    private String curso;

    public Alunos(String mtr1, String nome, String telefone, String cpf, String curso) {
        super(nome, telefone, cpf);
        this.mtr1 = mtr1;
        this.curso = curso;
    }

    public String getMtr1() {
        return mtr1;
    }

    public String getCurso() {
        return curso;
    }

    public void setMtr1(String mtr1) {
        this.mtr1 = mtr1;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
