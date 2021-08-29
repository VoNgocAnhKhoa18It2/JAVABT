package Bai3;

import java.util.Collection;
import java.util.Scanner;

public class ChuongSach {
	private int thutuChuong;
	private String tieuDeChuong;
	private int soTrangChuong;
	
	public ChuongSach() {
		super();
	}

	public ChuongSach(int thutuChuong, String tieuDeChuong, int soTrangChuong) {
		super();
		this.thutuChuong = thutuChuong;
		this.tieuDeChuong = tieuDeChuong;
		this.soTrangChuong = soTrangChuong;
	}
	public int getThutuChuong() {
		return thutuChuong;
	}
	public void setThutuChuong(int thutuChuong) {
		this.thutuChuong = thutuChuong;
	}
	public String getTieuDeChuong() {
		return tieuDeChuong;
	}
	public void setTieuDeChuong(String tieuDeChuong) {
		this.tieuDeChuong = tieuDeChuong;
	}
	public int getSoTrangChuong() {
		return soTrangChuong;
	}
	public int setSoTrangChuong(int soTrangChuong) {
		return soTrangChuong;
	}
	@Override
	public String toString() {
		return "\n\t\t+Chuong: " + thutuChuong + "\n\t\t+Tieu De Chuong: " + tieuDeChuong + "\n\t\t+So Trang Chuong:"
				+ soTrangChuong ;
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap Tieu De Chuong: ");
		this.tieuDeChuong = scanner.nextLine();
		System.out.print("Nhap So Trang Chuong: ");
		this.soTrangChuong = Integer.parseInt(scanner.nextLine());
	}
}
