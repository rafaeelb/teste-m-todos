public class Celular {
    private String tela;
    private String carregador;
    private String botao;
    private int botao_volume;
    private int senha;

    public Celular(){

    }
    public Celular(String tela, String carregador, String botao, int botao_volume, int senha){
        this.tela = tela;
        this.carregador = carregador;
        this.botao = botao;
        this.botao_volume = botao_volume;
        this.senha = senha;
    }

    public void setTela(String tela){
        this.tela = tela;
    }

    public String getTela(){
        return this.tela;
    }

    public void setCarregador(String carregador){
        this.carregador = carregador;
    }

    public String getCarregador(){
        return this.carregador;
    }

    public void setBotao(String botao){
        this.botao = botao;
    }

    public String botao(){
        return this.botao;
    }

    public void setBotao_volume(int botao_volume){
        this.botao_volume = botao_volume;
    }

    public int getBotao_volume(){
        return this.botao_volume;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public int getSenha(){
        return this.senha;
    }

    public boolean inserirSenha(int senha){
        if (senha == 1908) {
            return true;
        }else{
            return false;
        }
    }
}
