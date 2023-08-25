public class prac {
    public static class Car {
        String name;
        int price;
        int milage;
        private String bodyMaterial="Plastic";

        public String getbodyMaterial(){
            return bodyMaterial;
        }

        public Car(String name,int price,int milage){
            this.name=name;
            this.price=price;
            this.milage=milage;
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car("Audi",10000,20);

        System.out.println(c1.bodyMaterial);
    }
}
