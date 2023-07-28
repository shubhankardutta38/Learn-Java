package invalidage;

// class representing custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to Vote");
        }
    }
}

public class TestClassification {
    public static void main(String[] args) {
        try {
            InvalidAgeException.validate(18); 
        } catch (InvalidAgeException ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + ex);
        }
        System.out.println("rest of the code....");
    }
}
