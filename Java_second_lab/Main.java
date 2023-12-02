import java.nio.file.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(Paths.get("input.txt"));

      while (sc.hasNext()) {
        String word = sc.next();
        System.out.println(word);
      }
    } catch (Exception er) {
      System.out.println(er);
    }
  };
};