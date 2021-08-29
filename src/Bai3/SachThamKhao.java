package Bai3;

import java.util.ArrayList;
import java.util.Arrays;

public class SachThamKhao extends AnPham{
	private String linhVuc;
	private ArrayList<ChuongSach> chuongSach;
	
	public SachThamKhao(String linhVuc, ArrayList<ChuongSach> chuongSach) {
		super();
		this.linhVuc = linhVuc;
		this.chuongSach = chuongSach;
	}
	public SachThamKhao() {
		super();
	}
	public String getLinhVuc() {
		return linhVuc;
	}
	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}
	public ArrayList<ChuongSach> getChuongSach() {
		return chuongSach;
	}
	public void setChuongSach(ArrayList<ChuongSach> chuongSach) {
		this.chuongSach = chuongSach;
	}
	@Override
	public String toString() {
		return "SachThamKhao: Linh Vuc: " + linhVuc + ", chuongSach: " + chuongSach + "";
	}

}
