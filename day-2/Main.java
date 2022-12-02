import java.nio.file.*;
import java.util.*;

public class Main {

  private final String inputFileName = "input.txt";

  private String readInput() {
    String inputText = null;
    try {
      inputText = Files.readString(Path.of(this.inputFileName));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return inputText;
  }

  private List<ENUM> myMoves;
  private List<ENUM> theirMoves;

  private void convertToList(String input) {
    this.myMoves = new ArrayList<ENUM>();
    this.theirMoves = new ArrayList<ENUM>();
    String[] moves = input.split("\n");
    for (String move : moves) {
      String[] round = move.split(" ");
      myMoves.add(ENUM.isRockPaperScissors(round[1]));
      theirMoves.add(ENUM.isRockPaperScissors(round[0]));
    }
    System.out.println(myMoves.get(0));
  }

  public static void main(String args[]) {
    Main main = new Main();
    String input = main.readInput();
    main.convertToList(input);
  }
}
