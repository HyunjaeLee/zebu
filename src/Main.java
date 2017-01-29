import com.hyunjae.zebu.Zebu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("2");
        List<String> list3 = new ArrayList<>();
        list3.add("c");
        list3.add("3");

        Zebu.zip(list1, list2, list3).forEach(o -> System.out.println(o.get(0) + o.get(1) + o.get(2)));
    }
}
