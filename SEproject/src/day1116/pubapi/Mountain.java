package day1116.pubapi;

public class Mountain {
	/*멤버변수로는 오픈 데이터 포털의 산정보에 있는 모든 데이터를 다 담기엔 너무 많으니 원하는것만 골라 담음*/
	
	private int mntnid; //산의 고유 코드
	private String mntnnm; //산 이름을 담게될 변수
	private String mntninfopoflc; //산정보소재지(소재지)
	private String mntninfohght; //산 높이
	
	public int getMntnid() {
		return mntnid;
	}
	public void setMntnid(int mntnid) {
		this.mntnid = mntnid;
	}
	public String getMntnnm() {
		return mntnnm;
	}
	public void setMntnnm(String mntnnm) {
		this.mntnnm = mntnnm;
	}
	public String getMntninfopoflc() {
		return mntninfopoflc;
	}
	public void setMntninfopoflc(String mntninfopoflc) {
		this.mntninfopoflc = mntninfopoflc;
	}
	public String getMntninfohght() {
		return mntninfohght;
	}
	public void setMntninfohght(String mntninfohght) {
		this.mntninfohght = mntninfohght;
	}
	
	
}
