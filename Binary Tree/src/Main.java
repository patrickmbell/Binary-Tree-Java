import java.util.Scanner;


public class Main {

    private BinaryTree tree;



    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();


        Scanner scan = new Scanner(System.in);
        System.out.println("enter root value: ");
        tree.root = new Node(scan.nextInt());
        System.out.println("enter left: ");
        tree.root.left = new Node(scan.nextInt());
        System.out.println("enter right");
        tree.root.right = new Node(scan.nextInt());
        System.out.println("enter left.left");
        tree.root.left.left = new Node(scan.nextInt());
        System.out.println("enter left.right");
        tree.root.left.right = new Node(scan.nextInt());
        System.out.println("enter right.right");
        tree.root.right.right = new Node(scan.nextInt());
        System.out.println("enter right.left");
        tree.root.right.left = new Node(scan.nextInt());



        printRoot1(tree);
    }



    static void printRoot1(BinaryTree x)
    {
        System.out.print("\t\t"+"  "+x.root.getKey());
        System.out.println("\n\t\t/\t\\");
        System.out.println("\t"+ "   "+x.root.left.getKey() + "\t" + " "+x.root.right.getKey());
        System.out.println("\t  "+"/\\" + "\t "+"/\\");
        System.out.println("\t "+x.root.left.left.getKey() + " " + x.root.left.right.getKey() + "\t"+x.root.right.left.getKey() + "  " + x.root.right.right.getKey());

    }


}
