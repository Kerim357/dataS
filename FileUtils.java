package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileUtils {

    public static ArrayList<String> readFile(String filePath) throws FileNotFoundException {
    	ArrayList<String> lines = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("expressions.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        return lines;
    }
  }
    

