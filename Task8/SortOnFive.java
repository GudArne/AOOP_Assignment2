package Task8;

public class SortOnFive extends FilterTemplate {
    @Override
    public boolean accept(String s) {
        if(s.length() >= 5)
            return true;
        
        return false;
    }
    @Override
    public String[] filterArray(String[] a) {
        String[] tempList = new String[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(accept(a[i])){
                tempList[j++] = a[i];
            }
        }
        String[] retList = new String[j];
        for (int i = 0; i < j; i++) {
            retList[i] = tempList[i];
        }
        return retList;
    }    
}
