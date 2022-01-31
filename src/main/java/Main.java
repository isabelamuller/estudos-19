import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();
        double valor4 = sc.nextDouble();
        double valor5 = sc.nextDouble();
        double valor6 = sc.nextDouble();
        int contador = 0;

        List<Double> lista = Arrays.asList(valor1, valor2, valor3, valor4, valor5, valor6);

        for (double numero : lista) {
            if (numero >= 0) {
                contador++;
            }

        }
        System.out.println(contador + " valores positivos");

    }

}