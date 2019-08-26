public class Finder {
    private int max;
    private int min;
    private int length = 0;
    public Integer findMax(int[] intArray){
        if(intArray == null) {
            return null;
        }

        length = intArray.length - 1;
      //  int i = 0;


        if(length == 0) {
            return null;
        }

        //while(i < length) {
        for(int i = 0; i < length; i++){
            // in the future, can use Math.max
            if(intArray[i] > intArray[length]) {
                max = intArray[i];
            }
            else {
                max = intArray[length];
            }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if(intArray == null) {
            return null;
        }

        length = intArray.length - 1;

        if(length == 0) {
            return null;
        }
        for(int j = 0; j < length; j++) {

            if(intArray[j] < intArray[length]) {
                min = intArray[j];
            }
            else {
                min = intArray[length];
            }
            j++;

        }

        return min;
    }

}
