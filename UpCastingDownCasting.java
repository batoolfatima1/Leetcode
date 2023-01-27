public class UpCastingDownCasting 
{
    public static void main(String[] args) 
    {
        // UP-casting
        // will call all static or non static variables or static methods of Super or base or A class
        // and obviously non-static methods of sub or child or B class
        // super class can't access method of child only means jo inherit or redefine nai hua hota
        A obj = new B();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.fun1();
        obj.func2();
        /// obj.check(); this is throwing error

        System.out.println("------------------------------------------------------------");

        // Down Casting
        // call all the things of sub or B class  
        B obj2 = (B)obj;
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        obj2.fun1();
        obj2.func2();
        obj2.extra();
        obj2.check();

        // Simple 

        A obj3 = new A();
        // A.check(); can't call methof of its child class

        B obj4 = new B();
        obj4.extra(); // here child can call parent method 
    }    

}

class A
{
    static int x = 111;
    int y = 222;

    void fun1()
    {
        System.out.println("super class non-static func1");
    }
    static void func2()
    {
        System.out.println("super class static func2");
    }

    static void extra()
    {
        System.out.println("super class extra func");
    }
}

class B extends A
{
    static int x = 333;
    int y = 444;

    void fun1()
    {
        System.out.println("sub class non-static func1");
    }
    static void func2()
    {
        System.out.println("sub class static func2");
    }
    
    void check()
    {
        System.out.println("sub class non-static check fun");
    }
}
