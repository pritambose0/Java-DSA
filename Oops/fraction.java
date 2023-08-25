public class fraction {
    public static   Fraction add(Fraction f1, Fraction f2){
        int numerator = f1.num * f2.den + f2.num * f1.den;
        int denominator = f1.den * f2.den;

        Fraction f = new Fraction(numerator,denominator);
        return f;
    }
    public static   Fraction subtaction(Fraction f1, Fraction f2){
        int numerator = f1.num * f2.den - f2.num* f1.den;
        int denominator = f1.den * f2.den;

        Fraction f = new Fraction(numerator,denominator);
        return f;
    }

    public static   Fraction multiply(Fraction f1, Fraction f2){
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;

        Fraction f = new Fraction(numerator,denominator);
        return f;
    }

    public static int gcd(int num, int den){
        int min = Math.min(num,den);
        for(int i=min; i>=1;i--){
            if(num%i==0 && den%i==0){
                return i;
            }
        }
        return min;
    }
    public static class Fraction{
        int num;
        int den;


        public Fraction(int num, int den){
            this.num=num;
            this.den=den;
            simplify();
        }

        private void simplify() {
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = new Fraction(7,14);
        Fraction f3 = add(f1,f2);
        Fraction f4 = subtaction(f1,f2);
        Fraction f5 = multiply(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        System.out.println(f4.num+"/"+f4.den);
        System.out.println(f5.num+"/"+f5.den);
    }
}
