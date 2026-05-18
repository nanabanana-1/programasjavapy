class Console implements InterfaceUser{
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMensagem(String mensagem, String titulo, boolean ehErro) {
        String prefixo = ehErro ? "[ERRO] " : "[" + titulo + "] ";
        System.out.println("\n" + prefixo + mensagem);
    }
    public String pedirTexto(String mensagem) {
        System.out.print("\n" + mensagem + " ");
        return scanner.nextLine();
    }
    public int pedirInteiro(String mensagem) {
        System.out.print("\n" + mensagem + " ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}