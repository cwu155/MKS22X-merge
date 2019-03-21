public class Merge{

   public static int lo, hi;
   public static int[] temp;


   public static void insertionSort(int[] data, int o, int c){
     int orig = o;
     int current = c;
     for (int i = 1; i < data.length; i++){
       orig = i-1;
       current = data[i];
       while (orig >= 0 && current < data[orig]){
          data[orig+1] = data[orig];
          orig = orig-1;
         }
         data[orig+1] = current;
       }
     }

   public static void mergesort(int[]data, int[]temp, int lo, int hi){

    if((hi-lo) <= 120){
      insertionSort(data, lo, hi);
      return;
    }

    int m = (lo + hi) / 2;
    int l = lo;
    
      mergesort(temp, data, lo, m-l+1); //merge sorts the left
      mergesort(temp, data, hi-m, hi); //merge sorts the right

    for (int i = lo; i < hi + 1; i++){
      if (lo >= (l + hi + 1)/2 || m < hi + 1 && temp[lo] > temp[m]){ //if the middle is within the lower and upper bound,
                                                                    //and checks to see which elements are lower.
        data[i] = temp[m];
        m++;
      } else {
        data[i] = temp[lo];
        lo++;
      }
    }

    }

  public static void mergesort(int[]data){
    mergesort(data, temp, 0, data.length-1);
  }


   public static void main(String[] args) {
     int[] test = new int[]{38, 27, 43, 3, 9, 82, 10};
     mergesort(test);

     for (int i = 0; i < test.length; i++){
       System.out.println(test[i]);
     }
    //for (int j : test2){System.out.println(test2[j]);}
   }

}
