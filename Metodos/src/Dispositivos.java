public abstract class Dispositivos {
    public int senha;
    public int botao_volume;
    
    public abstract boolean inserirSenha(int senha);
    public abstract boolean aumentarVolume(int botao_volume);
}
