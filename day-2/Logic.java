public class Logic {

  public static WINNER isWinner(ENUM opponent, ENUM me) {
    return WINNER.convert(whoWins(me, opponent));
  }

  private static int whoWins(ENUM first, ENUM second) {
    if (first == second) {
      return 0;
    } else if (first == ENUM.ROCK) {
      return fightWithRock(second);
    } else if (first == ENUM.PAPER) {
      return fightWithPaper(second);
    } else {
      return fightWithScissors(second);
    }
  }

  private static int fightWithRock(ENUM opponent) {
    if (opponent == ENUM.PAPER) {
      return 2;
    } else {
      return 1;
    }
  }

  private static int fightWithPaper(ENUM opponent) {
    if (opponent == ENUM.ROCK) {
      return 1;
    } else {
      return 2;
    }
  }

  private static int fightWithScissors(ENUM opponent) {
    if (opponent == ENUM.ROCK) {
      return 2;
    } else {
      return 1;
    }
  }
}
