package Entities.Arquivos;

import Entities.Abstract.Banco;

import java.io.*;

public class FileWriters  {
    public static <T> void escreva(T msg){
        String arquivo = "C:\\Users\\clice\\OneDrive\\Documentos\\POO.txt";

        FileWriter fl;
        {
            try(BufferedWriter bf = new BufferedWriter(new FileWriter(arquivo))){
                bf.write(msg.toString() );
                bf.newLine();
                bf.write("-----LISTA BANCÁRIA-----");

                bf.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
