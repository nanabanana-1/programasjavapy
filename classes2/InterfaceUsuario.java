public interface InterfaceUsuario {
    void mostrarMensagem(String mensagem, String titulo, boolean ehErro);
    String pedirTexto(String mensagem);
    int pedirInteiro(String mensagem);
}