package dzien4.zadanie1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Student {
    private final String name;
    private final String surname;
    private int yearOfStudy = 1;
    private final LocalDateTime beginning;
    private LocalDateTime end;
    private LocalDateTime expulsion;

    public Student(String name, String surname, University uni) {
        this.name = name;
        this.surname = surname;
        this.beginning = LocalDateTime.now();
        uni.addStudent(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student: ").append(name).append(" ").append(surname);
        if (yearOfStudy < 6) {
            stringBuilder.append(", rok studiów: ").append(yearOfStudy);
        } else {
            stringBuilder.append(", studia zakończone");
        }
        stringBuilder.append(", Data rozpoczęcia: ").append(beginning);
        if (end != null) {
            stringBuilder.append(", Data zakończenia: ").append(end);
        }
        if (expulsion != null) {
            stringBuilder.append(", Data wydalenia: ").append(expulsion);
        }


        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfStudy == student.yearOfStudy && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(beginning, student.beginning) && Objects.equals(end, student.end) && Objects.equals(expulsion, student.expulsion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfStudy, beginning, end, expulsion);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public LocalDateTime getBeginning() {
        return beginning;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public LocalDateTime getExpulsion() {
        return expulsion;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public void setExpulsion(LocalDateTime expulsion) {
        this.expulsion = expulsion;
    }
}
