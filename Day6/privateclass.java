class A {
    private int data = 40;
    void display_data(){
        System.out.println("data value: "+data);
    }
}

public class privateclass {
    
    public static void main(String[] args) {
        A obj = new A();
        //System.out.println(obj.data); //Compile time error
        obj.display_data();
    }
}
