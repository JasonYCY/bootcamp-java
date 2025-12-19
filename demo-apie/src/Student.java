import java.util.Arrays;

public class Student {
  public final Subject[] subjects = new Subject[] {
    new Subject("Chinese"),
    new Subject("English"),
    new Subject("Math")
  };

  public void changeSubject(int index, Subject subject) {
    this.subjects[index] = subject;
  }

  @Override
  public String toString() {
    return "Student{" +
          "subjects=" + Arrays.toString(subjects) +
          '}';
  }

  public String showSubjects() {
    return Arrays.toString(subjects);
  }

  public double averageScore() {
    double result = 0;
    for (Subject subject : subjects) {
      result += subject.getScore();
    }
    return result / 3;
  }

  public void setScore(int index, int updatedScore) {
    this.subjects[index].setScore(updatedScore);
  }

  public void changeFirstSubject(Subject subject) {
    this.subjects[0] = subject;
  }

  public void changeSecondSubject(Subject subject) {
    this.subjects[1] = subject;
  }
  
  public void changeThirdSubject(Subject subject) {
    this.subjects[2] = subject;
  }


  // main method
  public static void main(String[] args) {
    Student student = new Student();
    student.changeSubject(0, new Subject("History", 100));
    System.out.println(student.showSubjects());
    System.out.println(student.averageScore());
  }
}
