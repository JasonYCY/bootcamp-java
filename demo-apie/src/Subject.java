public class Subject {
  private String name;
  private int score;

  public Subject(String name) {
    this.name = name;
    this.score = 60;
  }

  public Subject(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Subject{" +
          "name=\"" + name + '\"' +
          ", score=" + score +
          '}';
  }
}
