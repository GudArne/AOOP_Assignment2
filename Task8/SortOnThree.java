package Task8;

public class SortOnThree extends FilterTemplate {
    @Override
    public boolean accept(String s) {
        if(s.length() >= 3)
            return true;
        
        return false;
    }
}
