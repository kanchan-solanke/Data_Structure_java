import java.util.Scanner;

class Node {
    Object data;
    Node next;

    Node() {

    }

    Node(int d) {
        data = d;
        next = null;
    }

    public Node(String n) {

    }
}

class UnorderedLinkedList {
    Node head;

    //Inserting data in linkedList
    public void insert(String n) {
        Node new_node = new Node(n);
        if (head == null) {
            head = new Node(n);
            return;
        }
        new_node.next = null;

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = new_node;

    }

    public boolean search(Node head, String n) {
        Node current = head;

        while (current != null) {

            if (current.data.equals(n))
                return true;

            current = current.next;
        }
        return false;
    }

    //deleting Node
    void deleteNode(String key) {
        Node temp = head, prev_node = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev_node = temp;
            temp = temp.next;
        }

        prev_node.next = temp.next;
        System.out.println("Deleted Successfully");
        display();
    }

    //Dispalying Data from linkedllist
    public void display() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data + "");
            tempNode = tempNode.next;
        }
    }

    public static void main(String[] args) {
        UnorderedLinkedList ul = new UnorderedLinkedList();
        String word = new String();
        Scanner scan = new Scanner(System.in);
        scan = new Scanner(word);
        String string;
        int length = word.length();
        while (scan.hasNext()) {
            String s = scan.next();
            ul.insert(s);
        }
        System.out.println("Words seperated from text file:\n");
        ul.display();
        System.out.println("Enter the word you want to search: ");
        Scanner scanner = new Scanner(System.in);
        string = scanner.next();
        if (ul.search(ul.head, string)) {
            System.out.println("\nElement Found and deleting element....\n");
            ul.deleteNode(string);
        } else {
            System.out.println("\nElement Not Found, Adding into the list\n");
            ul.insert(string);
            System.out.println("Added Successfully");
            ul.display();
        }

    }

}