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
            System.out.print("1.노드 생성     2.노드 삭제     3.노드 검색     4.출력     5.종료 >> ");
            int state = scan.nextInt();
            if (state == 1) {
                System.out.print("1.마지막 삽입     2.중간에 삽입 >> ");
                int state2 = scan.nextInt();
                if (state2 == 1) {
                    System.out.print("값 입력 : ");
                    String tmpStr = scan.next();
                    insertNode(tmpStr);
                } else if (state2 == 2) {
                    System.out.print("찾을 값 입력 : ");
                    String tmpStr = scan.next();
                    Node tmpNode = searchNode(tmpStr, false);
                    System.out.print("값 입력 : ");
                    tmpStr = scan.next();
                    insertNode(tmpNode, tmpStr);
                }
            } else if (state == 2) {
                System.out.print("1.마지막 삭제     2.검색 삭제 >> ");
                int state2 = scan.nextInt();
                if (state2 == 1) {
                    deletNode();
                } else if (state2 == 2) {
                    System.out.print("검색 값 : ");
                    String tmpStr = scan.next();
                    deleteNode(tmpStr);
                }
            } else if (state == 3) {
                System.out.print("검색 값 : ");
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

    ////////////////////////// 삽입 /////////////////////////
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

    ////////////////////////// 검색 /////////////////////////
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
                System.out.println(idx + "번째 인덱스에서 " + str + " searched");
                return;
            } else {
                System.out.println("searching...");
                node = node.getPostNode();
                idx++;
            }
        }
        System.out.println("no match");
    }

    ////////////////////////// 삭제 /////////////////////////
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

    ////////////////////////// 출력 /////////////////////////
    public void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getData() + " -> ");
            node = node.getPostNode();
        }
        System.out.println("null");
    }

}