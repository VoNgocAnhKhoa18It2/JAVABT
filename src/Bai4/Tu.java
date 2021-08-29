package Bai4;

import java.util.Scanner;

public class Tu extends SanPham implements NhapVaXuat{
	private String guongSoi;
	private String loaiGo;
	
	public Tu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tu(String guongSoi, String loaiGo) {
		super();
		this.guongSoi = guongSoi;
		this.loaiGo = loaiGo;
	}

	public String getGuongSoi() {
		return guongSoi;
	}
	public void setGuongSoi(String guongSoi) {
		this.guongSoi = guongSoi;
	}
	public String getLoaiGo() {
		return loaiGo;
	}
	public void setLoaiGo(String loaiGo) {
		this.loaiGo = loaiGo;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Nhap Thong Tin Tu--------");
		System.out.print("Nhap Chieu Cao: ");
		setChieuCao(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Rong: ");
		setChieuRong(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Dai: ");
		setChieuDai(Integer.parseInt(sc.nextLine()));
		System.out.print("Guong Soi (Co hay Khong): ");
		this.guongSoi = sc.nextLine();
		System.out.print("Nhap Loai Go: ");
		this.loaiGo = sc.nextLine();
		System.out.print("Nhap Gia Tien: ");
		setGiaTien(Integer.parseInt(sc.nextLine()));
	}

	@Override
	public void xuatThongTin() {
		System.out.println("--------Thong Tin Tu--------");
		System.out.println("Chieu Cao: " + getChieuCao() + "\tChieu Rong: " + getChieuRong());
		System.out.println("Chieu Dai: " + getChieuDai() + "\tGuong Soi: " + this.guongSoi);
		System.out.println("Loai Go: " + this.loaiGo + "\tGia Tien: " + getGiaTien());
	}
	
	
}
