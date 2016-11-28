
public class MulletCuts
{    
    private final char YES = 'Y';
    public MulletCuts()
    {
        
    }
    private void menu()
    {
        
    }
    private char readAction()
    {
        return In.nextChar();
    }
    private String readString(String message)
    {
        System.out.print("Please Enter "+message+":");
        return In.next();
    }
    private double readDouble(String message)
    {
        System.out.print("Please Enter "+message+":");
        return In.nextDouble();
    }
    private int readInt(String message)
    {
        System.out.print("Please Enter "+message+":");
        return In.nextInt();
    }
    private int add ()
    {
        return 0;
    }
    private void view()
    {
        
    }
    private void appointment()
    {
    }
    private void appointment(HairDresser hairDresser)
    {
        
    }
    private void complete()
    {
        
    }
    private void summary()
    {
        
    }
    private void exit()
    {

    }
    private boolean comfim()
    {
        System.out.print("Sure? Y OR N");
        return In.nextChar() == YES;
    }
    private void help()
    {
        
    }
    private void error()
    {
        
    }
}
