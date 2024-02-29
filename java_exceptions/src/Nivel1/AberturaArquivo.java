package Nivel1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AberturaArquivo {

    public Boolean LeArquivo(FileReader arquivo) throws IOException {
       return arquivo.ready();
    }
}
