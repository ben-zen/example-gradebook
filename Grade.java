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
    int[] assignmentGrades = new int[10];
    // assignmentGrades: [ ][ ][ ][ ]
    assignmentGrades[0] = 9;
    // assignment 2 wasn't handed in
    assignmentGrades[2] = 8;
    assignmentGrades[3] = 10;
    assignmentGrades[4] = 9;
    assignmentGrades[5] = 10;
    assignmentGrades[6] = 7;
    assignmentGrades[7] = 8;
    assignmentGrades[8] = 9;
    // assignment 10 wasn't handed in

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
  
  public static double computeGrade (int pG, int mG, int fG) {
    
  }
}
