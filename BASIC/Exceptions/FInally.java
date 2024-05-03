package BASIC.Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class FInally {
    public static void main(String[] args) throws IOException {
        int num = 0;
        int num1 = 0;
        BufferedReader br = null;

        // Here, resource need to close manualy
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        // mostly used to close the resource
        finally {
            br.close();
        }
        
    }
}
