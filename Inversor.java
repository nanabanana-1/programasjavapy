public class Inversor {
    public static void main(String[] args) {
        int resultado = inverter(1234);
        System.out.println("O inverso é: " + resultado);
    }

    public static int inverter(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }
}