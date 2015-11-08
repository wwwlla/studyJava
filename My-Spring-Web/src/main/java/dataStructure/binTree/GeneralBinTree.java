package dataStructure.binTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

public class GeneralBinTree {
	
	public static<T> BinTreeNode<T> getTreeNode(List<T> list){
		BinTreeNode<T> root = null;
		if(list != null && list.size() > 0){
			root = getTreeNodeByIterator(list.iterator());
		}
		return root;
	}
	
	private static<T> BinTreeNode<T> getTreeNodeByIterator(Iterator<T> iterator){
		BinTreeNode<T> root = null;
		Queue<BinTreeNode<T>> queue = new LinkedList<BinTreeNode<T>>();
		if(iterator != null && iterator.hasNext()){
			root = new BinTreeNode<T>();
			root.setNode(iterator.next());
			queue.add(root);
			while(iterator.hasNext()){
				BinTreeNode<T> subRoot = queue.poll();
				BinTreeNode<T> subLeft = new BinTreeNode<T>();
				subLeft.setNode(iterator.next());
				subRoot.setLefTreeNode(subLeft);
				queue.add(subLeft);
				if(iterator.hasNext()){
					BinTreeNode<T> subRight = new BinTreeNode<T>();
					subRight.setNode(iterator.next());
					subRoot.setRightBinTreeNode(subRight);
					queue.add(subRight);
				}
			}
		}
		return root;
	}

}
