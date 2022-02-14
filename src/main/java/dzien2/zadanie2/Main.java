package dzien2.zadanie2;

public class Main {
    public static void main(String[] args) {
        Personel Anna = new Personel("Anna", "Kowalska", Gender.KOBIETA, "logistyka");
        Personel Kasia = new Personel("Kasia", "Kowalska", Gender.KOBIETA, "HR");
        Personel Monika = new Personel("Monika", "Kowalska", Gender.KOBIETA, "zaopatrzenie");
        Personel Lucyna = new Personel("Lucyna", "Kowalska", Gender.KOBIETA, "finanse");
        Personel Piotr = new Personel("Piotr", "Kowalski", Gender.MEZCZYZNA, "logistyka");

        Firm nowaFirma = new Firm();

        nowaFirma.addPersonel(Anna);
        nowaFirma.addPersonel(Kasia);
        nowaFirma.addPersonel(Monika);
        nowaFirma.addPersonel(Lucyna);
        nowaFirma.addPersonel(Piotr);

        nowaFirma.showPersonel();

        System.out.println("----------");

        nowaFirma.showDepartment();


    }
}
