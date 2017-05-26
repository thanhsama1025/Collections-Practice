package squaresofthoseintegers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SquaresOfThoseIntegers {
	int[] inputNumber;
	int[]  listOutput;
	Scanner sc=new Scanner(System.in);
	
	/*------------------------------*/
	public int[] getInput(){
		System.out.print("Enter size of Array : ");
		int size=sc.nextInt();
		inputNumber=new int[size];
		Random rd=new Random();
		for(int i=0;i<size;i++){
			inputNumber[i]=rd.nextInt(208)-104;
		}
		return inputNumber;
	}
	
	/*-------------------------------------*/
	public int[] gerResult(int[] input){
		listOutput=new int[input.length];
		for(int i=0;i<input.length;i++){
			listOutput[i]=input[i]*input[i];
		}
		Arrays.sort(listOutput);
		return listOutput;
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
	public static void main(String[] args) {
		SquaresOfThoseIntegers dn=new SquaresOfThoseIntegers();
		int[] input=dn.getInput();
		long timeStart=System.currentTimeMillis();
		SquaresOfThoseIntegers.displayInput(input);
		int[] output=dn.gerResult(input);
		SquaresOfThoseIntegers.displayInput(output);
		long timeRuning=System.currentTimeMillis() - timeStart;
		System.out.println("Time runing : " + timeRuning);
	}
}
