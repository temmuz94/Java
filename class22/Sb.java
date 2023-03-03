package class22;

public class Sb {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        double salary = 5000.0;

        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append(", Age: ").append(age).append(", Salary: ").append(salary);

        String result = sb.toString();
        System.out.println(sb);

    }
}
