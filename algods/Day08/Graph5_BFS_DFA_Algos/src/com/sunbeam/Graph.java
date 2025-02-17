package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private int vertexCount, edgeCount;
	private boolean adjmat[][];
	
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new boolean[vertexCount][vertexCount];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges : (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = true;
			adjmat[dest][src] = true;			// comment this line for directed graph
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int u = 0 ; u < vertexCount ; u++) {
			for(int v = 0 ; v < vertexCount ; v++) {
				System.out.print(adjmat[u][v] ? " 1" : " 0");
			}
			System.out.println("");
		}
	}
	
	public void DFSTraversal(int start) {
		//0. create stack to push vertices
		Stack<Integer> st = new Stack<Integer>();
		//0. create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. --- start
		//2. Push start vertex on stack & mark it.
		st.push(start);
		marked[start] = true;
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			//3. Pop vertex from stack.
			int u = st.pop();
			//4. Print the vertex. 
			System.out.print(" " + u);
			//5. Put all non-visited neighbours of the vertex on the stack and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjmat[u][v]) {
					st.push(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}
	
	public void BFSTraversal(int start) {
		//0. create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		//0. create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];		
		//1. Choose a vertex as start vertex. -- start
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			//3. Pop vertex from queue. 
			int u = q.poll();
			//4. Print the vertex. 
			System.out.print(" " + u);
			//5. Put all non-visited neighbours of the vertex on the queue and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjmat[u][v]) {
					q.offer(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}
	
	public void singleSourcePathLength(int start) {
		//0. create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		//0. create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Create path length array to keep length of vertex from start vertex.
		int length[] = new int[vertexCount];
		//2. push start on queue & mark it and update length = 0.
		q.offer(start);
		marked[start] = true;
		length[start] = 0;
		System.out.print("Single Source Path length tree : ");
		while(!q.isEmpty()) {
			//3. pop the vertex. 
			int u = q.poll();
			//4. push all its non-marked neighbors on the queue, mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjmat[u][v]) {
					q.offer(v);
					marked[v] = true;
					//5. For each such vertex calculate length as length[neighbor] = length[current] + 1 
					length[v] = length[u] + 1; 
					//6. print current vertex to that neighbor vertex edge. 
					System.out.print( "(" + u + "," + v + ")");
				}
			}
		}//7. repeat steps 3-6 until queue is empty.
		System.out.println("\nPath length of each vertex from " + start);
		//8. Print path length array.
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.println(start + " -> " + i + ":" + length[i]);
		}
	}
	
	public void DFSSpanningTree(int start) {
		//0. create stack to push vertices
		Stack<Integer> st = new Stack<Integer>();
		//0. create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. --- start
		//2. Push start vertex on stack & mark it.
		st.push(start);
		marked[start] = true;
		System.out.print("DFS Spanning tree : ");
		while(!st.isEmpty()) {
			//3. Pop vertex from stack.
			int u = st.pop();
			//5. Put all non-visited neighbours of the vertex on the stack and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjmat[u][v]) {
					st.push(v);
					marked[v] = true;
					System.out.print("(" + u + "," + v + ")");
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}
	
	public void BFSSpanningTree(int start) {
		//0. create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		//0. create an array to mark vertices
		boolean marked[] = new boolean[vertexCount];		
		//1. Choose a vertex as start vertex. -- start
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		System.out.print("BFS Spanning tree : ");
		while(!q.isEmpty()) {
			//3. Pop vertex from queue. 
			int u = q.poll();
			//5. Put all non-visited neighbours of the vertex on the queue and mark them. 
			for(int v = 0 ; v < vertexCount ; v++) {
				if(!marked[v] && adjmat[u][v]) {
					q.offer(v);
					marked[v] = true;
					System.out.print("(" + u + "," + v + ")");
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}
	
}
















