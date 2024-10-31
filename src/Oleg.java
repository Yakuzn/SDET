public class Oleg extends Person {
    private int weight;

    public Oleg(String name, String nextname, int age, int weight) {
        super(name, nextname, age, 10);  // Передаем 10 оценок
        this.weight = weight;
    }

    public void printWeight() {
        System.out.println("Weight = " + weight);
    }

    @Override
    public void calculateAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        double average = total / grades.length;
        System.out.println("Average Oleg = " + average);
    }

    @Override
    public void printBasicInfo() {
        super.printBasicInfo();
        System.out.println("Weight = " + weight);
    }
}
