package br.com.digital.innovation.one.controller;

import javax.swing.*;


public class Pinguins {
    public Pinguins(){
        super();
    }

    private String tipo(int tipo){
        if(tipo == 1 || tipo == 3 || tipo == 5){
           return "Filhote ";
        }else{
            return "Pai ";
        }
    }

    private String cor(int cor){
        if(cor == 1 || cor == 2){
            return "Azul";
        }else if(cor == 3 || cor == 4){
            return "Verde";
        }else{
            return "Vermelho";
        }
    }

    private String acao(int acao){

        if(acao == 1) {
            return " subiu no bloco!";
        }
        else{
            return " desceu do bloco!";
        }

    }

    private String moverBloco(){
        return "Bloco movido!";
    }

    public void msg(){
        int option;
        int action;

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("MOVER\n\n1 - Filhote Azul\n2 - Pai Azul\n3 - Filhote Verde\n" +
                    "4 - Pai Verde\n5 - Filhote Vermelho\n6 - Pai Vermelho\n7 - Bloco\n0 - Finalizar"));
            switch (option){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    action = Integer.parseInt(JOptionPane.showInputDialog("1 - subir\n2 - descer"));
                    System.out.println(tipo(option) + cor(option) + acao(action));
                    break;
                case 7:
                    System.out.println(moverBloco());
                    break;
                case 0:
                    System.out.println("Tarefa finalizada!");
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida!");
            }

        }while(option != 0);

    }

}
