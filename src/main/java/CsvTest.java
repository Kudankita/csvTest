import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvTest {
  public static void main(String[] args) throws IOException {
    //
    //    List<List<String>> answer = new ArrayList<>();
    //    List<String> temp;
    //    String csvPath = "G:\\study\\IDEA\\csvTest\\src\\main\\resources\\1301_2018.csv";
    //    Reader reader = Files.newBufferedReader(Paths.get(csvPath));
    //    CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build(); // ヘッダーを一行飛ばす
    //
    //    String[] nextLine;
    //    while ((nextLine = csvReader.readNext()) != null) {
    //      temp = Arrays.asList(nextLine);
    //      answer.add(temp);
    //    }
    //    System.out.println(answer);
    System.out.println(System.getProperty("file.encoding"));
    CSVReader reader =
        new CSVReader(
            new FileReader("G:\\study\\IDEA\\csvTest\\src\\main\\resources\\1301_2018.csv"));
    String[] nextLine;
    while ((nextLine = reader.readNext()) != null) {
      // nextLine[] is an array of values from the line
      // System.out.println(nextLine[0] + nextLine[1] + "etc...");
      for (String str : nextLine) {
        System.out.print(str);
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
