 
/**
 * to print bill.
 * @author (Prajyot Chandrashekhar Bhamare) 
 * @version (25-11-2016)
 */
public class bill_print
{
    public static void print(String name , String mob , String prdty , String brand , int budget , double price , int dp , double dis)
    {
        graphicsa g = new graphicsa();
        g.line();
        g.hash();
        g.hash();
        g.line();
        System.out.println("");
        System.out.println("Here is the bill for your purchase\nName of buyer : "+name  +"\nContact number: "+ mob +"\nYour pc type is: "+ prdty +" of brand: "+ brand +
                           "\nMRP. or total price "+ budget +"\nDiscounted price for you: "+ price + "\nyou got a discount of " + dp + "% which is about " + dis +" INR");
        System.out.println("You also have got a 16GB pen drive free with the purchase of our product\nThank you for having busness with us");
        g.line();
        g.hash();
        g.hash();
        g.line();
    }
}
