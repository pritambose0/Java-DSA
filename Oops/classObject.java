public class classObject{
    public static class Student{
        String name;
        int roll;
        double gpa;
    }
    public static void change(Student p){
        p.roll=15;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        s1.name = "Pritam";
        s1.roll = 37;
        s1.gpa = 8.3;

        change(s1);
        System.out.print(s1.roll);
    }
}
