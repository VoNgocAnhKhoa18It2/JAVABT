package Bai4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public DonHang donHang;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		donHang = new DonHang();
		Scanner scanner = new Scanner(System.in);
		int k = 0;
		while(k == 0) {
			System.out.println("------------- MENU -------------");
			System.out.println("1. Nhap Hoa Don");
			System.out.println("2. Xem Hoa Don");
			System.out.println("3. Xem Hoa Don Chi Tiet");
			System.out.println("4. Xac Dinh Co Phai La Tu");
			System.out.println("5. Tong Hoa Don");
			System.out.println("6. Tim Sam Pham Lon Nhat");
			System.out.println("7. Sap Xep Hoa Don Tu Cao Den Thap");
			System.out.println("8. Sap Xep Hoa Don Tu Thap Den Cao");
			System.out.println("9. Thoat");
			int n = Integer.parseInt(scanner.nextLine());
			switch (n) {
			case 1:
				donHang.nhapThongTin();
				break;
			case 2: 
				donHang.xuatThongTin();
				break;
			case 3: 
				donHang.xemChiTiet();
				break;
			case 4: 
				donHang.xacDinhSanPhamLaTu();
				break;
			case 5: 
				donHang.tinhTongSoTien();
				break;
			case 6: 
				donHang.timSanPhamCoSoTienLonNhat();;
				break;
			case 7: 
				donHang.sapXepSanPhamTuCaoDenThap();
				donHang.xemChiTiet();
				break;
			case 8: 
				donHang.sapXepSanPhamTuThapDenCao();
				donHang.xemChiTiet();
				break;
			case 9: 
				k = 1;
				System.out.println("------- END -------");
				break;
			
			}
		}
	}
	
	
}
