public class BinarySearch {

    public static int search(int [] sortedArray, int searchedElement){
        int p = 0;
        int r = sortedArray.length - 1;
        int q;
        while(p <= r){
            q = r + p / 2;
            if(sortedArray[q] == searchedElement)
                return q;
            else{
                if(searchedElement > sortedArray[q])
                    p = q + 1;
                else
                    r = q - 1;
            }

        }
        return - 1;
    }

    public static void main(String[] args) {
        int testArray [] = {1, 4, 5, 7, 9, 11, 15, 20, 30, 32, 100};
        System.out.println(search(testArray, 11));
    }
}