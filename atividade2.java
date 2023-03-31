import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int A,B,C;
        System.out.println("Digite o valor da variavel A");
        A = ler.nextInt();
        System.out.println("Digite o Valor da variavel B");
        B = ler.nextInt();
        System.out.println("A-> "+A);
        System.out.println("B-> "+B);
        C = A;
        A = B;
        B = C;
        System.out.println("__________________");
        System.out.println("");
        Thread.sleep( 2 * 1000 );
        System.out.println("Invertendo Valores:\n");
        System.out.println("A -> "+A);
        System.out.println("B -> "+B);
        Thread.sleep( 2 * 1000 );
        System.out.println("__________________");
    }
}