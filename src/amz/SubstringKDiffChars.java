package amz;


import java.util.ArrayList;
import java.util.List;

public class SubstringKDiffChars {

//    Input: s = "pqpqs", k = 2
//    Output: 7
//    Explanation: ["pq", "pqp", "pqpq", "qp", "qpq", "pq", "qs"]
    // [p,q,s] [p,q]


    public int getSubString(String s,int k){
        List<String> output=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            int count =1;
            String str=String.valueOf(s.charAt(i));
            int j=i+1;
            while(j<s.length()){
                int inscounter=0;
                if(str.contains(String.valueOf(s.charAt(j)))){
                       str+=String.valueOf(s.charAt(j));
                       inscounter+=1;
                   }else if(count!=k){
                        str+=String.valueOf(s.charAt(j));
                        count+=1;
                        inscounter+=1;
                   }
                if(count==k && inscounter!=0){
                    output.add(str);
                }
                j++;
            }

        }
//        for (int i =0;i<output.size();i++){
//            System.out.println(output.get(i));
//        }
        return output.size();
    }

    public static void main(String[] args) {
        SubstringKDiffChars obj=new SubstringKDiffChars();
        System.out.println(obj.getSubString("abbab",2));
    }
}
