import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("File Encrytor");//задаем заголовок
        frame.setSize(600,400);// задаем размер
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//метод остановки программы по закрытию окна
        frame.setLocationRelativeTo(null); // расположение окна равняем по центру экрана
        GUIForm form = new GUIForm(); //обьект класса  GUIform,
        frame.add(form.getRootPanel());// вызываем фрейм
        frame.setVisible(true);// делаем видимым




//        String path = "C:\\Users\\60034452\\Desktop\\";
//        ZipParameters parameters = new ZipParameters(); // создаем параметры
//        parameters.setCompressionMethod(CompressionMethod.DEFLATE);// тип энкриптора или тип архивации
//        parameters.setCompressionLevel(CompressionLevel.PRE_ULTRA);// сила сжатия файлов
//        parameters.setEncryptFiles(true); // устанавливает шифрование
//        parameters.setEncryptionMethod(EncryptionMethod.AES);// метод шифрования, алгоритм шифрования
//        parameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);// сила шифрования
//
//        try {
//            ZipFile zipFile = new ZipFile(path + "archive.zip", "passwd123".toCharArray());
//            zipFile.addFolder(
//                    new File(path + "folder"), // передаем путь
//                    parameters // передаем параметры
//            );
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
}
