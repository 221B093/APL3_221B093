public class Application
{
    public static void client(Swan swan)
    {
        swan.eat();
        swan.swim();
        swan.sing();
    }
    
    public static void  main(String args[])
    {
        Crow crow=new IndianCrow();
        Swan swan=new IndianSwan();
        CrowAdapter crowadapter=new CrowAdapter(crow);
        System.out.println("Swan is :- ");
        client(crowadapter);
    }
}