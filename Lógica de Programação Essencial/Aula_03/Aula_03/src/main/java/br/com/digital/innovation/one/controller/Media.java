package br.com.digital.innovation.one.controller;

public class Media {
    public Media() {
        super();
    }



    private double calcTotal(double n1, double n2, double n3, double n4){
        double res = 0;

        res = n1 + n2 + n3 + n4;

        return res;
    }

    private double calcMedia(double total){
        double res = 0;

        res = total / 4;

        return res;
    }
    public void exibeMedia(double n1, double n2, double n3, double n4){

        System.out.println(n1 + " + " + n2 + " + " + n3 + " + " + n4 + " = " + calcTotal(n1, n2, n3, n4));
        System.out.println("A média aritimética das notas 5, 7, 10 e 3 é igual a " + calcMedia(calcTotal(n1, n2, n3, n4)));
    }
}
