package Homework;

public class SecondMax {
	public static void main(String[]args) {
		int []nums= {10,34,20,35,8,2};
		int max=nums[0];
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
			if(nums[i]>nums[j]) {
				temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
			
		}
		}
		System.out.println(temp-1);
	}

}
