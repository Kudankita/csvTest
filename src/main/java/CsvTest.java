import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvTest {
  public static void main(String[] args) throws IOException {
    System.out.println(System.getProperty("file.encoding"));
    File file = new File("G:\\study\\IDEA\\csvTest\\src\\main\\resources\\1301_2018.csv");
    CSVReader reader =
        new CSVReader(
            new BufferedReader(new InputStreamReader(new FileInputStream(file), "Shift-JIS")));
    List<String[]> csvLines = new ArrayList<>();
    String[] nextLine;
    while ((nextLine = reader.readNext()) != null) {
      // nextLine[] is an array of values from the line
      for (String str : nextLine) {
        System.out.print(str);
        System.out.print(" ");
      }
      System.out.println();
      csvLines.add(nextLine);
    }
    reader.close();
  }
}
