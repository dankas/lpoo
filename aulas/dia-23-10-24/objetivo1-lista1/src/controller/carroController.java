package controller;

import model.Carro;

public class carroController {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

// instaciei os objetos usando o contrutor parametrizado.

        Carro c3 = new Carro(
                "ford",
                "ka",
                2001
        );
        Carro c4 = new Carro(
                "ford",
                "fiesta",
                2003
        );

// visualização dos primeiros objetos.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //Condtrutores variados

        Carro c5 = new Carro(
                "",
                "Gol",
                2010

        );
        Carro c6 = new Carro(
                "honda",
                "civic",
                2008,
                15
        );
        System.out.println("\n PRINT DEPOIS DOS CONTRUTORES VARIADOS \n");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        // usando getters e setters.

        c1.setId(1);
        c2.setId(2);
        c3.setId(3);
        c4.setId(4);
        c5.setId(5);
        c6.setId(6);
        c5.setMarca("volkswagen");
        c1.setMarca("fiat");
        c1.setModelo("marea");
        c1.setAnoFabricacao(1999);
        c2.setModelo("etios");
        c2.setMarca("toyota");
        c2.setAnoFabricacao(2010);

        // Formatei baseado no hasCode da classe.

        System.out.println("\n PRINT DEPOIS DOS SETTERS \n");
        System.out.println(
                "Carro{ ID = " + c1.getId() + '\'' +
                        "marca='" + c1.getMarca() + '\'' +
                        ", modelo='" + c1.getModelo() + '\'' +
                        ", anoFabricacao=" + c1.getAnoFabricacao() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c2.getId() + '\'' +
                        "marca='" + c2.getMarca() + '\'' +
                        ", modelo='" + c2.getModelo() + '\'' +
                        ", anoFabricacao=" + c2.getAnoFabricacao() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c3.getId() + '\'' +
                        "marca='" + c3.getMarca() + '\'' +
                        ", modelo='" + c3.getModelo() + '\'' +
                        ", anoFabricacao=" + c3.getAnoFabricacao() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c4.getId() + '\'' +
                        "marca='" + c4.getMarca() + '\'' +
                        ", modelo='" + c4.getModelo() + '\'' +
                        ", anoFabricacao=" + c4.getAnoFabricacao() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c5.getId() + '\'' +
                        "marca='" + c5.getMarca() + '\'' +
                        ", modelo='" + c5.getModelo() + '\'' +
                        ", anoFabricacao=" + c5.getAnoFabricacao() +
                        '}');
        System.out.println(
                "Carro{ ID = " + c6.getId() + '\'' +
                        "marca='" + c6.getMarca() + '\'' +
                        ", modelo='" + c6.getModelo() + '\'' +
                        ", anoFabricacao=" + c6.getAnoFabricacao() +
                        '}');
    }
}