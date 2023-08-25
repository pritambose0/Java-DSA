public class inheritance {
    static class Godf{
        String name;
        String surName="Rusi";
        int age;
    }
    static class Father extends Godf{
        String name;
    }
    public void hello(String name){
        System.out.println("Hi");
    }
    // public void hello(String surName){
    //     System.out.println("Hello");
    // }
    public void hello(int age){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Father f = new Father();
        f.name ="Rambo";
        System.out.println(f.name +" "+ f.surName);
    }
}
