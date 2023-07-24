package JavaException2;

public class JavaException2 {
    public static void main(String[] args) {
        try {
            int data = 100 / 10;
            System.out.println(data);
            String s = "Java";
            System.out.println(s.length());
            String a = "abc";// 200
            int i = Integer.parseInt(a);
            System.out.println(i);
            int a1[] = new int[5];// 0 1 2 3 4
            a1[6] = 1000;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        

        

    }
}
