import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Celular cel1 = new Celular();
        int senha, menu;
        String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Entrar no Youtube"};

        menu = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao, escolherOpcao[0]);
      switch (menu) {
        case 1:
         // instrução do while que solicita a senha do celular e logo após entra na condição de que se a senha for = 1908, retorna true e com a mensagem Senha correta, se não for igual a 1908 retorna false com a mensagem Senha incorreta e fica no loop até que a senha seja igual a 1908.
            do {
                senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a senha do meu celular?"));
                if (cel1.inserirSenha(senha)) {
                    JOptionPane.showMessageDialog(null,"A senha está correta");
                }else{
                    JOptionPane.showMessageDialog(null, "A senha está incorreta, digite novamente");
                }
            } while (cel1.inserirSenha(senha) == false);
            break;
        case 2:
            //funçao aumentar volume
        break;

        default:
            break;
      }

        
    }
}
