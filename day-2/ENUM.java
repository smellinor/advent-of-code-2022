public enum ENUM {
  ROCK,
  PAPER,
  SCISSORS;

  public static ENUM isRockPaperScissors(String s) {
    switch (s.toUpperCase()) {
      case "A":
        return ROCK;
      case "B":
        return PAPER;
      case "C":
        return SCISSORS;
      case "X":
        return ROCK;
      case "Y":
        return PAPER;
      case "Z":
        return SCISSORS;
      default:
        throw new RuntimeException();
    }
  }
}
