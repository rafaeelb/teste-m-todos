
import javax.swing.JOptionPane;

public class App {
    // definição de constantes para evitar repetição de strings
    private static final String ESCOLHER_OPCAO = "Escolha uma opção";
    private static final String SENHA_CELULAR = "Qual a senha do meu celular? ";
    private static final String SENHA_CORRETA = "A senha está correta!";
    private static final String SENHA_INCORRETA = "A senha está incorreta, digite novamente";
    private static final String RETORNAR_MENU = "Deseja retornar ao menu? ";
    private static final String MENU = "MENU";
    private static final String PROGRAMA_ENCERRADO = "Programa Encerrado";
    private static final String AUMENTAR_VOLUME = "Deseja aumentar o volume? ";
    private static final String VOLUME_ABAIXADO = "Volume abaixado";
    private static final String VOLUME_AUMENTADO = "Volume aumentado";
    private static final String ENTRAR_YOUTUBE = "Entrar no Youtube";
    private static final String CLIQUE_YOUTUBE = "Clique em sim para entrar no Youtube";
    private static final String ACESSO_LIBERADO = "Conseguiu acesso";
    private static final String ACESSO_NEGADO = "Não conseguiu acesso";
    public static void main(String[] args) throws Exception {
        // instanciação do objeto
        Celular cel1 = new Celular();
        // declaração de variáveis
        int senha, menu = 0, voltar = 0;
        String volume;
        // declaração do array com as opções
        String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Entrar no Youtube"};
        
        // inicialização do laço do while para o menu
        do {
            menu = JOptionPane.showOptionDialog(null, ESCOLHER_OPCAO, MENU, 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao, escolherOpcao[0]);
                   
            switch (menu) {
                // função digitar a senha
                case 1:
                // instrução do while que solicita a senha do celular e logo após entra na condição de que se a senha for = 1908, retorna true e com a mensagem Senha correta, se não for igual a 1908 retorna false com a mensagem Senha incorreta e fica no loop até que a senha seja igual a 1908.
                    do {
                        senha = Integer.parseInt(JOptionPane.showInputDialog(null, SENHA_CELULAR));
                        if (cel1.inserirSenha(senha)) {
                            JOptionPane.showMessageDialog(null,SENHA_CORRETA);
                        }else{
                            JOptionPane.showMessageDialog(null, SENHA_INCORRETA);
                        }
                        // enquanto a senha for errada, volta para o loop
                    } while (cel1.inserirSenha(senha) == false);
                    // instrução para voltar ao menu
                voltar = JOptionPane.showConfirmDialog(null, RETORNAR_MENU, MENU, JOptionPane.YES_NO_OPTION);
                // se a variavel voltar for igual a 0, retorna para o menu, o 0 indica a opção 'YES', e o 1 a opção 'NO'.
                if (voltar == 0) {
                    menu =4;
                }else{
                    // indica a posição 0 do menu(sair)
                    menu =0;
                    JOptionPane.showMessageDialog(null, PROGRAMA_ENCERRADO);
                }
                    break;

                case 2:
                    //funçao aumentar volume
                    volume = JOptionPane.showInputDialog(null,AUMENTAR_VOLUME);
                    if (cel1.aumentarVolume(volume) == true) {
                        JOptionPane.showMessageDialog(null, VOLUME_AUMENTADO);
                    }else{
                        JOptionPane.showMessageDialog(null, VOLUME_ABAIXADO);
                    }
                break;

                case 3:
                    // função entrar no youtube
                    int youtube = JOptionPane.showConfirmDialog(null, CLIQUE_YOUTUBE, ENTRAR_YOUTUBE, JOptionPane.YES_NO_OPTION);
                    // usando condição falsa (ARRUMAR), ainda não entendi
                    if (cel1.entrar_Youtube(youtube) == false) {
                        JOptionPane.showMessageDialog(null,ACESSO_LIBERADO);
                    }else{
                        JOptionPane.showMessageDialog(null,ACESSO_NEGADO);
                    }
                break;
            }
            // conclusão do laço do while para o menu
        } while (menu !=0);
    }
}
