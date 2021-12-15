public class  CleanCode {

    public static final int arraySize = 6;

    static class Check {

        int smallestNumber;
        int largestNumber;
    }

    static Check findLargestSmallest(int array[], int sizeOfArray) {
        Check objectOfCheck = new Check();
        int i;

        if (sizeOfArray == 1) {
            objectOfCheck.largestNumber = array[0];
            objectOfCheck.smallestNumber = array[0];
            return objectOfCheck;
        }

        if (array[0] > array[1]) {
            objectOfCheck.largestNumber = array[0];
            objectOfCheck.smallestNumber = array[1];
        } else {
            objectOfCheck.largestNumber = array[1];
            objectOfCheck.smallestNumber = array[0];
        }

        for (i = 2; i < sizeOfArray; i++) {
            if (array[i] > objectOfCheck.largestNumber)
            {
                objectOfCheck.largestNumber = array[i];
            } else if (array[i] < objectOfCheck.smallestNumber)
            {
                objectOfCheck.smallestNumber = array[i];
            }
        }

        return objectOfCheck;
    }

    public static void main(String args[]) {
        int array[] = {1000, 11, 445, 1, 330, 3000};
        Check objectOfCheck = findLargestSmallest(array, arraySize);

        System.out.println("\n array : ");
        for(int i=0;i<arraySize;i++){
            System.out.printf(array[i]+" ");
        }

        System.out.printf("\n Smallest Number in Array is %d", objectOfCheck.smallestNumber);
        System.out.printf("\n largest Number in Array is %d", objectOfCheck.largestNumber);
    }
}
