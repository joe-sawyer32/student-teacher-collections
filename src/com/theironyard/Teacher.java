package com.theironyard;

/**
 * Created by Joe on 7/26/17.
 */
public class Teacher extends Student {
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grade=" + getGrade() +
                '}';
    }
}
