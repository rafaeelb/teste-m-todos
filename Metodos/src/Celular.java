public abstract class Celular implements Aparelhos{
    private String modelo;
    private int youtube;
    private String armazenamento;
    private int botao_volume;
    private int senha;

    public Celular(){

    }
 
    public Celular(String modelo, int youtube, String armazenamento, int botao_volume, int senha) {
        this.modelo = modelo;
        this.youtube = youtube;
        this.armazenamento = armazenamento;
        this.botao_volume = botao_volume;
        this.senha = senha;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setyoutube(int youtube){
        this.youtube = youtube;
    }

    public int getyoutube(){
        return this.youtube;
    }

    public void setArmazenamento(String armazenamento){
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento(){
        return this.armazenamento;
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
    // public boolean aumentarVolume(int botao_volume){
    //     if (botao_volume == 0) {
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    // função entrar no Youtubue
    public boolean entrar_Youtube(int youtube){
        if (youtube ==1) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean inserirSenha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserirSenha'");
    }

    @Override
    public boolean aumentarVolume() {
        if (botao_volume == 0) {
            return true;
        }else{
            return false;
        }
    }

    
}
