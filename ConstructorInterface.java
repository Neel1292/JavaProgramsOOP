class First
{
    First()
    {
        System.out.println("Inside First  Class Constructor");
    }
}

class Second extends First
{
    Second()
    {
        System.out.println("Inside Second Class Constructor");
    }
}

class Third extends Second
{
    Third()
    {
        super();
        System.out.println("Inside Third Class Constructor");
    }
}


public class ConstructorInterface
{
    public static void main(String args[])
    {
        Third obj = new Third();

    }
}