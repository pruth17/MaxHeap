
public class Driver {
	public static void main(String[] arg)
    {
    	
    	int three1[] = new int[3];
        // create a maxheap
        System.out.println("The Max Heap is ");
        int[] arr={15,2,18,7,4,14,20,71,6,3};
        MaxHeap maxHeap = new MaxHeap(15);
        /// insert the elements of array one by one
        for(int element:arr)
            maxHeap.insertElement(element);

        maxHeap.printHeap();
        
        System.out.println();
        System.out.println("MaxHeap printed as array form:");
        
        maxHeap.printArray();
        System.out.println();
        // part - c get the max value.
       // System.out.println("The max val is " + maxHeap.extractMax());
      three1 =  maxHeap.extractMax();
      System.out.println();
      
      System.out.print("The three largest value of the array are: ");
      
      for(int i = 0; i < 3; i++)
      System.out.print(three1[i] + " ");
      
      
        
     
        
        
    }

}
