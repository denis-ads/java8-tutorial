

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SubstituirValorTagXml {

    private static final String PATH = "C:\\work\\propostas\\propostas_2017_01\\";
    private static final String PATH_SAIDA = "C:\\work\\propostas\\propostas_2017_01_saida\\";
    
    //private static final String PATH = "C:\\ambienteDesenv\\propostas_2017_01\\";
    //private static final String PATH_SAIDA = "C:\\ambienteDesenv\\propostas_2017_01_saida\\";

    public static void main(String[] args) {
        try {
            File arquivos[];
            File diretorio = new File(PATH);
            arquivos = diretorio.listFiles();

            for (int i = 0; i < arquivos.length; i++) {

                File nomeArquivo = arquivos[i];
                System.out.println(nomeArquivo);
                String content = new String(Files.readAllBytes(Paths.get(nomeArquivo.getCanonicalPath())));

                int indexOf = content.indexOf("<cd_cttppo>");
                int indexfim = content.indexOf("</cd_cttppo>");

                String stringQueSeraSubstituida = content.substring(indexOf, indexfim);

                int indexofFim = stringQueSeraSubstituida.indexOf(">");
                int cd_cttppo = Integer.parseInt(stringQueSeraSubstituida.substring(indexofFim + 1));

                cd_cttppo = cd_cttppo + 1;

                System.out.println(stringQueSeraSubstituida);
                String novoValor = "<cd_cttppo>" + cd_cttppo;
                content = content.replace(stringQueSeraSubstituida, novoValor);
                // VERIFICAR SE O ARQUIVO JA EXISTE
                Files.write(Paths.get(PATH_SAIDA + nomeArquivo.getName()), content.getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
