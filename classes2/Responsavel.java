import java.util.ArrayList;
import java.util.List;
public class Responsavel extends Pessoa {

    public List<Alunos> alunos;

    public Responsavel(String nome, String telefone, String cpf) throws DadoInvalidoException {
        super(nome, telefone, cpf);
        this.alunos = new ArrayList<>();
    }


    public List<Alunos> getAlunos() {
        return alunos;
    }

    public void addAluno(Alunos aluno) {
        this.alunos.add(aluno);
    }
    
    public String Saudacao1() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oi, eu sou ").append(getNome()).append(" | meu telefone eh: ").append(getTelefone()).append(" | meu cpf eh: ").append(getCpf());
        if (!alunos.isEmpty()) {
            sb.append(" | sou responsavel pelos alunos: ");
            for (Alunos a : alunos) {
                sb.append(a.getNome()).append(" (").append(a.getCpf()).append("), ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String Saudacao() {
        return "Bem-vindo, responsável!";
    }
}