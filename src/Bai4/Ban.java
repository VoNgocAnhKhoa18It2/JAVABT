package Bai4;

import java.util.Scanner;

public class Ban extends SanPham implements NhapVaXuat{
	private String hocTu;
	private String loaiGo;
	
	public Ban() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ban( String hocTu, String loaiGo) {
		super();
		this.hocTu = hocTu;
		this.loaiGo = loaiGo;
	}
	public String isHocTu() {
		return hocTu;
	}
	public void setHocTu(String hocTu) {
		this.hocTu = hocTu;
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
		System.out.println("--------Nhap Thong Tin Ban--------");
		System.out.print("Nhap Chieu Cao: ");
		setChieuCao(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Rong: ");
		setChieuRong(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Dai: ");
		setChieuDai(Integer.parseInt(sc.nextLine()));
		System.out.print("Hoc Tu (Co hay Khong): ");
		this.hocTu = sc.nextLine();
		System.out.print("Nhap Loai Go: ");
		this.loaiGo = sc.nextLine();
		System.out.print("Nhap Gia Tien: ");
		setGiaTien(Integer.parseInt(sc.nextLine()));
	}

	@Override
	public void xuatThongTin() {
		System.out.println("--------Thong Tin Ban--------");
		System.out.println("Chieu Cao: " + getChieuCao() + "\tChieu Rong: " + getChieuRong());
		System.out.println("Chieu Dai: " + getChieuDai() + "\tHoc Tu: " + this.hocTu);
		System.out.println("Loai Go: " + this.loaiGo + "\tGia Tien: " + getGiaTien());
	}
	
}
