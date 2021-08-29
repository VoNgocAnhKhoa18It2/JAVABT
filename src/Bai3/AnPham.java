package Bai3;

import java.util.Scanner;

public class AnPham  implements Comparable<AnPham>{
	private String tieuDe,namXb,tacGia;
	private int soTrang,giaTien;
	
	public AnPham() {
		super();
	}
	
	public AnPham(String tieuDe, String namXb, String tacGia, int soTrang, int giaTien) {
		super();
		this.tieuDe = tieuDe;
		this.namXb = namXb;
		this.tacGia = tacGia;
		this.soTrang = soTrang;
		this.giaTien = giaTien;
	}

	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNamXb() {
		return namXb;
	}
	public void setNamXb(String namXb) {
		this.namXb = namXb;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

	@Override
	public int compareTo(AnPham o) {
		return this.tieuDe.compareTo(o.getTieuDe());
	}
//	public int compareTo(AnPham ok) {
//		return this.namXb.compareTo(ok.getNamXb());
//	}
		
}
