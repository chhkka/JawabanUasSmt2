public class food {
    public class BinarySearchTree {
        public Node search(Node root, int key){
            if (root==null || root.key==key)
                return root;
            if (root.key < key)
                return search(root.right, key);
            return search(root.left, key);
        }

        private static Node insert(Node node, int key){
            if (node == null){
                Node temp = new Node(key);
                return temp;
            }

            if (key < node.key){
                node.left = insert(node.left, key);
            }
            else if (key > node.key){
                node.right = insert(node.right, key);
            }

            return node;
        }

        private static void inorder(Node root){
            if (root != null){
                inorder(root.left);
                System.out.println(" " + root.key);
                inorder(root.right);
            }
        }
        public static void main(String[] args) {
            Node root = null;
            root = insert(root, 50);
            insert(root, 30);
            insert(root, 20);
            insert(root, 40);
            insert(root, 70);
            insert(root, 60);
            insert(root, 80);
            inorder(root);
            public class Food{
                static Scanner in = new Scanner(System.in);
                private int[] data;
                public Food(int[] data) {
                    this.data = data;
                    this.QuickSortAscending();
                    this.QuickSortDescending();
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.print("Pilih : ");
                    int pilih = in.nextInt();
                    switch (pilih) {
                        case 1:
                            QuickSortAscending();
                            break;
                        case 2:
                            QuickSortDescending();
                            break;
                    }
                }
                public void QuickSortAscending() {
                    System.out.println("Sebelum : ");
                    for (int i = 0; i < data.length; i++) {
                        System.out.print(data[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Sesudah : ");
                }

                public static void main(String[] args) {
                    String[] dataArray = {"Pizza"};
                    int n = dataArray.length;
                    System.out.println("""
                Before sorting array elements are -\s""");
                    QuickSort _myQS = new QuickSort();
                    _myQS.setData(dataArray);
                    _myQS.printArr(n);
                    _myQS.quickSort(0, n-1);
                    System.out.println("\n After sorting array elements are - ");
                    _myQS.printArr(n);
                    System.out.println();
                }
        }
    }
}
