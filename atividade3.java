import java.util.Scanner;
public class atividade3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);
        Float C,F;
        System.out.println("Digite os graus em Celsius: ");
        C = ler.nextFloat();
        F = (9*C+160)/5;
        System.out.printf("O graus Celsius convertidos para Fahrenheit são :\n Fahrenheit :%.2f ",F,"\n");

    }
}
