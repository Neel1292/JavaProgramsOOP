class Student 
{
    int rollno;
    String name;
    
    Student(int rollno,String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    
    public  String toString()
    {
        return "Student { Rollno = " + rollno + " Name = " + name + " }";
    }

}

public class ToString
{
    public static void main(String args[])
    {
        Student stud = new Student(1,"Neel");
        System.out.println(stud);
    }
}