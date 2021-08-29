package Bai4;

import java.util.Scanner;

public class Ghe extends SanPham implements NhapVaXuat{
	
	public Ghe() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Nhap Thong Tin Ghe--------");
		System.out.print("Nhap Chieu Cao: ");
		setChieuCao(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Rong: ");
		setChieuRong(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Chieu Dai: ");
		setChieuDai(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhap Gia Tien: ");
		setGiaTien(Integer.parseInt(sc.nextLine()));
	}

	@Override
	public void xuatThongTin() {
		System.out.println("--------Thong Tin Ghe--------");
		System.out.println("Chieu Cao: " + getChieuCao() + "\tChieu Rong: " + getChieuRong());
		System.out.println("Chieu Dai: " + getChieuDai() + "\tGia Tien: " + getGiaTien());
	}
	
	
}
