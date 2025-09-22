package br.senai.sp.jandira.comissoes.media;
import java.util.Scanner;

public class Calcular {

    String nomedoaluno;
    double media1;
    double media2;
    double media3;
    double media4;
    double resultado;
    double calculo;
    int passou;
    int reprovado;


     public void obterDados(){

         Scanner scanner = new Scanner(System.in);

         System.out.println("======[Contador de Media]======");
         System.out.println("-------------------------------");

        //Obter Nome do Aluno e nota



         System.out.print("Qual o nome do Aluno?");
         nomedoaluno = scanner.nextLine();

        //Obtendo Nota

         System.out.print("Qual a Nota do Primeiro Bimestre?");
         media1 = scanner.nextDouble();
         System.out.print("Qual a Nota do Segundo Bimestre?");
         media2 = scanner.nextDouble();
         System.out.print("Qual a Nota do Terceiro Bimestre?");
         media3 = scanner.nextDouble();
          System.out.print("Qual a Nota do Quarto Bimestre?");
         media4 = scanner.nextDouble();
         System.out.println("------------------------------");

         calcularMedia();
     }

     public void calcularMedia(){

        calculo= media1 + media2 + media3 + media4;
        resultado= calculo/4;


        if (resultado> 5) {

            System.out.println("Média do aluno " + resultado);
            System.out.println("O(a) aluno(a) " + nomedoaluno +  " Foi Aprovado");


        } else {

            System.out.println("Média do aluno " + resultado);
            System.out.println("O(a) aluno(a) " + nomedoaluno +  " Foi reprovado");

        }
     }

     


}
