public class Main {
    public static void main(String[] args) {
        // java collection Framework
        // Collection - refers to storing the group of objects.
        // Framework - refers to a ready-made tools that can be used to store the objects
        // Collection framework means storing a group of datas with a ready-made tools and perform operations.
        // List  (Array list,LinkedList,  Hashset. priority queue, ArrayDeque and HashMap)
        // Set (LinkedHashSet, treeSet)

        //** LIST ** is a Interface  in java can be implements by A,HS,PQ,AD,HM \\
        ExmpleOfLst.display();
        ExmpleArray.display();
        ExampleOfArrayDeque.Display(); // values can be inserted from first and last
        ExamplePriorityQueue.display(); // values are stored in asc to desc, can be accessed from first
        ExmpleOfLinkedList.display();
        ExmplHashMap.display();
        // ** SET ** is a interface in java that can be implemented by Lhs,  LH
        ExmplHashset.display(); // group of unique data
        ExampleTreeSet.Display();
        // ** MAP ** // LinkedHashMap and Tree map)
        ExampleLinkedHashMap.display();
        ExampleTreeMap.display();
    }
}

