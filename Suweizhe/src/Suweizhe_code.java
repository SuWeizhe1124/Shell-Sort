import java.util.Arrays;

public class Suweizhe_code {

	
	 public static void main(String[] args) {
	        int [] arr = {13,14,94,33,82,25,59,94,65,23,45,27,73,25,39,10};
	        shellsort(arr);
	 }
	   public static void shellsort(int [] arr) {
	        int temp = 0; // 用來保存當前的數值
	        int step = arr.length /2 ; // 步長為陣列長度除以2
	        int count = 0; // 用於紀錄做了幾輪排序而已,不重要
	        while (step >= 1) {
	            for(int i = step; i < arr.length; i++) {
	                // 遍歷各組中所有的元素 , 步長為 arr.length/2 
	                for(int j = i - step; j >= 0; j -= step) {
	                    // 如果當前元素大於加上步長後的那個元素,說明需要交換
	                    if(arr[j] > arr[j+step]) {
	                        temp = arr[j];
	                        arr[j] = arr[j+step];
	                        arr[j+step] = temp;
	                    }
	                }
	            }
	            step = step / 2; // 每輪步長再繼續除以2
	            count++;
	            System.out.println("第 "+(count)+" 輪希爾排序後為 "+Arrays.toString(arr));
	        }
	    }
}
