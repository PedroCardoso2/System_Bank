package Entities.Arquivos;

import Entities.Abstract.Banco;

import java.io.*;

public class FileWriters  {
    public static void leia(Banco msg){
        String arquivo = "C:\\Users\\clice\\OneDrive\\Documentos\\POO.txt";

        FileReader fl;
        {
            try (BufferedReader bf = new BufferedReader(new FileReader(arquivo))){
                String line;
                int num = 0;

                while((line = bf.readLine()) != null){
                    System.out.println(msg.toString() + "Conta bancária " + num);
                    num ++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
