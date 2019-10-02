public class MaxHeap 
{
    
    private int[] heapArray;
    private int size;
    private int maxSize;

    // Constructor to initialize
    public MaxHeap(int maxSize)
    {
        this.maxSize = maxSize;
        this.size = 0;
        heapArray = new int[this.maxSize + 1];
        heapArray[0] = Integer.MAX_VALUE;
    }

    // Returns position of parent 
    public int parent(int pos)
    {
    	return pos / 2;
    }

    // Below two functions returns left and 
    // right children. 
    public int leftChild(int pos)
    {
        return (2 * pos);
    }
    public int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    // Returns true of given node is leaf 
    public boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
    
    // This function swaps two values
    public void swap(int p1, int p2)
    {
        int temporary;
        temporary = heapArray[p1];
        heapArray[p1] = heapArray[p2];
        heapArray[p2] = temporary;
    }
 // Heapifying the array
    public void maxHeapify(int pos)
    {
        // if its a loop then return, do nothing
        if (isLeaf(pos))
            return;

        if (heapArray[pos] < heapArray[leftChild(pos)] ||
                heapArray[pos] < heapArray[rightChild(pos)]) {

            if (heapArray[leftChild(pos)] > heapArray[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                // swap the positions
                swap(pos, rightChild(pos));
                // heapify it 
                maxHeapify(rightChild(pos));
            }
        }
    }

    // Inserts a new element to max heapArray 
    public void insertElement(int element)
    {
        heapArray[++size] = element;

        // Traverse up and fix violated property 
        int current = size;
        while (heapArray[current] > heapArray[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void printHeap()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.println(" PARENT : " + heapArray[i] );
            System.out.println(" LEFT CHILD : " +heapArray[2 * i] + " RIGHT CHILD :" + heapArray[2 * i + 1]);
            System.out.println();
        }
    }
    
    public void printArray() {
    	
    	for(int i = 1; i <= size; i++) {
    		System.out.print(heapArray[i] + " ");
    	}
    }

    // Remove an element from max heapArray 
    public int[] extractMax()
    {
    	int[] max = new int[3];
    	 int popped;
    	
    	for(int i = 0; i < 3; i++) {
        popped = heapArray[1];
        heapArray[1] = heapArray[size--];
        maxHeapify(1);
        max[i] = popped;
        
    	}
        
        
        
       return max;
    }
    

    
} 