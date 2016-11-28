import java.util.*;
public class HairDressers
{
    private LinkedList<HairDresser> hairDressers = new LinkedList<HairDresser>();
    private int idx=0;
    public void add(String name)
    {
        hairDressers.add(new HairDresser(++idx,name));
    }
    public HairDresser find(int id)
    {
        for (HairDresser hair : hairDressers)
        {
            if(hair.matches(id)) return hair;
        }
        return null;
    }
}
