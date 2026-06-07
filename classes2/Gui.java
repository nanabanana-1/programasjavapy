import javax.swing.JOptionPane;

class Gui implements InterfaceUsuario {
    public void mostrarMensagem(String mensagem, String titulo, boolean ehErro) {
        int tipo = ehErro ? JOptionPane.ERROR_MESSAGE : JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipo);
    }
    public String pedirTexto(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }
    public int pedirInteiro(String mensagem) {
        String resposta = JOptionPane.showInputDialog(mensagem);
        try {
            return resposta == null ? -1 : Integer.parseInt(resposta);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}