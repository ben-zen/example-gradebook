/* Copyright (C) 2012 Benjamin Lewis
 * 
 * Licensed under the GNU GPLv3
 */

/* Grade.java, an example grading program. */

/* Just some code to start from; we'll see how this can become far more
 * interesting.
 */

public class Grade {
  public static void main (String[] args) {
    int midtermGrade, finalGrade;
    midtermGrade = 61;
    finalGrade = 70;
    double courseGrade = ((double) (midtermGrade + finalGrade)) / 2; // (61 + 70) -> 131; 131 / 2 = 65.5
    boolean satisfactoryGrade = (courseGrade >= 50);
    if (satisfactoryGrade) {
      System.out.println("Satisfactory");
    } else {
      System.out.println("Unsatisfactory");
    }
  }
}
