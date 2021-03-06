// ** PROJECT BENDER / ROBOrally 2019
// ** Created 1.feb 2019 Rune Thelen

package inf112.skeleton.app.utils;
import java.io.*;
import java.util.ArrayList;

public class FileRead {
    public static void main(String[] args) throws IOException {
        String fileName = "res/cardData.txt";
        ArrayList<String> linesInFile = new ArrayList<String>();
        FileReader fileReader = new FileReader(fileName);

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                linesInFile.add(line);
                System.out.println(line);       // only for test purpose, REMOVE in production
            }
        }
    }
}
