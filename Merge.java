public class Merge{

   public static int lo, hi;
   public static int[] test1, test2, ary1, ary2;

   public static void mergesort(int[]data, int[]temp1, int[] temp2, int lo, int hi){
     //Split data array into half?

     // lo = 0;
     // hi = data.length/2;
     // temp = new int[hi];
     // for (int i = 0; i < hi; i++){
     //  temp[i] = data[i];
     //  System.out.println(temp[i]);
     // }

     //Starting position of first half: lo
     //Starting position of second half: (lo + hi / 2) + 1

     int left = lo; //0
     int middle = ((lo + hi) / 2); //3
     int right = hi; //6 (data.length - 1)

     // System.out.println(left);
     // System.out.println(middle);
     // System.out.println(right);

     temp1 = new int[middle + 1]; //4 slots, 0, 1, 2, 3
     temp2 = new int[right - middle]; //3 slots, 4, 5, 6

     //Copy data to temp arrays, my testing for this code is wack
      for (int i = 0; i < temp1.length; i++){
        temp1[i] = data[i];
      }

      for (int j = middle + 1; j < right + 1; j++){
        temp2[j] = data[j];
      }


      //Merge merge merge??
      int h1 = 0;
      int h2 = 0;

      int k = lo;
        while (h1 < (middle + 1) && h2 < (right - middle)){

          if (temp1[h1] <= temp2[h2]){
              data[k] = temp1[h1];
              h1++;
          } else {
              data[k] = temp2[h2];
              h2++;
          }
            k++;
        }

        while (h1 < (middle + 1)) {
            data[k] = temp1[h1];
            h1++;
            k++;
        }

        while (h2 < (right - middle)){
            data[k] = temp2[h2];
            h2++;
            k++;
        }
    }

  public static void mergesort(int[]data){
    mergesort(data, ary1, ary2, 0, data.length-1);
  }


   public static void main(String[] args) {
     int[] test = new int[]{38, 27, 43, 3, 9, 82, 10};
     mergesort(test, test1, test2, 0, 6);

     for (int i = 0; i < test1.length; i++){
       System.out.println(test1[i]);
     }
    //for (int j : test2){System.out.println(test2[j]);}
   }

}
