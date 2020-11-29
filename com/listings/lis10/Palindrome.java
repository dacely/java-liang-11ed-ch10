package com.listings.lis10;

public class Palindrome
{
    public static String filter(String s)
    {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetterOrDigit(s.charAt(i)))
                builder.append(s.charAt(i));
        }

        return builder.toString();
    }

    public static String reverse(String s)
    {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }

    public static boolean isPalindrome(String s)
    {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s1.equals(s2);
    }
}
