# java-2020.10.12  课后练习P110 4
实验2

**计G202  2020322104  焦鸿霄**

**阅读程序**

**一、实验目的**

1. 掌握基本的Eclipse平台的使用方法
2. 学会使用Java编写简单的类，理解简单的类的使用方法，熟悉Java的构造方法
3. 学会定义属性促使属性的多样化
4. 学会访问权限的内容，尝试定义属性的修饰符多样化，例如public、private、protected等

**二、实验过程**

在包中建立PC、CPU、HardDisk和Test四个类，其中Test上主类。
* CPU类要求getSpeed()返回speed的值，要求getSpeed（int m）方法将参数m的值赋值给speed;
* HardDisk类要求getAmount（）返回amount的值，要求setAmount（int m）方法将参数m的值赋值给amount；
* PC类要求setCPU（CPU c）将参数c的值值赋值给cpu，要求setHardDisk（HardDisk h）方法将参数h的值赋值给HD，要求show()方法显示cpu的速度和硬盘的容量；
* 添加新的属性：例如CPU的品牌和硬盘的价格；
* * * 
主类Test的要求
+ main方法中创建一个 CPU对象cpu, cpu将自己的speed设置为2200
+ main方法中创建一个HardDisk对象disk, disk 将自己的amount设置为200
+ main方法中创建一个PC对象pc
+ pc调用setCPU(CPU c)方法，调用时实参是cpu。
+ pc调用setHardDisk (HardDisk h)方法， 调用时实参是disk。
+ pc 调用show(方法。

**三、核心方法**
```
方法一PC：
 public class PC {
	CPU cpu;
	HardDisk HD;
	public void setCPU(CPU c){
		cpu=c;
	}
	public void setHardDisk(HardDisk h){
		HD=h;
	}
	public void show(){
		System.out.println("cpu的速度："+cpu.getSpeed()+
				           "硬盘的容量："+HD.getAmount()+
				           "cpu的品牌："+cpu.getBrand()+
				           "硬盘的价格："+HD.getPrice());
	}
}
```

```
方法二CPU：
public class CPU {
	int speed;
	protected String brand;//CPU品牌
	void setSpeed(int m){
		speed=m;
	}
	public int getSpeed(){
		return speed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
```

```
方法三HardDisk：
public class HardDisk {
	private int amount;
	int price;
	void setAmount(int m){
		amount=m;
	}
	int getAmount(){
		return amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
```

```
方法四Test：
public class Test {
	public static void main(String[] args){
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		cpu.setBrand("戴尔");
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		disk.setPrice(3800);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}
```

**四、实验结果**

  cpu的速度：2200硬盘的容量：200cpu的品牌：戴尔硬盘的价格：3800
```
   cpu的速度：2200硬盘的容量：200cpu的品牌：戴尔硬盘的价格：3800
```

**五、实验感想**

通过这次实验学会使用Java编写简单的类，理解简单的类的使用方法，熟悉Java的构造方法，实现了定义属性的修饰符多样化。
实验中遇到的问题：
  1. 代码转换为代码板块、文字的调节、文档最后显示所需要使用的makedown的使用方法不会
    解决办法：通过百度查询使用方法，多次尝试使用。
  2. 属性的修饰符多样化不熟悉
    解决办法：通过向同学请教，自己实际操作解决问题。
       
