package dataStructure.binTree;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class TestDataStruct {
	public static void main(String[] args){
		BinTreeNode<Integer> binTree = new BinTreeNode<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<15;i++){
			list.add(i);
		}
		BinTreeNode<Integer> root = GeneralBinTree.getTreeNode(list);
		VisitBinTree.PreVisit(root);
		System.out.println("");
		VisitBinTree.PreVisitByStackOne(root);
		System.out.println("");
		VisitBinTree.PreVisitByStackTwo(root);
	}

}
