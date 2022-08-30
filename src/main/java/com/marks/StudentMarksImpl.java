/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.marks;

public class StudentMarksImpl {
    // This is the main method.
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("The total marks : " + studentMarks.calculateMarks(88, 98, 78, 77));
        System.out.println("The total marks : " + studentMarks.calculateMarks(98, 78, 77));
        System.out.println(" The total marks : " + studentMarks.calculateMarks(89, 78, 89));
    }

}
