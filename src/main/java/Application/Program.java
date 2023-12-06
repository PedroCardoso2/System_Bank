package Application;
import Entities.Abstract.Cliente;
import Entities.Abstract.Empresa;
import Entities.ClassesPrincipais.ClientePF;
import Entities.ClassesPrincipais.ClientePJ;
import Entities.ClassesPrincipais.EmpresaMediaGrande;
import Entities.ClassesPrincipais.EmpresaPequena;
import Entities.Exceptions.ContException;
import Entities.Interface.Between;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program implements Between {
    public static Scanner sc = new Scanner(System.in);

    public static List<Empresa> listEmpresa = new ArrayList<>();
    public static List<Cliente> listCliente = new ArrayList<>();
    public static void main(String[] args) {

        String choseCont;
        //Lista de Contas Bancárias



        System.out.println("Seja Bem-Vindo ao Banco Cardoso");
        System.out.println("Faça a sua Conta !");

            while (true) {
                System.out.println("Deseja fazer conta empresarial ou conta cliente?");
                choseCont = sc.next().toLowerCase();

                if (choseCont.equals("empresarial")) {
                    try {
                        abrirContaEmpresa();
                    } catch (ContException e) {
                        throw new RuntimeException(e);
                    }
                } else if (choseCont.equals("cliente")) {
                    try {
                        abrirContaCliente();
                    } catch (ContException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("Opção inválida. Informe novamente os valores!");
                    continue; // Volta para o início do loop
                }

                // Pergunta se o usuário quer fazer mais uma conta
                System.out.println("Deseja fazer mais uma conta? (sim/não)");
                String escolha = sc.next().toLowerCase();

                if (!escolha.equals("sim")) {
                    System.out.println("Encerrando o programa.");
                    break; // Sai do loop
                }
            }



    }

    public static void abrirContaEmpresa()  throws ContException {
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
            listEmpresa.add(empresaPequena);
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
            listEmpresa.add(empresaMediaGrande);
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

            System.out.println("Informe seu salário: ");
            Double sl = sc.nextDouble();
            ClientePJ clientePJ = new ClientePJ(nome,(Data) date,endereco,cnpj,naturalidade, sl);

            listCliente.add(clientePJ);
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

            System.out.println("Informe seu salário: ");
            Double sl = sc.nextDouble();
            ClientePF clientePF = new ClientePF(nome,(Data) date,endereco,cpf,naturalidade, sl);
            listCliente.add(clientePF);
        }else {
            System.out.println("Reinicie o aplicativo");
        }
    }


    @Override
    public int between(List<Empresa> empresaList, List<Cliente> clienteList) {
        return 0;
    }
}
