/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
public class PrintingQuote
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String name = input.nextLine();
        System.out.print(name + " says, " + "\"" + quote + "\"");
    }
}

