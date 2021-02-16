
import java.util.Arrays;
public class Repeted {
    static int a[]= {40,10,20,50,10};
    public static void main(String[] args) {
        Repeted a = new Repeted();

        a.insertionsort(a.a);
        System.out.println(Arrays.toString(a.a));
        a.findRepeted(a.a);
        }
    public void findRepeted (int x[]){

        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i]==a[i+1]){
                System.out.println();
                System.out.println("the reapeted number is :");
                System.out.println(a[i]);
            }
        }}
    public void insertionsort(int x[]) {
        for (int i = 1; i < a.length; i++) {
            int cur = x[i];
            int j = i;
            while (j > 0 && cur < x[j - 1]) {
                x[j] = x[j - 1];
                j--;
            }
            x[j] = cur;
        }}}