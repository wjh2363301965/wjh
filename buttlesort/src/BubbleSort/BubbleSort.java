package BubbleSort;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr={12,23,34,56,56,56,78,23,224,2,1,4,5};
      /*  bubbleSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }*/
        bubbleSort2(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    //这是百度上的
    public static void bubbleSort(int[] arr){
        //int[] arr={12,23,34,56,56,56,78};

        for (int i = 0;i<arr.length-1;i++){

            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

    }
    //理解后我自己又做了一下，虽然没有百度的代码简单
    static int a=0;
    static int   b;
    public static void bubbleSort2(int[] arr){

        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-a;j++){

               if (arr[j]>arr[j+1]){
                   b=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=b;
               }
            }
            a++;
        }
    }






}
