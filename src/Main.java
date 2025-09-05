import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    }

    public static void enumerate(ArrayList<String> arrayList, Enumerator e){
        e.enumerate(arrayList);
    }

}