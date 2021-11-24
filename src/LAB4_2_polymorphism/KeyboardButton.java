package LAB4_2_polymorphism;

public class KeyboardButton {
	
	protected String name;
	protected int code;
	protected String impliesSymbol = "->";
	
	public KeyboardButton(String name, int code) {
		setName(name);
		setCode(code);
	}
	
	
	public String checkCode(int code) {
		if (code == this.getCode())
			return this.toString();
		else return "mistake";
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getCode() {
		return code;
	}
	
	
	public void setCode(int code) {
		this.code = code;
	}
	
	
	public String toString() {
		return this.getCode()+impliesSymbol+this.getName();
	}

}
