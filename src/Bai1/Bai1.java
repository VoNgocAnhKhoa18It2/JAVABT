package Bai1;

public class Bai1 {
	public static int dem(String[] string) {
		int dem=0;
		for (int i = 0; i < string.length; i++) {
            if (string[i].length()>4) {
            	dem=dem+1;
            }
        }
		return dem;	
	}
	public static int chuoidai(String[] string) {
		int vt=0;
		int max=string[0].length();
		for (int i = 1; i < string.length; i++) {
			if (string[i].length()>max) {
				max=string[i].length();
				vt=i;
			}
		}
		return vt;
	}
	public static void batdauso(String[] string) {
		for (int i = 0; i < string.length; i++) {
			if (string[i].substring(0,1).equals("1")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("2")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("3")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("4")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("5")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("6")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("7")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("8")) {
				System.out.println(string[i]);
			} else if (string[i].substring(0,1).equals("9")) {
				System.out.println(string[i]);
			}else if (string[i].substring(0,1).equals("0")) {
				System.out.println(string[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		String[] string= {"1kha","khoa","0helloo"};
		System.out.println(dem(string));
		System.out.println(string[chuoidai(string)]);
		//System.out.println(string[1].charAt(1));
		//System.out.println(batdauso(string).length);
		batdauso(string);
		
	}
}
