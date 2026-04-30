public class Pessoa {
    public String nome;
    public String telefone;
    public String cpf;

    public Pessoa(String nome, String telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String Saudacao(){
        return this.cpf + "oi, eu sou " + this.nome + "   | meu telefone eh: " + this.telefone + 
                "  | e meu cpf eh: ";
    }

}
