package org.example.UI;

import org.example.trees.AVLTree;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        System.out.println("AVL BINARY TREE");
        AVLTree binaryTree = new AVLTree();
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println();
            System.out.println("1. Insert a Node");
            System.out.println("2. Delete a Node");
            System.out.println("3. Get Balance Factor");
            System.out.println("4. Display Nodes in Order");
            System.out.println("5. Display Nodes in Pre Order");
            System.out.println("6. Display Nodes in Post Order");
            System.out.println("7. Total Number of Nodes");
            System.out.println("8. Remove all Nodes");
            System.out.println("9. Display Tree!");
            System.out.println("-. q to Quit");
            System.out.print("Enter your desired choice: ");
            switch (input.next()) {
                case "1":
                    System.out.println("\n*Insert Node*");
                    System.out.print("Enter a number to insert: ");
                    int userInsertNode = input.nextInt();
                    binaryTree.root = binaryTree.insertNode(binaryTree.root, userInsertNode);
                    break;
                case "2":
                    System.out.println("\n*Delete Node*");
                    System.out.print("Enter a number to delete: ");
                    int userDeleteNode = input.nextInt();
                    binaryTree.root = binaryTree.deleteNode(binaryTree.root, userDeleteNode);
                    break;
                case "3":
                    System.out.println("\n*Balance Factor*");
                    System.out.println(binaryTree.displayBalanceFactor(binaryTree.root));
                    break;
                case "4":
                    System.out.println("\n*Nodes in Order*");
                    binaryTree.inOrderTraversal();
                    break;
                case "5":
                    System.out.println("\n*Nodes Pre Order*");
                    binaryTree.preOrderTraversal();
                    break;
                case "6":
                    System.out.println("\n*Nodes Post Order*");
                    binaryTree.postOrderTraversal();
                    break;
                case "7":
                    System.out.println("\n*Total Nodes*");
                    System.out.println(binaryTree.getTotalNumberOfNodes());
                    break;
                case "8":
                    System.out.println("\n*Remove All Nodes*");
                    System.out.println("Removing...");
                    binaryTree.removeAllNodes();
                    System.out.println("Success");
                    break;
                case "9":
                    System.out.println();
                    binaryTree.printTree(binaryTree.root, "", true);
                    break;
                case "q":
                    System.out.println("\nQuiting...");
                    quit = true;
                    break;
                default:
                    System.err.println("ERROR: Please choose from the list from 1 to 9.\nProceed with your choice below..");
            }
        }
    }
}

