package github_assignment2;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2, 8};
        int[] minMaxResult = findMinMax(arr);

        System.out.println("Min element: " + minMaxResult[0] + ", Index: " + minMaxResult[1]);
        System.out.println("Max element: " + minMaxResult[2] + ", Index: " + minMaxResult[3]);
    }

    public static int[] findMinMax(int[] arr) {
    	int minElement=arr[0], maxElement=arr[0];
    	int minIndex=0, maxIndex=0;
    	
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]<minElement) {
    			minElement=arr[i];
    			minIndex=i;
    		}
    		
    		if(arr[i] < minElement) {
    			minElement=arr[i];
    			minIndex=i;
    		}
    		
    		if (arr[i] > maxElement) {
    			maxElement=arr[i];
    			maxIndex=i;
    		}
    	}
    	return new int[] {minElement, minIndex, maxElement, maxIndex};
}
}

