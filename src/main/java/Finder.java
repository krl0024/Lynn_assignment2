public class Finder {
    int max;
    int min;
    int length;
    public Integer findMax(int[] intArray){
        length = intArray.length;
        int i = 0;
        /** if(intArray == null) {

        }**/

        if(length == 0 || intArray == null) {
            return null;
        }

        while(i < length) {
            if(intArray[i] > intArray[length]) {
                max = intArray[i];
            }
            else {
                max = intArray[length];
            }
            i++;

        }
        return max;
    }

    public Integer findMin(int[] intArray) {

        length = intArray.length;
        int j = 0;
        if (length == 0 || intArray == null) {
            return null;
        }
        while(j < length) {
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
