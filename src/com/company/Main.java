package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner sf = new Scanner(new File("MyData2.txt"));

        int maxIndex = -1;
        String text [] = new String [1000];
        while (sf.hasNext())
        {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        sf.close();

        for(int j = 0; j <= maxIndex; j++)
            System.out.println(text[j]);

        FileWriter fw = new FileWriter("output.txt");
        PrintWriter output = new PrintWriter(fw);

        System.out.println("Username: ");
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();

        output.println(a);
        output.close();
        fw.close();


    }
}
