public class FormatadorCEPExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CEPInvalidoException e) {
           System.out.println("O cep não corresponde as regras ");
        }
    }
    static String formatarCep (String cep) throws CEPInvalidoException{
        if(cep.length() != 8)
        throw new CEPInvalidoException();

        return "23.765-064";
    }
}
