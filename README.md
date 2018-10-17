# Data-Structure
* 学习数据结构的一些代码，包括数组，链表，二分搜索树，集合，映射，优先队列，并查集，线段树，字典树（前缀树），AVL树，红黑树，哈希表，如有错误，多多指教。
* 我们在调用set,map等标准库里的东西，大多使用平衡二叉树，也就是红黑树实现的。
* 代码主要是用java写的，目前不断增加中......
---
|                  数据结构          |              源码               |                    注释      |           说明                   |
| --------   | -----:  |:---------:|:----------:|
|数组|[Array](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Array.java)|实现数组|对数组的增，删，查，改的时间复杂度最好有所了解|
|链表|[LinkedList](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LinkedList.java)|实现链表|可以实现并归排序，删除时间复杂度低|
|二分搜索树|[BinarySearchTree](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/BinarySearchTree.java)|实现二分搜索树|重点是删除元素过程|
|集合|[Set](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Set.java)|集合接口||
||[LinkedListSet](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LinkedListSet.java)|链表实现集合||
||[BSTSet](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/BinarySearchTreeSet.java)|二分搜索树实现集合||
|映射|[Map](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Map.java)|映射接口||
||[LinkedListMap](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LinkedListMap.java)|链表实现||
||[BSTMap](https://github.com/Schofi/Happy-With-Data-Structure-Java/commit/4f20437e69a616a1aefbe4a20e805453cd5f66d9)|二分搜索树实现||
|栈|[Stack](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Stack.java)|栈的接口||
||[ArrayStack](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/ArrayStack.java)|数组实现栈||
||[LinkedListStack](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LinkedListStack.java)|链表实现栈|
|堆|[MaxHeap](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/MaxHeap.java)|实现最大堆|重点是元素上升与下降过程|
|优先队列|[Queue](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Queue.java)|接口||
|循坏队列|[LoopQueue](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LoopQueue.java)|有两端的标志点|注意队空与队满的定义|
||[PriortyQueue](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/PriortyQueue.java)|用最大堆实现|所以为最大优先队列|
| 并查集     |[UnionFind](https://github.com/Schofi/Happy-With-Data-Structure-Java/tree/master/Union%20Find) |  代码   |处理一些不相交集合（Disjoint Sets）的合并及查询问题|
|字典树（前缀树）|[Trie](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Trie.java)|实现字典树|适用与字符串，查询很高效|
