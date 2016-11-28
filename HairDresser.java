import java.util.*;
public class HairDresser extends Record
{
    private LinkedList<Appointment> appointments = new LinkedList<Appointment>();
    public HairDresser(int id, String name)
    {
        super(id, name);
        
    }
}
