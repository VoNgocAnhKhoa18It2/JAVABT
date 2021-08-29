package Bai4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DonHang implements NhapVaXuat {
	private String ngayLap;
	private Nguoi nguoiBan;
	private Nguoi nguoiMua;
	private List<SanPham> danhSachSanPham;
	
	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}
	public Nguoi getNguoiBan() {
		return nguoiBan;
	}
	public void setNguoiBan(Nguoi nguoiBan) {
		this.nguoiBan = nguoiBan;
	}
	public Nguoi getNguoiMua() {
		return nguoiMua;
	}
	public void setNguoiMua(Nguoi nguoiMua) {
		this.nguoiMua = nguoiMua;
	}
	public List<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}
	public void setDanhSachSanPham(ArrayList<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}
	
	public void nhapThongTinSanPham() {
		this.danhSachSanPham = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int j = 0;
		while (j == 0) {
			System.out.println("----- DANH MUC SAN PHAM -----");
			System.out.println("1. Ban");
			System.out.println("2. Ghe");
			System.out.println("3. Tu");
			System.out.println("4. Thoat");
			int n = Integer.parseInt(scanner.nextLine());
			switch (n) {
			case 1: 
				Ban pham = new Ban();
				pham.nhapThongTin();
				this.danhSachSanPham.add(pham);
				break;
			case 2: 
				Ghe ghe = new Ghe();
				ghe.nhapThongTin();
				this.danhSachSanPham.add(ghe);
				break;
			case 3: 
				Tu tu = new Tu();
				tu.nhapThongTin();
				this.danhSachSanPham.add(tu);
				break;
			case 4: 
				j = 1;
				break;
			}
		}
	}

	@Override
	public void nhapThongTin() {
		System.out.println("--------Nhap Thong Don Hang--------");
		System.out.println("Nhap Thong Tin Nguoi Mua: ");
		Nguoi mua = new Nguoi();
		mua.nhapThongTin();
		setNguoiMua(mua);
		System.out.println("Nhap Thong Tin Nguoi Ban: ");
		Nguoi ban = new Nguoi();
		ban.nhapThongTin();
		setNguoiBan(ban);
		System.out.println("Nhap Thong Tin San Pham");
		nhapThongTinSanPham();
		Calendar calendar = Calendar.getInstance();
		setNgayLap(calendar.getTime().toLocaleString());
	}

	@Override
	public void xuatThongTin() {
		System.out.println("Ngay Lap: " + ngayLap);
		System.out.println("Thong Tin Nguoi Mua: ");
		nguoiMua.xuatThongTin();;
		System.out.println("Thong Tin Nguoi Ban: ");
		nguoiBan.xuatThongTin();
		System.out.println("So Luong San Pham: " + danhSachSanPham.size());
	}
	
	// phuong thuc tinh tong so tien cua 1 don hang
	public void tinhTongSoTien() {
		int sum = 0;
		for (SanPham sanPham : danhSachSanPham) {
			sum = sum + sanPham.getGiaTien();
		}
		System.out.println("Tong So Tien Don Hang: " + sum);
	}
	
	// phuong thuc tim san phan co so tien lon nhat
	public void timSanPhamCoSoTienLonNhat() {
		SanPham sp = null; 
		int max = 0;
		for (SanPham sanPham : danhSachSanPham) {
			if (sanPham.getGiaTien() > max) {
				max = sanPham.getGiaTien();
				sp = sanPham;
			}
		}
		if (sp instanceof Ban) {
			((Ban) sp).xuatThongTin();
		} else if (sp instanceof Ghe) {
			((Ghe) sp).xuatThongTin();
		} else if ( sp instanceof Tu ) {
			((Tu) sp).xuatThongTin();
		}
	}
	
	// sap xep don hang theo gia san pham tu cao den thap
	public void sapXepSanPhamTuCaoDenThap() {
		Collections.sort(this.danhSachSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getGiaTien() > o2.getGiaTien() ? -1 : 1;
            }
        });
	}
	
	// sap xep don hang theo gia san pham tu thap den cao
	public void sapXepSanPhamTuThapDenCao() {
		Collections.sort(this.danhSachSanPham, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getGiaTien() < o2.getGiaTien() ? -1 : 1;
            }
        });
	}
	
	// phuong thuc xac đinh san pham co phai la Tu
	public void xacDinhSanPhamLaTu() {
		for (SanPham sanPham : danhSachSanPham) {
			if (sanPham instanceof Tu) {
				((Tu) sanPham).xuatThongTin();
			}
		}
	}
	
	// xem chi tiet don hang
	public void xemChiTiet() {
		System.out.println("------------------ ------------------ ");
		int x = 1;
		for (SanPham sanPham : danhSachSanPham) {
			System.out.println("STT: " + x);
			if (sanPham instanceof Ban) {
				((Ban) sanPham).xuatThongTin();
			} else if (sanPham instanceof Ghe) {
				((Ghe) sanPham).xuatThongTin();
			} else if ( sanPham instanceof Tu ) {
				((Tu) sanPham).xuatThongTin();
			}
			x++;
		}
	}
	
}
