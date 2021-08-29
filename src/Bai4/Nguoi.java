package Bai4;

import java.util.Scanner;

public class Nguoi implements NhapVaXuat {
	private String hoVaTen;
	private String diaChi;
	
	public Nguoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nguoi(String hoVaTen, String diaChi) {
		super();
		this.hoVaTen = hoVaTen;
		this.diaChi = diaChi;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\t + Ho va Ten: ");
		this.hoVaTen = sc.nextLine();
		System.out.print("\t + Dia Chi: ");
		this.diaChi = sc.next();
	}

	@Override
	public void xuatThongTin() {
		System.out.println("\t + Ho va Ten: " + this.hoVaTen);
		System.out.println("\t + Dia Chi: " + this.diaChi);
	}

}
