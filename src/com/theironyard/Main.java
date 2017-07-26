package com.theironyard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final int STUDENT_COUNT = 15;
    private static final String[] FIRST_NAMES = new String[]{"John", "Jane", "Brenda", "Bobby", "Richard", "Roxanne", "Mike",
            "Marie", "Emily", "Edward", "Caroline", "Charles", "Katherine", "Kip", "Octavius"};
    private static final String[] LAST_NAMES = new String[]{"Doe", "Flagger", "Hipster", "Ajax", "Pincher", "Zippidy", "Wall",
            "Smith", "Gunner", "Indigo", "Volatile", "Quinton", "Thoreau", "Underminer", "Leopard"};

    public static void main(String[] args) {
        List<Student> firstGraders = new ArrayList<>();
        Student student;
        for (int i = 0; i < STUDENT_COUNT; i++) {
            student = new Student();
            student.setFirstName(FIRST_NAMES[i]);
            student.setLastName(LAST_NAMES[i]);
            student.setGrade(1);
            student.setId(i);
            firstGraders.add(student);
        }

    }
}
