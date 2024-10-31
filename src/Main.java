import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oleg oleg = new Oleg("Oleg", "Qwerty", 23, 657);
        oleg.inputGrades();  // Ввод оценок для Oleg
        oleg.printBasicInfo();
        oleg.printWeight();
        oleg.calculateAverage();  // Вычисление среднего балла
        School.printSchoolStudents();
        System.out.println("\n");

        Saha saha = new Saha("Saha", "asdf", 21, 345);
        saha.inputGrades();  // Ввод оценок для Saha
        saha.printBasicInfo();
        saha.printLength();
        saha.calculateAverage();  // Вычисление среднего балла

        School.printSchoolStudents();

    }
}