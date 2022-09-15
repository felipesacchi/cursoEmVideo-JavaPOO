package br.com.cursoEmVideo;

public class Main {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
        Caneta c2 = new Caneta("TIC", "Verde", 0.5f);

        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        c1.status();
        System.out.println();
        c2.status();

    }
}
