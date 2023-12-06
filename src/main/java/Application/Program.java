package Application;


import Entities.Abstract.Cliente;
import Entities.Abstract.Empresa;
import Entities.ClassesPrincipais.ClientePF;
import Entities.ClassesPrincipais.ClientePJ;
import Entities.ClassesPrincipais.EmpresaMediaGrande;
import Entities.ClassesPrincipais.EmpresaPequena;
import Entities.Exceptions.ContException;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                try {abrirContaCliente();} catch (ContException e) {throw new RuntimeException(e);}
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

    public static void abrirContaCliente() throws ContException{
        String choseCont, endereco, nome, naturalidade,dataNascimento;




        System.out.println("Você é PESSOA FÍSICA/ PESSOA JURÍDICA");
        System.out.println("Escreva PJ ou PF");
        choseCont = sc.next().toLowerCase();



        if(choseCont.equals("pf")){
            Date date = null;
            System.out.println("Informe seu Nome: ");
            nome = sc.next();

            System.out.println("Informe seu Data de Nascimento: ");
            dataNascimento = sc.next();

            try{
                SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
                date = st.parse(dataNascimento);
            }catch (ParseException e){
                System.out.println("Data inválida!");
            }

            System.out.println("Informe seu Naturalidade: ");
            naturalidade = sc.next();


            System.out.println("Informe seu Endereço: ");
            endereco = sc.next();

            System.out.println("Informe seu cnpj: ");
            Long cnpj = sc.nextLong();

            ClientePJ cpj = new ClientePJ(nome,(Data) date,endereco,cnpj,naturalidade);
        }else if (choseCont.equals("pj")){
            Date date = null;
            System.out.println("Informe seu Nome: ");
            nome = sc.next();

            System.out.println("Informe seu Data de Nascimento: ");
            dataNascimento = sc.next();

            try{
                SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
                date = st.parse(dataNascimento);
            }catch (ParseException e){
                System.out.println("Data inválida!");
            }

            System.out.println("Informe seu Naturalidade: ");
            naturalidade = sc.next();


            System.out.println("Informe seu Endereço: ");
            endereco = sc.next();

            System.out.println("Informe seu cpf: ");
            Long cpf = sc.nextLong();

            ClientePF cpj = new ClientePF(nome,(Data) date,endereco,cpf,naturalidade);
        }else {
            System.out.println("Reinicie o aplicativo");
        }
    }
}
