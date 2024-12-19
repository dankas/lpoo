package controller;
import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class empresaController {
    public static void main(String[] args) {

        //b) Criação da instancias

        Vendedor vd1 = new Vendedor("cassio","moreno",1.0,1.0);
        Vendedor vd2 = new Vendedor("cleiton","silva",2.0,2.0);

        Gerente gr1 = new Gerente("pedro","silva",1,1);
        Gerente gr2 = new Gerente("paulo","pereira",1.0,1.0);

        ClientePessoaFisica pf1 = new ClientePessoaFisica("lucia","rosa","lucy@email","11.121222-77");
        ClientePessoaFisica pf2 = new ClientePessoaFisica("fernando","spech","fefe@ymail","21.121222-88");

        ClientePessoaJuridica pj1 = new ClientePessoaJuridica("sapaTaria","---","contato@zapataria","323232/00001-023");
        ClientePessoaJuridica pj2 = new ClientePessoaJuridica("lojas 10","---","contato@lojas","323242/00001-029");

        //c) Impressão dos obj:

        System.out.println("Funcionarios:\n" );
        System.out.println(vd1);
        System.out.println(vd2);
        System.out.println(gr1);
        System.out.println(gr2);
        System.out.println("Clientes:\n" );
        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pj1);
        System.out.println(pj2);

        //d) Coleções

        //já que qualquer instancia pode ser considerada socio, fiz uma coleção de com todos para facilitar.
        List<Socio> socios = new ArrayList<>();

        socios.add(vd1);
        socios.add(vd2);
        socios.add(gr1);
        socios.add(gr2);
        socios.add(pf1);
        socios.add(pf2);
        socios.add(pj1);
        socios.add(pj2);

        //fiz uma lista de clientes para poder acessar o escopo para classificação por nome dos clientes.
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(pf1);
        clientes.add(pf2);
        clientes.add(pj1);
        clientes.add(pj2);

        System.out.println(socios);
        System.out.println("\nCLIENTES:\n");
        socios.forEach(i -> {
            if(i instanceof Cliente) { System.out.println(i); }
        });
        System.out.println("\nFUNCIONARIOS:\n");
        socios.forEach(i -> {
            if(i instanceof Funcionario) { System.out.println(i); }
        });

        //e)Ajuste salarios e bonificações

        vd1.setSalario(3000.0);
        vd2.setSalario(3000.0);
        vd1.setTaxaDeComissao(0.05);
        vd2.setTaxaDeComissao(0.05);
        gr1.setSalario(12000.0);
        gr2.setSalario(12000.0);
        gr1.setTaxaDeBonificacao(0.02);
        gr2.setTaxaDeBonificacao(0.02);
        System.out.println("\nFUNCIONARIOS REAJUSTADOS:\n");
        socios.forEach(i -> {
            if(i instanceof Funcionario) { System.out.println(i); }
        });

        //f) folhas da empresa
        double folhaEmpresa =0;
        for (Socio socio : socios) {
            if(socio instanceof Funcionario) { folhaEmpresa+=((Funcionario) socio).getSalario(); }
        }
        System.out.println("\nFolha da Empresa: "+folhaEmpresa);

        //g) Atualizando a qtde de ações e mostrando em ordem decrescente
        vd1.setQteAcoes(5);
        vd2.setQteAcoes(6);
        gr1.setQteAcoes(50);
        gr2.setQteAcoes(23);
        pf1.setQteAcoes(700);
        pf1.setQteAcoes(0);
        pj1.setQteAcoes(2300);
        pj2.setQteAcoes(2299);

        socios.sort(Comparator.comparing(Socio :: getQuantidadeDeAcoes).reversed());

        System.out.println(socios);

        //h) Imprimindo os clientes
        clientes.sort(Comparator.comparing(Cliente :: getNome));
        System.out.println("\nCLIENTES:\n");
        clientes.forEach(i -> {
             System.out.println(((Cliente) i).getNome());
        });


        //i) Socios com mais ações (que neste caso só tem um por causa questão g)
        System.out.println("\nSocios com mais ações:");
        Socio maxAcoes = socios.stream()
                .max(Comparator.comparing(Socio :: getQuantidadeDeAcoes))
                .get();
        for (Socio socio : socios) {
            if (socio.getQuantidadeDeAcoes() >= maxAcoes.getQuantidadeDeAcoes()) {
                System.out.print(socio);
            }
        }


    }
}

