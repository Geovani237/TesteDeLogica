import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Digite um número para verificar se ele é um palindromo: ");
       int numero = sc.nextInt();

       String numeroStr = String.valueOf(numero);
       String invertido = new StringBuilder(numeroStr).reverse().toString();

       if (numeroStr.equals(invertido)){
            System.out.println("Esse número é um palindromo: " + numero);
       } else {
           System.out.println("Não é um palindromo");
       }

        sc.close();//boa prátrica sempre fechar o Scanner
    }
}