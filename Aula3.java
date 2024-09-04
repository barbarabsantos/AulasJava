import java.util.Scanner;

/**
 * Faça um sistema em Java para a leitura dos nomes de 5 funcionários e em seguida mostre o nome digitado desses funcionários
*/
public class Aula3 {
    
    public static void main (String[] args){
    Scanner leitorTxt = new Scanner(System.in);   
    System.out.println("Digite seu nome1");
    String nome1 = leitorTxt.nextLine() ;
    System.out.println("Digite nome2" );
     String nome3 =leitorTxt.nextLine()
    System.println("Seu nome é "+ nome3);
    leitorTxt.close();
}
} 