/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.marks;

public class StudentMarks {


    public int calculateMarks(int math, int physics, int chemistry, int biology) {
        return math + physics + chemistry + biology;
    }

    public int calculateMarks(int math, int physics, int chemistry) {
        return math + physics + chemistry;
    }

    public int calculateMarks(byte businessStudies, int finance, int accounting) {
        return (businessStudies + finance + accounting);
    }

}
