public class Day39 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx=-1;
        static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]== -1) return null;

            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }

    }
    public static int maxdepth(Node root){
        if(root==null) return 0;
         
        int lheight=maxdepth(root.left);
        int rheight=maxdepth(root.right);

         int height=Math.max(lheight,rheight)+1;
        return height;
    }

    public static void main(String[] args) {
    
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binarytree tree=new Binarytree();
        Node root=tree.buildtree(nodes);

        int depth=maxdepth(root);
        System.out.println(depth);
    }

}
