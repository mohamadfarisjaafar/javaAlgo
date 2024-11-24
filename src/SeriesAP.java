import java.util.Arrays;

public class SeriesAP {
//    Input:
//    A1=2
//    A2=3
//    N=4
//    Output:
//    5
//    Explanation:
//    The series is 2,3,4,5,6....
//    Thus,4th term is 5.
    public static void seriesAP(int input1, int input2, int counter){
        int diff = input2 - input1;
        int holder = input2;
        String res = "";
        int[] intArray = new int[11];
        for(int i = 0 ; i <= 10; i++){
            if(i == 0){
                intArray[i] = input1;
            }else if(i == 1){
                intArray[i] = input2;
            }
            else{
                holder = holder + diff;
                intArray[i] = holder;
            }
        }
        System.out.println("The series is " + Arrays.toString(intArray));
        System.out.println("Thus," + String.valueOf(counter) +"th term is " + intArray[counter-1]);
    }

    public static void main(String[] args){
        seriesAP(2,3,4);
    }
}
