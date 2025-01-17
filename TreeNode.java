package com.example;

import java.util.ArrayList;
import java.util.List;

public class TreeNode extends Tree{
	   private final List<Tree> children = new ArrayList<>();

	    public TreeNode(int value, Color color, int depth) {
	        super(value, color, depth);
	    }

	    public void addChild(Tree child) {
	        children.add(child);
	    }

	    public List<Tree> getChildren() {
	        return children;
	    }

	    @Override
	    public void accept(TreeVis visitor) {
	        visitor.visitNode(this);
	        for (Tree child : children) {
	            child.accept(visitor);
	        }
	    }
}
