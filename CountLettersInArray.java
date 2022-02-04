package com.acts.assessment;
//import java.util.Random;

public class CountLettersInArray {
	
	
	public static char[] createArray(int size)
	{
		char[] chArr = new char[size];
		return chArr;
	}
	
	public static void display(char []ch)
	{
		
		for(int i = 0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}
	public static char getRandomCharacter(char c1, char c2)
	{
		return (char)(c1 + Math.random()*(c2 - c1 + 1));
	}
	
	
	
	public static int[] countLetters(char[] chars) {
          
		int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++)
        {
        	counts[chars[i] - 'a']++;
        }
            return counts;

     }
	
	
	public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.print((counts[i] + " " + (char)(i + 'a')));
            else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }

	
	
	
	public static void main(String[] args) {
		
		
		char a[];
		int counts[];
		a = CountLettersInArray.createArray(100);
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = CountLettersInArray.getRandomCharacter('a', 'z');
			//count++;
		}
		
		//CountLettersInArray.display(a);
		//System.out.println('b' - 'a');
		counts = CountLettersInArray.countLetters(a);
		CountLettersInArray.displayCounts(counts);
  }

}
