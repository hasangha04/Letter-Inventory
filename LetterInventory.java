/*
Programmer: Harpreet Sangha
Date 02/12/2022
Purpose:
This program takes in user String input and count each letter
It will print out how many of each letter you have types
it will not account for special characters and spaces
*/


import java.util.Scanner;

public class LetterInventory 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] wordCount = new int[26]; 
        int alphabet = 25;
        char [] letters = new char[26];

        String sentence;
        System.out.println("Please type a sentence:");
        sentence = input.nextLine().toLowerCase();

        countTest(wordCount, sentence, alphabet, letters);
        results(wordCount, letters);
    }

    public static int[] countTest(int[] wordCount, String sentence, int alphabet, char[] letters)
    {
        for(int i = 0; i <= alphabet; i++)
        {
            letters[i] = (char)('a' + i);
        }
        for(int i = 0; i < sentence.length(); i++)
        {
            for(int j = 0; j <= alphabet; j++)
            {
               if(sentence.charAt(i) == (letters[j]))
               {
                    wordCount[j]++;
                    break;
               }
            }
       } 
        return wordCount;
    }

    public static void results(int[] wordCount, char[] letters)
    {
        System.out.println("Results: ");
        useLetters(wordCount);
        for(int i = 0; i < wordCount.length; i++)
        {
            if (wordCount[i] > 0)
            {
                System.out.println(letters[i] + " = " + wordCount[i]);
            }
        }
    }

    // This method checks if no letters are used in the sentence
    public static void useLetters(int[] wordCount)
    {
        boolean check = false;
        for(int i = 0; i < wordCount.length; i++)
        {
            if(wordCount[i] == 0)
            {
                check = false;
            }
            else if(wordCount[i] != 0)
            {
                check = true;
                break;
            }
        }
        if(check == false)
        {
            System.out.println("No letters used!");
        }
    }
}
