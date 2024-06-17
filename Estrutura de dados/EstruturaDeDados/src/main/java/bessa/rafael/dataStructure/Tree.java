package bessa.rafael.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    private Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
        public boolean isLeaf(){
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(int value){
        if(root == null) root = new Node(value);
        else{
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0){
                Node currentNode = queue.remove();
                if(currentNode.left == null){
                    currentNode = newNode;
                    break;
                } else{
                    queue.add(currentNode.left);
                }
                if(currentNode.right == null){
                    currentNode = newNode;
                    break;
                } else{
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(final Node node){
        // RAIZ ESQUERDA DIRETA
        if(node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(final Node node){
        // ESQUERDA RAIZ DIREITA
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void posOrder(){
        posOrder(root);
    }

    private void posOrder(final Node node){
        // ESQUERDA DIREITA RAIZ
        if(node == null) return;
        inOrder(node.left);
        inOrder(node.right);
        System.out.println(node.value);

    }



}
