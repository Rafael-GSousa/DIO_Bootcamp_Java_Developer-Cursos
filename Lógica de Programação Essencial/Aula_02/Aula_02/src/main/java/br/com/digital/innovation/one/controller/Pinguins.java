package br.com.digital.innovation.one.controller;

import javax.swing.*;


public class Pinguins {
    public Pinguins(){
        super();
    }

    private String tipo(int tipo){
        if(tipo == 1){
           return "Filho ";
        }else{
            return "Pai ";
        }
    }

    private String cor(int cor){
        if(cor == 1){
            return "Azul";
        }else if(cor == 2){
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
        int color;
        int action;

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("1 - Mover Filho\n2 - Mover Pai\n3 - Mover Bloco\n0 - Finalizar"));
            switch (option){
                case 1:
                case 2:
                    color = Integer.parseInt(JOptionPane.showInputDialog("1 - Azul\n2 - Verde\n3 - Vermelho"));
                    action = Integer.parseInt(JOptionPane.showInputDialog("1 - subir\n2 - descer"));
                    System.out.println(tipo(option) + cor(color) + acao(action));
                    break;
                case 3:
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
