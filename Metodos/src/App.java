import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Celular cel1 = new Celular();
        // Scanner sc = new Scanner(System.in);
        // declaração da variável senha para manipular o método
        int senha;

        // instrução do while que solicita a senha do celular e logo após entra na condição de que se a senha for = 1908, retorna true e com a mensagem Senha correta, se não for igual a 1908 retorna false com a mensagem Senha incorreta e fica no loop até que a senha seja igual a 1908.
        do {
            senha = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a senha do meu celular?"));
        if (cel1.inserirSenha(senha)) {
            JOptionPane.showMessageDialog(null,"A senha está correta");
        }else{
            JOptionPane.showMessageDialog(null, "A senha está incorreta, digite novamente");
        }
        } while (cel1.inserirSenha(senha) == false);
        

        // do {
        //     System.out.println("Qual a senha do meu celular? ");
        //     senha = sc.nextInt();

        //     if (cel1.inserirSenha(senha)) {
        //         System.out.println(senha+" é a senha correta");
        //     }else{
        //         System.out.println(senha+" é a senha incorreta, digite novamente");
        //     }
        // } while (cel1.inserirSenha(senha) == false);
    }
}
