package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        int length = list.size();
        boolean changed;

        for (int i = 0; i < length - 1; i++) {
            changed = false;

            for (int j = 0; j < length - 1 - i; j++) {
                Student s1 = list.get(j);
                Student s2 = list.get(j + 1);

                boolean changeNeeded = false;
                int lastNameComp = s1.getLastName().compareTo(s2.getLastName());
                if (lastNameComp > 0) {
                    changeNeeded = true;
                } else if (lastNameComp == 0) {
                    int firstNameComp = s1.getFirstName().compareTo(s2.getFirstName());
                    if (firstNameComp > 0) {
                        changeNeeded = true;
                    } else if (firstNameComp == 0) {
                        if (s1.getGpa() < s2.getGpa()) {
                            changeNeeded = true;
                        }
                    }
                }

                if (changeNeeded == true) {
                    list.set(j, s2);
                    list.set(j + 1, s1);
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }
        }
        return list;
    }
}