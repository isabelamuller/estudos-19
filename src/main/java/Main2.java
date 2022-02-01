import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double conta = Math.pow(n, 2) + n + 41; //  conta que vi na aula q tava assistindo. queria saber se qlqr numero n naquela equacao daria numero primo. resultado = apenas ate 39.
    boolean isPrime = true;

    for (int i = 2; i < conta; i++) {
        if (conta%i == 0) {
            isPrime = false;
            System.out.println(conta + " nao é primo");
            break;
        }
    }
    if (isPrime) {
        System.out.println(conta + " é primo");
    }


    }
}