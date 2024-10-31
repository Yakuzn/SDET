public class Saha extends Person {
    private int length;

    public Saha(String name, String nextname, int age, int length) {
        super(name, nextname, age, 10);  // Передаем 10 оценок
        this.length = length;
    }

    public void printLength() {
        System.out.println("Length = " + length);
    }

    @Override
    public void calculateAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = total / grades.length;
        System.out.println("Average Saha = " + average);
    }

    @Override
    public void printBasicInfo() {
        super.printBasicInfo();
        System.out.println("Length = " + length);
    }
}