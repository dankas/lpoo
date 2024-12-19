package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class contaController {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("lucas");
        Cliente cl2 = new Cliente("julia");
        Cliente cl3 = new Cliente("francis");

        System.out.println("\nClientes:");
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);

        ContaCorrente cr1 = new ContaCorrente(0.0);
        ContaCorrente cr2 = new ContaCorrente(0.0);
        ContaCorrente cr3 = new ContaCorrente(0.0);

        System.out.println("\nContas Correntes:");
        System.out.println(cr1);
        System.out.println(cr2);
        System.out.println(cr3);

        ContaPoupanca cp1 = new ContaPoupanca(0.0);
        ContaPoupanca cp2 = new ContaPoupanca(0.0);
        ContaPoupanca cp3 = new ContaPoupanca(0.0);

        System.out.println("\nContas Poupança");
        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);

        List<Associado> associados = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();


        contas.add(cr1);
        contas.add(cr2);
        contas.add(cr3);
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        associados.add(cl1);
        associados.add(cl2);
        associados.add(cl3);
        associados.add(cr1);
        associados.add(cr2);
        associados.add(cr3);

        System.out.println("\nAssociados:" + associados);
        System.out.println("\nContas:" + contas);

        cp1.deposita(1000.);
        cp1.atualiza(0.05);
        cp1.saca(1000.0);
        cr1.deposita(1000.);
        cr1.atualiza(0.1);
        cr1.saca(1000.0);

        System.out.println(cp1);
        System.out.println(cr1);

        cr1.setQteCotas(100);
        cr2.setQteCotas(400);
        cr3.setQteCotas(600);
        cl1.setQteCotas(300);
        cl2.setQteCotas(600);
        cl3.setQteCotas(600);

        System.out.println(associados);

        associados.sort(Comparator.comparing(Associado::getQdeCotas).reversed());
        System.out.println(associados);
        Associado maxAssociado = associados.stream()
                .max(Comparator.comparing(Associado::getQdeCotas))
                .get();
        for (Associado associado : associados) {
            if (associado.getQdeCotas() >= maxAssociado.getQdeCotas()) {
                System.out.print(associado);
            }
        }
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n" + contas);

        Conta maxConta = contas.stream()
                .max(Comparator.comparing(Conta::getSaldo))
                .get();
        for (Conta conta : contas) {
            if (conta.getSaldo() >= maxConta.getSaldo()) {
                System.out.print(conta);
            }
        }
    }

}

