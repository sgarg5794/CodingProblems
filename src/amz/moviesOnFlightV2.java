package amz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class moviesOnFlightV2 {

    public int[] moviesOnFlight(int[] moviesDuration,int flightDuration){

        List<List> x=new ArrayList<>();
        List<List<Integer>> list=null;

        for(int i =0;i<moviesDuration.length;i++){
            List temp=new LinkedList();
            temp.add(moviesDuration[i]);
            temp.add(i);
            x.add(temp);
        }

       flightDuration-=30;

        x.sort(new Comparator<List>() {
            @Override
            public int compare(List o1, List o2) {
                int returnValue=0;
                if((int)o1.get(0)<(int)o2.get(0)){
                    returnValue=-1;
                }else if((int)o1.get(0)>(int)o2.get(0)){
                    returnValue=1;
                } else if((int)o1.get(0)==(int)o2.get(0)){
                    returnValue=0;
                }
                return returnValue;
            }
        });

        System.out.println(x);
       Arrays.sort(moviesDuration);
       int left=0;
       int maxValue=0;
       int right=moviesDuration.length-1;
       while(left<right){
           if((int)x.get(left).get(0)+(int)x.get(right).get(0)<=flightDuration){
              if((int)x.get(left).get(0)+(int)x.get(right).get(0)>maxValue){
                    list=new ArrayList<>();
                    maxValue=(int)x.get(left).get(0)+(int)x.get(right).get(0);
                    List list1= new ArrayList();
                    list1.add((int)x.get(left).get(1));
                    list1.add((int)x.get(right).get(1));
                    list.add(list1);
              }else if((moviesDuration[left]+moviesDuration[right])==maxValue){
                  List list1= new ArrayList();
                  list1.add((int)x.get(left).get(1));
                  list1.add((int)x.get(right).get(1));
                  list.add(list1);
              }
              left+=1;
           }else{
               right=right-1;
           }
       }
        for(List value:list){
            System.out.println(value);
        }
       return new int[]{1,2};
    }



    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,1};
        //System.out.println(Arrays.stream(a).);
        moviesOnFlightV2 moviesOnFlight=new moviesOnFlightV2();
        moviesOnFlight.moviesOnFlight(new int[]{40,85,80, 85, 90,75, 60, 120,130, 150, 125,135},250);
    }
}
