import java.beans.FeatureDescriptor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    public static void createFile() throws IOException {
        File file = new File("gio.txt");
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("File Has Been Created");
            } else {
                System.out.println("Couldn't Create");
            }
        }
    }

    public static void writeIntoFile(String text) throws IOException {
        File file = new File("gio.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }
}
