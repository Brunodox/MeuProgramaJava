package JavaProject;
import java.util.Scanner;

public class Principal {//Classe que cont�m o m�todo principal
    public static void main(String[] args) {// Este � o m�todo principal.
        System.out.println("Ol� amigo!\nQual � o seu nome?");

        // Ler uma string do console usando a biblioteca scanner.
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        // Exibir um string usando printf.
        System.out.printf("Ol� %s", nome);
        in.close();
    }

}
