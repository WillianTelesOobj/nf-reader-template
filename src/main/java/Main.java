public class Main {

    private static final String DIRETORIO = "src/main/resources";

    public static void main(String[] args) {

        ProcessadorDeArquivos processador = new ProcessadorDeArquivos();

        processador.processaArquivosDo(DIRETORIO);

    }
}
