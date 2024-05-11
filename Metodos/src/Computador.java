public class Computador extends Dispositivos {
    
    @Override
    public boolean desligar() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean ligar() {
        if (botao_ligar == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean inserirSenha(int senha) {
     return true;   
    }

    @Override
    public boolean aumentarVolume(int botao_volume) {
        // TODO Auto-generated method stub
        return false;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public int getSenha(){
        return this.senha;
    }
    
    public void setBotao_volume(int botao_volume){
        this.botao_volume = botao_volume;
    }

    public int getBotao_volume(){
        return this.botao_volume;
    }
}
