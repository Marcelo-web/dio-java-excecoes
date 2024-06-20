public class FormatadorCepExemplo {
    public static void main(String[] args) {
        // tratamento imediato de possível exceção que o método formataCep pode lançar.
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio.");
        }
    }
    
    // Este método lança uma exceção personalizada do tipo CepInvalidoException que herda de Exception.
    // Portanto, quando esse método for usado, deve ser imediatamente tratado.
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // simulando um cep formatado
        return "23.765-064";
    }
}
