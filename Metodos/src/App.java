import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Celular cel1 = new Celular();
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.println("Qual a senha do meu celular? ");
            senha = sc.nextInt();
            cel1.inserirSenha(senha);
            if (senha == 1908) {
                System.out.println("Senha correta");
            }else{
                System.out.println("Senha incorreta");
            }
        } while (senha != 1908);

        
    }
}
