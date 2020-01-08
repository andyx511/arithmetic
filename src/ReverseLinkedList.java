/**
 * @author NiDingbo
 * @date 2019/11/18
 * 链表逆序
 * 需要三个节点
 * 当p2不等于null时
 * 将p2的next指向p3
 *
 */
public class ReverseLinkedList {
    private static Node head;
    // 初始化Node
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // 链表逆序
    public static void reverseLinkedList(){
        if (head == null || head.next==null ){
           return;
        }

        Node p1 = head;
        Node p2 = head.next;
        Node p3 = null;

        while (p2 !=null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;
    }
    public static void main(String [] args){
        head = new Node(3);
        head.next = new Node(5);
        Node temp = head.next;
        temp.next = new Node(1);
        temp = temp.next;
        temp.next = new Node(4);
        temp = temp.next;
        temp.next = new Node(9);

        // 输出逆序前的列表
        temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        // 逆序
        reverseLinkedList();

        // 输出逆序后的
        System.out.println("逆序后的");
        temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
