package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Anagrams {
	
	ArrayList<String> listInput=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	HashSet<String> hashSetInput=new HashSet<>();
	
	/*--------Lap mang chuoi nhap vao--------*/
	public ArrayList<String> getListInput(){
		String temp;
		do{
			temp=sc.nextLine();
			listInput.add(temp);
		}while(!temp.equals("exit"));
		return listInput;
	}

	/*--Ssap xep lai cac tu trong chuoi nhap vao----*/
	public String sortString(String str){
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		str = charArrayToString(ch);
		return str;
	}

	/*---Chuyen 1 mang ki tu thanh 1 chuoi---*/
	public String charArrayToString(char[] ch){
		String str="";
		for(int i=0;i<ch.length;i++){
			str += ch[i];
		}
		return str;
	}

	/*----Lay ra list cac chuoi nhap vao sau khi sap xep----*/
	public ArrayList<String> sortListInput(ArrayList<String> list){
		for(int i=0;i<list.size();i++){
			sortString(list.get(i));
		}
		return list;
	}

	/*-----Chuyen list nhap vap thanh Hashset----*/
	public HashSet<String> getOutput(ArrayList<String> list){
		for(int i=0;i<list.size();i++){
			hashSetInput.add(list.get(i));
		}
		return hashSetInput;
	}
	
	/*---------Ket qua tra ve la kick thuoc cua HashSet da tao--------------------*/
	public static int getResult(HashSet<String> hashSet){
		return hashSet.size();
	}	
	
	/*----------------------------------------*/
	public static void main(String[] args) {
		Anagrams ana=new Anagrams();
		System.out.println("Enter data :");
		ArrayList<String> input=ana.getListInput();
		long timeStart=System.currentTimeMillis();
		HashSet<String> output=ana.getOutput(input);
		System.out.println("groupsOfAnagrams(words) = " + Anagrams.getResult(output));
		System.out.println(System.currentTimeMillis() - timeStart);
	}
	
}
