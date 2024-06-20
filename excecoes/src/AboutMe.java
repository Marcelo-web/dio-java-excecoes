import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        /**
         * Exceção
         * 
         * - Na aplicação de entrada de dados abaixo, usando a classe Scanner, podem
         * ocorrer os seguintes erros:
         * - Não informar o nome e sobrenome.
         * - O valor da idade não ser do tipo numérico.
         * - O valor da altura ter uma vírgula ao invés de um ponto(conforme padrão
         * americano).
         */

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.err.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e minha altura é "
                            + altura + "cm.");

            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
