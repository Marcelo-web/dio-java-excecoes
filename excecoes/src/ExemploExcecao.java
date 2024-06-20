import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        /**
         *  Hierarquia de exceções
         */
       
        // - Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número.
        // - valueOf = método que recebe uma string e tenta converter para um Double. Quando isso não é possível , lança uma exceção do tipo NumberFormatException.
        // - Aqui como existe letra e números como entrada, não há como fazer a conversão. 
        // - Por que essa exceção não teve que ser tratada pelo try-catch já que a exceção é lançada?
        // - Se subirmos na hierarquia, vemos que NumberFormatException é subclasse de IllegalArgumentException, que por sua vez é subclasse de RuntimeException. 
        // - A classe RuntimeException trata de exceções que não obrigam o programador a tratar ou lançar. (Exceção não checada)

        // 1ª forma de tentativa de conversão
        // Number valor = Double.valueOf("a1.75");
        // System.out.println(valor);


        // 2ª forma de tentativa de conversão
        // Ao tentar usar o método parse, esse método determina que deve ser feito o tratamento da exceção imediatamente, já que lança uma ParseException.
        // Observe que a classe ParseException é subclasse de Exception. 
        // Aqui o programador é obrigado a tratar a exceção ou lançá-la. (Exceção checada)
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1,75");
            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Erro na conversão para número: " + e.getMessage());
        }   
    }
}
