class NumberIsGreaterException extends Exception {
    public NumberIsGreaterException(String str) {
        super(str);
    }
}

class NumberIsLesserException extends Exception {
    public NumberIsLesserException(String str) {
        super(str);
    }
}

public class TestClassification2{
    static void validate(int marks) throws NumberIsGreaterException,NumberIsLesserException{
        if(marks >100){
            throw new NumberIsGreaterException("Marks is >100");
        }
        else if(marks < 0){
            throw  new NumberIsLesserException("Marks is <0");
        }
        else{
            System.out.println("Marks is right");
        }
    }
    public static void main(String[] args) {
        try{
            validate(18); 
        }
        catch(NumberIsGreaterException ex){
            System.out.println("Exception occured "+ex);
        }
        catch(NumberIsLesserException ex){
            System.out.println("Exception occured "+ex);
        }
        System.out.println("rest of the code......");
    }    
}
