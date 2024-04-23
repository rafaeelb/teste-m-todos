import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Celular cel1 = new Celular();
        int senha, menu, opcaomenu = 0;
        String volume;
        String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Entrar no Youtube", "Voltar ao menu"};
        do {
            menu = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao, escolherOpcao[0]);
                   
      switch (menu) {
        // função digitar a senha
        case 1:
         // instrução do while que solicita a senha do celular e logo após entra na condição de que se a senha for = 1908, retorna true e com a mensagem Senha correta, se não for igual a 1908 retorna false com a mensagem Senha incorreta e fica no loop até que a senha seja igual a 1908.
            do {
                senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a senha do meu celular?"));
                if (cel1.inserirSenha(senha)) {
                    JOptionPane.showMessageDialog(null,"A senha está correta! Conseguiu o acesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "A senha está incorreta, digite novamente");
                }
            } while (cel1.inserirSenha(senha) == false);
            break;

        case 2:
            //funçao aumentar volume
            volume = JOptionPane.showInputDialog(null,"Deseja aumentar o volume?");
            if (cel1.aumentarVolume(volume) == true) {
                JOptionPane.showMessageDialog(null,"Volume aumentado");
            }else{
                JOptionPane.showMessageDialog(null,"Volume abaixado");
            }
        break;

        case 3:
            // função entrar no youtube
        break;

        case 4:
            // voltar ao menu
          opcaomenu = 4;
        break;
      }
        } while (opcaomenu !=0);

    }
}
