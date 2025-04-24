public class ScndBinImple {
    class Node{
        int data;
        Node left, right;
        Node(int item){
            data=item;
            left=right=null;
        }
    }
    Node root;
    
    ScndBinImple(){
        /**This is the default constructor for the containing class that contains the entire tree */
        root=null;
    }

    public void insert(int key){
        root=insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        /**Recursive insert method to define nodes */
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<=root.data)
            root.left=insertRec(root.left, key);
        else if(key>root.data)
            root.right=insertRec(root.right, key);
        return root;
    }
    Node findNode(Node node, int data){
        /**Method to find a node in the tree */
        if(node==null)
            return null;
        if(node.data==data)
            return node;
        if(data<=node.data)
            return findNode(node.left, data);
        else if (data>node.data)
            return findNode(node.right, data);
        return null;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        ScndBinImple tree=new ScndBinImple();
        for(int i=0; i<arr.length; i++){
            tree.insert(arr[i]);
        }
        int searchKey=9;
        Node foundNode=tree.findNode(tree.root, searchKey);
        if(foundNode!=null){
            System.out.println("Node with key " + searchKey + " found in the tree.");
        } else {
            System.out.println("Node with key " + searchKey + " not found in the tree.");
        }
    }
}
