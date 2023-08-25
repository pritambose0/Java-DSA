public class polymorphism {
    public static class A{
        int age;
        String name;   

        public void rakesh(int age){
            System.out.println(age);
        }
        
    }
    public static class B extends A{
        @Override
        public void rakesh(int age){
            System.out.println("Hi");
        }
    }
    public static void main(String[] args) {
        A a = new A();
        a.age=10;
        a.rakesh(a.age);
        
        
    }
}
