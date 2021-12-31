package com.greatlearning.lab4.main;

import java.util.Scanner;
import com.greatlearning.lab4.service.*;


public class App {

	public static void main(String[] args) {
		//Intializing Scanner
		Scanner sq=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sq.nextInt();
		int notes[] = new int[size];
		System.out.println("Enter the currency denominations value one by one");
		for(int i=0;i<size;i++) {
			notes[i]=sc.nextInt();
		}
		BubbleSortImp bb=new BubbleSortImp();
		bb.bubbleSort(notes);
		
		System.out.println("Enter the amount to pay");
		int amount = sq.nextInt();
		NotesCountService ncs=new NotesCountService();
		ncs.notesCounter(notes, amount);
		
	}

}
