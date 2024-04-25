
import javax.swing.JOptionPane;

public class App {
    // definição de constantes para evitar repetição de strings
    public static final String ESCOLHER_OPCAO = "Escolha uma opção";
    public static final String SENHA_CELULAR = "Qual a senha do meu celular? ";
    public static final String SENHA_CORRETA = "A senha está correta!";
    public static final String SENHA_INCORRETA = "A senha está incorreta, digite novamente";
    public static final String RETORNAR_MENU = "Deseja retornar ao menu? ";
    public static final String MENU = "MENU";
    public static final String PROGRAMA_ENCERRADO = "Programa Encerrado";
    public static final String AUMENTAR_VOLUME = "Deseja aumentar o volume? ";
    public static final String VOLUME_ABAIXADO = "Volume abaixado";
    public static final String VOLUME_AUMENTADO = "Volume aumentado";
    public static final String ENTRAR_YOUTUBE = "Entrar no Youtube";
    public static final String CLIQUE_YOUTUBE = "Clique em sim para entrar no Youtube";
    public static final String ACESSO_LIBERADO = "Conseguiu acesso";
    public static final String ACESSO_NEGADO = "Não conseguiu acesso";
    public static void main(String[] args) throws Exception {
        // instanciação do objeto
        Celular cel1 = new Celular();
        // declaração de variáveis
        int senha, menu = 0, voltar = 0;
        int botao_volume;
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
                    do {
                    botao_volume = JOptionPane.showConfirmDialog(null, AUMENTAR_VOLUME, MENU, JOptionPane.YES_NO_OPTION);
                        // ARRUMAR CONDIÇÃO ///
                        if (cel1.aumentarVolume(botao_volume) == true) {
                            int quantidade_volume = Integer.parseInt(JOptionPane.showInputDialog("Em quanto deseja aumentar o volume? "));
                            JOptionPane.showMessageDialog(null, "Volume aumentado em" + quantidade_volume);
                        }else{
                            JOptionPane.showMessageDialog(null, "Volume abaixado em " + botao_volume);
                        }
                    } while (cel1.aumentarVolume(botao_volume) == true);
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
