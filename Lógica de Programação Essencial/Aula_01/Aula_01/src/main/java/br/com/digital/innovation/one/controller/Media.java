package br.com.digital.innovation.one.controller;

public class Media {
    public Media() {
        super();
    }

    public double calcMedia(double n1, double n2, double n3, double n4){
        double res = 0;

        res = (n1 + n2 + n3 + n4) / 4;

        return res;
    }

    public void exibeMedia(double media){

        System.out.println("A média aritimética das notas 5, 7, 10 e 3 é igual a " + media);
    }
}
