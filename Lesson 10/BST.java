package binarytree;

import java.util.Scanner;

public class BST {
	
	// Root of BST
	private Node root;
	
	private class Node {
		private Node right;
		private Node left;
		private int key;
		private int data;
		
		public Node(int data) {
			key = data;
			left = right = null;
		}
	}
  
    // Constructor 
    BST() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
    
//    /**
//	 * Prints the values in the nodes of the tree
//	 * in sorted order.
//	 */
//    public void printTree( ) {
//        if( root == null )
//            System.out.println( "Empty tree" );
//        else
//            printTree( root );
//    }
//    private void printTree(Node t ){
//        if( t != null ){
//            printTree( t.left );
//            System.out.print( t.key+" " );
//            printTree( t.right );
//        } // An INORDER Traversal
//    }
// 
    
  //Node-Left-Right (NLR)
  	public void preOrder(Node root) {
  		if(root==null) {
  			return;
  		}
  		System.out.print(root.key+" ");
  		preOrder(root.left);
  		preOrder(root.right);
  		
  	}
  	
  	//Left-Node-Right (LNR)
  	public void inOrder(Node root) {
  		if(root==null)
  			return;
  		
  		inOrder(root.left);
  		System.out.print(root.key + " ");
  		inOrder(root.right);
  	}
  	
  	//Left-Right-Node (LRN)
  	public void postOrder(Node root) {
  		if(root==null)
  			return;
  		
  		postOrder(root.left);
  		postOrder(root.right);
  		System.out.print(root.key + " ");
  	}
  	
  	//count no of nodes
  	static int countNodes(Node root) {
  		
  		if(root==null) 
  			return 0;
  		
  		return 1+countNodes(root.left)+countNodes(root.right);
  	}

  	//count no of leaves
  	static int countLeaves(Node root) {
  		
  		if(root==null) 
  			return 0;
  		if (root.left == null && root.right == null) 
            return 1; 
        else
            return countLeaves(root.left) + countLeaves(root.right); 
  	}

    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BST tree = new BST(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter required numbers to keep in binary tree: ");
        int input = sc.nextInt();
        while(input>0) {
            tree.insert(input);
            input=sc.nextInt();
        }
       
    //    tree.printTree();

        // print inorder traversal of the BST 
        tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		
		int count = countNodes(tree.root);
		System.out.println("\nNo of nodes are: "+count);
		
		int count1 = countLeaves(tree.root);
		System.out.println("\nNo of nodes are: "+count1);
		
		sc.close();
    } 
} 

