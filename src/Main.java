import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber a soma dos impares dele:");
    int numero = sc.nextInt();
    int resultado = 0;
        for (int i = 0; i <= numero; i++) {
        if (i % 2 == 1) {
            resultado = resultado + i;
        }
    }
        System.out.println(resultado);

    }
}