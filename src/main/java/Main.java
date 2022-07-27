import net.lingala.zip4j.ZipFile;// важно импорт класса ZipFile из библиотеки maven
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

import java.io.File;

public class Main {

    public static void main(String[] args)
    {
        String path = "C:\\Users\\60034452\\Desktop\\";
        ZipParameters parameters = new ZipParameters(); // создаем параметры
        parameters.setCompressionMethod(CompressionMethod.DEFLATE);// тип энкриптора или тип архивации
        parameters.setCompressionLevel(CompressionLevel.PRE_ULTRA);// сила сжатия файлов
        parameters.setEncryptFiles(true); // устанавливает шифрование
        parameters.setEncryptionMethod(EncryptionMethod.AES);// метод шифрования, алгоритм шифрования
        parameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);// сила шифрования

        try {
            ZipFile zipFile = new ZipFile(path + "archive.zip", "passwd123".toCharArray());
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
