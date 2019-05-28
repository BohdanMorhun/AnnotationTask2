import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "1.txt")
public class TextContainer {

     private String text = "Hello World";

    @Saver
public void save(String path) throws IOException {

    FileWriter fw = new FileWriter(path);

    try {
        fw.write(text);
    } finally {
        fw.close();
    }
  }
}