import javax.swing.JOptionPane;
public class App {
    // definição de constantes para evitar repetição de strings
    private static final String DIGITAR_MODELO_CELULAR = "Digite o modelo do celular";
    private static final String DIGITAR_ARMAZENAMENTO = "Digite o armazenamento do celular";
    private static final String NOME_MODELO = "Modelo ";
    private static final String ARMAZENAMENTO = "Armazenamento ";
    private static final String ESCOLHER_OPCAO = "Escolha uma opção para: ";
    private static final String SENHA_CELULAR = "Qual a senha do meu celular? (Digite apenas valores numéricos inteiros)";
    private static final String SENHA_CORRETA = "A senha está correta!";
    private static final String SENHA_INCORRETA = "A senha está incorreta, digite novamente";
    private static final String VALORES_NUMÉRICOS = "Digite apenas valores numéricos inteiros";
    private static final String RETORNAR_MENU = "Deseja retornar ao menu? ";
    private static final String MENU = "MENU";
    private static final String PROGRAMA_ENCERRADO = "Programa encerrado";
    private static final String AUMENTAR_VOLUME = "Em quanto deseja aumentar o volume? ";
    private static final String ABAIXAR_VOLUME = "Em quanto deseja abaixar o volume? ";
    private static final String ESCOLHER_MENU_VOLUME = "Escolha entre aumentar ou abaixar o volume";
    private static final String VOLUME_ABAIXADO = "Volume abaixado em ";
    private static final String VOLUME_AUMENTADO = "Volume aumentado em ";
    // private static final String ENTRAR_YOUTUBE = "Entrar no Youtube";
    // private static final String CLIQUE_YOUTUBE = "Clique em sim para entrar no Youtube";
    // private static final String ACESSO_LIBERADO = "Conseguiu acesso";
    // private static final String ACESSO_NEGADO = "Não conseguiu acesso";
    public static void main(String[] args) {
        // instanciação dos objetos
        Celular meuCelular = new Celular();
        Computador meuComputador = new Computador();
        // declaração de variáveis
        int senha = 0, menu = 0, voltar = 0, botao_volume, menuAparelhos = 0;
        String modelo, armazenamento;
        do {
            // menu escolha de aparelhos
            String escolherMenu[] = {"Sair", "Celular", "Computador"};
            menuAparelhos = JOptionPane.showOptionDialog(null, "Escolha uma opção", MENU, 0, JOptionPane.QUESTION_MESSAGE, null, escolherMenu, escolherMenu[0]);
            switch (menuAparelhos) {
                // inicialização da função para o celular
                case 1:
                    // ligar o celular
                    meuCelular.ligar();

                    JOptionPane.showMessageDialog(null, "Celular ligado... Aperte em OK para prosseguir");
                    modelo = JOptionPane.showInputDialog(DIGITAR_MODELO_CELULAR);
                    meuCelular.setModelo(modelo);
                    armazenamento = JOptionPane.showInputDialog(DIGITAR_ARMAZENAMENTO);
                    meuCelular.setArmazenamento(armazenamento);
                    
                
                    // declaração do array(vetor) com as opções
                    String escolherOpcao[] = {"Sair", "Digitar a senha", "Aumentar volume", "Desligar o Celular"};
                    
                    JOptionPane.showMessageDialog(null, NOME_MODELO + meuCelular.getModelo() + "\n"+ARMAZENAMENTO + meuCelular.getArmazenamento());
                    // inicialização do laço do while para o menu das opções
                    do {
                        menu = JOptionPane.showOptionDialog(null, ESCOLHER_OPCAO + meuCelular.getModelo(), "Meu Celular", 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao, escolherOpcao[0]);
                            
                        switch (menu) {
                            // função digitar a senha
                            case 1:
                            // instrução while que solicita a senha do celular até que forneça a correta
                                    while (!meuCelular.inserirSenha(senha)) {
                                        try {
                                            senha = Integer.parseInt(JOptionPane.showInputDialog(null, SENHA_CELULAR));
                                            if (meuCelular.inserirSenha(senha)) {
                                                JOptionPane.showMessageDialog(null, SENHA_CORRETA);
                                            }else{
                                                JOptionPane.showMessageDialog(null, SENHA_INCORRETA);
                                            }
                                            // TRATAMENTO DE EXCECÃO, ACEITANDO APENAS VALORES NUMÉRICOS
                                        } catch (NumberFormatException e) {
                                            JOptionPane.showMessageDialog(null, VALORES_NUMÉRICOS);
                                        }
                                    }
                                break;
        
                        case 2:
                            //funçao aumentar volume
                            do {
                                // String escolha de opção para o volume
                                String opcoesVolume[] = {"Sair","Aumentar volume" , "Abaixar volume", "Retornar ao Menu"};
                                // variavel de quantidade do volume
                                int quantidade_volume = 0;
                                // variavel do método aumentar volume, com a opção de aumentar ou abaixar o volume
                                botao_volume = JOptionPane.showOptionDialog(null, ESCOLHER_MENU_VOLUME,MENU , 0, JOptionPane.QUESTION_MESSAGE, null, opcoesVolume, opcoesVolume[0]);
                                
                                
                                switch (botao_volume) {
                                    // encerrar programa
                                    case 0:
                                    menu = 0;
                                    menuAparelhos = 0;
                                    JOptionPane.showMessageDialog(null, PROGRAMA_ENCERRADO);
                                    break;

                                    // se escolher o array aumentar o volume, entra nessa condição
                                    case 1:
                                    if (!meuCelular.aumentarVolume(botao_volume)) {
                                        // escolha da quantidade para aumentar o volume
                                        quantidade_volume = Integer.parseInt(JOptionPane.showInputDialog(AUMENTAR_VOLUME));
                                        JOptionPane.showMessageDialog(null, VOLUME_AUMENTADO +  quantidade_volume);
                                        // }
                                    }break;
                                    // se escolher o array abaixar o volume, entra nessa condição
                                    case 2:
                                    if (!meuCelular.aumentarVolume(botao_volume)) {
                                        // escolha da quantidade para abaixar o volume
                                        quantidade_volume = Integer.parseInt(JOptionPane.showInputDialog(ABAIXAR_VOLUME));
                                        JOptionPane.showMessageDialog(null, VOLUME_ABAIXADO + quantidade_volume);
                                    }
                                    break;
                                    case 3:
                                        //voltar ao menu
                                    voltar = JOptionPane.showConfirmDialog(null, RETORNAR_MENU, MENU, JOptionPane.YES_NO_OPTION);
                                    //instrução voltar ao menu
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
                            meuCelular.desligar();
                            JOptionPane.showMessageDialog(null, "Celular desligado");
                            menu = 0;
                        break;
                    }
                    if (menu !=0) {
                        voltar = JOptionPane.showConfirmDialog(null, RETORNAR_MENU, MENU, JOptionPane.YES_NO_OPTION);
                        if (voltar == 0) {
                            menu =4;
                        }else{
                            menu =0;
                            menuAparelhos =0;
                            JOptionPane.showMessageDialog(null, PROGRAMA_ENCERRADO);
                        }
                    }
                    // conclusão do laço do while para o menu das opções do celular.
                } while (menu !=0 && voltar == JOptionPane.YES_OPTION);
                    break;

                // computador
                case 2:
                    senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha para o seu computador"));
                    meuComputador.setSenha(senha);
                    JOptionPane.showMessageDialog(null, "Senha cadastrada");
                    // String escolherOpcao_PC[] = {"Sair", "Digitar Senha"};
                    // int menuPC;
                    // menuPC= JOptionPane.showOptionDialog(null, ESCOLHER_OPCAO, MENU, 0, JOptionPane.QUESTION_MESSAGE, null, escolherOpcao_PC, escolherOpcao_PC[0]);
            }
            if (menuAparelhos!=0) {
                voltar = JOptionPane.showConfirmDialog(null, RETORNAR_MENU, MENU, JOptionPane.YES_NO_OPTION);
                        if (voltar == 0) {
                            menu =4;
                        }else{
                            menu = 0;
                            menuAparelhos =0;
                            JOptionPane.showMessageDialog(null, PROGRAMA_ENCERRADO);
                        }
            }
            // conclusão do laço do while para o menu dos aparelhos
        } while (menuAparelhos !=0 && voltar == JOptionPane.YES_OPTION);
        
    }
}
