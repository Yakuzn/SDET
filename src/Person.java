import java.util.Scanner;

public abstract class Person implements InterfaceA, InterfaceB {
    private final String name;
    private final String nextname;
    private final int age;
    protected int[] grades;  // Массив для оценок

    public Person(String name, String nextname, int age, int numberOfGrades) {
        this.name = name;
        this.nextname = nextname;
        this.age = age;
        this.grades = new int[numberOfGrades];  // Инициализируем массив оценок
    }

    public void printNameNextNameAge() {
        System.out.println("Name = " + name);
        System.out.println("NextName = " + nextname);
        System.out.println("Age = " + age);
    }

    public String getName() {
        return name;
    }

    @Override
    public void printBasicInfo() {
        System.out.println("Basic Info: " + name + " " + nextname + ", Age: " + age);
    }

    public void inputGrades() {  // Метод для ввода оценок
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + name + "'s grades:");
        for (int i = 0; i <= grades.length-1; i++) {
            System.out.print("Grade " + (i+1) + ": ");
            grades[i] = sc.nextInt();

        }
    }

    @Override
    public abstract void calculateAverage();  // Оставляем абстрактным для реализации в потомках
}

