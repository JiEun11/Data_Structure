package vo;

public class ProductVO {
	private int appleCnt;
	private int halabongCnt;
	private int bananaCnt;
	
	public int getAppleCnt() {
		return appleCnt;
	}
	public void setAppleCnt(int appleCnt) {
		this.appleCnt += appleCnt;
	}
	
	public int getHalabongCnt() {
		return halabongCnt;
	}
	public void setHalabongCnt(int halabongCnt) {
		this.halabongCnt += halabongCnt;
	}
	
	public int getBananaCnt() {
		return bananaCnt;
	}
	public void setBananaCnt(int bananaCnt) {
		this.bananaCnt += bananaCnt; //기존 값에 누적시켜라
	}
	
	
}
