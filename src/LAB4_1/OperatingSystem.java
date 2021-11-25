package LAB4_1;

import java.util.Scanner;

public class OperatingSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1-QWERTY");
			System.out.println("2-Claculator");
			System.out.println("Please choose one of the two keyboards to run: ");
			String x = input.next();
			Keyboard keyboard;
			//----------------------------------------------PART 1.2-----------------------
			if(isNumeric(x)) {
				if (Integer.valueOf(x) == 1) {
					keyboard = new QWERTY();
					
				}else if (Integer.valueOf(x) == 2) {
					keyboard = new Calculator();
				}else {
					continue;
				}
			}
			else {
				continue;
			} 
			

			String inputTxt;
			while(true) {
				System.out.print("Please enter the code of the button or -1 to exit: ");
				inputTxt = input.next();

				if(inputTxt.equals(-1+""))break;
				
				//----------------------------------------------PART 1.1-----------------------

				else if (keyboard.buttonCodeList.contains(inputTxt)) {
					keyboard.buttonPressed(inputTxt);
				}
				else{
					System.out.println("Not Found!");
					continue;
				}
					
			}
		}
	}
	   public static boolean isNumeric(String str) {
	        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
	    }
}
