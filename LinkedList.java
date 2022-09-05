import java.io.*;

public class LinkedList
{
    Node head;
    int size = 0;

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

        list.size++;

        return list;
    }

    public static void print_by_index(LinkedList list, int index)
    {
        if (index >= list.size || index < 0) System.out.println("** OUT OF RANGE **");
        else
        {
            Node next_node = list.head;

            int i = 1;
            while (i <= index)
            {
                next_node = next_node.next;
                i++;
            }

            System.out.println(next_node.data + " ");
        }
    }

    public static LinkedList delete_by_index(LinkedList list, int index)
    {
        Node n = list.head, pn = null;

        if (index >= list.size || index < 0) System.out.println("** OUT OF RANGE **");

        if (index == 0 && n != null)
        {
            list.head = n.next;
            list.size--;
        }
        else
        {
            int i = 1;
            while (i <= index && n != null)
            {
                pn = n; n = n.next;
                i++;
            }

            if (n != null) pn.next = n.next;
            list.size--;
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

        delete_by_index(list, 0);
        print_by_index(list, 0);
    }
}
