public class Merge{

   public static int lo, hi;
   public static int[] temp;

   public static void mergesort(int[]data, int[]temp, int lo, int hi){

     if (lo >= hi){
      return;
     }


    int m = (lo + hi + 1) / 2;
      mergesort(data, temp, lo, m-1);
      mergesort(data, temp, m, hi);

    for (int i = lo; i < hi + 1; i++){
      if(lo >= m || m < hi + 1 && temp[lo] > temp[m]){
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
