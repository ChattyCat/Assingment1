package assignment1_package;

public class MainTrail {

	public static void main(String[] args) {
		Register reg = new Register();
		reg.retrieveAllStuReg();
		String sID = "S1";
		System.out.println(reg.retrieveStuReg( sID));

	}

}
