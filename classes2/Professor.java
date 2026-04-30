class Professor extends Alunos{
    String titulo;

    public Professor(String mtr1, String nome, String telefone, String cpf, String curso, String titulo) {
        super(mtr1, nome, telefone, cpf, curso);
        this.titulo = titulo;

    }

    public String ENSINA(){
        return "o professsor ensina: " + this.titulo + " seu curso foi: " + this.curso;
    }

    
}
