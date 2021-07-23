package com.DhivyaRenuka;

import java.util.Stack;

public class reverseStringUsingStack {
    public String reverseArrayStr(String str){
        Stack<Character> st = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c :chars){
            st.push(c);
        }
        for(int i =0;i< str.length();i++){
            chars[i]=st.pop();

        }
        return new String(chars);

    }

    public static void main(String[] args) {
        reverseStringUsingStack rsa=new reverseStringUsingStack();

        System.out.println(rsa.reverseArrayStr("Divya"));

    }

}
