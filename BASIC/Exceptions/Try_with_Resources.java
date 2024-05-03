package BASIC.Exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Try_with_Resources {
    public static void main(String[] args) throws IOException {
        int num = 0;
        int num1 = 0;
        BufferedReader br = null;

        // Resource Closing Ways
        // 1)..
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


        // 2)..
        // In the try block, the resource get closed automatically. Don't need to close manualy with final block
        try (BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));){
            num1 = Integer.parseInt(buffReader.readLine());
            System.out.println(num1);
        }

        
    }
}
