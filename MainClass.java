package Lesson8;

public class MainClass {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "Vasiliy";
        citizen.age = 27;
        citizen.inn = "12345";
        System.out.println(citizen);
    }
}