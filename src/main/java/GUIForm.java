import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class GUIForm {
    private JPanel rootPanel;
    private JTextField filePath;
    private JButton button;
    private File selectedFile;

    public GUIForm(){
        button.addActionListener(new Action() { // позволяет создать обработчик событий
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser(); // позволяет выбирать файл
                chooser.showOpenDialog(rootPanel); // указываем компонет отностильно которого он будет размещен
                selectedFile = chooser.getSelectedFile();// возвращает нам файл
                filePath.setText(selectedFile.getAbsolutePath());// вставляем полный путь файла в графическом интерфейсе
            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }

}
