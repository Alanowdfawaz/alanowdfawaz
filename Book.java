package bookshop;

/**
 * Created by xenon on 11/14/2020.
 */
public class Book {
   int b_no;
    String b_name;
    int b_copied;
    int b_price;
    int b_sprice ;
    int b_profit;

    public int b_profit(){
        b_profit=b_sprice-b_price;
        return b_profit;
    }
       public void b_details(){
           System.out.println("book number:"+b_no);
           System.out.println("book name:"+b_name);
           System.out.println("book copied:"+b_copied);
           System.out.println("purchase price:"+b_price);
           System.out.println("sell price:"+b_sprice);
           System.out.println("profit:"+b_profit);
           System.out.println("*********************************");
       }
    }

