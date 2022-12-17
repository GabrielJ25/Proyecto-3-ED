/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_3ed;

/**
 *
 * @author marcossanchez
 */
class Main {
  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node("Juan");
    tree.root.left = new Node("Maria");
    tree.root.right = new Node("Pedro");
    tree.root.left.left = new Node("Ana");
    tree.root.left.right = new Node("Carlos");

    System.out.println("Recorrido en inorden:");
    tree.printInOrder(tree.root);

    System.out.println("\nRecorrido en preorden:");
    tree.printPreOrder(tree.root);

    System.out.println("\nRecorrido en postorden:");
    tree.printPostOrder(tree.root);
  }
}

