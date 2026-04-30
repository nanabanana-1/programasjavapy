import java.util.ArrayList;
import java.util.List;
class Responsavel extends Pessoa{

    public List<Alunos> alunos;

    public Responsavel(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        this.alunos = new ArrayList<>();
    }

    @Override
    public String Saudacao(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.cpf).append("oi, eu sou ").append(this.nome).append("   | meu telefone eh: ").append(this.telefone).append("  | e meu cpf eh: ").append(this.cpf);
        if (!alunos.isEmpty()) {
            sb.append(" | sou responsavel pelos alunos: ");
            for (Alunos a : alunos) {
                sb.append(a.nome).append(" (").append(a.cpf).append("), ");
            }
            // Remover a última vírgula e espaço
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}