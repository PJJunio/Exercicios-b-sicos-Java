import java.util.Scanner;

public class algoritimoBasico {
    public static void main(String[] args) {
        //Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;


        System.out.println("Digite o primeiro número: ");
        a = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        c = scanner.nextDouble();

        double soma = a + b;

        if(soma > c) {
            System.out.println(a + " + " + b + " não é menor que " + c);

        }else {
            System.out.println(a + " + " + b + " é menor que " + c );

        }



    }
}
