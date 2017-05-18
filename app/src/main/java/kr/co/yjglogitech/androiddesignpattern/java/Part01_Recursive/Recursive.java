package kr.co.yjglogitech.androiddesignpattern.java.Part01_Recursive;

/**
 * Created by landr on 2017. 5. 14..
 */

public class Recursive {

    /**
     *  암시적 매개변수 대신
     *  명시적 매개변수를 써라
     */

    /**
     * Factorial : n!
     */
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    /**
     * Sum
     */
    public static int sumNum(int n){
        if(n==1)
            return 1;
        else
            return n+sumNum(n-1);
    }


    /**
     * Recursive 기본 개념
     * 기본적인 순차 탐색 (데이터가 정렬 되어 있지 않은 경우)
     */

    public int search(int[] data, int length, int target) {
        for(int i = 0 ; i < length ; i++){
            if(data[i]==target){
                return i;
            }
        }
        return -1;
    }

    public int search01(int[] data, int begin, int end, int target) {
        if(begin > end)
            return -1;
        else if(target == data[begin])
            return begin;
        else
            return search01(data, begin+1, end, target);
    }

    //Recursive binary Search01
    public int search02(int[] data, int begin, int end, int target){
        if(begin > end)
            return -1;
        else {
            int middle = (begin+end)/2;
            if(data[middle]==target)
                return middle;
            int index = search02(data, begin, middle-1, target);
            if(index != -1)
                return index;
            else
                return search02(data, middle+1, end, target);
        }
    }


    public int findMax01(int[] data, int begin, int end) {
        if(begin == end)
            return data[begin];
        else{

            return Math.max(data[begin], findMax01(data, begin+1, end));
        }
    }

    public int findMax02(int[] data, int begin, int end){
        if(begin == end)
            return data[begin];
        else {
            System.out.println(begin);
            int middle = (begin+end)/2;
            int max1 = findMax02(data, begin, middle);
            int max2 = findMax02(data, middle+1, end);
            return Math.max(max1,max2);
        }
    }

    public static int binary_search_string(String[] items, String target, int begin, int end){
        if(begin>end)
            return -1;
        else {
            int middle = (begin + end)/2;
            int compResult = target.compareTo(items[middle]);
            if(compResult == 0)
                return middle;
            else if(compResult<0)
                return binary_search_string(items, target, begin, middle-1);
            else
                return binary_search_string(items, target, middle+1, end);
        }
    }

    public static int binary_search_num(int[] data, int target, int begin, int end){
        if(begin>end)
            return -1;
        else {
            int middle = (begin+end)/2;
            if(data[middle] == target)
                return middle;
            else if(data[middle]<target)
                return binary_search_num(data, target, middle+1, end);
            else
                return binary_search_num(data, target, begin, middle-1);
        }
    }

<<<<<<< HEAD
    /**
     *       public static int Partition(int[] numbers, int left, int right)
     {
     int pivot = numbers[left];
     while (true)
     {
     while (numbers[left] < pivot)
     left++;

     while (numbers[right] > pivot)
     right--;

     if (left < right)
     {
     int temp = numbers[right];
     numbers[right] = numbers[left];
     numbers[left] = temp;
     }
     else
     {
     return right;
     }
     }
     }

     public static void QuickSort_Recursive(int[] arr, int left, int right)
     {
     // For Recusrion
     if(left < right)
     {
     int pivot = Partition(arr, left, right);

     if(pivot > 1)
     QuickSort_Recursive(arr, left, pivot - 1);

     if(pivot + 1 < right)
     QuickSort_Recursive(arr, pivot + 1, right);
     }
     }
     */
=======
    public void quickSort(int[] data, int begin, int end){

        if(begin<end){

            int left = begin;
            int right= end;
            int pivot = data[begin];

            while(left<right) {

                while (pivot > data[left]) {
                    left++;
                }
                while (pivot < data[right]) {
                    right--;
                }

                if(left<=right){
                    int temp = data[left];
                    data[left] = data[right];
                    data[right] = temp;
                    left++;
                    right--;
                }

            }

//            data[begin] = data[left];
//            data[left] = pivot;
            quickSort(data,begin, left-1);
            quickSort(data, left+1, end);
        }
    }

>>>>>>> 549054f7916b0087fb9dd7b227426810442d29df
}
