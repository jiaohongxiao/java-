package jhx;

public class People {
	 int id;
	 String name;
	 String sex;
	 String major; 
	//����People���вι��췽��
	People(int id,String name,String sex,String major){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.major=major;
	}
	//����People�������ʽtoString()
	public String toString() {
		return "���룺"+id+"\n"+
				"������"+name+
				"�Ա�"+sex+
				"�γ̣�"+major;
	}
}
//�γ�
class Course {
	int id;
	String name;
	String place;
	String teacher;
	String time;
	Course(){
	}
	//���캯��
	Course(int id,String name,String place,String teacher,String time){
		this.id=id;
		this.name=name;
		this.place=place;
		this.teacher=teacher;
		this.time=time;
	}
	public String toString(){
		return "ѧ��ѡ����Ϣ��"+"\n"+
				"�γ̱�ţ�"+id+"\n"+
				"�γ����֣�"+name+
				"�γ̵ص㣺"+place+
				"�̿���ʦ��"+teacher+
				"�Ͽ�ʱ�䣺"+time;
	}
	
}
//ѧ��
class Student extends People{  
	Course scourse;
	double grade;
	
	Student(int id,String name,String sex,String major){
		super(id,name,sex,major);
	}
	
	public String toString() {
		return "ѧ����Ϣ��"+"\n"+
	           super.toString()+"\n";
	}
	//ʵ�����Եķ�װ
	public Course getScourse() {
		return scourse;
	}
	public void setScourse(Course scourse) {
		this.scourse=scourse;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade=grade;
	}
}
//��ʦ
class Teacher extends People{
	Course teacourse;
	String credit;
	
	Teacher(int id,String name,String sex,String major){
		super(id,name,sex,major);
	}
	public String toString() {
		return "��ʦ��Ϣ��"+"\n"+
	           super.toString()+"\n"+
	           "ѧ�֣�"+credit;
	}
	//ʵ�����Եķ�װ
	public Course getTeacourse() {
		return teacourse;
	}
	public void setTeacourse(Course teacourse) {
		this.teacourse=teacourse;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit=credit;
	}
}

