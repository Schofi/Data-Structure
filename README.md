# Data-Structure
* 学习数据结构的一些代码，包括数组，链表，二分搜索树，集合，映射，优先队列，并查集，线段树，字典树（前缀树），AVL树，红黑树，哈希表，如有错误，多多指教。
* 我们在调用set,map等标准库里的东西，大多使用平衡二叉树，也就是红黑树实现的
* 哈希表的操作时间复杂度为o(1),但失去了可比较性实现的哈希表要求键必须为可比较的对象，Java8之后当哈希冲突达到一定程度后每个位置会从链表变成红黑树。
* 在线段树中，不考虑添加元素，即区间固定，假设区间有n个元素，数组开出4n的静态空间就好了。
* 代码主要是用java写的，目前不断增加中......
---
|                  数据结构          |              Java源码               |                    注释      |           说明                   |
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
||[PriortyQueue](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/PriortyQueue.java)|用最大堆实现|所以为最大优先队列|
|循坏队列|[LoopQueue](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/LoopQueue.java)|有两端的标志点|注意队空与队满的定义|
| 并查集     |[UnionFind](https://github.com/Schofi/Happy-With-Data-Structure-Java/tree/master/Union%20Find) |  代码   |处理一些不相交集合（Disjoint Sets）的合并及查询问题|
||[UnionFind1](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind1.java)|数组实现||
||[UnionFind2](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind2.java)|树实现|森林结构，并查集初始形态|
||[UnionFind3](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind3.java)|基于size优化|size为集合元素个数|
||[UnionFind4](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind4.java)|基于rank的优化|rank为树的高度|
||[UnionFind5](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind5.java)|路径压缩|让当前节点指向父亲的父亲结点|
||[UnionFind6](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Union%20Find/UnionFind6.java)|递归实现路径压缩||
|字典树（前缀树）|[Trie](https://github.com/Schofi/Happy-With-Data-Structure-Java/blob/master/Trie.java)|实现字典树|适用与字符串，查询很高效|
|哈希表|[HashTable](https://github.com/Schofi/Happy-With-Data-Structure/blob/master/HashTable.java)|整形哈希函数|键与值分布越均匀越好，不同领域有不同的设计方法|
|线段树|[SegmentTree](https://github.com/Schofi/Happy-With-Data-Structure/blob/master/SegmentTree.java)|数组实现|用以存储区间或线段，并且允许快速查询结构内包含某一点的所有区间|
|AVL树|[AVLTree](https://github.com/Schofi/Happy-With-Data-Structure/blob/master/AVLTree.java)|BST实现|具有自平衡机制，重点判断不平衡点和左旋与右旋的使用及连贯使用，在极端情况下，相较普通的二分搜索树，性能巨大的提升|
|红黑树|[RBTree](https://github.com/Schofi/Happy-With-Data-Structure/blob/master/RBTree.java)|||
***
### 不是总结的总结
* 这个目录只是让读者大概了解一下数据结构的主要内容，学会如何思考是数构的核心内容，不是某种语言，学好数构需要大量的上机练习，不是看看就行的，祝你成功。
