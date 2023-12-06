package Application;


import Entities.Abstract.Cliente;
import Entities.Abstract.Empresa;
import Entities.ClassesPrincipais.EmpresaMediaGrande;
import Entities.ClassesPrincipais.EmpresaPequena;
import Entities.Exceptions.ContException;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String chose, choseCont;
        //Lista de Contas Bancárias

        List<Empresa> listEmpresa = new ArrayList<>();
        List<Cliente> listCliente = new ArrayList<>();


        System.out.println("Seja Bem-Vindo ao Banco Cardoso");
        System.out.println("Você já possui conta no banco ? ");

        chose = sc.next().toLowerCase();

        if(chose.equals("sim")){

        }else {
            System.out.println("Deseja fazer conta empresarial ou conta cliente ?");
            choseCont = sc.next().toLowerCase();
            if(chose.equals("empresarial")){
                try {abrirContaEmpresa();} catch (ContException e) {throw new RuntimeException(e);}
            } else if (chose.equals("cliente")) {

            }else {
                System.out.println("Informe novamente os valores !");
            }
        }
    }





    public static void abrirContaEmpresa()  throws ContException{
        String nomeEmpresa;
        Integer funcionario, numberIdent, socioQuant;
        long cnpj;
        System.out.println("Qual o faturamento anual da sua empresa ?");
        Double faturamento = sc.nextDouble();
        if(faturamento <= 10.000){
            System.out.println("Digite o nome da Empresa: ");
            nomeEmpresa = sc.next();

            System.out.println("Digite o número de funcionários: ");
            funcionario = sc.nextInt();

            System.out.println("Digite o número Identificador: ");
            numberIdent = sc.nextInt();

            System.out.println("Digite o CNPJ da empresa: ");
            cnpj = sc.nextInt();
            EmpresaPequena empresaPequena = new EmpresaPequena(nomeEmpresa, funcionario, numberIdent, numberIdent, faturamento);

            System.out.println("Conta Empresarial Aberta !");
        }else if (faturamento > 10.000){

            System.out.println("Digite o nome da Empresa: ");
            nomeEmpresa = sc.next();

            System.out.println("Digite o número de funcionários: ");
            funcionario = sc.nextInt();

            System.out.println("Digite o número Identificador: ");
            numberIdent = sc.nextInt();

            System.out.println("Digite o CNPJ da empresa: ");
            cnpj = sc.nextInt();

            System.out.println("Quantidade de Socios: ");
            socioQuant = sc.nextInt();

            EmpresaMediaGrande empresaMediaGrande = new EmpresaMediaGrande(nomeEmpresa, funcionario, numberIdent, numberIdent, faturamento, socioQuant);
            System.out.println("Conta Empresarial Aberta !");
        }else{
            throw new ContException("ERRO CONTA");
        }
    }

    public static void abrirContaCliente(){
        String choseCont, endereco, nome, naturalidade;



        System.out.println("Você é PESSOA FÍSICA/ PESSOA JURÍDICA");
        System.out.println("Escreva PJ ou PF");
        choseCont = sc.next().toLowerCase();
        if(choseCont.equals("pf")){
            System.out.println("");
        }else if (choseCont.equals("pj")){

        }else {

        }
    }
}
