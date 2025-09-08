public class CustomArrayList {

    int [] elements;

    CustomArrayList(int [] data){
        elements = data;
    }

    //Implement the add(int e) method that is supposed to take an integer and add it to the elements array.
    void add(int e){
        //create a new array with one element bigger than the previous array
        int [] newArray = new int[elements.length + 1];

        //put every element into the new array
        for(int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }

        //add the parameter to the end of the array
        newArray[newArray.length-1] = e;
        elements = newArray;//update the array
    }

    //Implement the get(int index)method that is supposed to take an index value and to return the value of the element at that index.
    int get(int index){
        return elements[index];
    }

    //Implement a test code that populates the list with elements and then outputs all the elements from the list.
    void test(CustomArrayList array){
        for(int i = 0; i < array.elements.length; i++){
            System.out.print(array.elements[i] + " ");
        }
    }


    public static void main(String[] args) {
//        int [] x = {1, 2, 3, 4};
//
//        for (int j : x) {
//            System.out.println(j);
//        }

        int []someNumber = {1,2,3,4,5};
        // Print element at index 3
        System.out.println(someNumber[3]);
        CustomArrayList number = new CustomArrayList(someNumber);
        number.add(6);
        number.add(7);
        number.test(number);

        int indexElement = 2;
        System.out.println("\nElement at index " + indexElement + " is " + number.get(indexElement));
        
    }
}
