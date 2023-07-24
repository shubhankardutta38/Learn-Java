package Exercise14;

class calculator12 {
    public int add(int x, int y){
        return x+y ;
    }
    public double divide (int x, int y) throws ArithmeticException{
        return x/y;
    }
}
public class calculator1{
    public static void main(String[] args) {
        calculator12 calc = new calculator12();
        int addResult = calc.add(40,79);
        System.out.println("Add Result :" +addResult);
        try{
            double divResult = calc.divide(15,0);
            System.out.println("Division Result : "+divResult);
        }
        catch(ArithmeticException ee){
            System.out.println(ee);
        }
    }
}
