package infit;
import java.util.*;
import java.io.*;

public class Hashcode {
	public static void main(String args[]){
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	e1.id=1;
	e1.name="sai";
	e1.pay=100;
	e2.id=12;
	e2.name="saib";
	e2.pay=1100;
	e3.id=1;
	e3.name="sai";
	e3.pay=100;
	int t=e1.paye();
	int t2=e2.paye();
	int t3=e3.paye();
	}

}
 class Employee{
	 int id,pay;
	 String name;
	 int paye(){
		 System.out.println(id);
		 System.out.println(pay);
		 System.out.println(name);
		 return 0;
	 }
 }