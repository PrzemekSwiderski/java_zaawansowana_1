package dzien4.zadanie1;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class University {
    private int index = 0;
    Map<Integer, Student> listOfStudents = new HashMap<>();

    public void addStudent(Student student) {
        index++;
        listOfStudents.put(index, student);
    }

    public void promoteStudent(Student student) {
        if (student.getExpulsion() != null || student.getEnd() != null) {
            System.out.println("Dany student "
                    + student.getName() + " " + student.getSurname()
                    + " nie może przejść do następnego roku");
            return;
        }

        student.setYearOfStudy(student.getYearOfStudy() + 1);
        if (student.getYearOfStudy() > 5) {
            complteStudentStudies(student);
        }
    }

    public void promoteStudent(Integer index) {
        if (listOfStudents.get(index).getExpulsion() != null || listOfStudents.get(index).getEnd() != null) {
            System.out.println("Dany student "
                    + listOfStudents.get(index).getName() + " " + listOfStudents.get(index).getSurname()
                    + " nie może przejść do następnego roku");
            return;
        }

        listOfStudents.get(index).setYearOfStudy(listOfStudents.get(index).getYearOfStudy() + 1);
        if (listOfStudents.get(index).getYearOfStudy() > 5) {
            complteStudentStudies(index);
        }
    }

    public void complteStudentStudies(Student student) {
        if (student.getExpulsion() != null || student.getEnd() != null) {
            System.out.println("Dany student "
                    + student.getName() + " " + student.getSurname()
                    + " nie może zakończyć studiów!");
            return;
        }
        student.setEnd(LocalDateTime.now());
    }

    public void complteStudentStudies(Integer index) {
        if (listOfStudents.get(index).getExpulsion() != null || listOfStudents.get(index).getEnd() != null) {
            System.out.println("Dany student "
                    + listOfStudents.get(index).getName() + " " + listOfStudents.get(index).getSurname()
                    + " nie może zakończyć studiów!");
            return;
        }
        listOfStudents.get(index).setEnd(LocalDateTime.now());
    }


    public void expelStudent(Student student) {
        student.setExpulsion(LocalDateTime.now());
    }

    public void expelStudent(Integer index) {
        listOfStudents.get(index).setExpulsion(LocalDateTime.now());
    }

    public void showActiveStudents() {
        for (Map.Entry<Integer, Student> person : listOfStudents.entrySet()) {
            if (person.getValue().getEnd() == null && person.getValue().getExpulsion() == null) {
                System.out.println(person);
            }
        }
    }

    public void showAllStudents() {
        for (Map.Entry<Integer, Student> person : listOfStudents.entrySet()) {
            System.out.println(person);
        }
    }

    public void showNotExpelledStudents() {
        for (Map.Entry<Integer, Student> person : listOfStudents.entrySet()) {
            if (person.getValue().getEnd() == null) {
                System.out.println(person);
            }
        }
    }

    public void showExpelledStudents() {
        for (Map.Entry<Integer, Student> person : listOfStudents.entrySet()) {
            if (person.getValue().getExpulsion() != null) {
                System.out.println(person);
            }
        }
    }

    public void showGraduate() {
        for (Map.Entry<Integer, Student> person : listOfStudents.entrySet()) {
            if (person.getValue().getEnd() != null) {
                System.out.println(person);
            }
        }
    }

}
