class Stu {
    int roll_no;
    String stu_name;
    double marks1, marks2, marks3, marks4;

    Stu() {
        roll_no = 1001;
        stu_name = "Shubhankar";
        marks1 = 80.0;
        marks2 = 81.0;
        marks3 = 88.0;
        marks4 = 88.0;
    }
}

class functioncall {
    public static void main(String[] args) {

        Stu s1 = new Stu();
        System.out.println(s1.roll_no + " " + s1.stu_name + " " + s1.marks1);
        System.out.println(s1.marks2 + " " + s1.marks3 + " " + s1.marks4);
        Stu s2 = new Stu();
        System.out.println(s2.roll_no + " " + s2.stu_name + " " + s2.marks1);
        System.out.println(s2.marks2 + " " + s2.marks3 + " " + s2.marks4);
    }
}
