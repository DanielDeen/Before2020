package Micro.caprice.list.CDesign;

/**
 * @program Before2020
 * @description: 设计链表
 * @author: ding
 * @create: 2022/02/24 00:06
 */
public class TestDesign {
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();

		linkedList.addAtHead(2);
		linkedList.deleteAtIndex(1);
		linkedList.addAtHead(2);
		linkedList.addAtHead(7);
		linkedList.addAtHead(3);
		linkedList.addAtHead(2);
		linkedList.addAtHead(5);

		linkedList.addAtTail(5);
		linkedList.get(5);

		linkedList.deleteAtIndex(6);

		linkedList.deleteAtIndex(4);

	}
}
