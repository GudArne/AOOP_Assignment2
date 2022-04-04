package Task8;

public class TestFilter {
    public static void main(String[] args) {
        FilterTemplate ft = new SortOnThree();
        //FilterTemplate ft5 = new SortOnFive();
        String [] s = {"this", "is", "a", "test"};
        //ft.filterArray(s);
        String [] sTest =  ft.getFStrings(s);
        //String [] sTest2 = ft5.filterArray(s);
        

    }

}
