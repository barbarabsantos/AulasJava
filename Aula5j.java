import java.util.Random;
import java.util.Scanner;

public class Aula5j {
 public static void main(String[]args) {
Random aleatorio = new Random();
Scanner leitura = new Scanner(System.in);
final int sorteio = aleatorio.nextInt(1,6);
System.out.println("Digite um numero");
int numero = leitura.nextInt();
if (numero == sorteio) {
    System.out.println("Acertou");
    leitura.close();
    return;
}






}  
}
