import net.lingala.zip4j.ZipFile;// важно импорт класса ZipFile из библиотеки maven
import net.lingala.zip4j.model.ZipParameters;

import java.io.File;

public class Main {

    public static void main(String[] args)
    {
        String path = "C:\\Users\\60034452\\Desktop\\";
        ZipParameters parameters = new ZipParameters(); // создаем параметры
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);

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
