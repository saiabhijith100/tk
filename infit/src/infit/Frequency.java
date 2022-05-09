package infit;

import java.util.Scanner;
import java.util.Collection;
import java.util.*;


public class Frequency {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(2);
		ar.add(3);
		ar.add(3);
		ar.add(3);
		for(Integer i: ar){
		System.out.println(Collections.frequency(Arrays.asList(ar),i));
		ar.removeAll(Collections.singletonList(i));
		}
	}
}
