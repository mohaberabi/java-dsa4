package Simple;

import  Shared.Node;
public class PrintAtKDistance {






    void printAtKDistance(Node root , int k){


        if (root==null){
            return;
        }
        if (k==0){
            System.out.println(root.data);
        }
        printAtKDistance(root.left,k-1 );
        printAtKDistance(root.right,k-1);
    }
}
