public class maxmincmd {
    public static void main(String[] ar) {
        int n = ar.length;
        int max = Integer.parseInt(ar[0]);
        int min = Integer.parseInt(ar[0]);
        int i, d;
        for (i = 1; i < n; i++) {
            d = Integer.parseInt(ar[i]);
            if (max < d)
                max = d;
            else if (min > d)
                min = d;
        }
        System.out.println("maximum value in cmd line argument="+max);
        System.out.println("minimum value in cmd line argument="+min);
    }
}