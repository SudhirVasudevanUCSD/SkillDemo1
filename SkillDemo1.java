import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class SkillDemo1 {
  public static void main(String[] args) throws IOException {
      Path fileName = Path.of(args[0]);
      String contents = Files.readString(fileName);
      int links = addDigits(contents);
      System.out.println(links);
  }
  //Takes All numeric digits and sums them
  public static int addDigits(String contents) {
      int sum = 0;
      for(int i = 0; i < contents.length(); i++){
           if(i == contents.length()-1){
               sum += Integer.parseInt(contents.substring(i));
           } else {
               sum += Integer.parseInt(contents.substring(i, i + 1));
           }
      }
      return sum;
  }
}
