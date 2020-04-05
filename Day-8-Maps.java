import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            hmap.put(name, phone);
            // Write code here
        }
        while (in.hasNext()) {
            String s = in.next();

            if (hmap.containsKey(s)) {
                System.out.println(s + "=" + hmap.get(s));

            } else {
                System.out.println("Not found");
            }

            // Write code here
        }
        in.close();
    }
