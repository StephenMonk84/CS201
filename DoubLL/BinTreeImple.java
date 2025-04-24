public class BinTreeImple {
    private static class Node{
        int key;
        Node left, right;
        Node(int item){
            key = item;
            left=right=null;
        }
    }
    private static class BinTree{
        Node root;
        BinTree(){
            root=null;
        }
        BinTree(int key){
            root=new Node(key);
        }
    }

    public static void main(String[] args){
        BinTree tree=new BinTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
    }






}
