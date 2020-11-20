package user;

public class UserDto {
	private String userid;
	private String password;
	private String name;
	//alt + shift + s + r
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override //alt + shift + s + s
	public String toString() {
		return "사용자정보 [아이디=" + userid 
				+ ", 비밀번호=" + password 
				+ ", 이름=" + name + "]";
	}
	
	
}