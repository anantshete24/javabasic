package com.example;

import com.example.Tree.Color;

public class FancyVisitor extends TreeVis{

	 private int sumEvenDepthNonLeaf = 0;
	    private int sumGreenLeaf = 0;

	    @Override
	    public int getResult() {
	        return Math.abs(sumEvenDepthNonLeaf - sumGreenLeaf);
	    }

	    @Override
	    public void visitNode(TreeNode node) {
	        if (node.getDepth() % 2 == 0) {
	            sumEvenDepthNonLeaf += node.getValue();
	        }
	    }

	    @Override
	    public void visitLeaf(TreeLeaf leaf) {
	        if (leaf.getColor() == Color.GREEN) {
	            sumGreenLeaf += leaf.getValue();
	        }
	    }
}
