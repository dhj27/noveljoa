package kr.co.noveljoa.user.novel.domain;

public class NovelDomain {
	
	private String name;
	private int age;
	
	public NovelDomain() {
		super();
	}
	public NovelDomain(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "NovelVO [name=" + name + ", age=" + age + "]";
	}
	
}
