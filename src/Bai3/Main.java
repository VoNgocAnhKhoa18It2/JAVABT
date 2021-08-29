package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static ArrayList<AnPham> anPhams;
	static ArrayList<ChuongSach> danhSachChuongSach;

	static TapChi nhapTapChi() {
		Scanner scanner = new Scanner(System.in);
		TapChi tapchi = new TapChi();
		int j = 0;
		while (j == 0) {
			try {
				System.out.println("--------- Nhap Thong Tin Tap Chi ---------");
				System.out.print("Nhap Tieu De: ");
				tapchi.setTieuDe(scanner.nextLine());
				System.out.print("Nhap So Trang: ");
				tapchi.setSoTrang(Integer.parseInt(scanner.nextLine()));
				System.out.print("Nhap Nam Xuat Ban: ");
				tapchi.setNamXb(scanner.nextLine());
				System.out.print("Nhap Tac Gia: ");
				tapchi.setTacGia(scanner.nextLine());
				System.out.print("Nhap Gia Tien: ");
				tapchi.setGiaTien(Integer.parseInt(scanner.nextLine()));
				System.out.print("Nhap Ten Tap Chi: ");
				tapchi.setTenTapchi(scanner.nextLine());
				j = 1;
			} catch (Exception e) {
				System.out.println("Kiem tra lai du lieu nhap. Vui Long Nhap Lai");
			}
		}
		return tapchi;
	}

	static SachThamKhao nhapSachThamKhao() {
		Scanner scanner = new Scanner(System.in);
		SachThamKhao sachThamKhao = new SachThamKhao();
		int j = 0;
		while (j == 0) {
			try {
				System.out.println("--------- Nhap Thong Tin Sach Tham Khao ---------");
				System.out.print("Nhap Tieu De: ");
				sachThamKhao.setTieuDe(scanner.nextLine());
				System.out.print("Nhap So Trang: ");
				sachThamKhao.setSoTrang(Integer.parseInt(scanner.nextLine()));
				System.out.print("Nhap Nam Xuat Ban: ");
				sachThamKhao.setNamXb(scanner.nextLine());
				System.out.print("Nhap Tac Gia: ");
				sachThamKhao.setTacGia(scanner.nextLine());
				System.out.print("Nhap Gia Tien: ");
				sachThamKhao.setGiaTien(Integer.parseInt(scanner.nextLine()));
				System.out.print("Nhap Linh Vuc: ");
				sachThamKhao.setLinhVuc(scanner.nextLine());
				System.out.println("---------- Nhap Chuong Cua Sach ------------");
				System.out.print("Nhap Tong So Chuong: ");
				int n = Integer.parseInt(scanner.nextLine());
				ArrayList<ChuongSach> chuongSachs = new ArrayList<>();
				for (int i = 1 ; i <= n ; i++ ) {
					ChuongSach chuongSach = new ChuongSach();
					System.out.println("STT " + i);
					chuongSach.setThutuChuong(i);
					chuongSach.nhapThongTin();
					chuongSachs.add(chuongSach);
					danhSachChuongSach.add(chuongSach);
				}
				sachThamKhao.setChuongSach(chuongSachs);
				j = 1;
			} catch (Exception e) {
				System.out.println("Kiem tra lai du lieu nhap. Vui Long Nhap Lai");
			}
		}
		return sachThamKhao;
	}

	public static void xuatTapChi(TapChi tapchi) {
		System.out.println("Tieu de :" + tapchi.getTieuDe());
		System.out.println("Ten tap chi:" + tapchi.getTenTapchi());
		System.out.println("Nam xuat ban :" + tapchi.getNamXb());
		System.out.println("Tac gia :" + tapchi.getTacGia());
		System.out.println("So trang :" + tapchi.getSoTrang());
		System.out.println("Gia tien :" + tapchi.getGiaTien());
	}

	public static void xuatSachThamKhao(SachThamKhao sachthamkhao) {
		System.out.println("Tieu de :" + sachthamkhao.getTieuDe());
		System.out.println("Nam xuat ban :" + sachthamkhao.getNamXb());
		System.out.println("Tac gia :" + sachthamkhao.getTacGia());
		System.out.println("So trang :" + sachthamkhao.getSoTrang());
		System.out.println("Gia tien :" + sachthamkhao.getGiaTien());
		System.out.println("Linh vuc:" + sachthamkhao.getLinhVuc());
		System.out.println(sachthamkhao.getChuongSach());
	}

	public static boolean checkanPahm(AnPham anpham1, AnPham anpham2) {
		boolean f = false;
		if ((anpham1 instanceof TapChi) && (anpham2 instanceof TapChi)
				&& (anpham1.getTacGia().equals(anpham2.getTacGia()))) {
			f = true;
		} else if ((anpham1 instanceof SachThamKhao) && (anpham2 instanceof SachThamKhao)
				&& (anpham1.getTacGia().equals(anpham2.getTacGia()))) {
			f = true;
		}
		return f;
	}

	public static int sum(AnPham anpham) {
		int sum = 0;
		for (AnPham anPham : anPhams) {
			sum = sum + anPham.getGiaTien();
		}
		return sum;
	}

	public static void addElement(Map<Integer, Integer> map, Integer element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	public static void main(String[] args) {
		anPhams = new ArrayList<>();
		danhSachChuongSach = new ArrayList<>();
		TapChi tapchi1 = nhapTapChi();
		System.out.println("*****************************");
		TapChi tapchi2 = nhapTapChi();
		System.out.println("*****************************");
		xuatTapChi(tapchi1);
		anPhams.add(tapchi1);
		System.out.println("*****************************");
		xuatTapChi(tapchi2);
		anPhams.add(tapchi2);
		System.out.println("*****************************");
		SachThamKhao sachthamkhao1 = nhapSachThamKhao();
		System.out.println("*****************************");
		SachThamKhao sachthamkhao2 = nhapSachThamKhao();
		System.out.println("*****************************");
		xuatSachThamKhao(sachthamkhao1);
		anPhams.add(sachthamkhao1);
		System.out.println("*****************************");
		xuatSachThamKhao(sachthamkhao2);
		anPhams.add(sachthamkhao2);
		System.out.println("*****************************");
		System.out.println("Phan Loai:");
		for (AnPham anPham : anPhams) {
			if (anPham instanceof TapChi) {
				System.out.println(((TapChi) anPham).toString());
			}
			if (anPham instanceof SachThamKhao) {
				System.out.println(((SachThamKhao) anPham).toString());
			}
		}
		System.out.println("*****************************");
		System.out.println("Tap chí xuat ban < 2011:");
		for (AnPham anPham : anPhams) {
			if (anPham instanceof TapChi) {
				if (Integer.parseInt(anPham.getNamXb()) < 2011) {
					System.out.println(((TapChi) anPham).toString());
				}
			}
		}
		System.out.println("*****************************");
		System.out.println("Check 2 an pham co cung loai va cung tac gia hay ko:");
		System.out.println(checkanPahm(tapchi1, tapchi2));
		System.out.println("*****************************");
		System.out.println("Tong tien các an pham:");
		int sum = 0;
		for (AnPham anPham : anPhams) {
			sum = sum + anPham.getGiaTien();
		}
		System.out.println(sum);
		System.out.println("*****************************");
		System.out.println("Sach Tham Khao ca so trang trong chuong lon nhat :");
		int max = danhSachChuongSach.get(0).getSoTrangChuong();
		int vtmax = 0;
		for (int i = 1; i < danhSachChuongSach.size(); i++) {
			if (max < danhSachChuongSach.get(i).getSoTrangChuong()) {
				max = danhSachChuongSach.get(i).getSoTrangChuong();
				vtmax = i;
			}
		}
		String s1 = String.valueOf(danhSachChuongSach.get(vtmax).getSoTrangChuong());
		for (AnPham anPham : anPhams) {
			if (anPham instanceof SachThamKhao) {
				if (String.valueOf(((SachThamKhao) anPham).getChuongSach()).contains(s1)) {
					System.out.println(((SachThamKhao) anPham).getTieuDe());
					System.out.println(((SachThamKhao) anPham).getTacGia());
					System.out.println(((SachThamKhao) anPham).getNamXb());
					System.out.println(((SachThamKhao) anPham).getGiaTien());
				}
			}
		}
		System.out.println("*****************************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten:");
		String s = scanner.nextLine();
		boolean check = false;
		for (AnPham anPham : anPhams) {
			if (anPham instanceof TapChi) {
				if (((TapChi) anPham).getTenTapchi().equals(s)) {
					check = true;
				}
			}
		}
		if (check) {
			System.out.println("Co");
		} else {
			System.out.println("Khong");
		}
		System.out.println("*****************************");
		ArrayList<String> listtapchi = new ArrayList<>();
		System.out.println("Nhap Nam:");
		String nam = scanner.nextLine();
		for (AnPham anPham : anPhams) {
			if (anPham instanceof TapChi) {
				if (((TapChi) anPham).getNamXb().equals(nam)) {
					listtapchi.add(((TapChi) anPham).getTenTapchi());
				}
			}
		}
		for (String listTapChi : listtapchi) {
			System.out.println(listTapChi);
		}
		System.out.println("*****************************");
		System.out.println("Sap xep thep ten:");
		Collections.sort(anPhams);
		anPhams.stream().map(o -> o.getTieuDe()).forEach(System.out::println);
		System.out.println("*****************************");
		ArrayList<Integer> listnam = new ArrayList<>();
		int m = listnam.size();
		int[] sonam = new int[listnam.size()];
		for (AnPham anPham : anPhams) {
			listnam.add(Integer.parseInt(anPham.getNamXb()));
		}

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (AnPham anPham : anPhams) {
			addElement(map, Integer.parseInt(anPham.getNamXb()));
		}
		for (Integer key : map.keySet()) {
			System.out.printf("%d : %d cuon.\n", key, map.get(key));
		}

	}
}
