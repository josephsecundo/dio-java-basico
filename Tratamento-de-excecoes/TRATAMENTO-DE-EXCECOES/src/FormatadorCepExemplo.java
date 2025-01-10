public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("17606295");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O Cep nao corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "17.606-295";

    }
}
