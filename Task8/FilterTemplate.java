package Task8;

public abstract class FilterTemplate
 { 
    public void filter()
    {
        accept(null);
        filterArray(null);
    }

    public  boolean accept(String s)
    {
        return false;
    }
    public String [] filterArray(String [] s)
    {
        return s;
    }
}
