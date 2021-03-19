package com;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack stackS = delete(S);
        Stack stackT = delete(T);
        while(!stackS.isEmpty() && !stackT.isEmpty()){
            if (!stackS.pop().equals(stackT.pop())){
                return false;
            }
        }
        if (stackS.isEmpty() && stackT.isEmpty()){
            return true;
        } else return false;

    }
    public Stack delete(String inputS){
        Stack<String> stackString = new Stack();
        char[] charString = inputS.toCharArray();
        for (char charS: charString){
            String s = String.valueOf(charS);
            if (s.equals("#") && !stackString.isEmpty()){
                stackString.pop();
            } else if (s.equals("#") && stackString.isEmpty()){
                continue;
            } else{
                stackString.push(s);
            }
        }
        return stackString;
    }
}
