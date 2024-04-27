import javax.swing.JOptionPane;
public class App {
    // definição de constantes para evitar repetição de strings
    private static final String NOME_MODELO = "Modelo ";
    private static final String ARMAZENAMENTO = "Armazenamento ";
    public static final String ESCOLHER_OPCAO = "Escolha uma opção para: ";
    public static final String SENHA_CELULAR = "Qual a senha do meu celular? ";
    public static final String SENHA_CORRETA = "A senha está correta!";
    public static final String SENHA_INCORRETA = "A senha está incorreta, digite novamente";
    public static final String RETORNAR_MENU = "Deseja retornar ao menu? ";
    public static final String MENU = "MENU";
    public static final String PROGRAMA_ENCERRADO = "Programa encerrado";
    public static final String AUMENTAR_VOLUME = "Em quanto deseja aumentar o volume? ";
    public static final String ABAIXAR_VOLUME = "Em quanto deseja abaixar o volume? ";
    public static final String ESCOLHER_MENU_VOLUME = "Escolha entre aumentar ou abaixar o volume";
    public static final String VOLUME_ABAIXADO = "Volume abaixado em ";
    public static final String VOLUME_AUMENTADO = "Volume aumentado em ";
    public static final String ENTRAR_YOUTUBE = "Entrar no Youtube";
    public static final String CLIQUE_YOUTUBE = "Clique em sim para entrar no Youtube";
    public static final String ACESSO_LIBERADO = "Conseguiu acesso";
    public static final String ACESSO_NEGADO = "Não conseguiu acesso";
    public static void main(String[] args) throws Exception {
        // instanciação do objeto
        Celular meuCelular = new Celular();
        // declaração de variáveis
        int senha, menu = 0, voltar = 0, botao_volume;
        String modelo, armazenamento;
        modelo = JOptionPane.showInputDialog("Digite o modelo do celular ");
        meuCelular.setModelo(modelo);
        armazenamento = JOptionPane.showInputDialog("Digite o armazenamento do celular ");
        meuCelular.setArmazenamento(armazenamento);
    
        // declaração do array com as opções
        String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Entrar no Youtube"};
        
        JOptionPane.showMessageDialog(null, NOME_MODELO + meuCelular.getModelo() + "\n"+ARMAZENAMENTO + meuCelular.getArmazenamento());
        // inicialização do laço do while para o menu
        do {
            menu = JOptionPane.showOptionDialog(null, ESCOLHER_OPCAO + meuCelular.getModelo(), MENU, 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao, escolherOpcao[0]);
                   
            switch (menu) {
                // função digitar a senha
                case 1:
                // instrução do while que solicita a senha do celular e logo após entra na condição de que se a senha for = 1908, retorna true e com a mensagem Senha correta, se não for igual a 1908 retorna false com a mensagem Senha incorreta e fica no loop até que a senha seja igual a 1908.
                    do {
                        senha = Integer.parseInt(JOptionPane.showInputDialog(null, SENHA_CELULAR));
                        if (meuCelular.inserirSenha(senha)) {
                            JOptionPane.showMessageDialog(null,SENHA_CORRETA);
                        }else{
                            JOptionPane.showMessageDialog(null, SENHA_INCORRETA);
                        }
                        // enquanto a senha for errada, volta para o loop(O '!' INDICA O OPERADOR LÓGICO NOT), o método já é true, então pela lógica, ele vai ser negado
                    } while (!meuCelular.inserirSenha(senha));
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
                        // String escolha de opção para o volume
                        String opcoesVolume[] = {"Aumentar volume" , "Abaixar volume", "Retornar ao Menu"};
                        // variavel de quantidade do volume
                        int quantidade_volume = 0;
                        // variavel do método aumentar volume, com a opção de aumentar ou abaixar o volume
                        botao_volume = JOptionPane.showOptionDialog(null, ESCOLHER_MENU_VOLUME,MENU , 0, JOptionPane.QUESTION_MESSAGE, null, opcoesVolume, opcoesVolume[0]);
                        
                        // se escolher o array aumentar o volume, entra nessa condição
                        switch (botao_volume) {
                            case 0:
                            if (meuCelular.aumentarVolume(botao_volume)) {
                                // escolha da quantidade para aumentar o volume
                                quantidade_volume = Integer.parseInt(JOptionPane.showInputDialog(AUMENTAR_VOLUME));
                                JOptionPane.showMessageDialog(null, VOLUME_AUMENTADO + quantidade_volume);
                            }break;
                            // se escolher o array abaixar o volume, entra nessa condição
                            case 1:
                            if (!meuCelular.aumentarVolume(botao_volume)) {
                                // escolha da quantidade para abaixar o volume
                                quantidade_volume = Integer.parseInt(JOptionPane.showInputDialog(ABAIXAR_VOLUME));
                                JOptionPane.showMessageDialog(null, VOLUME_ABAIXADO + quantidade_volume);
                            }
                            break;
                            case 2:
                                // voltar ao menu
                            voltar = JOptionPane.showConfirmDialog(null, RETORNAR_MENU, MENU, JOptionPane.YES_NO_OPTION);
                            // se a variavel voltar for igual a 0, retorna para o menu, o 0 indica a opção 'YES', e o 1 a opção 'NO'.
                            if (voltar == 0) {
                                menu =4;
                            }else{
                                // indica a posição 0 do menu(sair)
                                menu =0;
                                JOptionPane.showMessageDialog(null, PROGRAMA_ENCERRADO);
                            }
                        }  break;
                            
                    } while (meuCelular.aumentarVolume(botao_volume));
                    break;

                case 3:
                    // função entrar no youtube
                    int youtube = JOptionPane.showConfirmDialog(null, CLIQUE_YOUTUBE, ENTRAR_YOUTUBE, JOptionPane.YES_NO_OPTION);
                    // usando condição falsa (ARRUMAR), ainda não entendi
                    if (meuCelular.entrar_Youtube(youtube) == false) {
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
