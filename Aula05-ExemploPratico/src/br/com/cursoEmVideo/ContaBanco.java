package br.com.cursoEmVideo;

public class ContaBanco {
    int numConta;
    String tipo;
    String dono;
    double saldo;
    boolean status;

    public ContaBanco(String tipo, String dono, boolean status) {
        this.numConta++;
        this.tipo = tipo;
        if (tipo.equals("CC")){
            this.saldo = 50;
        }else{
            this.saldo = 150;
        }
        this.dono = dono;
    }

    public ContaBanco() {

    }

    public void abrirConta(){
        new ContaBanco();
    }


}
