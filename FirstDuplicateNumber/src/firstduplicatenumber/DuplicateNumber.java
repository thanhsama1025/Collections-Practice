package firstduplicatenumber;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumber {
	int[] inputNumber;
	Set<Integer> inputSetNumber=new LinkedHashSet<>();
	Scanner sc=new Scanner(System.in);
	
	/*------------------------------*/
	public int[] getInput(){
		System.out.print("Enter size of Array : ");
		int size=sc.nextInt();
		inputNumber=new int[size];
		Random rd=new Random();
		for(int i=0;i<size;i++){
			inputNumber[i]=rd.nextInt(size)+1;
		}
		return inputNumber;
	}
	
	public static void displayInput(int[] input){
		System.out.print("Array = [");
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]);
			if(i!=input.length-1){
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	/*-------------------------------------*/
	public int gerResult(int[] input){
		int result=-1;
		int temp;
		for(int i=0;i<input.length;i++){
			temp=inputSetNumber.size();
			inputSetNumber.add(input[i]);
			if (temp == inputSetNumber.size()) {
				result=input[i];
				return result;
			}
		}
		return result;
	}
	
	/*-------------------------------------*/
	public static void main(String[] args) {
		DuplicateNumber dn=new DuplicateNumber();
		int[] input=dn.getInput();
		DuplicateNumber.displayInput(input);
		System.out.println("firstDuplicate(a) = "+dn.gerResult(input));
	}
}
