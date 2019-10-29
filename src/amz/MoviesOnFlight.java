package amz;


//You are on a flight and wanna watch two movies during this flight.
//        You are given int[] movie_duration which includes all the movie durations.
//        You are also given the duration of the flight which is d in minutes.
//        Now, you need to pick two movies and the total duration of the two movies is less than or equal to (d - 30min).
//        Find the pair of movies with the longest total duration. If multiple found, return the pair with the longest movie.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MoviesOnFlight {

    public int[] moviesOnFlight(int[] moviesDuration,int flightDuration){
        //int[] originalmovieDuration=moviesDuration;
        Map<List<Integer>,Integer> map=new HashMap<>();
        int temp=0;
        int totalMoviesLength=flightDuration-30;
        List returnList=new ArrayList();
        //Arrays.sort(moviesDuration);
        for (int i=0;i<moviesDuration.length-1;i++){
            int duration=0;
            List moviesDurationList=null;
            for(int j=i+1;j<moviesDuration.length;j++){
                duration=moviesDuration[i]+moviesDuration[j];
                if(duration<=totalMoviesLength && duration>=temp){
                    moviesDurationList=new ArrayList();
                    moviesDurationList.add(i);
                    moviesDurationList.add(j);
                    temp=duration;
                    map.put(moviesDurationList,duration);
                }
            }
        }
        Optional<Integer> max = map.values().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int returnValue=0;
                if (o1.equals(o2)) {
                    returnValue= 0;
                } else if (o1 > o2) {
                    returnValue= 1;
                } else if (o1 < o2) {
                    returnValue= -1;
                }
                return returnValue;
            }
        });

        Integer maxValue=max.get();

        for(Map.Entry<List<Integer>,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(maxValue)){
                returnList.add(entry.getKey());
            }
        }

        System.out.println(returnList);
        return new int[]{1,2};
    }

    public static void main(String[] args) {
        MoviesOnFlight moviesOnFlight=new MoviesOnFlight();
        moviesOnFlight.moviesOnFlight(new int[]{40,80, 85, 90,75, 60, 120, 150, 125,135},250);
    }
}
