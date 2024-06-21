package First.Springclasses;

public class day1springclass {


 
	 private int phonemodle;
	 private String company;
	 private int cost;
	 private int rom ;
	 private int ram;
	 private int Storage;
	public int getPhonemodle() {
		return phonemodle;
	}
	public void setPhonemodle(int phonemodle) {
		this.phonemodle = phonemodle;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	@Override
	public String toString() {
		return "day1springclass [phonemodle=" + phonemodle + ", company=" + company + ", cost=" + cost + ", rom=" + rom
				+ ", ram=" + ram + ", Storage=" + Storage + "]";
	}
	
 
}
