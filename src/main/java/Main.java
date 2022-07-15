import net.lingala.zip4j.ZipFile;// важно импорт класса ZipFile из библиотеки maven
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;

import java.io.File;

public class Main {

    public static void main(String[] args)
    {
        String path = "C:\\Users\\60034452\\Desktop\\";
        ZipParameters parameters = new ZipParameters(); // создаем параметры
        parameters.setCompressionMethod(CompressionMethod.DEFLATE);
        //parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        //parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);
        parameters.setCompressionLevel(CompressionLevel.HIGHER);

        try {
            ZipFile zipFile = new ZipFile(path + "archive.zip");
            zipFile.addFile(
                    new File(path + "picture.jpeg"), // передаем путь
                    parameters // передаем параметры
            );
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
