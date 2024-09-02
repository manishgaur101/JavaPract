package com.special;

public class ReplaceCountWithSign {
    public static void main(String[] args){
        String s = "tomorrow";
        //Expected - "t#m##rr###w"
        char sign  =  '#';
        int i = 0;
        for(char c:s.toCharArray()){
            if(c=='o'){
                i++;
                for(int j=0;j<i;j++){
                    System.out.print(sign);
                }
            }
            else{
                System.out.print(c);
            }
        }
    }
}
