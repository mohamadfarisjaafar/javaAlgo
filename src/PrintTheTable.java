public class PrintTheTable {
//    Input:
//    N = 9
//
//    Output:
//            9 18 27 36 45 54 63 72 81 90
//
//    Explanation:
//    The table of 9 is the output whose 1st
//    term is 9 and the 10th term is 90.

    public static void printTheTable(int input){
        String res = "";
        int sum = 0;
        for(int i = 1 ; i < 11; i++){
            sum = input * i;
            res += String.valueOf(sum) +  " ";
        }
        System.out.println(res.trim());
    }

    public static  void main(String[] args){
        printTheTable(3);
    }
}
