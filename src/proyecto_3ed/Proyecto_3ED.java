package proyecto_3ed;


// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
 //* and open the template in the editor.

import java.util.Queue;
import java.util.LinkedList;
import java.lang.Class;
class Node {
  String name;
  Node left;
  Node right;

  public Node(String name) {
    this.name = name;
    left = null;
    right = null;
  }
}

class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  // Inorden: izquierda, raíz, derecha
  public void printInOrder(Node node) {
    if (node == null) {
      return;
    }

    printInOrder(node.left);
    System.out.println(node.name);
    printInOrder(node.right);
  }

  // Preorden: raíz, izquierda, derecha
  public void printPreOrder(Node node) {
    if (node == null) {
      return;
    }

    System.out.println(node.name);
    printPreOrder(node.left);
    printPreOrder(node.right);
  }

  // Postorden: izquierda, derecha, raíz
  public void printPostOrder(Node node) {
    if (node == null) {
      return;
    }

    printPostOrder(node.left);
    printPostOrder(node.right);
    System.out.println(node.name);
  }


  public void printAncestors(Node node, String target) {
    if (node == null) {
      return;
    }

    if (node.name.equals(target)) {
      return;
    }

    if (node.left != null) {
      System.out.println(node.left.name);
      printAncestors(node.left, target);
    }

    if (node.right != null) {
      System.out.println(node.right.name);
      printAncestors(node.right, target);
    }
  }

  public void printDescendants(Node node, String target) {
    if (node == null) {
      return;
    }

    if (node.name.equals(target)) {
      System.out.println(node.left.name);
      System.out.println(node.right.name);
      return;
    }

    printDescendants(node.left, target);
    printDescendants(node.right, target);
  }



class Main {
  public void main(){
    BinaryTree tree = new BinaryTree();
    tree.root = new Node("Juan");
    tree.root.left = new Node("Maria");
    tree.root.right = new Node("Pedro");
    tree.root.left.left = new Node("Ana");
    tree.root.left.right = new Node("Carlos");

    System.out.println("Progenitores femeninos de Carlos en la rama izquierda:");
    tree.printAncestors(tree.root, "Carlos");
  }
}
}
           