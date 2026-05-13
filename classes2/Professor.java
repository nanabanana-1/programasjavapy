public class Professor extends Alunos {
    public String titulo;

    public Professor(String mtr1, String nome, String telefone, String cpf, String curso, String titulo) {
        super(mtr1, nome, telefone, cpf, curso);
        this.titulo = titulo;
    }
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String Saudacao() {
        return "Bem-vindo, professor!";
    }
}