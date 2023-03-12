package com.ctlloopSamples;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {10,25,100,125,999,60,2,9990};
		int max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					max =arr[i];
				}
				else {
					max=arr[j];
					arr[i]=max;
				}
			}	
		}
		System.out.println("Biggest Number = "+max);
	}

}
