

public class MinHeap {

    //基本照抄
    //大概了解一下，之前对这个完全没听过
    //网址:https://blog.csdn.net/szu_crayon/article/details/81812946

    int[]  Heap = new int[100005];
    int Cur=0;

    void Insert(int val){
        Heap[++Cur] = val;
        int Temp_Cur = Cur;
        while (Temp_Cur>1){
            int Root = Temp_Cur/2;
            if(Heap[Root]>val){
                //swap(Heap[Root],Heap[Temp_Cur]);

            }else
                break;
            Temp_Cur = Root;
        }
    }


}
