package ferdinandNiyongiraAssignment3;

public class FerdinandNiyongiraBinarySearchTree<E> implements FerdinandNiyongiraTree<E>
{
	protected FerdinandNiyongiraTreeNode<E> root;
	protected int size = 0;
	protected java.util.Comparator<E> c;
	
	//Counter used to format traversal outputs
	
	private int traversalCount=0;
	
	/**Create a default FerdinandNiyongiraBinarySearchTree with a natural order comparator*/
	
	public FerdinandNiyongiraBinarySearchTree() 
	{
		// Create a comparator that uses the natural ordering of the elements.
		this.c = (e1, e2)-> ((Comparable<E>) e1).compareTo(e2);
	}
	/**Create FerdinandNiyongiraBinarySearchTree with a specified comparator*/
	
	public FerdinandNiyongiraBinarySearchTree(java.util.Comparator<E> c) 
	{
		// Store the comparator provided by the user.
		this.c = c;
	}
	
	/**Create a binary tree from an array of object*/
	
	public FerdinandNiyongiraBinarySearchTree(E[] Objects) 
	{
		// Use the natural ordering of the elements in the array.
		this.c = (e1, e2)-> ((Comparable<E>) e1).compareTo(e2);
	
		// Insert each element from the array into the FerdinandNiyongiraBinarySearchTree.
		for (int i=0; i < Objects.length; i++)
			add(Objects[i]);
	}
	
	/**Return true if the element is in the tree*/
	@Override
	public boolean ferdinandNiyongiraSearch(E e) 
	{
		// Start the search at the root of the tree.
		FerdinandNiyongiraTreeNode<E> current = root;	//Start from the root
		
		while (current != null) 
		{
			// Move to the left subtree when the target is smaller.
			if(c.compare(e, current.element)<0) 
			{
				current = current.left;
			}
			// Move to the right subtree when the target is larger.
			else if(c.compare(e,current.element)>0) 
			{
				current = current.right;
			}
			
			else 
			{
				return true;
			}
		}
		
		// Return false when the search reaches the end without finding the element.
		return false;
	}
	
	/**Create a new node*/
	
	protected FerdinandNiyongiraTreeNode<E> ferdinandNiyongiraCreateNewNode(E e)
	{
		// Create a new TreeNode containing the specified element.
		return new FerdinandNiyongiraTreeNode<>(e);
	}
	
	/*This inner class is static, because it doesn't access any 
	 * instance members defined in its outer class*/
	
	public static class FerdinandNiyongiraTreeNode<E> 
	{
		protected E element;
		protected FerdinandNiyongiraTreeNode<E> left;
		protected FerdinandNiyongiraTreeNode<E> right;
		
		public FerdinandNiyongiraTreeNode(E e)
		{
			// Store the element inside the new node.
			element = e;
		}
		
		
		@Override
		public String toString() 
		{
			return element.toString();
		}
	}
	
	/**Insert element e into binary tree
	 * Return true if the element is inserted successfully*/
	
	@Override
	public boolean ferdinandNiyongiraInsert(E e) 
	{
		// If the tree is empty, the new element becomes the root.
		if(root == null) 
		{
			root = ferdinandNiyongiraCreateNewNode(e);			//Create a new root
		}
		else 
		{
			//Locate the parent node
			FerdinandNiyongiraTreeNode<E> parent = null;
			FerdinandNiyongiraTreeNode<E> current = root;
			
			// Search for the correct position for the new element.
			while(current!=null) 
			{
				// Move left when the new element is smaller.
				if(c.compare(e, current.element)<0) 
				{
					parent = current;
					current = current.left;
				}
				// Move right when the new element is larger.
				else if(c.compare(e, current.element)>0) 
				{
					parent = current;
					current = current.right;
				}
				else 
				{
					return false;	//Duplicate node not inserted
				}
			}
			
			//Create a new node and attach it to the parent node
			
			// Attach the new node to the appropriate side of the parent.
			if(c.compare(e, parent.element)<0)
				parent.left = ferdinandNiyongiraCreateNewNode(e);
			else
				parent.right = ferdinandNiyongiraCreateNewNode(e);
		}
		
		// Increase the number of elements after successful insertion.
		size ++;
		return true;
	}
	
	/**Inorder traversal from the root*/
	@Override
	public void ferdinandNiyongiraInorder() 
	{
		
		//Reset the counter anytime inorder traversal starts
		traversalCount = 0;
		
		// Start the inorder traversal at the root.
		inorder(root);
		
		//Move to the next line after traversal is finished
		
		System.out.println();
	}
	
	/**Inorder traversal from a subtree*/
	protected void inorder(FerdinandNiyongiraTreeNode<E> root) 
	{
		// Stop when an empty subtree is reached.
		if(root == null) return;

		// Visit the left subtree first.
		inorder(root.left);

		// Visit the current node.
		System.out.print(root.element + " ");
		
		traversalCount++;
		
		//After every 15 values, start a new line
		
		if(traversalCount%15==0) 
		{
			System.out.println();
		}
		

		// Visit the right subtree.
		inorder(root.right);
	}
	
	/**Postorder traversal from the root*/
	@Override
	public void ferdinandNiyongiraPostorder() 
	{
		//Reset the counter anytime postorder traversal starts
		traversalCount = 0;
		
		// Start the postorder traversal at the root.
		postorder(root);
		
		//Move to the next line after traversal is finished
		
		System.out.println();
	}
	
	/**Postorder traversal from a subtree*/
	protected void postorder(FerdinandNiyongiraTreeNode<E>root) 
	{
		// Stop when an empty subtree is reached.
		if(root == null) return;
	
		// Visit the left subtree first.
		postorder(root.left);
	
		// Visit the right subtree second.
		postorder(root.right);
	
		// Visit the root of the current subtree last.
		System.out.print(root.element + " ");
		
		traversalCount++;
		
		//After every 15 values, start a new line
		
		if(traversalCount%15==0) 
		{
			System.out.println();
		}
		
	}
	
	/**Preorder traversal from the root*/
	@Override
	public void ferdinandNiyongiraPreorder()
	{
		//Reset the counter anytime preorder traversal starts
		traversalCount = 0;
		// Start the preorder traversal at the root.
		preorder(root);
		
		//Move to the next line after traversal is finished
		System.out.println();
	}
	
	/**Preorder traversal from a a subtree*/
	public void preorder(FerdinandNiyongiraTreeNode<E>root) 
	{
		// Stop when an empty subtree is reached.
		if(root == null) return;
	
		// Visit the root before its children.
		System.out.print(root.element + " ");
		traversalCount++;
		
		//After every 15 values, start a new line
		
		if(traversalCount%15==0) 
		{
			System.out.println();
		}
	
		// Visit the left subtree.
		preorder(root.left);
	
		// Visit the right subtree.
		preorder(root.right);
	}
	
	/**Get the number of notes in the tree*/
	@Override
	public int ferdinandNiyongiraGetSize() 
	{
		// Return the number of elements currently stored in the tree.
		return size;
	}
	
	/**Return the root of the tree*/
	public FerdinandNiyongiraTreeNode<E> getRoot()
	{
		// Return the root node of the FerdinandNiyongiraBinarySearchTree.
		return root;
	}
	
	/**Return a path from the root leading to a specified element*/
	public java.util.ArrayList<FerdinandNiyongiraTreeNode<E>> path(E e)
	{
		// Create a list that will contain the nodes along the search path.
		java.util.ArrayList<FerdinandNiyongiraTreeNode<E>> list = new java.util.ArrayList<>();
	
		// Start searching from the root.
		FerdinandNiyongiraTreeNode<E> current = root;								//Start from the root
		
		while(current!=null) 
		{
			list.add(current);			//Add the node to the list
	
			// Move to the left subtree when the target is smaller.
			if(c.compare(e,current.element)<0) 
			{
				current = current.left;
			}
			// Move to the right subtree when the target is larger.
			else if(c.compare(e, current.element)>0) 
			{
				current = current.right;
			}
			else
				// Stop when the specified element is found.
				break;
		}
	
		// Return all nodes visited while searching for the element.
		return list;
	}
	

/**Delete an element from a binary tree. Return true if the element is deleted successfully
 * Return false if the element is not in the tree*/
	
	
	@Override
	public boolean ferdinandNiyongiraDelete(E e) 
	{
		//Locate the node to be deleted and also locate its parent node
		FerdinandNiyongiraTreeNode<E> parent = null;
		FerdinandNiyongiraTreeNode<E> current = root;
		
		// Search for the node containing the element.
		while(current!=null) 
		{
			// Move left when the element is smaller than the current element.
			if(c.compare(e,current.element)<0) 
			{
				parent = current;
				current = current.left;
			}
			// Move right when the element is larger than the current element.
			else if(c.compare(e, current.element)>0) 
			{
				parent = current;
				current = current.right;
			}
			else
				// Stop when the element is found.
				break;
		}
		
		// Check whether the element was found
		if(current == null)
			return false;				//The element is not in the tree
		
		//Case1: current has no left child
		if(current.left == null) 
		{
			//Connect the parent with the right child of the current node
			if(parent == null) 
			{
				// If current is the root, its right child becomes the new root.
				root = current.right;
			}
			else if(c.compare(e,parent.element)<0) 
			{
				// Connect the parent's left child to current's right child.
				parent.left = current.right;
			}
			else
				// Connect the parent's right child to current's right child.
				parent.right = current.right;
		}
		
		else
		{
			//Case2: The current node has left child
			//Locate the rightmost in the left subtree of 
			//The parent node and also its parent
			
			// Find the largest node in the left subtree.
			FerdinandNiyongiraTreeNode<E> parentOfRightMost = current;
			FerdinandNiyongiraTreeNode<E> rightMost = current.left;
			
			// Continue right until the rightmost node is reached.
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
				// Replace the rightmost node with its left child.
				parentOfRightMost.right = rightMost.left;
			}
			else
				//Special case: parentOfRightMost == current
				// Replace current's left child with the rightmost node's left child.
				parentOfRightMost.left = rightMost.left;
			
			
		}
		
		size --;			//Reduce the size of the tree
		return true;		//Element deleted successfully
	}
	
	/**Obtain an iterator. Use inorder*/
	@Override
	public java.util.Iterator<E> iterator()
	{
		// Return an iterator that traverses the tree in inorder.
		return new FerdinandNiyongiraInorderIterator();
	}
	
	//Inner class Inorder Iterator
	private class FerdinandNiyongiraInorderIterator implements java.util.Iterator<E>
	{
		//Store the elements in the list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	
		// Keep track of the current position in the list.
		private int current = 0;		//Point to the current element in the list
		
		public FerdinandNiyongiraInorderIterator() 
		{
			// Build the list by traversing the binary tree.
			inorder();		//Traverse binary tree and store elements in list
		}
		
		/**Inorder traversal from the root*/
		public void inorder() 
		{
			// Start the inorder traversal at the root.
			inorder(root);
		}
		
		/**Inorder traversal from a subtree*/
		protected void inorder(FerdinandNiyongiraTreeNode<E> root) 
		{
			// Stop when an empty subtree is reached.
			if(root == null) return;
	
			// Visit the left subtree first.
			inorder(root.left);
	
			// Visit the current node.
			System.out.print(root.element + " ");
	
			// Visit the right subtree.
			inorder(root.right);
		}
		
		
		/**More elements for traversing*/
		@Override
		public boolean hasNext() 
		{
			// Check whether there are still elements remaining in the list.
			if(current < list.size())
				return true;
			return false;
		}
		
		@Override
		public E next() 
		{
			// Return the current element and move to the next position.
			return list.get(current++);
		}
		
		@Override
		public void remove() 
		{
			// An element cannot be removed before next() has been called.
			if(current == 0) 
			{
				throw new IllegalStateException();
				
			}
			
			// Delete the previously returned element from the tree.
			ferdinandNiyongiraDelete(list.get(--current));
	
			// Rebuild the list after the deletion.
			list.clear();
			inorder();
		}
	}
	
	/**Remove all elements from the tree*/
	@Override
	public void clear() 
	{
		// Remove the root reference, making the tree empty.
		root = null;
	
		// Reset the number of elements to zero.
		size = 0;
	}
	
}
