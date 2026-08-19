package chapter25BinartSearchTreesOrBSTChapter26AVLTree;

public class BST<E> implements Tree<E>
{
	protected TreeNode<E> root;
	protected int size = 0;
	protected java.util.Comparator<E> c;
	
	/**Create a default BST with a natural order comparator*/
	
	public BST() 
	{
		this.c = (e1, e2)-> ((Comparable<E>) e1).compareTo(e2);
	}
	/**Create BST with a specified comparator*/
	
	public BST(java.util.Comparator<E> c) 
	{
		this.c = c;
	}
	
	/**Create a binary tree from an array of object*/
	
	public BST(E[] Objects) 
	{
		this.c = (e1, e2)-> ((Comparable<E>) e1).compareTo(e2);
		for (int i=0; i < Objects.length; i++)
			add(Objects[i]);
	}

	/**Return true if the element is in the tree*/
	@Override
	public boolean search(E e) 
	{
		TreeNode<E> current = root;	//Start from the root
		
		while (current != null) 
		{
			if(c.compare(e, current.element)<0) 
			{
				current = current.left;
			}
			else if(c.compare(e,current.element)>0) 
			{
				current = current.right;
			}
		}
		
		return false;
	}

	/**Create a new node*/

	protected TreeNode<E> createNewNode(E e)
	{
		return new TreeNode<>(e);
	}
	
	/*This inner class is static, because it doesn't access any 
	 * instance members defined in its outer class*/
	
	public static class TreeNode<E> 
	{
		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;
		
		public TreeNode(E e)
		{
			element = e;
		}
	}

	/**Insert element e into binary tree
	 * Return true if the element is inserted successfully*/
	
	@Override
	public boolean insert(E e) 
	{
		if(root == null)
			root = createNewNode(e);			//Create a new root
		else 
		{
			//Locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			
			while(current!=null) 
			{
				if(c.compare(e, current.element)<0) 
				{
					parent = current;
					current = current.left;
				}
				else if(c.compare(e, current.element)>0) 
				{
					parent = current;
					current = current.right;
				}
				else 
				{
					return false;	//Duplicate node not inserted
				}
				
				//Create a new node and attach it to the parent node
				
				if(c.compare(e, current.element)<0)
					parent.left = createNewNode(e);
				else
					parent.right = createNewNode(e);
			}
		}
		
		size ++;
		return true;
	}
	
	/**Postorder traversal from the root*/
	@Override
	public void postorder() 
	{
		postorder(root);
	}
	
	/**Postorder traversal from a subtree*/
	protected void postorder(TreeNode<E>root) 
	{
		if(root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}
	
	/**Preorder traversal from the root*/
	@Override
	public void preorder()
	{
		preorder(root);
	}
	
	/**Preorder traversal from a a subtree*/
	public void preorder(TreeNode<E>root) 
	{
		if(root == null) return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	/**Get the number of notes in the tree*/
	@Override
	public int getSize() 
	{
		return size;
	}
	
	/**Return the root of the tree*/
	public TreeNode<E> getRoot()
	{
		return root;
	}
	
	/**Return a path from the root leading to a specified element*/
	public java.util.ArrayList<TreeNode<E>> path(E e)
	{
		java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
		TreeNode<E> current = root;								//Start from the root
		
		while(current!=null) 
		{
			list.add(current);			//Add the node to the list
			if(c.compare(e,current.element)<0) 
			{
				current = current.left;
			}
			else if(c.compare(e, current.element)>0) 
			{
				current = current.right;
			}
			else
				break;
		}
		return list;
	}
	
	
	/**Delete an element from a binary tree. Return true if the element is deleted successfully
	 * Return false if the element is not in the tree*/
	
	@Override
	public boolean delete(E e) 
	{
		//Locate the node to be deleted and also locate its parent node
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		
		while(current!=null) 
		{
			if(c.compare(e,current.element)<0) 
			{
				parent = current;
				current = current.left;
			}
			else if(c.compare(e, current.element)>0) 
			{
				parent = current;
				current = current.right;
			}
			else
				break;
		}
		
		if(current.left == null)
			return false;				//The element is not in the tree
		
		//Case1: current has no left child
		if(current.left == null) 
		{
			//Connect the parent with the right child of the current node
			if(parent == null) 
			{
				root = current.right;
			}
			else if(c.compare(e,current.element)<0) 
			{
				parent.left = current.right;
			}
			else
				parent.right = current.right;
		}
		
		else
		{
			//Case2: The current node has left child
			//Locate the rightmost in the left subtree of 
			//The parent node and also its parent
			
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			
			while(rightMost.right != null) 
			{
				parentOfRightMost = rightMost;
				rightMost = rightMost.right;		//Keep going to the right
			}
	
			//Replace the element in current with the element in rightmost
			current.element = rightMost.element;
			
			//Eliminate the right most node
			if(parentOfRightMost.right == rightMost) 
			{
				parentOfRightMost.right = rightMost.left;
			}
			else
				//Special case: parentOfRightMost == current
				parentOfRightMost.left = rightMost.left;
			
			
		}
		
		size --;			//Reduce the size of the tree
		return true;		//Element deleted successfully
	}
	
	/**Obtain an iterator. Use inorder*/
	@Override
	public java.util.Iterator<E> iterator()
	{
		return new InorderIterator();
	}
	
	//Inner class Inorder Iterator
	private class InorderIterator implements java.util.Iterator<E>
	{
		//Store the elements in the list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private int current = 0;		//Point to the current element in the list
		
		public InorderIterator() 
		{
			inorder();		//Traverse binary tree and store elements in list
		}
		
		/**Inorder traversal from the root*/
		public void inorder() 
		{
			inorder(root);
		}
		
		/**Inorder traversal from a subtree*/
		protected void inorder(TreeNode<E> root) 
		{
			if(root == null) return;
			inorder(root.left);
			System.out.print(root.element + " ");
			inorder(root.right);
		}
		
		
		/**More elements for traversing*/
		@Override
		public boolean hasNext() 
		{
			if(current < list.size())
				return true;
			return false;
		}
		
		@Override
		public E next() 
		{
			return list.get(current++);
		}
		
		@Override
		public void remove() 
		{
			if(current == 0) 
			{
				throw new IllegalStateException();
				
			}
			
			delete(list.get(--current));
			list.clear();
			inorder();
		}
	}
	
	/**Remove all elements from the tree*/
	@Override
	public void clear() 
	{
		root = null;
		size = 0;
	}

}
