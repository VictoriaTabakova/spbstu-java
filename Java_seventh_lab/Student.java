public class Student {
    private String first_name;
    private String last_name;
    private int age;
    private double average_score;

    Student(String first_name, String last_name, int age, double average_score) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.average_score = average_score;
    };

    @Override
    public String toString() {
        return "First name \"" + this.first_name + "\": Last name = " + this.last_name + ", Age = " + this.age
                + ", score = " + this.average_score;
    };
};
