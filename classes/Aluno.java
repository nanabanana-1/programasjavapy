import java.time.LocalTime;

public class Aluno{
    private String nome;
    private int mtr;
    private String dtNascimento;
    private String telefone;
    private String nomeResponsa;

    public Aluno(String nome, int mtr, String dtNascimento, String telefone, String nomeResponsa){
        this.nome = nome;
        this.mtr = mtr;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.nomeResponsa = nomeResponsa;
    }

    public String apresenteSe(){
        return "o aluno eh:" + this.nome + "   | seu telefone eh: " + this.telefone + 
        "  | sua data de nascimento: " + this.dtNascimento + "  | sua matricula";
    }

    public String Saudacao(){
        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();
        if(hora >= 6 && hora < 12){
            return "Bomdia";
        } else if(hora >= 12 && hora < 18){
            return "Boatarde";
        } else {
            return "Boanoite";
        }
        
    }
}