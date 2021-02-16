import java.util.Arrays;

public class RepeteFi {

    static int b[]= {1,6,2,1,1,1};
    public static void main(String[] args) {
        RepeteFi a = new RepeteFi();

        a.insertionsort(a.b);
        System.out.println(Arrays.toString(a.b));
        a.findRepeted(a.b);

    }
    public void findRepeted (int x[]){

        for (int i = 0; i <b.length-1 ; i++) {
            if (b[i]==b[i+1]){
                System.out.println();
                System.out.println("the repeted number is :");
                System.out.println(b[i]);
                i+=100;
            }
        }

    }
    public void insertionsort(int x[]) {
        for (int i = 1; i < b.length; i++) {
            int cur = x[i];
            int j = i;
            while (j > 0 && cur < x[j - 1]) {
                x[j] = x[j - 1];
                j--;
            }
            x[j] = cur;
        }

    }

}



