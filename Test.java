import java.util.Scanner;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<Integer>();
        long totalTime, printTotal=0;
        Random generator = new Random();

        System.out.println("Please enter BST items : ");
        while (true) {
            Scanner scan = new Scanner(System.in);
            int v = Integer.parseInt(scan.nextLine());
            if (v == -1 ) {
                break;
            } else {
                long startTime = System.nanoTime();
                bst.insert(v);
                long endTime = System.nanoTime();
                totalTime = endTime - startTime;
                printTotal = printTotal + totalTime;
            }
        }
        System.out.println("All items inserted.");
        System.out.println("Time elapsed for insertion : " + printTotal);
        System.out.println("Maximum Value in Tree : " + bst.max());
        System.out.println("Minumum Value in Tree : " + bst.min());
        long startSum = System.nanoTime();
        System.out.println("GETSUM of all items in Tree : " + bst.sum());
        long endSum = System.nanoTime();
        long totalSum = endSum - startSum;
        System.out.println("Time elapsed for GETSUM() : " + totalSum);
        System.out.print("In-order manner all Tree items : ");
        bst.inorder();
        System.out.println();


        long totalInsertTree=0, totalSumTree=0;
        long totalInsertTree1=0, totalSumTree1=0;

        for(int i = 0; i<1000 ; i++) {
            int number = generator.nextInt(2000) + 1;
            long treeInsertTimeS = System.nanoTime();
            bst.insert(number);
            long treeInsertTimeE = System.nanoTime();
            long treeinsertTime = treeInsertTimeE-treeInsertTimeS;
            totalInsertTree = totalInsertTree + treeinsertTime;
            long treeSumTimeS = System.nanoTime();
            bst.sum();
            long treeSumTimeE = System.nanoTime();
            long treeSumTime = treeSumTimeE-treeSumTimeS;
            totalSumTree = totalSumTree + treeSumTime;

        }
        System.out.println("Total Insert Time for Tree (1000) : " + totalInsertTree);
        System.out.println("Total Sum Time for Tree (1000) : " + totalSumTree);

        for(int i = 0; i<10000 ; i++) {
            int number = generator.nextInt(2000) + 1;
            long treeInsertTimeS = System.nanoTime();
            bst.insert(number);
            long treeInsertTimeE = System.nanoTime();
            long treeinsertTime = treeInsertTimeE-treeInsertTimeS;
            totalInsertTree1= totalInsertTree1 + treeinsertTime;
            long treeSumTimeS = System.nanoTime();
            bst.sum();
            long treeSumTimeE = System.nanoTime();
            long treeSumTime = treeSumTimeE-treeSumTimeS;
            totalSumTree1 = totalSumTree1 + treeSumTime;

        }
        System.out.println("Total Insert Time for Tree (10000) : " + totalInsertTree1);
        System.out.println("Total Sum Time for Tree (10000) : " + totalSumTree1);
    }
}
