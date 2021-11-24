package LAB4_2_polymorphism_OS;

import java.util.Scanner;

import LAB4_2_polymorphism.*;

public class OperatingSystem {
		
		public enum SpecialButtons { Backspace };
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			String[] qwertyButtonsValues = {"a","b","c","d","e","f","g","h","i",
					"j","k","l","m","n","o","p","q","r",
					"s","t","u","v","w","x","y","z",
					"0","1","2","3","4","5","6","7","8","9"};
			String[] calculatorButtonsValues = {"0","1","2","3","4","5","6","7",
					"8","9","+","-","/","*","=","(",")"};
			
			String[] generalButtonsValues = {"Space","New Line"};
			String[] generalButtonsActions = {" ","\n"};
			
			SpecialButtons[] SpecialButtonsList = {SpecialButtons.Backspace};
			
			while(true) {
				System.out.println("1-QWERTY");
				System.out.println("2-Claculator");
				System.out.println("Please choose one of the two keyboards to run: ");
				int x = input.nextInt();
				
				Keyboard keyboard ;
				if(x==1) {
					keyboard = new QWERTY(1,qwertyButtonsValues,generalButtonsValues,
						generalButtonsActions,SpecialButtonsList);
					String inputTxt;
					while(true) {
						System.out.print("Please enter the code of the button or -1 to exit: ");
						inputTxt = input.next();
						if(inputTxt.equals(-1+""))break;
						keyboard.buttonPressed(inputTxt);
					
					}	
				
				}
				else  if (x==2) {
					keyboard = new Calculator(0,calculatorButtonsValues,generalButtonsValues,
						generalButtonsActions,SpecialButtonsList);
				
				String inputTxt;
				while(true) {
					System.out.print("Please enter the code of the button or -1 to exit: ");
					inputTxt = input.next();
					if(inputTxt.equals(-1+""))break;
					keyboard.buttonPressed(inputTxt);
				}
				}
			}
		}
	}