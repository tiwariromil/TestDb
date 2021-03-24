
public class abc {
	public static String revStr(String s){
		if(s.isEmpty()) {
			System.out.println("Strin");
		
		return s;
		}
		else if(s.length() < 2){
		 return s;
		}
		else{
		return revStr(s.substring(1) + s.charAt(0));
				}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Romil Tiwari";
		String rev = revStr(s);
		System.out.println(rev);
	}
		

}
