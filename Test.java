package jhx;


public class Test {
	public static void main(String[] args) {
		Student stu=new Student(2020322104,"������\n","Ů\n","Java\n");
		Course cour=new Course(8323,"Java\n","��0610\n","��ǿ\n","����03/04��\n");
		Course nocourse=new Course();
		Teacher tch=new Teacher(202047,"��ǿ\n","��\n","Java\n");
		tch.setCredit("6.0");
		tch.setTeacourse(cour);
		stu.setScourse(cour);
		stu.setScourse(nocourse);
		if (stu.getScourse().id==0) {
			 System.out.println("��ѧ����ѡ�Ρ�\n");
			 System.out.println(stu);
			 System.out.println(cour);
			 System.out.println(tch);
		}
	else {
		     System.out.println("��ѧ��δѡ�λ����˿Ρ�\n");
		     System.out.println(stu);
		     System.out.println("��ѧ����ѡ����Ϣ��\n");
		}
		
	}
	
}
