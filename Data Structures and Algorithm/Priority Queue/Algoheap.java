import java.io.*;
import java.util.*;


// dealing with max-heap in general
class Heap {
    // Declaration of heap
    public int[] arr;  // heap itself :)
    public int count; // no of nodes in the heap
    public int capacity; // size of the heap
    public int heap_type; // min-heap or max-heap

    public Heap(int capacity, int heap_type){
        this.capacity = capacity;
        this.heap_type = heap_type;
        this.count = 0;
        this.arr = new int[this.capacity];
    }

    public int Parent(int num) {
        if(num < 0 || num > capacity)
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

    // Heapifying the element at location i
    public void PrelocateDown(int i) {
        int l, r, max, temp;
        l = leftChild(i); // left child of parent node at i
        r = rightChild(i); // right child of parent node at i
        if(l != -1 && this.arr[l] > this.arr[i]) {
            max = l;
        }
        else {
            max = i;
        }

        if(r != -1 && this.arr[r] > this.arr[i])
            max = r;
        
        if(max != i) {
            temp = this.arr[i];
            this.arr[i] = this.arr[max];
            this.arr[max] = temp;
            PrelocateDown(max);
        }
    }

public class Algoheap {
    public static void main(String[] args) {
        
    }
}
}
