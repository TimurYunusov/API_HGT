package homeworks;

public class ArraysMultidimensionalHomework {
    public static void main(String[] args) {
        //  //write a method which find the index of a given element.
        //    //method takes an int array and it takes a int value
        //    //your method should return an int which is the index of the given value.
        //    //if the value doesnt exist return 0;(-1)

////try to create a method which accepts an int array
////and returns a sorted int array.
int[] barcelonaTransfersMln={66,34,23,7,132,94,28,20,20};
        System.out.print("The 20 mln transfer was stored under index: ");
        System.out.print(indexFinder(barcelonaTransfersMln,20));

    } public static int indexFinder(int[] arr, int num){
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }return -1; //requirements ask us to return 0 but what if number we are looking for num at index 0? So I changed requirements
       // to return -1 if program won't find element of array
    }
}
