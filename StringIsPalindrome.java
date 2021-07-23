package com.DhivyaRenuka;

public class StringIsPalindrome {
    /*
    checking palindrome in strings
    input : madam
    output :true
     */
    public boolean isPalindrome(String word){
        char[] chararr=word.toCharArray();
        int start =0;
        int end = word.length() -1;
        while(start<end){
            if(chararr[start] != chararr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        StringIsPalindrome sp =new StringIsPalindrome();
        String madam="madam";
        System.out.println(sp.isPalindrome(madam));


    }
}
