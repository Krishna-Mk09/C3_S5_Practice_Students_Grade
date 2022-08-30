/*
 * Author Name : M.Krishna.
 * Date: 30-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.marks;

public class StudentMarks {


    /**
     * This function calculates the marks of a student in a subject.
     *
     * @param math      The marks obtained in Maths
     * @param physics   The number of marks scored in physics.
     * @param chemistry int
     * @param biology   int
     * @return The sum of the four integers.
     */
    public int calculateMarks(int math, int physics, int chemistry, int biology) {
        return math + physics + chemistry + biology;
    }

    /**
     * This function calculates the marks of a student in a subject.
     *
     * @param math      The marks obtained in Maths
     * @param physics   The number of marks scored in physics.
     * @param chemistry The number of marks scored in chemistry.
     * @return The sum of the three integers.
     */
    public int calculateMarks(int math, int physics, int chemistry) {
        return math + physics + chemistry;
    }

    /**
     * > This function calculates the marks of a student in a particular subject
     *
     * @param businessStudies a byte
     * @param finance         int
     * @param accounting      int
     * @return The sum of the three parameters.
     */
    public int calculateMarks(byte businessStudies, int finance, int accounting) {
        return (businessStudies + finance + accounting);
    }

}
