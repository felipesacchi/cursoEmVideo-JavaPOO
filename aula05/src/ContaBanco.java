import java.util.Objects;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (Objects.equals(t, "CC")){
            setSaldo(50);
        }else if (Objects.equals(t, "CP")){
            setSaldo(150);
        }
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0){
            System.out.println("Conta negativa");
        }else {
            setStatus(false);
        }
    }

    public void depositar(double v){
        if (isStatus()){
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(double v){
        if(isStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo() - v);
            } else{
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }

    }

    public void pagarMensal(){
        int v = 0;
        if (getTipo().equals("CC")){
            v = 12;
        } else if (getTipo().equals("CP")) {
            v = 20;
        }
        if (isStatus()){
            if (getSaldo() > v){
                setSaldo(getSaldo()-v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Impossivel pagar");
        }

    }

    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }


}
