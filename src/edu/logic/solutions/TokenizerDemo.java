package edu.logic.solutions;

import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String data = "name=Mou;address=Kaliyaganj;country=India";
        StringTokenizer stk = new StringTokenizer(data,"=;");
        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}
