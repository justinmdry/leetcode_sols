package leetcodetest;

public class q1768 {
	
	
	public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String res = "";

        while(i < word1.length() && j < word2.length()){
            if(i <= j){
                res += word1.charAt(i);
                i++;
            }else{
                res += word2.charAt(j);
                j++;
            }
        }

        if(j != word2.length()){
            res += word2.substring(j, word2.length());
        }else  if(i != word1.length()){
            res += word1.substring(i, word1.length());
        }

        return res;
    }
}
