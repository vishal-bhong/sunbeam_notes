package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount, edgeCount;
	private int adjmat[][];
	
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new int[vertexCount][vertexCount];
		for(int u = 0 ; u < vertexCount ; u++)
			for(int v = 0 ; v < vertexCount ; v++)
				adjmat[u][v] = INF;
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjmat[src][dest] = wt;
			adjmat[dest][src] = wt;			// comment this line for directed graph
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			for(int v = 0 ; v < vertexCount ; v++) {
				System.out.print(" " + adjmat[u][v]);
			}
			System.out.println("");
		}
	}
	
	public int findMinKeyVertex(int keys[], boolean mst[]) {
		int minKey = INF, minKeyVertex = -1;
		for(int i = 0 ; i < vertexCount ; i++) {
			if(!mst[i] && keys[i] < minKey) {
				minKey = keys[i];
				minKeyVertex = i;
			}
		}
		return minKeyVertex;
	}
	
	public void primsMST(int start) {
		//1. create arrays to maintain MST, parent and key of every vertex
		boolean mst[] = new boolean[vertexCount];
		int parents[] = new int[vertexCount];
		int keys[]	= new int[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			mst[i] = false;
			parents[i] = -1;
			keys[i] = INF;
		}
		//2. mark key of start vertex equal to 0
		keys[start] = 0;
		//3. Repeat till all vertices are not added into MST
		int count = 0;
		while(count < vertexCount) {
			//4. choose minimum key vertex
			int u = findMinKeyVertex(keys, mst);
			//5. add vertex into MST
			mst[u] = true;
			//6. increment count
			count++;
			//7. update key and parent of all adjacent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!mst[v] && adjmat[u][v] != INF && adjmat[u][v] < keys[v]) {
					keys[v] = adjmat[u][v];
					parents[v] = u;
				}
			}
		}	
		//8. print MST and find wt
		int wt = 0;
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print("(" + parents[i] + "," + i + ")");
			wt += keys[i];
		}
		System.out.println("\nWeight = " + wt);		
	}
	
}
















