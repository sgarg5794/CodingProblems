package amz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWordPara {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedList= Arrays.asList(banned);
        Map<String,Integer> map=new HashMap<>();
        String maxString="";
        int maxCount=0;
        String[] array=paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        for(int i=0;i<array.length;i++){
            if(map.keySet().contains(array[i]) && !bannedList.contains(array[i])){
                Integer value=map.get(array[i]);
                map.put(array[i],value+1);
            }else if(!bannedList.contains(array[i])){
                map.put(array[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            if((int)entry.getValue()>maxCount){
                maxCount= (int)entry.getValue();
                maxString=(String)entry.getKey();
            }
        }
        return maxString;

    }
}
