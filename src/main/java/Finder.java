public class Finder {
    private int max;
    private int min;
    private int length = 0;
    public Integer findMax(int[] intArray){
        if(intArray == null) {
            return null;
        }

        length = intArray.length;


      //  int i = 0;


        if(length == 0) {
             return null;
        }

        //while(i < length) {
        max = intArray[0];
        for(int i = 0; i < length; i++){
            // in the future, can use Math.max
            if(intArray[i] > max) {
                max = intArray[i];
            }

        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        //try {
            if (intArray != null) {
                return null;
            }

            length = intArray.length;

            if (length == 0) {
                return null;
            }

            min = intArray[0];
            for (int j = 1; j < length; j++) {

                if (intArray[j] < min) {
                    min = intArray[j];
                }
            }


        //}
        //catch (NullPointerException e) {
          //  return null;
        //}

            return min;

        }
    }


