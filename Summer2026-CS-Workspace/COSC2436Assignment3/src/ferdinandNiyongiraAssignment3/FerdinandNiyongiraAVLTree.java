package ferdinandNiyongiraAssignment3;

public class  FerdinandNiyongiraAVLTree <E> extends FerdinandNiyongiraBinarySearchTree<E> {
	  /** Create an empty AVL tree using a natural comparator*/
	  public FerdinandNiyongiraAVLTree() { // super() is implicitly called
	  }

	  /** Create a FerdinandNiyongiraBinarySearchTree with a specified comparator */
	  public FerdinandNiyongiraAVLTree(java.util.Comparator<E> c) {
	    super(c);
	  }

	  /** Create an AVL tree from an array of objects */
	  public FerdinandNiyongiraAVLTree(E[] objects) {
	    super(objects);
	  }

	  @Override /** Override createNewNode to create an AVLTreeNode */
	  protected FerdinandNiyongiraAVLTreeNode<E> ferdinandNiyongiraCreateNewNode(E e) {
	    // Create and return a new AVL tree node containing the element.
	    return new FerdinandNiyongiraAVLTreeNode<E>(e);
	  }

	  @Override /** Insert an element and rebalance if necessary */
	  public boolean ferdinandNiyongiraInsert(E e) {
	    // First, insert the element using the insertion method inherited from FerdinandNiyongiraBinarySearchTree.
	    boolean successful = super.ferdinandNiyongiraInsert(e);
	    if (!successful)
	      return false; // e is already in the tree
	    else {
	    	ferdinandNiyongiraBalancePath(e); // Balance from e to the root if necessary
	    }

	    return true; // e is inserted
	  }

	  /** Update the height of a specified node */
	  private void ferdinandNiyongiraUpdateHeight(FerdinandNiyongiraAVLTreeNode<E> node) {
	    // A leaf node has a height of zero because it has no children.
	    if (node.left == null && node.right == null) // node is a leaf
	      node.height = 0;

	    // If there is no left child, calculate the height using the right subtree.
	    else if (node.left == null) // node has no left subtree
	      node.height = 1 + ((FerdinandNiyongiraAVLTreeNode<E>)(node.right)).height;

	    // If there is no right child, calculate the height using the left subtree.
	    else if (node.right == null) // node has no right subtree
	      node.height = 1 + ((FerdinandNiyongiraAVLTreeNode<E>)(node.left)).height;

	    // If both children exist, use the taller subtree plus one.
	    else
	      node.height = 1 +
	        Math.max(((FerdinandNiyongiraAVLTreeNode<E>)(node.right)).height,
	        ((FerdinandNiyongiraAVLTreeNode<E>)(node.left)).height);
	  }

	  /** Balance the nodes in the path from the specified
	   * node to the root if necessary
	   */
	  private void ferdinandNiyongiraBalancePath(E e) {
	    // Get all nodes from the specified element up to the root.
	    java.util.ArrayList<FerdinandNiyongiraTreeNode<E>> path = path(e);

	    // Process the path from the bottom node toward the root.
	    for (int i = path.size() - 1; i >= 0; i--) {
	      // A is the current node being checked for imbalance.
	    	FerdinandNiyongiraAVLTreeNode<E> A = (FerdinandNiyongiraAVLTreeNode<E>)(path.get(i));

	      // Recalculate A's height before checking its balance factor.
	    	ferdinandNiyongiraUpdateHeight(A);

	      // Find the parent of A. The root has no parent.
	      FerdinandNiyongiraAVLTreeNode<E> parentOfA = (A == root) ? null :
	        (FerdinandNiyongiraAVLTreeNode<E>)(path.get(i - 1));

	      // Determine which type of AVL rotation is needed.
	      switch (ferdinandNiyongiraBalanceFactor(A)) {
	        case -2:
	          // A is left-heavy. Check whether its left child is also left-heavy.
	          if (ferdinandNiyongiraBalanceFactor((FerdinandNiyongiraAVLTreeNode<E>)A.left) <= 0) {
	        	  ferdinandNiyongiraBalanceLL(A, parentOfA); // Perform LL rotation
	          }
	          else {
	            // A is left-heavy but its left child is right-heavy.
	        	  ferdinandNiyongiraBalanceLR(A, parentOfA); // Perform LR rotation
	          }
	          break;

	        case +2:
	          // A is right-heavy. Check whether its right child is also right-heavy.
	          if (ferdinandNiyongiraBalanceFactor((FerdinandNiyongiraAVLTreeNode<E>)A.right) >= 0) {
	        	  ferdinandNiyongiraBalanceRR(A, parentOfA); // Perform RR rotation
	          }
	          else {
	            // A is right-heavy but its right child is left-heavy.
	        	  ferdinandNiyongiraBalanceRL(A, parentOfA); // Perform RL rotation
	          }
	      }
	    }
	  }

	  /** Return the balance factor of the node */
	  private int ferdinandNiyongiraBalanceFactor(FerdinandNiyongiraAVLTreeNode<E> node) {
	    // A node with only a right subtree has a positive balance factor.
	    if (node.right == null) // node has no right subtree
	      return -node.height;

	    // A node with only a left subtree has a negative balance factor.
	    else if (node.left == null) // node has no left subtree
	      return +node.height;

	    // Balance factor = right subtree height - left subtree height.
	    else
	      return ((FerdinandNiyongiraAVLTreeNode<E>)node.right).height -
	        ((FerdinandNiyongiraAVLTreeNode<E>)node.left).height;
	  }

	  /** Balance LL (see Figure 26.3) */
	  private void ferdinandNiyongiraBalanceLL(FerdinandNiyongiraTreeNode<E> A, FerdinandNiyongiraTreeNode<E> parentOfA) {
	    // B becomes the new root of this subtree.
		  FerdinandNiyongiraTreeNode<E> B = A.left; // A is left-heavy and B is left-heavy

	    // If A was the root, B becomes the new root of the entire tree.
	    if (A == root) {
	      root = B;
	    }
	    else {
	      // Otherwise, connect B to A's former parent.
	      if (parentOfA.left == A) {
	        parentOfA.left = B;
	      }
	      else {
	        parentOfA.right = B;
	      }
	    }

	    // Move B's right subtree to become A's left subtree.
	    A.left = B.right; // Make T2 the left subtree of A

	    // Make A the right child of B.
	    B.right = A; // Make A the left child of B

	    // Recalculate the heights after the rotation.
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)A);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)B);
	  }

	  /** Balance LR (see Figure 26.5) */
	  private void ferdinandNiyongiraBalanceLR(FerdinandNiyongiraTreeNode<E> A, FerdinandNiyongiraTreeNode<E> parentOfA) {
	    // B is the left child of A.
		  FerdinandNiyongiraTreeNode<E> B = A.left; // A is left-heavy

	    // C is the right child of B and becomes the new subtree root.
		  FerdinandNiyongiraTreeNode<E> C = B.right; // B is right-heavy

	    // If A is the root, C becomes the new root.
	    if (A == root) {
	      root = C;
	    }
	    else {
	      // Otherwise, connect C to A's former parent.
	      if (parentOfA.left == A) {
	        parentOfA.left = C;
	      }
	      else {
	        parentOfA.right = C;
	      }
	    }

	    // Rearrange the subtrees during the double rotation.
	    A.left = C.right; // Make T3 the left subtree of A
	    B.right = C.left; // Make T2 the right subtree of B
	    C.left = B;
	    C.right = A;

	    // Adjust heights
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)A);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)B);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)C);
	  }

	  /** Balance RR (see Figure 26.4) */
	  private void ferdinandNiyongiraBalanceRR(FerdinandNiyongiraTreeNode<E> A, FerdinandNiyongiraTreeNode<E> parentOfA) {
	    // B becomes the new root of this subtree.
		  FerdinandNiyongiraTreeNode<E> B = A.right; // A is right-heavy and B is right-heavy

	    // If A is the root, B becomes the new root of the entire tree.
	    if (A == root) {
	      root = B;
	    }
	    else {
	      // Otherwise, connect B to A's former parent.
	      if (parentOfA.left == A) {
	        parentOfA.left = B;
	      }
	      else {
	        parentOfA.right = B;
	      }
	    }

	    // Move B's left subtree to become A's right subtree.
	    A.right = B.left; // Make T2 the right subtree of A

	    // Make A the left child of B.
	    B.left = A;

	    // Recalculate the heights after the rotation.
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)A);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)B);
	  }

	  /** Balance RL (see Figure 26.6) */
	  private void ferdinandNiyongiraBalanceRL(FerdinandNiyongiraTreeNode<E> A, FerdinandNiyongiraTreeNode<E> parentOfA) {
	    // B is the right child of A.
		  FerdinandNiyongiraTreeNode<E> B = A.right; // A is right-heavy

	    // C is the left child of B and becomes the new subtree root.
		  FerdinandNiyongiraTreeNode<E> C = B.left; // B is left-heavy

	    // If A is the root, C becomes the new root.
	    if (A == root) {
	      root = C;
	    }
	    else {
	      // Otherwise, connect C to A's former parent.
	      if (parentOfA.left == A) {
	        parentOfA.left = C;
	      }
	      else {
	        parentOfA.right = C;
	      }
	    }

	    // Rearrange the subtrees during the double rotation.
	    A.right = C.left; // Make T2 the right subtree of A
	    B.left = C.right; // Make T3 the left subtree of B
	    C.left = A;
	    C.right = B;

	    // Adjust heights after the rotation.
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)A);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)B);
	    ferdinandNiyongiraUpdateHeight((FerdinandNiyongiraAVLTreeNode<E>)C);
	  }
	  
	  /** Delete an element from the binary tree.
	   * Return true if the element is deleted successfully
	   * Return false if the element is not in the tree */
	  @Override 
	  public boolean ferdinandNiyongiraDelete(E element) {
	    // An empty tree cannot contain the element.
	    if (root == null)
	      return false; // Element is not in the tree

	    // Locate the node to be deleted and also locate its parent node
	    FerdinandNiyongiraTreeNode<E> parent = null;
	    FerdinandNiyongiraTreeNode<E> current = root;

	    // Search through the tree until the element is found or the search reaches null.
	    while (current != null) {
	      // Move to the left subtree if the element is smaller.
	      if (c.compare(element, current.element) < 0) {
	        parent = current;
	        current = current.left;
	      }
	      // Move to the right subtree if the element is larger.
	      else if (c.compare(element, current.element) > 0) {
	        parent = current;
	        current = current.right;
	      }
	      else
	        break; // Element is in the tree pointed by current
	    }

	    // The element was not found.
	    if (current == null)
	      return false; // Element is not in the tree

	    // Case 1: current has no left child
	    if (current.left == null) {
	      // Connect the parent with the right child of the current node
	      if (parent == null) {
	        // If there is no parent, current is the root.
	        root = current.right;
	      }
	      else {
	        // Connect the parent's appropriate child to current's right child.
	        if (c.compare(element, parent.element) < 0)
	          parent.left = current.right;
	        else
	          parent.right = current.right;

	        // Balance the tree if necessary
	        ferdinandNiyongiraBalancePath(parent.element);
	      }
	    }
	    else {
	      // Case 2: The current node has a left child
	      // Locate the rightmost node in the left subtree of
	      // the current node and also its parent
	    	FerdinandNiyongiraTreeNode<E> parentOfRightMost = current;
	    	FerdinandNiyongiraTreeNode<E> rightMost = current.left;

	      // Find the largest element in current's left subtree.
	      while (rightMost.right != null) {
	        parentOfRightMost = rightMost;
	        rightMost = rightMost.right; // Keep going to the right
	      }

	      // Replace the element in current by the element in rightMost
	      current.element = rightMost.element;

	      // Eliminate rightmost node
	      if (parentOfRightMost.right == rightMost)
	        parentOfRightMost.right = rightMost.left;
	      else
	        // Special case: parentOfRightMost is current
	        parentOfRightMost.left = rightMost.left;

	      // Balance the tree if necessary
	      ferdinandNiyongiraBalancePath(parentOfRightMost.element);
	    }

	    // Decrease the total number of elements after successful deletion.
	    size--;
	    return true; // Element deleted
	  }

	/** AVLTreeNode is TreeNode plus height */
	protected static class FerdinandNiyongiraAVLTreeNode<E> extends FerdinandNiyongiraBinarySearchTree.FerdinandNiyongiraTreeNode<E> {
	  protected int height = 0; // New data field

	  public FerdinandNiyongiraAVLTreeNode(E o) {
	    // Initialize the inherited TreeNode element.
	    super(o);
	  }
	}
}
