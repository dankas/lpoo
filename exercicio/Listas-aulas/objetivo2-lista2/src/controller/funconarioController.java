package controller;

import model.Gerente;
import model.Desenvolvedor;
import model.Cliente;
import model.Funcionario;
import model.Investidor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class funconarioController {
    static public void main(String[] args) {

        Cliente cli1 = new Cliente(1, "João", "Dias", "ALUP11", 500);
        Cliente cli2 = new Cliente(2, "Tânia", "Pereira", "ALUP11", 1000);
        Cliente cli3 = new Cliente(3, "Mel", "Soares", "ALUP11", 1000);
        Cliente cli4 = new Cliente(4, "Luna", "Farias", "ALUP11", 1000);
        Cliente cli5 = new Cliente(5, "Maria", "Terra", "ALUP11", 1000);
        Cliente cli6 = new Cliente(6, "Pedro", "Santos", "ALUP11", 2000);

        Gerente ger1 = new Gerente("Ana", 4500.00, "ALUP11", 500);
        Gerente ger2 = new Gerente("Rafal", 4500.00, "ALUP11", 1000);
        Gerente ger3 = new Gerente("Aline", 4500.00, "ALUP11", 1000);
        Gerente ger4 = new Gerente("Talita", 4500.00, "ALUP11", 1000);
        Gerente ger5 = new Gerente("Paulo", 6500.00, "ALUP11", 1000);
        Gerente ger6 = new Gerente("Cris", 6500.00, "ALUP11", 2000);

        Desenvolvedor dsr1 = new Desenvolvedor("carla", 3500);
        Desenvolvedor dsr2 = new Desenvolvedor("cleiton", 3500);
        Desenvolvedor dsr3 = new Desenvolvedor("catia", 3500);
        Desenvolvedor dsr4 = new Desenvolvedor("clovis", 3500);
        Desenvolvedor dsr5 = new Desenvolvedor("clint", 3500);
        Desenvolvedor dsr6 = new Desenvolvedor("cassio", 3500);



        List<Investidor> investidores = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        investidores.add(cli1);
        investidores.add(cli2);
        investidores.add(cli3);
        investidores.add(cli4);
        investidores.add(cli5);
        investidores.add(cli6);
        investidores.add(ger1);
        investidores.add(ger2);
        investidores.add(ger3);
        investidores.add(ger4);
        investidores.add(ger5);
        investidores.add(ger6);

        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);
        funcionarios.add(dsr1);
        funcionarios.add(dsr2);
        funcionarios.add(dsr3);
        funcionarios.add(dsr4);
        funcionarios.add(dsr5);
        funcionarios.add(dsr6);

        System.out.println(funcionarios);
        System.out.println(investidores);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        investidores.sort(Comparator.comparing(Investidor::getQdeCotas).reversed());

        System.out.println(funcionarios);
        for (Investidor i : investidores) {
            if (i.toString().startsWith("\nCliente")) { System.out.println(i); }
        }
        investidores.sort(Comparator.comparing(Investidor::getQdeCotas).reversed());
        System.out.println(investidores);

        System.out.println(funcionarios.get(0));

        System.out.println(investidores.get(0));





    }
}
