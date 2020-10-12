
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
