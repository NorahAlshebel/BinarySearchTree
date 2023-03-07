
package binarytreenorah;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarytreeNORAH {

    
    public static void main(String[] args) {

 BST T = new BST();
T.insert(5);
T.insert(3);
T.insert(9);
T.insert(1);
T.insert(4);
T.insert(6);
System.out.println("The root of Bi-Tree is: " + (T.root()));
System.out.println("In-order traversal sequence :"); T.inOrder();
System.out.println("Pre-order traversal sequence :"); T.preOrder();
System.out.println("Post-order traversal sequence :"); T.postOrder();
System.out.println("Level-order traversal sequence :"); T.levelOrder();
System.out.println("In-order traversal sequence (after mirroring) :");
T.mirror();  
T.inOrder();
    }}

public class BST {
  private Node root;
  
  public static class Node { 
      
 Node left;
 Node right;
int data;
Node(int newData) {
    left = null;
    right = null;
    data = newData;} }
  
  public void BST() {
root = null; }
  
public void insert(int data) {

    root = insert(root, data);}

 private Node insert(Node node, int data) {
     if (node == null) {
node = new Node(data); }
     else {
         if (data <= node.data) {
             node.left = insert(node.left, data);
         }
         else {
            node.right = insert(node.right, data); }  
     }
      return (node);
 }


public int size() {
return (size(root));
}

private int size(Node node) {
   
    if (node == null)
return 0;
    else
        return(size(node.left) + 1 + size(node.right));
}

public boolean lookup(int data) {
return (lookup(root, data));
}
private boolean lookup(Node node, int data) {
    if (node == null) {
return (false);
  }
    if (data == node.data) {
return (true);
  } 
   else if (data < node.data) {
return (lookup(node.left, data));
}    
   else {
return (lookup(node.right, data));
}
  } 
public void inOrder() {
    inorderTree(root);
System.out.println();
}

private void inorderTree(Node node) {
if (node == null) {
   return;
}
inorderTree(node.left);
System.out.print(node.data + " ");
inorderTree(node.right);
}

public void preOrder() {
  preOrder(root);
System.out.println();
   }

  public void preOrder(Node node) { 
     
      if (node == null) {
       return;
      }
System.out.print(node.data + " ");
preOrder(node.left);
preOrder(node.right);
  }
  
 public void postOrder() {
     postOrder(root);
     System.out.println();
     
}
 
public void postOrder(Node node) {
   
   if (node == null) {
    return;
   }
postOrder(node.left);
postOrder ( node.right);
System.out.print(node.data + " "); 
}

public void levelOrder() {
 levelOrder(root);
 System.out.println();
}
public void levelOrder(Node node) {
    if (node != null) {
       Queue<Node> q = new ArrayDeque<Node>();
       q.add(node);
      while (q.size() != 0) {
            Node currentNode = q.remove();
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null) { 
                q.add(currentNode.left);
            }
            if (currentNode.right != null) {
                q.add(currentNode.right);
}
  }
    }
      }

public void mirror() {
 
    root = mirror(root);
}

private Node mirror(Node node) {
    if (node == null)
return node;

Node left = mirror(node.left);
Node right = mirror(node.right);

node.left = right;
node.right = left;
return node;

   }

public int root() {
 return root.data;   
}

}
    

