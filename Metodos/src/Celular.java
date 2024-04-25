public class Celular {
    private String tela;
    private int youtube;
    private String botao;
    private int botao_volume;
    private int senha;

    public Celular(){

    }
    public Celular(String tela, int youtube, String botao, int botao_volume, int senha){
        this.tela = tela;
        this.youtube = youtube;
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

    public void setyoutube(int youtube){
        this.youtube = youtube;
    }

    public int getyoutube(){
        return this.youtube;
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

    // função inserir senha
    public boolean inserirSenha(int senha){
        if (senha == 1908) {
            return true;
        }else{
            return false;
        }
    }

    // função aumentar volume
    public boolean aumentarVolume(int botao_volume){
        if (botao_volume == 0) {
            return true;
        }else{
            return false;
        }
    }

    // função entrar no Youtubue
    public boolean entrar_Youtube(int youtube){
        if (youtube ==1) {
            return true;
        }else{
            return false;
        }
    }

    
}
