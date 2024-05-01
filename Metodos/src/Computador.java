public abstract class Computador implements Aparelhos{
    private boolean ligar_computador;
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean getLigar_computador() {
        return ligar_computador;
    }

    public void setLigar_computador(boolean ligar_computador) {
        this.ligar_computador = ligar_computador;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public boolean inserirSenha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserirSenha'");
    }

    @Override
    public boolean aumentarVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aumentarVolume'");
    }

    // public boolean inserirSenha(int senha){
    //     o mesmo método da classe celular, porém com verificação de uma senha determinada pelo usuário
    // }
    
}
