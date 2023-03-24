import java.util.*;
class MyComparator implements Comparator<Integer>{
    public int compare(Integer I1, Integer I2){
        return (I1<I2)?-1:(I1>I2)?1:0;
    }
}
public class LambdaComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(84);
        list.add(8);
        list.add(4);
        list.add(842);

        Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
        System.out.println(list);

//        Collections.sort(list, new MyComparator());
        Collections.sort(list);//,c);


        System.out.println(list);
    }
}
