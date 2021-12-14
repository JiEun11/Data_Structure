package com.javaex.structure.linkedlist;

import java.util.*;

public class LinkedList {
    // field
    private Node head = null;

    // constructor
    LinkedList() {
        head = null;
    }

    // method

    public void test() {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("1.��� ����     2.��� ����     3.��� �˻�     4.���     5.���� >> ");
            int state = scan.nextInt();
            if (state == 1) {
                System.out.print("1.������ ����     2.�߰��� ���� >> ");
                int state2 = scan.nextInt();
                if (state2 == 1) {
                    System.out.print("�� �Է� : ");
                    String tmpStr = scan.next();
                    insertNode(tmpStr);
                } else if (state2 == 2) {
                    System.out.print("ã�� �� �Է� : ");
                    String tmpStr = scan.next();
                    Node tmpNode = searchNode(tmpStr, false);
                    System.out.print("�� �Է� : ");
                    tmpStr = scan.next();
                    insertNode(tmpNode, tmpStr);
                }
            } else if (state == 2) {
                System.out.print("1.������ ����     2.�˻� ���� >> ");
                int state2 = scan.nextInt();
                if (state2 == 1) {
                    deletNode();
                } else if (state2 == 2) {
                    System.out.print("�˻� �� : ");
                    String tmpStr = scan.next();
                    deleteNode(tmpStr);
                }
            } else if (state == 3) {
                System.out.print("�˻� �� : ");
                String tmpStr = scan.next();
                searchNode(tmpStr);
            } else if (state == 4){
                printList();
            }
            else{
                System.out.println("EXIT");
                break;
            }
        }
    }

    ////////////////////////// ���� /////////////////////////
    public void insertNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
        } else {
            Node periNode = head;
            while (periNode.getPostNode() != null) {
                periNode = periNode.getPostNode();
            }
            periNode.setPostNode(newNode);
        }
    }

    public void insertNode(Node node, String data) {
        Node newNode = new Node(data);
        newNode.setPostNode(node.getPostNode());
        node.setPostNode(newNode);
    }

    ////////////////////////// �˻� /////////////////////////
    public Node searchNode(String str, boolean b) {
        int idx = 0;
        Node node = this.head;
        while (node != null) {
            if (str.equals(node.getData())) {
                return node;
            } else {
                node = node.getPostNode();
                idx++;
            }
        }
        return node;
    }

    public void searchNode(String str) {
        int idx = 0;
        Node node = this.head;
        while (node != null) {
            if (str.equals(node.getData())) {
                System.out.println(idx + "��° �ε������� " + str + " searched");
                return;
            } else {
                System.out.println("searching...");
                node = node.getPostNode();
                idx++;
            }
        }
        System.out.println("no match");
    }

    ////////////////////////// ���� /////////////////////////
    public void deletNode() {
        Node preNode;
        Node periNode;
        if (head == null) return;
        else {
            preNode = head;
            periNode = head.getPostNode();
            if (periNode == null) {
                head = null;
            } else {
                while (periNode.getPostNode() != null) {
                    preNode = periNode;
                    periNode = periNode.getPostNode();
                }
                preNode.setPostNode(null);
            }
        }
    }

    public void deleteNode(String str) {
        Node preNode = head;
        Node periNode = head.getPostNode();

        if (str.equals(preNode.getData())) {
            head = preNode.getPostNode();
//            preNode.setPostNode(null);
        } else {
            while (periNode.getPostNode() != null) {
                if (str.equals(periNode.getData())) {
                    if (periNode.getPostNode() == null) {
                        preNode.setPostNode(null);
                    } else {
                        preNode.setPostNode(periNode.getPostNode());
                        periNode.setPostNode(null);
                    }
                    break;
                } else {
                    preNode = periNode;
                    periNode = periNode.getPostNode();
                }

            }
        }
    }

    ////////////////////////// ��� /////////////////////////
    public void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getData() + " -> ");
            node = node.getPostNode();
        }
        System.out.println("null");
    }

}