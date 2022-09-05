import java.io.*;

public class LinkedList
{
    Node head;

    static class Node
    {
        Node next;
        int data;

        Node(int d)
        {
            data = d; next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node n = new Node(data);

        if (list.head == null) list.head = n;
        else
        {
            Node next_node = list.head;
            while (next_node.next != null) next_node = next_node.next;
            next_node.next = n;
        }

        return list;
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list = insert(list, 10);
        list = insert(list, 20);

        Node next_node = list.head;
        while (next_node != null)
        {
            System.out.println(next_node.data + " ");
            next_node = next_node.next;
        }

    }
}
