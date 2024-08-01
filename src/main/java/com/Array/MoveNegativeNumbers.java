package com.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveNegativeNumbers {
    public static void main(String[] args) {
        int marks[] = {0,2,33,5,-1,0,-9,21,7,-6,-7,-2,7};
        System.out.printf("Given array is:\n%s",Arrays.toString(marks));

        List<Integer> result  = Arrays.stream(marks)
                .boxed()
                .sorted((a,b)->{
                    if(a<0 && b>=0) return -1;
                    else if(a>=0 && b<0) return 1;
                    else return 0;
                })
                .collect(Collectors.toList());
        System.out.printf("\nMoved all negatives at Front:\n %s",result);

        //Moving all negatives to the end
        List<Integer> resultRight  = Arrays.stream(marks)
                .boxed()
                .sorted((a,b)->{
                    if(a<0 && b>=0) return 1;
                    else if(a>=0 && b<0) return -1;
                    else return 0;
                })
                .collect(Collectors.toList());
        System.out.printf("\nMoved all negatives at the end:\n %s",resultRight);
    }
}
