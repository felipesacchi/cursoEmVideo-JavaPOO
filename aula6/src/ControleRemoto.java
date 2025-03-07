public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Esta ligado? " + isLigado());
        System.out.println("Esta tocando? " + isTocando());
        System.out.print("Volume: " + getVolume());

        for (int i = 0; i <= getVolume(); i+=10){
            System.out.print("#");
        }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()){
            setVolume(getVolume() - 5);
            System.out.println("Volume aumentou em 5");
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()){
            setVolume(getVolume() - 5);
            System.out.println("Volume diminuiu em 5");
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado()){
            if (getVolume() > 0){
                setVolume(0);
                System.out.println("Volume no mudo");
            }else{
                System.out.println("Volume ja estava mudo");
            }
        }else {
            System.out.println("Tv desligada");
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado()){
            if (getVolume() == 0){
                setVolume(50);
                System.out.println("Volume no 50");
            }else{
                System.out.println("Volume nao estava no mudo");
            }
        }else {
            System.out.println("Tv desligada");
        }
    }

    @Override
    public void play() {
        if (isLigado() && !(isTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()){
            setTocando(false);
        }
    }
}
