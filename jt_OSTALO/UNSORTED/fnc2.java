import func_list_en.func_list;


public class fnc2 {
	
	public static void main(String[] args) {
		
		func_list fl = new func_list();
		
		fl.crtc(30);
		String TMS = func_list.tms();
		System.out.println(TMS);
		
		System.out.println(fl.tms());
		
		System.out.println(TMS);
	
	}

}