/**
 * Created by xenon on 2/10/2021.
 */
public class Copy {

        public static void main(String[] args)
        {
            int a[] = { 1, 8, 3 };
            // Create an array b[] of same size as a[]
            int b[] = new int[a.length];
            b = a;
            b[0]++;
            System.out.println("Contents of a[] ");
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i] + " ");
            System.out.println("\n\nContents of b[] ");
            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
        }
    }

