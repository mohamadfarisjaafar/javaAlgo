import java.lang.reflect.Array;

public class StockBuyAndSell {
//    Input:
//    N = 7
//    A[] = {100,180,260,310,40,535,695}
//    Output:
//            1
//    Explanation:
//    One possible solution is (0 3) (4 6)
//    We can buy stock on day 0,
//    and sell it on 3rd day, which will
//    give us maximum profit. Now, we buy
//    stock on day 4 and sell it on day 6.
    public static void buyAndSell(Integer arraySize,Integer[] intArray){
        Integer[] result = new Integer[arraySize];
        String[] positive = new String[arraySize];
        int compareValue = 0;
        for(int i=0; i < arraySize -1; i++){
            compareValue = intArray[i];
            for(int j=1;j<arraySize -1; j++){
                int diff = compareValue-intArray[j];
                if(diff < 0){
                }else{
                    positive[i] =
                }
            }
        }
    }

    public static void main(String[] args){
        Integer[] intArray = {100,180,260,310,40,535,695};

        buyAndSell(7,intArray);
    }
}
