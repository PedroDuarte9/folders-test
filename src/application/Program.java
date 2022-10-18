package application;

import entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo. */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                List<Produtos> produtos = new ArrayList<>();

        /*Bloco de código que fará a leitura do arquivo*/
        System.out.println("Digite um caminho: ");
        String pripath = sc.nextLine();

        File directory = new File(pripath); //variável do tipo clase que armazena esse caminho

        try (BufferedReader br = new BufferedReader(new FileReader(directory))) { //try-with-resources para leitura do que tem dentro do arquivo
        String[] linha = br.readLine().split(",");

        while (linha != null){
        System.out.println(linha);
        linha = br.readLine().split(",");
        }
        }
        catch(IOException e){
        System.out.println("Error " + e.getMessage());
        }
        catch(NullPointerException e){
        e.printStackTrace();
        }
//        File[] files = directory.listFiles(File::isFile);
//        System.out.println("Arquivos: ");
//        for (File f: files) {
//            System.out.println(f);
//        }



        sc.close();
    }
}
