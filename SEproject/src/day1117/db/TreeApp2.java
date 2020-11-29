/*데이터간 포함관계를 표현할때 흔히 사용되는 Tree를 배워보자*/
package day1117.db;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeApp2 extends JFrame {
	JTree tree;
	JScrollPane scroll;

	public TreeApp2() {
		// 트리에 보여질 노드를 구성해보자
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("상품정보");
		DefaultMutableTreeNode accessory = new DefaultMutableTreeNode("액세서리");
		DefaultMutableTreeNode shoes = new DefaultMutableTreeNode("신발");
		
		
		createNode1(accessory);
		createNode2(shoes);
		
		tree = new JTree(top); // 이따가 여기에 노드를 생성자 인수로 넣어줄 예정
		top.add(accessory);
		top.add(shoes);
		scroll = new JScrollPane(tree);

		add(scroll);

		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public void createNode1(DefaultMutableTreeNode accessory) {
		// 넘겨받은 탑 노드에 원하는 하위 노드를 생성하여 자식노드로 붙이자
		DefaultMutableTreeNode[] node = new DefaultMutableTreeNode[4];
		node[0] = new DefaultMutableTreeNode("반지");
		node[1] = new DefaultMutableTreeNode("목걸이");
		node[2] = new DefaultMutableTreeNode("귀걸이");
		node[3] = new DefaultMutableTreeNode("팔찌");

		// 생성된 노드를 top노드의 하위노드로 부착!
		for (DefaultMutableTreeNode obj : node) {
			accessory.add(obj);
		}
	}
	
	public void createNode2(DefaultMutableTreeNode shoes) {
		// 넘겨받은 탑 노드에 원하는 하위 노드를 생성하여 자식노드로 붙이자
		DefaultMutableTreeNode[] node = new DefaultMutableTreeNode[4];
		node[0] = new DefaultMutableTreeNode("반지");
		node[1] = new DefaultMutableTreeNode("목걸이");
		node[2] = new DefaultMutableTreeNode("귀걸이");
		node[3] = new DefaultMutableTreeNode("팔찌");

		// 생성된 노드를 top노드의 하위노드로 부착!
		for (DefaultMutableTreeNode obj : node) {
			shoes.add(obj);
		}
	}

	public static void main(String[] args) {
		new TreeApp2();
	}
}
