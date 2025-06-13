package D50;

import java.util.Arrays;

public class Test {
        public static void main(String args[]){
            int[] num = new int[args.length];
            for (int i=0; i < args.length; i++) {
                num[i] = Integer.parseInt(args[i]);
            }

            System.out.println(Arrays.toString(num));

        }
}

