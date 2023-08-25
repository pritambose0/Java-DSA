public class finalKey{
    public static class Student {
        String name;
        int rno;
        double percentage;
        final String school = "HDB"; // Cant change value
        private static int noOfStudents;

        public Student(){

        }
        public Student(String name, int rno, double percentage){
            this.name = name; //Same name cannot pass
            this.rno = rno;
            this.percentage = percentage;
            noOfStudents++;
        }

        public static int getNoOfStudents(){
            return noOfStudents;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(Student.getNoOfStudents());
        Student s2 = new Student("Ayush", 27, 91.4);
        Student s3 = new Student("Ayush", 27, 91.4);
        System.out.println(s3.name);
        System.out.println(s2.rno);
        System.out.println(Student.getNoOfStudents());
    }

}
