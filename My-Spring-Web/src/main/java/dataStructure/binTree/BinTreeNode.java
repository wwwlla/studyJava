package dataStructure.binTree;

public class BinTreeNode<T> {
	private T node;
	private BinTreeNode<T> lefTreeNode;
	private BinTreeNode<T> rightBinTreeNode;
	public T getNode() {
		return node;
	}
	public void setNode(T node) {
		this.node = node;
	}
	public BinTreeNode<T> getLefTreeNode() {
		return lefTreeNode;
	}
	public void setLefTreeNode(BinTreeNode<T> lefTreeNode) {
		this.lefTreeNode = lefTreeNode;
	}
	public BinTreeNode<T> getRightBinTreeNode() {
		return rightBinTreeNode;
	}
	public void setRightBinTreeNode(BinTreeNode<T> rightBinTreeNode) {
		this.rightBinTreeNode = rightBinTreeNode;
	}
	
	

}
