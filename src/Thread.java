class Multithreading extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread " +Thread.currentThread().getId() +" is executing");
        }
        catch (Exception e)
        {
            System.out.println ("Exception");
        }
    }
}
class ExtendingThreadClass
{
    public static void main(String[] args)
    {
        for (int count=0; count<5; count++)
        {
            Multithreading object = new Multithreading();
            object.start();
        }
    }
}
