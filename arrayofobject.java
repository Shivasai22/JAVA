class student{
    int rollno;
    String name;
    double marks;
}




public class arrayofobject {
    public static void main(String[] args) {
        student s = new student();
        s.rollno=1;
        s.name="Shiva";
        s.marks=88.8;

        student s2=new student();
        s2.rollno=2;
        s2.name="Sai";
        s2.marks=85.6;

        student s3=new student();
        s3.rollno=3;
        s3.name="Prasad";
        s3.marks=92.3;

        student students[]=new student[3];
        students[0]=s;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno + ") "+ students[i].name+ " : " +students[i].marks);
        }
    }
}
