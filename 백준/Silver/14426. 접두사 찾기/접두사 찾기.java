import java.util.HashMap;
import java.util.Scanner;


class Node {
	HashMap<Character, Node> next;
	boolean isEnd;
	
	public Node() {
		this.next = new HashMap<>();
		this.isEnd = false;
	}
}

class Trie {
	Node root;
	
	public Trie() {
		this.root = new Node();
	}
	
	public void insert(String str) {
		Node cur = this.root;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			cur.next.putIfAbsent(c, new Node());
			cur = cur.next.get(c);
			
			if (i == str.length() - 1) {
				cur.isEnd = true;
				return;
			}
		}
	}
}

public class Main {
	public static boolean search (Trie trie, String prefix) {
		Node cur = trie.root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			if (cur.next.get(c) == null) {
				return false;
			}
			cur = cur.next.get(c);
		}
		return true;
	}
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int m = scanner.nextInt();
		Trie trie = new Trie();
    	int cnt = 0;
    	scanner.nextLine();
    	
    	for (int i = 0; i < n; i++) {
    		trie.insert(scanner.nextLine());
    	}
    	
    	for (int i = 0; i < m; i++) {
    		cnt += search(trie, scanner.nextLine()) ? 1 : 0;
    	}
    	System.out.println(cnt);
	}
}
