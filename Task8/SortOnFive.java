package Task8;

public class SortOnFive extends FilterTemplate {
    @Override
    public boolean accept(String s) {
        if(s.length() >= 5)
            return true;
        
        return false;
    }
   @Override
   public String[] getFStrings(String[] s) {
       // TODO Auto-generated method stub
       return super.getFStrings(s);
   }
}
