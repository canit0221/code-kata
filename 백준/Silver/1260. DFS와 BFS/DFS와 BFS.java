
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int V, E, start;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt();
		E = sc.nextInt();
		start = sc.nextInt();

		adjList = new ArrayList[V + 1];
		for (int i = 1; i < V + 1; i++) {
			adjList[i] = new ArrayList<>();
		} // 초기화

		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();

			adjList[s].add(e);
			adjList[e].add(s);
		}

		for (int i = 1; i < V + 1; i++) {
			Collections.sort(adjList[i]);
		}

		visited = new boolean[V + 1];
		dfs(start);
		System.out.println();
		visited = new boolean[V + 1];
		bfs(start);
		System.out.println();

	}

	static void dfs(int v) {
		System.out.print(v + " ");
		visited[v] = true;

		for (int w : adjList[v]) {
			if (!visited[w]) {
				dfs(w);
			}
		}
	}

	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		visited[v] = true;

		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			for (int w : adjList[curr]) {
				if (!visited[w]) {
					visited[w] = true;
					q.add(w);
				}
			}
		}
	}

}
