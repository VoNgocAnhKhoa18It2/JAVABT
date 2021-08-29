package Bai3;

public class TapChi extends AnPham {
	private String tenTapchi;
	public TapChi() {
		super();
	}
	public TapChi(String tenTapchi) {
		super();
		this.tenTapchi = tenTapchi;
	}
	public String getTenTapchi() {
		return tenTapchi;
	}
	public void setTenTapchi(String tenTapchi) {
		this.tenTapchi = tenTapchi;
	}
	@Override
	public String toString() {
		return "TapChi: Ten Tap Chi: " + tenTapchi + "";
	}
		
}
