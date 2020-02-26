import org.w3c.dom.Node;

public class MyLinkedist {
      public Node head;
      public int numNodes;

      public MyLinkedist(){
       head = new Node(data)
      }

    public class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
