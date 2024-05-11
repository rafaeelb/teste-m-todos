public abstract class Dispositivos {
    protected int senha;
    protected int botao_volume;
    protected int botao_ligar;
    
    public abstract boolean inserirSenha(int senha);
    public abstract boolean aumentarVolume(int botao_volume);
    public abstract boolean ligar(int botao_ligar);
    public abstract boolean desligar(int botao_ligar);
}
