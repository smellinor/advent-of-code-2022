public enum WINNER {
  WIN,
  LOSS,
  DRAW;

  public static WINNER convert(int i) {
    if (i == 0) {
      return DRAW;
    } else if (i == 1) {
      return WIN;
    } else if (i == 2) {
      return LOSS;
    } else {
      throw new RuntimeException();
    }
  }
}
