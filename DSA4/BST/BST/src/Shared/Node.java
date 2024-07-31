package Shared;

public class Node {


    public int data;
    public Node left;
    public Node right;


    public int leftCount;


    public Node(int d) {
        data = d;
        left = null;
        right = null;
        leftCount = 0;
    }
}
