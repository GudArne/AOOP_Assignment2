package Task8;

public class TestFilter {
    public static void main(String[] args) {
        FilterTemplate ft = new SortOnThree();
        FilterTemplate ft5 = new SortOnFive();
        String [] s = {"this", "is", "a", "test"};
        ft.filterArray(s);
        String [] sTest =  ft.filterArray(s);
        String [] sTest2 = ft5.filterArray(s);
        System.out.println("test on 3" + sTest.toString() + "\n" + "test on five" + sTest2.toString());

    }
    
}
