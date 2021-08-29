package Bai4;

public class SanPham {
	private int chieuCao;
	private int chieuRong;
	private int chieuDai;
	private int giaTien;
	
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SanPham(int chieuCao, int chieuRong, int chieuDai, int giaTien) {
		super();
		this.chieuCao = chieuCao;
		this.chieuRong = chieuRong;
		this.chieuDai = chieuDai;
		this.giaTien = giaTien;
	}
	
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public int getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
}
