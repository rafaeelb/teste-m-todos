public class Computador extends Celular{
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
    
}
