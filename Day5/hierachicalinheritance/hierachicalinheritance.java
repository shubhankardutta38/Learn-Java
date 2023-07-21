package hierachicalinheritance;

// write a program to demonstrate hierarchical inheritance where 
//base class is college and the derieved classes are student and teacher.

class college {
    public void print_college() {
        System.out.println("College");
    }
}

class student extends college {
    public void print_student() {
        System.out.println("Student");
    }
}

class teacher extends college {
    public void print_teacher() {
        System.out.println("Teacher");
    }
}

public class hierachicalinheritance {
    public static void main(String[] args) {
        student obj1 = new student();
        obj1.print_college();
        obj1.print_student();

        System.out.println(" ");

        teacher obj2 = new teacher();
        obj2.print_college();
        obj2.print_teacher();
    }
}