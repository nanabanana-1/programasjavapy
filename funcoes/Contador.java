public class Contador {
    public static void main(String[] args) {
        verificarTamanho("Frase de exemplo");
    }

    public static void verificarTamanho(String frase) {
        int total = frase.length();
        System.out.println("A frase tem " + total + " caracteres.");
    }
}