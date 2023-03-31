import java.util.Scanner;
public class atividade1 {
    public static void main(String[] args) {
        String nome;
        Float nota1,nota2,nota3;
        Float media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o seu nome ?");
        nome = ler.nextLine();
        System.out.println("Ola "+nome+" digite a sua primeira  nota :");
        nota1 = ler.nextFloat();
        System.out.println("Digite a sua segunda nota :");
        nota2 = ler.nextFloat();
        System.out.println("Digite a sua terceira nota :");
        nota3 = ler.nextFloat();
        media = (nota1+nota2+nota3) / 2;
        if (media>=7) 
       { System.out.printf("Parabêns "+nome+" você passou de ano, sua media foi: %.2f\n ",media);
            
        } else if (media>=4) {
            System.out.printf("Infelizmente você ficou de recuperação com sua media sendo : %.2f\n",media);
        }else{
            System.out.printf("É não teve jeito cumpade, você não passou de ano\n Sua media final foi : %.2f\n",media);
        }
    }
}

