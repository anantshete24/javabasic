package com.example;

import com.example.Tree.Color;

public class ProductRedNodesVisitor extends TreeVis {
	private static final int MOD = 1000000007;
    private long product = 1;

    @Override
    public int getResult() {
        return (int) product;
    }

    @Override
    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product = (product * node.getValue()) % MOD;
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product = (product * leaf.getValue()) % MOD;
        }
    }
}
