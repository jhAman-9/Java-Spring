package BASIC.BufferReader;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a num");

        // Taking Input Using Buffer reader
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        bf.close();


        // Taking Input  with Scanner
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);


    }    
}
