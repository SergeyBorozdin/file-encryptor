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
        parameters.setCompressionMethod(CompressionMethod.DEFLATE);// тип энкриптора или тип архивации
        //parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
        //parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_ULTRA);
        parameters.setCompressionLevel(CompressionLevel.PRE_ULTRA);// уровень сжатия файлов

        try {
            ZipFile zipFile = new ZipFile(path + "archive.zip");
            zipFile.addFolder(
                    new File(path + "folder"), // передаем путь
                    parameters // передаем параметры
            );
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
