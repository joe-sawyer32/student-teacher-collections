package com.theironyard;

/**
 * Created by Joe on 7/26/17.
 */
public class Teacher extends Student {
    @Override
    public String toString() {
        return "Teacher\n" +
                "Name: '" + getFirstName() + " " + getLastName() + "'\n" +
                "Id: " + getId() + "\n" +
                "Grade: " + getGrade() + "\n";
    }
}
