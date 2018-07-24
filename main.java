
import java.util.*;
 class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int sticker(int[] score) {
        int l=score.length;

        int ans=l,scr=0;
        for(int i=1;i<l;i++)
        {
            if(score[i]>score[i-1]){
                scr++;
            }else {
                scr=0;
            }
            ans+=scr;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = null;
        if (in.hasNextLine()) {
            str = in.nextLine();
        }
        String[] s = str.split(",");
        int[] score = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            score[i] = Integer.parseInt(s[i]);
        }

        System.out.println(sticker(score));
    }

}
