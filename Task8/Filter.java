package Task8;

public interface Filter {
    /**In assignment 1 you programmed an interface Filter and a method filter. In this exercise,
use the Template method pattern instead to define an abstract class Filter with a public method
filter (the template method) that calls the method accept (the hook method) that can be
implemented in different ways in the different concrete classes. Write a test program by extending
the class Filter and defining accept so that only strings of at most three characters are accepted. */
    public boolean accept(String x);

    public void filter(Filter filter);



    

}
