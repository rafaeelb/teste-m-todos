
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Celular cel1 = new Celular();
        int senha, menu = 0, voltar = 0;
        String volume;
        String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Entrar no Youtube"};
        
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
                        // enquanto a senha for errada, volta para o loop
                    } while (cel1.inserirSenha(senha) == false);
                    // instrução para voltar ao menu
                voltar = JOptionPane.showConfirmDialog(null, "Deseja retornar ao menu? ", "Menu", JOptionPane.YES_NO_OPTION);
                // se a variavel voltar for igual a 0, retorna para o menu, o 0 indica a opção 'YES', e o 1 a opção 'NO'.
                if (voltar == 0) {
                    menu =4;
                }else{
                    menu =0;
                    JOptionPane.showMessageDialog(null, "Programa encerrado");
                }
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
                    int youtube = JOptionPane.showConfirmDialog(null, "Clique em sim para entrar no Youtube", "Entrar", JOptionPane.YES_NO_OPTION);
                    // usando condição falsa, ainda não entendi
                    if (cel1.entrar_Youtube(youtube) == false) {
                        JOptionPane.showMessageDialog(null,"Conseguiu acesso");
                    }else{
                        JOptionPane.showMessageDialog(null,"Não conseguiu acesso");
                    }
                break;
            }
        } while (menu !=0);


        // opcVoltar = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?", "Voltar", JOptionPane.YES_NO_OPTION);
        // if (opcVoltar ==0) {
        //     opcaomenu = 4;
        // }
    }
}
