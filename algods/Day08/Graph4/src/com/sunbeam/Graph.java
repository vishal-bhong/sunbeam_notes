package com.sunbeam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	static class Adjacent{
		private int v;
		private int wt;
		public Adjacent(int v, int wt) {
			this.v = v;
			this.wt = wt;
		}
	}
	
	private int vertexCount, edgeCount;
	private List<Adjacent> adjlist[];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjlist = new List[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			adjlist[i] = new LinkedList<Adjacent>();
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges(src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjlist[src].add(new Adjacent(dest, wt));
			adjlist[dest].add(new Adjacent(src, wt));		// in case of directed graph, comment this line
		}
	}
	
	public void print() {
		System.out.println("Graph :: ");
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print(i + "->");
			for(Adjacent j : adjlist[i]) {
				System.out.print(" " + j.v + "(" + j.wt + ")");
			}
			System.out.println("");
		}
	}
}









