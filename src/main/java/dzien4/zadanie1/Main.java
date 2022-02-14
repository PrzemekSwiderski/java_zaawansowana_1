package dzien4.zadanie1;

public class Main {
    public static void main(String[] args) {
        University agh = new University();

        Student student1 = new Student("Kasia", "Nowak", agh);
        Student student2 = new Student("Asia", "Kowalska", agh);
        Student student3 = new Student("Małgosia", "Janda", agh);
        Student student4 = new Student("Marysia", "Wojcik", agh);
        Student student5 = new Student("Magda", "Kowal", agh);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        agh.expelStudent(student3);


        agh.showActiveStudents();
//        agh.showAllStudents();

        System.out.println("===========");

        agh.showExpelledStudents();

        agh.promoteStudent(student5);
        agh.promoteStudent(student5);
        agh.promoteStudent(5);
        agh.promoteStudent(5);
        agh.promoteStudent(5);
        agh.promoteStudent(5);
        agh.promoteStudent(student5);

        System.out.println("===========");
        agh.showActiveStudents();
        System.out.println("===========");
        agh.showGraduate();

    }
}
