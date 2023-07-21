public class operators2 {
    public static void main(String[] args) {

        int a = 12, b = 12, c = 14, d = 14;

        int result1, result2, result3, result4;
        System.out.println("Value of a:" + a); // a=12
        result1 = ++a;// pre increrement =13
        // result1=13
        System.out.println("After increment:" + result1);

        System.out.println("Value of b:" + b); // b=12
        result2 = --b; // pre decrement =11
        System.out.println("After decreement:" + result2);

        System.out.println("Value of c:" + c); // c=14
        result3 = c++; // post increcment =11
        System.out.println("After increment:" + result3);
        System.out.println("after increment value of c: " + c);

        System.out.println("Value of d:" + d); // d=14
        result4 = d--; // post decrement =14
        System.out.println("After decreement:" + result4);
        System.out.println("after increment value of d: " + d);
    }
}
