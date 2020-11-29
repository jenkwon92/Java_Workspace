/*
 	글씨 크기 조절 ctrl + +
 	window > Preferences >General > Appearance > colors and Fonts >Basic > TextFont >Verdana 
 	단축키 모두 보기 ctrl+shifth +L
	자동임포트 : 해당 클래스에 커서 올려놓고 ctrl+shift+ o
	자동 코드정렬 : ctrl+shift +F
	해당객체의 api문서 바로가기 : 해당 클래스 커서 올린 후 shift+ F2
	자동완성 ctrl+space
	출력: sout이라는 단축단어 입력과 동시에 strl+space	
	블럭지정 후 Alt누르고 방향키 누르면 코드블럭 이동
	복사 ctrl+Alt+방향
 */
package day1027.gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RadioTest extends Frame{
	CheckboxGroup group;
	
	
	public RadioTest() {
		group = new CheckboxGroup();
		setLayout(new FlowLayout());
		this.add(new Checkbox("운동", group, false));
		this.add(new Checkbox("독서", group, false));
		this.add(new Checkbox("컴퓨터", group, false));
		this.add(new Checkbox("요리", group, false));
		this.add(new Checkbox("애견돌보기", group, true));
		
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("겁나빠름");
		new RadioTest();
	}

}
