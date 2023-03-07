public class Q3 {
        public static void main(String[] args) {
            int a[]= {5,10,15};
            int m[]= {30,35,40};
            int a1 = a.length;
            int m2 = a.length;
            int c3  = a1+m2;
            int c[] = new int[c3];
            for (int i = 0; i < a1; i=i+1) {
                c[i]=a[i];
            }
            for (int i = 0; i < m2; i=i+1) {
                c[a1 + i]=m[i];
            }
            for (int i = 0; i < c3; i=i+1) {
                System.out.print(c[i]+" ");
            }

        }
    }


