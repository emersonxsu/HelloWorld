package com.example.helloworld;


/**
 * Created by Emer on 4/17/15.
 */
public class HelloWorld {
    public static boolean binarySearch(int[] A, int start, int end, int target) {
        int mid = start + end / 2;
        while(mid >= start && mid <= end) {
            if(A[mid] == target) return true;
            else if(A[mid] > target) return binarySearch(A, start, mid, target);
            else return binarySearch(A, mid + 1, end, target);
        }
        return false;
    }

    // next implementation:
    public class Point{
        public int x;
        public int y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    public static list<Point> kCloesetPoints(list<Point> points) {

    }
    public static void main(String[] arg)
    {
        int[] A = new int[] {-9, -6, -1, 0, 2, 3, 3};
        boolean res = binarySearch(A, 0, A.length - 1, 1);
        System.out.println("The result is: " + res);
    }
}

