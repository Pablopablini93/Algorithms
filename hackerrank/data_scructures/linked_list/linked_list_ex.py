'''
1. Inserting a Node at the Tail of a Linked List
2. Printing in Reverse
'''


class Node:
    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next = next_node


def insert_node(head, data):
    if head.data is None:
        head.data = data
    else:
        current_node = head
        while current_node.next is not None:
            current_node = current_node.next
        node = Node(data)
        current_node.next = node
    return head


def print_reverse(head):
    if head is None:
        return
    if head.next is not None:
        print_reverse(head.next)
    print(head.data)


def main():
    head = Node()
    for i in range(0, 15):
        insert_node(head, i + 1)

    print_reverse(head)


if __name__ == '__main__':
    main()






