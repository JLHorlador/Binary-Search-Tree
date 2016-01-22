public class BSTNode<E extends Comparable<E>> implements IBSTNode<E>
{
	private E data;
	private IBSTNode<E> left, right;
	
	public BSTNode(E data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public E getData()
	{
		return data;
	}
	
	public IBSTNode<E> getLeft()
	{
		return left;
	}
	
	public IBSTNode<E> getRight()
	{
		return right;
	}
	
	public void setLeft(IBSTNode<E> node)
	{
		left = node;
	}
	
	public void setRight(IBSTNode<E> node)
	{
		right = node;
	}
	
	public void add(IBSTNode<E> node)
	{
		if (this.compareTo(node) >= 0)
		{
			if (left == null)
				left = node;
			else
				left.add(node);
		}
		else
		{
			if (right == null)
				right = node;
			else
				right.add(node);
		}
	}
	
	public String inOrder()
	{
		String order = "";
		String tempLeft = "";
		String tempRight = "";
		
		if (left != null)
			tempLeft = left.inOrder();
		
		order += data + ", ";
		
		if (right != null)
			tempRight = right.inOrder();
		
		return tempLeft + order + tempRight;
	}
	
	public String postOrder()
	{
		String order = "";
		String tempLeft = "";
		String tempRight = "";
		
		if (left != null)
			tempLeft = left.postOrder();
		
		if (right != null)
			tempRight = right.postOrder();
		
		order += data + ", ";
		
		return tempLeft + tempRight + order;
	}
	
	public String preOrder()
	{
		String order = "";
		String tempLeft = "";
		String tempRight = "";
		
		order += data + ", ";
		
		if (left != null)
			tempLeft = left.preOrder();
		
		if (right != null)
			tempRight = right.preOrder();
		
		return order + tempLeft + tempRight;
	}
	
	public int compareTo(IBSTNode<E> other)
	{
		return data.compareTo(other.getData());
	}
	
	public String toString()
	{
		return data + "";
	}
}