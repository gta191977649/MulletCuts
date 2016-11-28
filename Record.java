public class Record
{
    protected int id;
    protected String name;
    
    public Record(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    protected boolean matches(int id )
    {
        return id == this.id;
    }
    protected String getName()
    {
        return name;
    }
    public String toString()
    {
        return "id:" + id+ "name" + name;
    }
}
