package controller;

import model.Automovel;

public class automovelController {
    public static void main(String[] args) {
        Automovel car1 = new Automovel("0001","itt2345","vermelho",4,"flex",45233,"inx231234",0.0);
        Automovel car2 = new Automovel("0003","itt2325","prata",4,"gasolina",48233,"intx231234",0.0);

        //Print dos objetos criados.
        System.out.println(car1);
        System.out.println(car2);
    }


}
