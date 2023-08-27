import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite seu idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Me chamos " +  nome.toUpperCase() + " "+ sobrenome.toUpperCase());
            System.out.println("Tenho "+ idade+ " anos");
            System.out.println("tenho "+ altura + "cm de altura");
            scanner.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser númericos");
        }
    }
}
