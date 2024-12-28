package org.example;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Data Structures is all about storing data in a way that optimizes performance and memory


        //TIME COMPLEXITY - measure of how the running time of an algorithm increases with the size of the input data
        //space complexity means it takes less memory
        //time complexity means that it takes less time


        //Searching for an element in a sorted array
        //linear search - you search each element/index one by one linearly until you find the element/value that you are searching for
        //if the element is not in the array you will not know until the very end

//        int[] searchArray = {1,2,3,5,7,8,22,33,77,203,300,342,664};

//        int result = LinearSearch(searchArray,77);
//        System.out.println(result);
//        System.out.println(searchArray[1]);


        //binary search
        //give a starting & ending point of the array, divide the array into two parts, check the middle index value to see if it matches
        //if the index value is less than the target than you check the chunk to the right & if it is greater, then you check the chunk to the lft

//        int binaryTarget = 300;
//        int resultBinary = BinarySearch(searchArray, binaryTarget);
//        System.out.println("result index: "+resultBinary+" target value: "+binaryTarget+" index value: "+searchArray[resultBinary]);

        //BIG O NOTATION
        //O(1): Constant Time
        //O(log n): Logarithmic Time - Binary Search
        //O(n): Linear Time - Linear Search
        //O(n log n): Linearithmic Time
        //O(n^2): Quadratic TIme
        //O(2^n): Exponential Time
        //O(n!): Factorial Time

//        int[] nums = {5,7,9,11,13,15,34,55,66};
//        int target = 55;
//
//        int result = LinearSearch(nums, target);
//        int result2 = BinarySearch(nums, target);
//
//        if (result!= -1)
//            System.out.println("linear search element found at index: "+result);
//        else
//            System.out.println("Element not found");
//
//        if (result2!= -1)
//            System.out.println("binary search element found at index: "+result2);
//        else
//            System.out.println("Element not found");


        //SORTING METHODS/TECHNIQUES
        //Bubble, Insertion, Quick, Radix, Selection, Merge, Sounting, Heap, Bucket

        //BUBBLE SORT O(n^2): Quadratic time
        //Compare two values at a time & then swap them based on the comparison

//        int[] nums = {6,5,2,8,9,4};

//        nums = bubbleSort(nums);


        //SELECTION SORT O(n^2) - same value but better than bubble sort

        //nums = selectionSort(nums);


        //INSERTION SORT O(n^2)
        //We use shifting not swapping

        //nums = insertionSort(nums);


        //QUICK SORT O(n logn) - O(n^2)
        //uses the divide and conquer approach
        //typically the last value/index is used as the pivot

//        quickSort(nums,0,nums.length-1);
//        for(int num : nums){
//            System.out.print(num+" | ");
//        }


        //MERGE SORT O(n logn)

        //uses the divide and conquer approach
        //will break the array into two parts by using the median
        //will use index values to find the median m = (left most index + right most index)/2
        //using the median you divide the array into two parts
        //continue dividing until each part/section of the array is only one value/index
        //MERGING Values -
        //take two values from the different arrays and merge into an array, upon sorting/comparing

//        mergeSort(nums,0,nums.length-1);
//
//        for(int num : nums){
//            System.out.print(num+" | ");
//        }





        //LINKED LIST

        //using a concept of data & reference
        //you have to make the first element as the "head" element
        //each element is called a "NODE", each node will have an address/location in memory.
        //each node/element has a reference to the location of the next node
        //the last node/element in the list has a reference value of "null" that will be updated with location of a new node when it is added to the list
        //the process is much the same for adding elements/nodes in beginngin/middle of the linked list. reference locations to nodes must be updated
        //linked lists are more flexible when it comes to updating/changing values & size, but it is slower than an Array (due to it reference locations instead of being sequential in the same location)

        //will be using NODE class as it contains "int data" as well as the reference to the next Node
        //will be using LinkedList class for functionality insert()...insertAt()...insertAtStart()...delete()...deleteAt()...


        //There is already a created class but I will be building out my own with it's own functionality
//        LinkedList list = new LinkedList();
//
//        list.add(5);
//        list.add(3,12);

//        MyLinkedList list = new MyLinkedList();
//        list.insert(5);
//        list.insert(3);
//        list.insert(12);
//        list.insert(99);
//
//        list.show();
//
//        list.insertAtStart(100);
//        list.insertAt(2,11);
//        list.deleteAt(4);
//        list.show();


        //STACK LIFO: last in first out approach
        // add values using "push"
        // delete values using "pop"
        // find values using "peak"

//        Stack nums = new Stack();
//        nums.push(15);
//        nums.push(22);
//        nums.push(33);
//        nums.show();
//
//        nums.pop();
//        nums.show();
//
//        nums.peak();
//        System.out.println("The size of the array is "+nums.size());
//        System.out.printf("Empty status: "+nums.isEmpty());


        //DYNAMIC SIZED ARRAY
        // this means the array should be expandable and shrinkable

//        DynamicStack nums = new DynamicStack();
//
//        nums.push(13);
//        nums.show();
//        nums.push(14);
//        nums.show();
//        nums.push(15);
//        nums.show();
//        nums.push(16);
//        nums.show();
//        nums.push(17);
//        nums.show();
//        nums.push(18);
//        nums.show();
//
//        nums.pop();
//        nums.pop();
//        nums.show();
//        nums.pop();
//        nums.show();



        // QUEUE
        // FIFO - fisrt in first out, the opposit of LIFO
        // insert - enqueue(data)
        // remove - dequeue()

//        Queue q = new Queue();
//        q.enQueue(5);
//        q.enQueue(6);
//        q.enQueue(10);
//        q.show();
//        System.out.println(q.deQueue());
//        q.show();
//        q.enQueue(33);
//        q.enQueue(66);
//        q.enQueue(100);
//        q.enQueue(99);
//        q.show();




        // TREE
        // each node can have multiple references
        // the top most/original node is called the "Root Node"
        // the lines connecting the nodes are called "Edges"
        // the nodes that are at the sequential end that do not have a node connected to them are called "Leaf Nodes"

        // BINARY TREE
        // where every node will have a max of two nodes connected to it downstream
        // STRICT BINARY TREE: where each node as two or no children nodes
        // FULL BINARY TREE: where each level of nodes have two child nodes to where all leaf nodes are on the same level
        // COMPLETE BINARY TREE: where all leaf nodes are on level "l" or "l-1"

        // NODE DEPTH: the distance from the root node to the node in question
        // NODE HEIGHT: the distance from the node in question to its furthest child/leaf node (counts all nodes except for the one in question)
        // the height of the tree is the same as the height of the root node



        // BINARY SEARCH TREE
        // you always make sure that the smaller values is on the left hand side and the larger values are on the right hand side (in reference to the root/parent node)

//        BinaryTree tree = new BinaryTree();
//        tree.insert(10);
//        tree.insert(12);
//        tree.insert(99);
//        tree.insert(8);
//        tree.insert(2);
//        tree.insert(15);
//        tree.insert(3);
//        tree.insert(5);
//        tree.insert(1);
//        tree.insert(11);
//        tree.insert(14);
//        tree.insert(80);
//
//        //IN ORDER TRAVERSING
//        // goes to the left most node, then the root node, and then the right node (displays data in order/smallest to largest)
//        System.out.println("In order");
//        tree.inOrder();
//        System.out.println();
//
//        //PRE ORDER TRAVERSING
//        // goes to the root node first, then left and then right
//        System.out.println("Pre Order");
//        tree.preOrder();
//        System.out.println();
//
//        //POST ORDER TRAVERSING
//        // left node, then right, and then root
//        System.out.println("Post Order");
//        tree.postOrder();


        //TIMESTAMP 21:11






    }


    public static void mergeSort(int[] nums, int l, int r) {

        if(l<r){
            int mid = (l+r)/2;
            mergeSort(nums,l, mid);
            mergeSort(nums,mid+1, r);

            merge(nums, l, mid, r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] lNum = new int[n1];
        int[] rNum = new int[n2];

        //Copy values to new arrays
        for(int x=0;x<n1;x++){
            lNum[x] = nums[l+x];
        }
        for(int x=0;x<n2;x++){
            rNum[x] = nums[mid+1+x];
        }

        //Merging the two arrays
        int i=0;
        int j=0;
        int key=l;

        while(i<n1 && j<n2){
            if(lNum[i]<=rNum[j]){
                nums[key] = lNum[i];
                i++;
            }
            else{
                nums[key]=rNum[j];
                j++;
            }
            key++;
        }
        while(i<n1){
            nums[key]=lNum[i];
            i++;
            key++;
        }
        while(j<n2){
            nums[key]=rNum[j];
            j++;
            key++;
        }

    }

    public static void quickSort(int[] nums, int low, int high) {

        if(low<high){

            int part = partition(nums, low, high);
            quickSort(nums, low, part-1);
            quickSort(nums, part, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low -1;

        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }


    public static int LinearSearch(int[] array,int target){
        int n = array.length;
        int result = -1;
        int steps = 0;
        for(int i=0;i<n-1;i++){
            steps++;
            if (array[i] == target){
                System.out.println("the linear search took "+steps+" steps");
                return  i;
            }
        }
        System.out.println("the linear search took "+steps+" steps");
        return result;
    }

    public static int BinarySearch(int[] array, int target){
        int left = 0;
        int right = array.length -1;
        int result = -1;
        int steps = 0;

        while (left<=right){
            steps++;
            int mid = (left+right)/2;
            if(array[mid]==target){
                System.out.println("The binary search took "+steps+" steps");
                return mid;
            }
            else if (array[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("The binary search took "+steps+" steps");
        return result;
    }

    public static int[] bubbleSort(int[] nums){

        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }
        int temp = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }
        return nums;
    }

    private static int[] selectionSort(int[] nums) {

        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }

        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        for(int i=0;i<size-1;i++){
            minIndex = i;

            for(int j=i+1;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }
        return nums;
    }



    private static int[] insertionSort(int[] nums) {

        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }

        int size = nums.length;
        int temp = 0;

        for(int i=1;i<size;i++){
            int key = nums[i];
            int j = i-1;


            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num+" | ");
        }
        return nums;
    }
}