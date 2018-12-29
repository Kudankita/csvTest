import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvTest {
  /**
   * @param args 利用せず
   * @throws IOException 対処せず
   */
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
    // ここでファイルを保存するが、特に指定していないので、環境がUTF8ならそれ、sjisならばそれで保存する
    // ideaで実行するとUTF８で保存され、powershellで保存するとsjisになる
    CSVWriter writer = new CSVWriter(new FileWriter("yourfile.csv"));
    for (String[] sList : csvLines) {
      writer.writeNext(sList);
    }
    writer.close();
  }
}
