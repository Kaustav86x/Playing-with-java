import java.io.*;
import java.util.*;


// dealing with max-heap in general
class Heap {
    // Declaration of heap
    public int[] arr;  // heap itself :)
    public int count; // no of nodes in the heap
    public int capacity; // size of the heap
    // public int heap_type; // min-heap or max-heap

    public Heap(int capacity){
        this.capacity = capacity;
        // this.heap_type = heap_type;
        this.count = 0;
        this.arr = new int[this.capacity];
    }

    public int Parent(int num) {
        if(num <= 0 || num > capacity)
            return -1;
        return (num-1)/2;
    }

    // finding out the childrens of a particular parent-node i
    public int leftChild(int i) {
        int left = 2*i + 1;
        if(i >= this.count)
            return -1;
        return left;
    }

    public int rightChild(int i) {
        int right = 2*i + 2;
        if(i >= this.count)
            return -1;
        return right;
    }

    public int getMaximum() {
        if(this.count == 0)
            return -1;
        return this.arr[0];
    }

    public void swap(int fnode, int snode) {
        int temp;
        temp = arr[fnode];
        arr[fnode] = arr[snode];
        arr[snode] = temp;
    }

    // Heapifying the element at location i
    public void PrelocateDown(int i) {
        int flag = 0;
        // int l, r, max, temp;
        // l = leftChild(i); // left child of parent node at i
        // r = rightChild(i); // right child of parent node at i
        // if(l != -1 && this.arr[l] > this.arr[i]) {
        //     max = l;
        // }
        // else {
        //     max = i;
        // }

        // if(r != -1 && this.arr[r] > this.arr[i])
        //     max = r;
        
        // if(max != i) {
        //     temp = this.arr[i];
        //     this.arr[i] = this.arr[max];
        //     this.arr[max] = temp;
        //     PrelocateDown(max);
        // }

        if(i > (count / 2) && i <= count) {
            flag = -1;
        }
        flag = 0;

        if(flag == -1)
            return;

        if(this.arr[i] < this.arr[leftChild(i)] || this.arr[i] < this.arr[rightChild(i)]) {
            if(this.arr[leftChild(i)] > this.arr[rightChild(i)]) {
                swap(i, leftChild(i));
                PrelocateDown(leftChild(i));
            }
            else {
                swap(i, rightChild(i));
                PrelocateDown(rightChild(i));
            }
        }
    } 

    public int DeleteMax() {

        // if the graph is empty
        if(this.count == 0)
            return -1;
        int data = this.arr[0];
        // to make sure the heapify fucntion works
        this.arr[0] = this.arr[this.count - 1];
        //  smallest element as root
        PrelocateDown(0);
        return data;
    }

    // inserting element 
    public void InsertEl(int num) {

        this.arr[count] = num;
        // int temp;
        
        int current = count; // last index
        while(this.arr[current] > this.arr[Parent(current)]) {
            swap(current, Parent(current));
            current = Parent(current);
        }
        count ++;
    }

    // destroying heap
    public void DestroyHeap() {
        // setting the number of node count to 0
        this.count = 0;
        // setting the heap array representation to null
        this.arr = null;
    } 


    public void Print() {
        for(int i=0; i<count/2; i++) {
            System.out.print("Parent node : " + this.arr[i]);

            if(leftChild(i) < count)
                System.out.print("Left node : " + this.arr[leftChild(i)]);

            if(rightChild(i) < count)
                System.out.print("Right node : " + this.arr[rightChild(i)]);

                System.out.println();

        }
    }
}

public class Algoheap {
    public static void main(String[] args) {
        System.out.println("The Max heap");

        // int size;
        // int value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the heap : ");
        int capacity = sc.nextInt();

        Heap heap = new Heap(capacity);

        // System.out.println("Enter the number of elements : ");
        // size = sc.nextInt();
        // for(int i=0; i<size; i++) {

        //     value = sc.nextInt();
        //     heap.InsertEl(value);
        // }

        // heap.Print();

        // System.out.println("Maximum value : " + heap.DeleteMax());

        // sc.close();
        heap.InsertEl(5);
        heap.InsertEl(3);
        heap.InsertEl(17);
        heap.InsertEl(10);

        heap.Print();
        
        System.out.println("Maximum element");
        heap.DeleteMax();

        sc.close();
    }
}
