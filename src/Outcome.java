import java.util.Arrays;
import java.util.Comparator;
public class Outcome {
    //    Given an array of meeting time intervals where intervals[i] =
//    [start_i, end_i], determine if a person could attend all meetings.
//
//    Input: meetings = [[0, 30], [5, 10], [15, 20]]
//    Input: meetings = [[5, 10] [10, 11]]
//    Input: intervals = [[7,10],[2,4]]
//    Output: false
    public static boolean solve(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        int n = arr.length;
        if(n < 2)
            return true; //meeting = [[0,1]]
        for(int i = 0; i < n - 1; i++){
            if(arr[i][1] > arr[i+1][0])
                return false;
        }
        return true;
    }
    public static boolean sol2(int[][] arr){
        int n = arr.length;
        if(n < 2)
            return true; //meeting = [[0,1]]
        //[1,20],[5,15]
        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i][1] > arr[j][0])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int[][] test1 = {{0,4}, {5,10}, {15, 30}};
        //int[][] test2 = {{0,30}, {5,10}, {15, 30}};
        int[][] test3 = {{1,20},{5,15}};
        int[][] test4 = {{7,10},{2,4}};
        //System.out.println( solve(test1));
        //System.out.println( solve(test2));
        System.out.println( sol2(test3));
        System.out.println( sol2(test4));
        //System.out.println( sol2(test2));
    }

}
