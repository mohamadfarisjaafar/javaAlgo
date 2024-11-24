public class PrintingPattern {

    //For N = 2 the pattern will be
    //2 2 1 1
    //2 1

    public static void printProcess(Integer N){
        String res = "";
        int end = 0;
        int startingPoint = N;
        int counter = N;
        while(end != counter) {
            for (int i = 0; i < counter; i++) {
                res += startingPoint;
            }
            startingPoint = startingPoint-1;
            if(startingPoint < 1){
                System.out.println(res);
                res = "";
                startingPoint = N;
                counter = counter-1;
            }
        }
    }

    public static void main(String[] args){
        printProcess(3);
    }
}
