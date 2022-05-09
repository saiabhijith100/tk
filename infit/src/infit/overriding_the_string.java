package infit;
import infit.Kevil;
import java.util.*;




public class overriding_the_string{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	Kings kk =new Kings();
	s=kk.piraval();
	int d=kk.piraval(3, 4);
	
	
		

}
}

class Kings implements Kevil{

	public int piraval() {
		System.out.println("overoaded method1");
		return 0;
	}
	public int piraval(int k, int j) {
		System.out.println("overoaded method");
		return 0;
	}
	
	
	
	
}


