
public class Test {
	public static void main(String[] args){
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		cpu.setBrand("����");
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		disk.setPrice(3800);
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
