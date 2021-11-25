package LAB4_1;

import java.util.ArrayList;
import java.util.Arrays;
public class QWERTY extends Keyboard {
	
	public QWERTY() {
		
		super.buttonCodeList = new ArrayList<String>(
				Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"
			,"17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39"));
		
		super.buttonValueList = new ArrayList<String>(
				Arrays.asList("Backspace","Space","Enter","a","b","c","d","e","f","g","h","i","j"
			,"k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"));
		
		showKeyboard(10, 10);

	}
	
}

