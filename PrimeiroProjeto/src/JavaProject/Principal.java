package JavaProject;
import java.util.Scanner;

public class Principal {//Classe que contém o método principal
    public static void main(String[] args) {// Este é o método principal.
        System.out.println("Olá amigo!\nQual é o seu nome?");

        // Ler uma string do console usando a biblioteca scanner.
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        // Exibir um string usando printf.
        System.out.printf("Olá %s", nome);
        in.close();
    }

}
