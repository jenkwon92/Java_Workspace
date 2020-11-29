package day1116.pubapi;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class MountainModel extends AbstractTableModel {
	/*벡터는 컬렉션 프레임웍이니 배열처럼 생성시 크기를 명시하지 않아도됨 유연함*/
	Vector<Mountain> data = new Vector<Mountain>();
	
	// 컬럼 제목 정보를 담는 벡터
	Vector <String> columnName = new Vector<String>();
	
	//컬럼 제목을 구성할 벡터 요소는 생성자에서 채움
	public MountainModel() {
		columnName.add("아이디"); //산 아이디
		columnName.add("산이름"); //산 이름
		columnName.add("소재지"); //산 소재지
		columnName.add("높이"); //산 높이
	}
	//레코드의 수는 백터의 길이에서 가져오면 됨
	public int getRowCount() {
		return data.size();
	}
	//컬럼의 수는 백터의 길이에서 가져오면됨
	public int getColumnCount() {
		return columnName.size();
	}
	public String getColumnName(int col) {
		return columnName.get(col); //배얼이 아니므로, get(인덱스) 로 가져와야함
	}
	
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}
	

}
