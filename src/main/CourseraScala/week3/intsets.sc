package CourseraScala.week3

println("Coursera FPS: Week 3 Data Abstraction")

val t1 = new BinarySearchTree(3, new BinaryTree, new BinaryTree)
val t2 = t1 incl 4
val t3 = t2 incl 2
val t4 = new BinarySearchTree(5, new BinaryTree, new BinaryTree)
val t5 = t4 incl 1
val t6 = t5 incl 7

val t7 = t3 union t6
/*
Abstract classes can contain members which
are missing an implementation
Consequently, No instances of an abstract class can be created with the operator new.
 */
abstract class IntSet {
  def incl(x : Int): IntSet
  def contains(x : Int): Boolean
  def union(other: IntSet):IntSet
}


// binary  tree
class BinaryTree extends IntSet {
  override def contains(x: Int): Boolean = false

  override def incl(x: Int): IntSet = new BinarySearchTree(x, new BinaryTree,new BinaryTree)

  override def union(other: IntSet): IntSet = other
  override def toString: String = "."
}

// binary search tree
class BinarySearchTree(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def  contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def incl(x: Int): IntSet =
    if (x < elem) new BinarySearchTree(elem, left incl x, right)
    else if (x > elem) new BinarySearchTree(elem, left, right incl x)
    else this

  override def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem

  override def toString: String = "{" + left + elem + right + "}"
}

//object BinaryTree extends IntSet {
//  def contains(x:Int): Boolean = false
//  def incl(x: Int): IntSet = new BinarySearchTree(x, BinaryTree, BinaryTree)
//}