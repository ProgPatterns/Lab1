import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Axel", "Clark", "Robert", "Bob", "Dan"));

//        for(String name : names){
//            System.out.println(name);
//        }

        Enumerator e = ( (arrayList) -> {
                    for(String name : arrayList){
                        System.out.println(name);
                    }
                }
        );

        enumerate(names, e);

        enumerate(names, (arrayList) -> {
            for(String name : arrayList){
                System.out.println(name);
            }
        });

    }

    public static void enumerate(ArrayList<String> arrayList, Enumerator e){
        e.enumerate(arrayList);
    }
}