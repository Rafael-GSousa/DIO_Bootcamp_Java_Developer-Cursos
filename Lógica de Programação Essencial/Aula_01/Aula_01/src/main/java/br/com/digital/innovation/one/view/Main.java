package br.com.digital.innovation.one.view;

import br.com.digital.innovation.one.controller.Media;

public class Main {
    public static void main(String[] args) {

        Media media = new Media();

        double n1 = 5, n2 = 7, n3 = 10, n4 = 3, md;

        md = media.calcMedia(n1, n2, n3, n4);

        media.exibeMedia(md);

    }
}
