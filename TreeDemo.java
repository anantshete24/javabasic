package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.example.Tree.Color;

public class TreeDemo {

	public static Tree Solve()
	{
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		
		int[] values= new int [n];
		
		for(int i=0;i<n;i++)
		{
			values[i]=scan.nextInt();
		}
		
		Color[] colors=new Color[n];
		
		for(int i=0;i<n;i++)
		{
			colors[i]=scan.nextInt() ==0? Color.RED: Color.GREEN;
		}
		
		Map <Integer, List<Integer>> edges=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			int u=scan.nextInt() -1;
			int v =scan.nextInt()-1;
			
			edges.computeIfAbsent(u, k-> new ArrayList<>()).add(v);
			edges.computeIfAbsent(v, k->new ArrayList<>()).add(u);
		}
		scan.close();
		return buildTree(0,-1,0,values, colors, edges);
	}
	
	private static Tree buildTree(int node, int parent, int depth, int [] values,Color[] colors,Map <Integer, List<Integer>> edges)
	{
		List<Integer>children=edges.getOrDefault(node, new ArrayList<>());
		if(children.size()==1 && children.contains(parent))
		{
			return new TreeLeaf(values[node], colors[node],depth);
		}
		
		TreeNode treeNode=new TreeNode(values[node],colors[node],depth);
		
		for(int child:children)
		{
			if(child!=parent)
			{
				treeNode.addChild(buildTree(child,node,depth+1,values, colors,edges));
			}
		}
		
		return treeNode;
	}
}
