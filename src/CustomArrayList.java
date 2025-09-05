import java.util.Arrays;

public class CustomArrayList {

    int [] elements;

    CustomArrayList(int [] data){
        elements = data;
    }

    //Implement the add(int e) method that is supposed to take an integer and add it to the elements array.
    void add(int e){
        int [] newArray = new int[elements.length + 1];
        for(int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length-1] = e;
        elements = newArray;
    }

    //Implement the get(int index)method that is supposed to take an index value and to return the value of the element at that index.
    int get(int index){
        for(int i = 0; i < elements.length; i++){
            if(elements[i] == elements[index]){
                return elements[i];
            }
        }
        return 0;
    }

    //Implement a test code that populates the list with elements and then outputs all the elements from the list.
    void test(CustomArrayList array){
        for(int i = 0; i < array.elements.length; i++){
            System.out.println(array.elements[i]);
        }
    }


    public static void main(String[] args) {
//        int [] x = {1, 2, 3, 4};
//
//        for (int j : x) {
//            System.out.println(j);
//        }

        int []someNumber = {1,2,3,4,5};
        CustomArrayList number = new CustomArrayList(someNumber);
        number.add(6);
        number.test(number);

        int indexElement = 2;
        System.out.println("Element at index " + indexElement + " is " + number.get(indexElement));
        
    }
}
