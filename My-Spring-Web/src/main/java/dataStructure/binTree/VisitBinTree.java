package dataStructure.binTree;

import java.util.LinkedList;
import java.util.Stack;

public class VisitBinTree {
	
	/**
	 * 栈中可能保存null，始终由栈保存所有未访问的信息
	 * @param root
	 */
	public static<T> void MiddleVisitByStackOne(BinTreeNode<T> root){
		Stack<BinTreeNode<T>> stack = new Stack<BinTreeNode<T>>();
		BinTreeNode<T> p = root;
		if(root != null){
			stack.push(root);
			while(!stack.isEmpty()){
				while(p != null){
					p = p.getLefTreeNode();
					stack.push(p);
				}
				p = stack.pop();
				if(p != null){
					visit(p);
					p = p.getRightBinTreeNode();
					stack.push(p);
				}
			}
		}
	}
	
	/**
	 * 由p和栈共同保存未访问信息
	 * @param root
	 */
	public static<T> void MiddleVisitByStackTwo(BinTreeNode<T> root){
		Stack<BinTreeNode<T>> stack = new Stack<BinTreeNode<T>>();
		BinTreeNode<T> p = root;
		while(p != null || !stack.isEmpty()){
			if(p != null){
				stack.push(p);
				p = p.getLefTreeNode();
			}else{
				p = stack.pop();
				visit(p);
				p = p.getRightBinTreeNode();
			}
		}
	}
	
	public static<T> void PreVisitByStackTwo(BinTreeNode<T> root){
		BinTreeNode<T> p = root;
		if(root != null){
			Stack<BinTreeNode<T>> stack = new Stack<BinTreeNode<T>>();
			while(p != null || !stack.isEmpty()){
				if(p != null){
					visit(p);
					stack.push(p);
					p = p.getLefTreeNode();
				}else{
					p = stack.pop();
					p = p.getRightBinTreeNode();
				}
			}
		}
	}
	
	public static<T> void PreVisitByStackOne(BinTreeNode<T> root){
		if(root != null){
			BinTreeNode<T> p = root;
			Stack<BinTreeNode<T>> stack = new Stack<BinTreeNode<T>>();
			stack.push(root);
			while(!stack.isEmpty()){
				while(p != null){
					visit(p);
					p = p.getLefTreeNode();
					stack.push(p);
				}
				p = stack.pop();
				if(p != null){
					p = p.getRightBinTreeNode();
					stack.push(p);
				}
			}
		}
	}
	
	public static<T> void PostVisitByStackTwo(BinTreeNode<T> root){
		
	}
	
	public static<T> void PreVisit(BinTreeNode<T> root){
		if(root != null){
			System.out.println(root.getNode());
			PreVisit(root.getLefTreeNode());
			PreVisit(root.getRightBinTreeNode());
		}
	}
	
	public static<T> void MiddileVisit(BinTreeNode<T> root){
		if(root != null){
			MiddileVisit(root.getLefTreeNode());
			System.out.println(root.getNode());
			MiddileVisit(root.getRightBinTreeNode());
		}
	}
	
	public static<T> void PostVisit(BinTreeNode<T> root){
		if(root != null){
			PostVisit(root.getLefTreeNode());
			PostVisit(root.getRightBinTreeNode());
			System.out.println(root.getNode());
		}
	}
	
	private static<T> void visit(BinTreeNode<T> node){
		if(node != null){
			System.out.println(node.getNode());
		}
	}

}
