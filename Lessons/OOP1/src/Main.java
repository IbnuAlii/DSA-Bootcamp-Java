public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Students student1 = new Students(12,"Mohan",96.5f);
//        student1.rno= 13;
//        student1.name = "Mohamed";
//        student1.marks = 96.5f;

//        Students student2= new Students(12,"ali",65.7f);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }
}
class Students {
    int rno;
    String name;
    float marks;

     Students(int rno, String name , float marks) {
        this.rno=rno;
        this.name = name;
        this.marks = marks;
    }
}