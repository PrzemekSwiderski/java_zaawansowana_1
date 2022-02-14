package dzien2.zadanie2;

public class Personel {
    private String name;
    private String surname;
    private Gender gender;
    private String department;

    public Personel(String name, String surname, Gender gender, String department) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.department = department;
    }

    @Override
    public String toString(){
        return name + " " + surname + " " + gender.toString() + " " + department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
