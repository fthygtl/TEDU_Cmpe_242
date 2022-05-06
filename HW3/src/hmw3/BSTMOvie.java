package hmw3;





public class BSTMOvie {

	
	private class Node {

		Movie key;
		

		Node leftChild;
		Node rightChild;

		Node(Movie key) {

			this.key = key;
			
		}

		public String toString() {

			return   key.toString();

			/*
			 * return name + " has the key " + key + "\nLeft Child: " + leftChild +
			 * "\nRight Child: " + rightChild + "\n";
			 */

		}

	}

	
	
	
	
	
	
	
	
	
	
	Node root;

	public void addNode(Movie key) {

		// Create a new Node and initialize it

		Node newNode = new Node(key);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			// Future parent for our new Node

			Node parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node

				if (key.compareTo(focusNode.key)==1) {

					// Switch focus to the left child

					focusNode = focusNode.leftChild;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.leftChild = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightChild;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.rightChild = newNode;
						return; // All Done

					}

				}

			}
		}

	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public static void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

	public static void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public static void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}

	public Node findNode(Movie key) {

		// Start at the top of the tree

		Node focusNode = root;

		// While we haven't found the Node
		// keep looking

		while ( focusNode.key.compareTo(key)!=-1) {

			// If we should search to the left

			if (key.compareTo(focusNode.key)==-1) {

				// Shift the focus Node to the left child

				focusNode = focusNode.leftChild;

			} else {

				// Shift the focus Node to the right child

				focusNode = focusNode.rightChild;

			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}

	public void printall() {
		
		Node f = root;
		
		 inOrderTraverseTree(f);
		
		
		
		
		
	}

	public Movie find1( String a) {
		Node a2 =root;

		Node focusNode = root;
		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			Node a1=null;
			if(focusNode.key.getTitle().equalsIgnoreCase(a)) {
				a2=focusNode;
				a1=a2;
				
			}

		}


				return a2.key;

	}
	
	
	
	
	
	
	
	public void finddirector(Persons a) {
		Node focusNode = root;
		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			Node a1 = focusNode;
			if(a1.key.getDirector().getFname().equals(a.getFname())&&a1.key.getDirector().getLname().equals(a.getLname())) {
			        System.out.println(a1.key.getTitle());    
			}

		}

	}
	
	public void showm(int a) {
		
		Node focusNode = root;
		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			Node a1 = focusNode;
			
			if(a1.key.getYear()==a) {
		System.out.println(focusNode);		
				
			}
		}
	}
	
	
public void showm2(int a,int b) {
		
		Node focusNode = root;
		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			Node a1 = focusNode;
			
			if(a1.key.getYear()<=b && a1.key.getYear()>=a) {
		System.out.println(focusNode);		
				
			}
		}
	}
	
	
	public boolean remove(Movie key) {
	
		 
	
		        // Start at the top of the tree
	
		 
	
		        Node focusNode = root;
	
		        Node parent = root;
	
		 
		
		        // When searching for a Node this will
		
		        // tell us whether to search to the
	
		        // right or left
		
		 
		
		        boolean isItALeftChild = true;
	
		
		        // While we haven't found the Node
		
		        // keep looking
		
		 
		
		        while (focusNode.key != key) {
		
		 
	
		            parent = focusNode;
		
		 
		
		            // If we should search to the left
		
		 
	
		            if (key.compareTo(focusNode.key)==1) {
		
		 
		
		                isItALeftChild = true;
	
		 
	             // Shift the focus Node to the left child
	
		 
		
		                focusNode = focusNode.leftChild;
		
		 
	
		            } else {
	
		 
	
		                // Greater than focus node so go to the right
		
		 
		
		                isItALeftChild = false;
	
		 
		
		                // Shift the focus Node to the right child
		
		 
		
		                focusNode = focusNode.rightChild;
		
		 
		
		            }
		
		 
		
		            // The node wasn't found
		
		 
		
		            if (focusNode == null)
		
		                return false;
		
		 
		
		        }
		
		 
		
		        // If Node doesn't have children delete it
	
		 
		
		        if (focusNode.leftChild == null && focusNode.rightChild == null) {
		
		 
		
		            // If root delete it
		
		 
		
		            if (focusNode == root)
		
		                root = null;
		
		 
		
		            // If it was marked as a left child
		
		            // of the parent delete it in its parent
		
		 
		
		            else if (isItALeftChild)
		
		                parent.leftChild = null;
		
		 
	
		            // Vice versa for the right child
		
		 
		
		            else
		
		                parent.rightChild = null;
		
		 
		
		        }
		
		
	
		        // If no right child
		
		 
		
		        else if (focusNode.rightChild == null) {
		
		 
		
		            if (focusNode == root)
	
		                root = focusNode.leftChild;
		
		 
		
		            // If focus Node was on the left of parent
		
		            // move the focus Nodes left child up to the
		
		            // parent node
		
		 
		
		            else if (isItALeftChild)
		
		                parent.leftChild = focusNode.leftChild;
		
		 
		
		            // Vice versa for the right child
		
		 
		
		            else
		
		                parent.rightChild = focusNode.leftChild;
		
		 
		
		        }
		
		 
		
		        // If no left child
		
		 
		
		        else if (focusNode.leftChild == null) {
		
		 
		
		            if (focusNode == root)
		
		                root = focusNode.rightChild;
		
		 
		
		            // If focus Node was on the left of parent
		
		            // move the focus Nodes right child up to the
	
		            // parent node
		
		 
		
		            else if (isItALeftChild)
	
		                parent.leftChild = focusNode.rightChild;
		
		
		            // Vice versa for the left child
		
		 
		
		            else
		
		                parent.rightChild = focusNode.rightChild;
		
		 
		
		        }
		
		 
		
		        // Two children so I need to find the deleted nodes
		
		        // replacement
		
		 
		
		        else {
		
		 
		
		            Node replacement = getReplacementNode(focusNode);
		
		 
	
		            // If the focusNode is root replace root
		
		            // with the replacement
		
		 
		
		            if (focusNode == root)
		
		                root = replacement;
		
		
		
		            // If the deleted node was a left child
		
		            // make the replacement the left child
		
		 
		
		            else if (isItALeftChild)
		
		                parent.leftChild = replacement;
		
		 
		
		            // Vice versa if it was a right child
		
		 
		
		            else
		
		                parent.rightChild = replacement;
		
		 
		
		            replacement.leftChild = focusNode.leftChild;
		
		 
		
		        }
	
		 
		
		        return true;
		
		 
		
		    }
		
		 
		public Node getReplacementNode(Node replacedNode) {
		
		 
		
		        Node replacementParent = replacedNode;
		
		        Node replacement = replacedNode;
		
		 
		
		        Node focusNode = replacedNode.rightChild;
		
		 
		
		        // While there are no more left children
		
		 
		
		        while (focusNode != null) {
		
		 
		
		            replacementParent = replacement;
		
		 
		
		            replacement = focusNode;
		
		 
		
		            focusNode = focusNode.leftChild;
		
		 
		
		        }
		
		 
		
		        // If the replacement isn't the right child
	
		        // move the replacement into the parents
		
		        // leftChild slot and move the replaced nodes
		
		        // right child into the replacements rightChild
		
		 
	
		        if (replacement != replacedNode.rightChild) {
		
		 
		
		            replacementParent.leftChild = replacement.rightChild;
		
		            replacement.rightChild = replacedNode.rightChild;
		
		 
		
		        }
		
		 
		
		        return replacement;
		
		 
		
		    }

	
	
	
	

}

