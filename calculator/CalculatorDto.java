package calculator;

public class CalculatorDto {
	int Num1;
	int Num2;
	int result;
	String opcode;
	
	public int getNum1() {
		return Num1;
	}
	public void setNum1(int Num1) {
		this.Num1 = Num1;
	}
	
	public int getNum2() {
		return Num2;
	}
	public void setNum2(int Num2) {
		this.Num2 = Num2;
	}
	public int getresult() {
		return result;
	}
	public void setresult(int result) {
		this.result = result;
	}
	
	public String getOpcode() {
		return opcode;
	}
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
}
