package controllers;

import java.util.ArrayList;
import java.util.List;

import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

import java.util.ArrayList;

public class funcionarioController {

    public static void main(String[] args) {
        Desenvolvedor ds1 = new Desenvolvedor();
        Gerente gr1 = new Gerente();
        Desenvolvedor ds2 = new Desenvolvedor("pedro", 2000, 0);
        Gerente gr2 = new Gerente("paulo", 2500, 0);

//      Criação dos gerentes e devs com os dois construtores.

        System.out.println(gr1);
        System.out.println(gr2);
        System.out.println(ds1);
        System.out.println(ds2);
//      Modificando os objetos com setters e getter.
        ds1.setNome("luiz");
        gr1.setNome("Fernando");
        ds1.setSalario(2200);
        gr1.setSalario(2500);
        ds1.setBonus(0.05);
        ds2.setBonus(0.05);
        gr2.setBonus(0.2);
        gr1.setBonus(0.2);

        System.out.println(gr1);
        System.out.println(gr2);
        System.out.println(ds1);
        System.out.println(ds2);
//      Bônus de cada um dos funcionários,
        System.out.println(ds1.getNome() + " | Valor Bonus:" + ds1.getBonus() + " |  Salario:" + ds1.getSalario());
        System.out.println(ds2.getNome() + " | Valor Bonus:" + ds2.getBonus() + " |  Salario:" + ds2.getSalario());
        System.out.println(gr1.getNome() + " | Valor Bonus:" + gr1.getBonus() + " |  Salario:" + gr1.getSalario());
        System.out.println(gr2.getNome() + " | Valor Bonus:" + gr2.getBonus() + " |  Salario:" + gr2.getSalario());

//      Não se pode criar nenhum objeto de uma classe abstrata, por isso sómente criei instancias de desenvolvedor e funcionarios.
//      O metodo getBonus eu implementei nos objetos desenvolvedor e gerente, pois eram com valores diferentes.   Na questão dois eu modifiquei a classe
//      Funcionario para poder generalizar o getbonus e não passar trabalho de criar modelo para cada tipo de desenvolvedor (eu sei que não deveria mudar as classes, mas
//      não vou passar essa trabalheira toda!).

//      Questão 2
        gr2.setSalario(4500);
        System.out.println("\n\nGerente de Desenvolvimento");
        System.out.println(gr2.getNome() + " | Valor Bonus:" + gr2.getBonus() + " |  Salario:" + gr2.getSalario());
        gr1.setSalario(6500);
        gr1.setBonus(0.4);
        System.out.println("Gerente Geral");
        System.out.println(gr1.getNome() + " | Valor Bonus:" + gr1.getBonus() + " |  Salario:" + gr1.getSalario());
//      Desenvolvedores plenos
        Desenvolvedor ds3 = new Desenvolvedor("pamela", 2500, 0.05);
        Desenvolvedor ds4 = new Desenvolvedor("patricia", 2500, 0.05);
        Desenvolvedor ds5 = new Desenvolvedor("klevston", 2500, 0.05);
        Desenvolvedor ds6 = new Desenvolvedor("tiago", 2500, 0.05);
        ds2.setSalario(4500);
        ds1.setSalario(4500);
        System.out.println("\nDEvs plenos:" + "\n" + ds1 + "\n" + ds2 + "\n" + ds3 + "\n" + ds4 + "\n" + ds5 + "\n" + ds6);
//      Desenvolvedores seniors
        Desenvolvedor dsr1 = new Desenvolvedor("carla", 3500, 0.1);
        Desenvolvedor dsr2 = new Desenvolvedor("cleiton", 3500, 0.1);
        Desenvolvedor dsr3 = new Desenvolvedor("catia", 3500, 0.1);
        Desenvolvedor dsr4 = new Desenvolvedor("clovis", 3500, 0.1);
        Desenvolvedor dsr5 = new Desenvolvedor("clint", 3500, 0.1);
        Desenvolvedor dsr6 = new Desenvolvedor("cassio", 3500, 0.1);
        System.out.println("\nDevs seniors:" + "\n" + dsr1 + "\n" + dsr2 + "\n" + dsr3 + "\n" + dsr4 + "\n" + dsr5 + "\n" + dsr6);
//      Desenvolvedores juniors
        Desenvolvedor djr1 = new Desenvolvedor("Dennis", 1800, 0.05);
        Desenvolvedor djr2 = new Desenvolvedor("Daniel", 1800, 0.05);
        Desenvolvedor djr3 = new Desenvolvedor("Davi", 1800, 0.05);
        Desenvolvedor djr4 = new Desenvolvedor("Dante", 1800, 0.05);
        Desenvolvedor djr5 = new Desenvolvedor("Douglas", 1800, 0.05);
        Desenvolvedor djr6 = new Desenvolvedor("Darlon", 1800, 0.05);
        System.out.println("\nDevs juniors:" + "\n" + djr1 + "\n" + djr2 + "\n" + djr3 + "\n" + djr4 + "\n" + djr5 + "\n" + djr6);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gr1);
        funcionarios.add(gr2);
        funcionarios.add(ds1);
        funcionarios.add(ds2);
        funcionarios.add(ds3);
        funcionarios.add(ds4);
        funcionarios.add(ds5);
        funcionarios.add(ds6);
        funcionarios.add(dsr1);
        funcionarios.add(dsr2);
        funcionarios.add(dsr3);
        funcionarios.add(dsr4);
        funcionarios.add(dsr5);
        funcionarios.add(dsr6);
        funcionarios.add(djr1);
        funcionarios.add(djr2);
        funcionarios.add(djr3);
        funcionarios.add(djr4);
        funcionarios.add(djr5);
        funcionarios.add(djr6);
        System.out.println("\n");

        double folhaComBonus = 0.0;
        double folha = 0.0;
        double folhaReajustada = 0.0;
        for (Funcionario f : funcionarios) {
            folhaComBonus += f.getBonus() + f.getSalario();
            folha += f.getSalario();
            folhaReajustada += f.getBonus() + (f.getSalario()* 0.05);
            System.out.println("Funcionario: " + f.getNome() + " | Salario: " + f.getSalario() + " | Bonus: " + f.getBonus());
        }
        System.out.println("\nFolha Com Bonus:" + folhaComBonus + "\nFolha sem Bonus:" + folha + "\nFolha Reajustada em 5%:" + folhaReajustada);

    }
}


