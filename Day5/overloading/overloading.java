package overloading;

class adddigit{
    static int add(int a,int b, int c, int d){
        return a+b+c+d;
    }
    static float add(float a,float b){
        return a+b;
    }
    static double add(double a,double b, double c){
        return a+b+c;
    }
}

public class overloading {
    public static void main(String[] args) {
        System.out.println("Four Integer values :"+adddigit.add(11, 22, 33, 44));
        System.out.println("Two float values :" + adddigit.add(22, 11));
        System.out.println("Three double values :"+adddigit.add(21, 21, 21));
    }
}
