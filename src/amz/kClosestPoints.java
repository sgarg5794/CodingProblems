package amz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class kClosestPoints {

    public int[][] kClosest(int[][] points, int K) {
        int[][] returnArray=new int[K][2];
        double previousDistance=Double.MAX_VALUE;
        Map<List,Double> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            Double distance=calculateDistance(points[i][0],points[i][1]);
            map.put(Arrays.asList(points[i] ),distance);

        }

        List<Map.Entry<List, Double>> list =
                new LinkedList<>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<List,Double>>(){
            public int compare(Map.Entry<List,Double> o1,
                               Map.Entry<List,Double> o2) {

                return (o1.getValue()).compareTo(o2.getValue());
            }});

        System.out.println(list.get(0).getKey());
        int i=0;
        while(K>0){
            returnArray[i]=(int[])(list.get(i).getKey().toArray())[0];
            i++;
            K--;
        }

        return returnArray;
    }

    public Double calculateDistance(int pt1,int pt2){
        return Math.sqrt((pt1*pt1)+(pt2*pt2));
    }

    public static void main(String[] args) {
        kClosestPoints obj=new kClosestPoints();
        obj.kClosest(new int[][]{{1,3},{-2,2}},1);
    }
}
