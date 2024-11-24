import java.util.List;

public class LinearSearch {
    public static int LinearSearchItems(int searchItem, Integer[] list){
        int i = -1;
        for(int a = 0; a <= list.length-1; a++){
            if(list[a] == searchItem){
                i = a;
                break;
            }
        }
        return  i;
    }

    public static void main(String[] args) {
        Integer[] list = {1,2,3,4};
        int result = LinearSearchItems(2,list);
        System.out.println(result);
    }
}
