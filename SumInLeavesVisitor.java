package com.example;

public class SumInLeavesVisitor extends TreeVis{
	 private int sum = 0;

	    @Override
	    public int getResult() {
	        return sum;
	    }

	    @Override
	    public void visitNode(TreeNode node) {
	        // Do nothing
	    }

	    @Override
	    public void visitLeaf(TreeLeaf leaf) {
	        sum += leaf.getValue();
	    }
}
