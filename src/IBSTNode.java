public interface IBSTNode<E extends Comparable<E>>
{
	E getData();
	IBSTNode<E> getLeft();
	IBSTNode<E> getRight();
	void setLeft(IBSTNode<E> node);
	void setRight(IBSTNode<E> node);
	void add(IBSTNode<E> node);
	int compareTo(IBSTNode<E> other);
	String toString();
	String inOrder();
	String postOrder();
	String preOrder();
	boolean contains(E n);
}
