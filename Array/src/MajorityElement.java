
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MajorityElement {

	public static void main(String[] args) {
		//==========================Q.1=================================
		//		*
		//		**
		//		***
		//		****
		//		*****

		//	        for(int i=0;i<5;i++) {
		//	        	for(int j=0;j<=i;j++) {
		//	        		System.out.print("*");
		//	        	}
		//	        	System.out.println();
		//	        }
		//	        


		//==========================Q.2==================================		
		//	      *
		//	     **
		//	    ***
		//	   ****
		//	  *****

		//		for(int i=0;i<5;i++) {
		//	    for(int k=4-i-1;k>=0;k--) {
		//	    	System.out.print(" ");
		//	    }
		//			
		//			for(int j=0;j<=i;j++) {
		//	        		System.out.print("*");
		//	        	}
		//	        	System.out.println();
		//	        }
		//	        



		//========================Q.3========================================
		//	       *
		//	      * *
		//	     * * *
		//	    * * * *
		//	   * * * * *
		//		

		//		for(int i=0;i<5;i++) {
		//		    for(int k=4-i-1;k>=0;k--) {
		//		    	System.out.print(" ");
		//		    }
		//				
		//				for(int j=0;j<=i;j++) {
		//		        		System.out.print(" *");//same as Q.2 only space provide here 
		//		        	}
		//		        	System.out.println();
		//	        }


		//=============================Q.4========================================		
		//		*****
		//		****
		//		***
		//		**
		//		*

		//		for(int i=5;i>0;i--) {			
		//			for(int j=i;j>0;j--) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//	        
		//=============================Q.5=================================================

		//		*****
		//		 ****
		//		  ***
		//		   **		
		//		    *


		//		for(int i=5;i>0;i--) {
		//			 for(int k=5-i-1;k>=0;k--) {
		//			    	System.out.print(" ");
		//			    }
		//			
		//			for(int j=i;j>0;j--) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}

		//================================Q.6==================================================

		//		 * * * * *
		//		  * * * *
		//		   * * *
		//		    * *
		//           *


		//		
		//		for(int i=5;i>0;i--) {
		//			 for(int k=5-i-1;k>=0;k--) {
		//			    	System.out.print(" ");
		//			    }
		//			
		//			 
		//			for(int j=i;j>0;j--) {
		//				System.out.print(" *");//same as Q.5 only space provide here 
		//			}
		//			System.out.println();
		//		}
		//		
		//==================================Q.7================================================

		//	       *
		//	      * *
		//	     * * *
		//	    * * * *
		//	   * * * * *
		//	    * * * *
		//	     * * *
		//	      * *
		//	       *		


		//		for(int i=0;i<5;i++) {
		//		    for(int k=5-i-1;k>=0;k--) {
		//		    	System.out.print(" ");
		//		    }
		//				
		//				for(int j=0;j<=i;j++) {
		//		        		System.out.print(" *");//same as Q.2 only space provide here 
		//		        	}
		//		        	System.out.println();
		//		}
		//			
		//		for(int i=4;i>0;i--) {               //here i=4 because we want to print 4 star not 5
		//			System.out.print("  ");          //Double Space to align(fit) second part
		//				 for(int k=4-i-1;k>=0;k--) {
		//				    	System.out.print(" ");
		//				    }
		//				
		//				 
		//				for(int j=i;j>0;j--) {
		//					System.out.print(" *");//same as Q.5 only space provide here 
		//				}
		//				System.out.println();
		//			}

		//================================Q.8=================================================


		//		*
		//		**
		//		***
		//		****
		//		*****
		//		*****
		//		****
		//		***
		//		**
		//		*

		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<=i;j++) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//		for(int i=5;i>0;i--) {
		//			
		//			for(int j=i;j>0;j--) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}


		//======================================Q.9=======================================================

		//		    *
		//		   **
		//		  ***
		//		 ****
		//		*****
		//		*****
		//		 ****
		//		  ***
		//		   **
		//		    *

		//		for(int i=0;i<5;i++) {
		//		    for(int k=4-i-1;k>=0;k--) {
		//		    	System.out.print(" ");
		//		    }
		//				
		//				for(int j=0;j<=i;j++) {
		//		        		System.out.print("*");
		//		        	}
		//		        	System.out.println();
		//		        }
		//		
		//		for(int i=5;i>0;i--) {
		//			 for(int k=5-i-1;k>=0;k--) {
		//			    	System.out.print(" ");
		//			    }
		//			
		//			for(int j=i;j>0;j--) {
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//    	}





		//========================Number Pattern=======Q.1===============================================================
		//		0
		//		11
		//		222
		//		3333
		//		44444

		//		int num=0;
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<=i;j++) {
		//				System.out.print(num+i);
		//			}
		//			System.out.println();
		//		}



		//===========================Q.2=============================
		//		4
		//		33
		//		222
		//		1111
		//		00000		

		//		int num=4;
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<=i;j++) {
		//				System.out.print(num-i);
		//			}
		//			System.out.println();
		//		}


		//========================Q.3====================================		

		//		1
		//		11
		//		111
		//		1111
		//		11111


		//		for(int i=0;i<5;i++) {
		//			int num=1;
		//			for (int j=0;j<=i;j++) {
		//				System.out.print(num);
		//			}
		//			System.out.println();
		//		}
		//	




		//=========================Q.4==============================================================

		//		1
		//		12
		//		123
		//		1234
		//		12345



		//		for(int i=0;i<5;i++) {	
		//			int num=1;
		//			for (int j=0;j<=i;j++) {
		//				System.out.print(num);
		//				num++;
		//			}
		//			System.out.println();
		//		}	


		//=============================Q.5===================================		

		//		1
		//		23
		//		456
		//		78910
		//		1112131415

		//		int num=1;	
		//		for(int i=0;i<5;i++) {	
		//		for (int j=0;j<=i;j++) {
		//			System.out.print(num);
		//			num++;
		//		}
		//		System.out.println();
		//	}	

		//================================Q.6===================================		

		//		55555
		//		4444
		//		333
		//		22
		//		1


		//		int num=0;
		//		for(int i=5;i>=0;i--) {			
		//			for(int j=i;j>0;j--) {
		//				System.out.print(num+i);
		//			}
		//			System.out.println();
		//		}

		//===========================Q.7=====================================		

		//		11111
		//		2222
		//		333
		//		44
		//		5


		//		int num=6;
		//		for(int i=5;i>=0;i--) {			
		//			for(int j=i;j>0;j--) {
		//				System.out.print(num-i);
		//			}
		//			System.out.println();
		//		}


		//============================Q.8=================================		

		//		11111
		//		1111
		//		111
		//		11
		//		1

		//		for(int i=5;i>=0;i--) {		
		//			int num=1;
		//			for(int j=i;j>0;j--) {
		//				System.out.print(num);
		//			}
		//			System.out.println();
		//		}
		//		


		//======================Q.9================================

		//		12345
		//		1234
		//		123
		//		12
		//		1

		//		for(int i=5;i>=0;i--) {		
		//			int num=1;
		//			for(int j=i;j>0;j--) {
		//				System.out.print(num);
		//				num++;
		//			}
		//			System.out.println();
		//		}

		//=========================Q.10======================================		

		//		1514131211
		//		10987
		//		654
		//		32
		//		1

		//		int num=15;	
		//		for(int i=5;i>=0;i--) {		
		//		for(int j=i;j>0;j--) {
		//			System.out.print(num);
		//			num--;
		//		}	
		//		System.out.println();
		//	}

		//============================Q.1========================================

		//		A
		//		BB
		//		CCC
		//		DDDD
		//		EEEEE


		//		char ch='A';
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<=i;j++) {
		//				System.out.print((char)(ch+i));
		//			}
		//			System.out.println();
		//		}

		//============================Q.2====================================

		//		E
		//		DD
		//		CCC
		//		BBBB
		//		AAAAA


		//		char ch='E';
		//		for(int i=0;i<5;i++) {
		//			for(int j=0;j<=i;j++) {
		//				System.out.print((char)(ch-i));
		//			}
		//			System.out.println();
		//		}

		//=========================Q.3=====================================

		//		A
		//		AA
		//		AAA
		//		AAAA
		//		AAAAA


		//		for(int i=0;i<5;i++) {
		//			char ch='A';
		//			for(int j=0;j<=i;j++) {
		//				System.out.print((char)(ch));
		//			}
		//			System.out.println();
		//		}

		//===========================Q.4==============================	

		//		A
		//		AB
		//		ABC
		//		ABCD
		//		ABCDE		

		//		for(int i=0;i<5;i++) {
		//			char ch='A';
		//			for(int j=0;j<=i;j++) {
		//				System.out.print((char)(ch));
		//				ch++;
		//			}
		//			System.out.println();
		//		}

		//===========================Q.5=================================

		//		A
		//		BC
		//		DEF
		//		GHIJ
		//		KLMNO

		//		char ch='A';	
		//		for(int i=0;i<5;i++) {	
		//		for (int j=0;j<=i;j++) {
		//			System.out.print((char)(ch));
		//			ch++;
		//		}
		//		System.out.println();
		//	}	


		//==========================Q.6=======================================		

		//		EEEEE
		//		DDDD
		//		CCC
		//		BB
		//		A

		//		char ch='A';
		//			for(int i=5;i>=0;i--) {			
		//				for(int j=i;j>0;j--) {
		//					System.out.print((char)(ch+i-1)); //change subtract -1 
		//				}
		//				System.out.println();
		//			}

		//=============================Q.7====================================		
		//		AAAAA
		//		BBBB
		//		CCC
		//		DD
		//		E
		//		
		//		char ch='F';
		//		for(int i=5;i>=0;i--) {			
		//			for(int j=i;j>0;j--) {
		//				System.out.print((char)(ch-i
		//						));
		//			}
		//			System.out.println();
		//		}


		//==============================Q.8====================================		

		//		AAAAA
		//		AAAA
		//		AAA
		//		AA
		//		A

		//		for(int i=5;i>=0;i--) {		
		//		char ch='A';
		//			for(int j=i;j>0;j--) {
		//				System.out.print(ch);
		//			}
		//			System.out.println();
		//		}

		//=============================Q.9===================================		

		//		ABCDE
		//		ABCD
		//		ABC
		//		AB
		//		A

		//		for(int i=5;i>=0;i--) {		
		//			char ch='A';
		//			for(int j=i;j>0;j--) {
		//				System.out.print(ch);
		//				ch++;
		//			}
		//			System.out.println();
		//		}

		//=============================Q.10====================================		

		//		ONMLK
		//		JIHG
		//		FED
		//		CB
		//		A

		//		char ch='O';
		//		for(int i=5;i>=0;i--) {		
		//		for(int j=i;j>0;j--) {
		//			System.out.print(ch);
		//			ch--;
		//		}	
		//		System.out.println();
		//	}

		//============================================================================

		//You Can Solve these type of patter using Above Logic		

		//		     A
		//		    A B
		//		   A B C
		//		  A B C D
		//		 A B C D E

		//ref Q.4 
		//		for(int i=0;i<5;i++) {
		//			for(int k=4-i-1;k>=0;k--) {
		//				System.out.print(" ");
		//			}
		//			char ch='A';
		//			for(int j=0;j<=i;j++) {
		//				System.out.print(" "+(char)(ch));
		//				ch++;
		//			}
		//			System.out.println();
		//		}




		//==============Factorial Of Big Integer==============		

		//		ArrayList <Integer> arr= new ArrayList <Integer>();
		//	        int N=5;
		//	        
		//	        arr.add(1);
		//	        
		//	        for(int i=1; i<=N; i++){
		//	            int carry=0;
		//	         
		//	            for(int j=arr.size()-1; j>=0; j--){
		//	            	System.out.println(j);
		//	            	System.out.println(i);
		//
		//	                int val=arr.get(j)*i+carry;
		//	            	System.out.println(val);
		//	            	System.out.println("***********");
		//
		//
		//	                arr.set(j,val%10);
		//	                System.out.println(arr);
		//	                carry=val/10;
		//	            }
		//	            System.out.println("carry"+carry);
		//	            System.out.println("++=++=====");
		//	            
		//	            while(carry!=0){
		//	                arr.add(0,carry%10);
		//	                System.out.println("arrrrrr"+arr);
		//	                carry=carry/10;
		//	            }
		//	        }
		//
		//	       System.out.println("Fianl Answer Is"+arr);


		//=======Move All Negative elemnets to the begining of array=======
		//		int nums[]= {1,2,-3,6,8,7,-6,-7,9};
		//		int j=0;
		//		for(int i=0;i<nums.length;i++){
		//			if(nums[i]<0){
		//				int temp=nums[j];
		//				nums[j]=nums[i];
		//				nums[i]=temp;
		//				j++;
		//			}
		//		}
		//
		//		for(int i=0;i<nums.length;i++){
		//			System.out.print(nums[i]+" ");
		//		}
		//================String Palindrome Using Recursion====================================


		//		String str="abcdsaba";
		//		String rev="";
		//		String revstr=isPalindrome("str");
		//		if(str.equals(revstr)) {
		//			System.out.println("yes");
		//		}
		//		else {
		//			
		//			System.out.println("No");
		//		}
		//		
		//	}
		//
		//	private static String isPalindrome(String str) {
		//
		//		if(str==null || str.length()<=1) {
		//			return str;
		//		}
		//		return isPalindrome(str.substring(1))+str.charAt(0);

		//====================Number Palindrome Using Recursion==============================		
		//		int num=121;
		//		int sum=0;
		//		int revnum=isPalindrome(num,sum);
		//		System.out.println(revnum);
		//		if(num==revnum) {
		//			System.out.println("yes");
		//		}
		//		else {
		//			
		//			System.out.println("No");
		//		}
		//		
		//	}
		//
		//	private static int isPalindrome(int num, int sum) {
		//		if(num==0)
		//		{
		//			return sum;
		//		}
		//		sum=sum*10+num%10;
		//		return isPalindrome(num/10, sum);

		//======================Factorial of NUmber using recursion================		
		//		
		//		int num=5;
		//		
		//		int result=findFacorial(num);
		//		System.out.println(result);
		//		
		//		
		//	}
		//
		//	private static int findFacorial(int num) {
		//		if(num==1) {
		//			return 1;
		//		}
		//		return (findFacorial(num-1)*num);

		//=================Nth Fibonacci using recursion(Logic 1) ===================		
		//		int num=5;
		//		int result = 0;
		//		for(int i=0;i<num;i++) {
		//			 result=findFibonacci(i);
		//			System.out.print(" "+result);
		//		}		
		//		System.out.println(" \n The Nth Fibbonicci Number is :"+result);
		//	}
		//	 
		//	private static int findFibonacci(int num) {
		//		if(num==0 || num==1)
		//			return num;
		//		else
		//		return findFibonacci(num-1)+findFibonacci(num-2);

		//=================Nth Fibonacci using recursion (Logic 2)===================		

		//		int count=5;
		//		System.out.print(n1+" "+n2);
		//		findFibonacci(count-2);
		//		System.out.println(" \n The Nth Fibbonicci Number is :"+n3);
		//		
		//		
		//		
		//	}
		//	static int n1=0,n2=1,n3=0;
		//	private static void findFibonacci(int count) {
		//		if(count>0) {
		//			n3=n1+n2;
		//			n1=n2;
		//			n2=n3;
		//			System.out.print(" "+n3);
		//			findFibonacci(count-1);
		//			
		//		}

		//=========================Brute Force Logic of Fibonacci ==============================
		//
		//	System.out.print(n1+" "+n2);
		//		for(int i=2;i<count;i++){
		//			n3=n1+n2;
		//			n1=n2;
		//			n2=n3;
		//			System.out.print(" "+n3);		
		//		}
		//		System.out.println("\n "+n3);

		//==========================Find MIn MAx element from Array=========================

		//		int arr[]= {5,8,3,7,6,9,50,1};
		//		int min=arr[0];
		//		int max=arr[0];
		//		
		//		for (int i=1;i<arr.length;i++) {
		//			if(arr[i]>max)
		//				max=arr[i];
		//			else
		//				min=arr[i];
		//		}
		//
		//		
		//		
		//		System.out.println("Max is "+max);
		//		System.out.println("Min is "+min);

		//======================Binary Search===========================		

		//		int arr[]= {10,20,30,80,50};
		//		int key=480;
		//		int first=0;
		//		int last=arr.length-1;
		//		boolean flag=false;
		//		while(first<=last) {
		//			int mid=(first+last)/2;
		//
		//			if(key==arr[mid]) {
		//				System.out.println("element found at Index :" +mid);
		//				flag=true;
		//				break;
		//			}
		//			else if(key<arr[mid]){
		//				last=mid-1;
		//				
		//			}
		//			else {
		//				first=mid+1;
		//			}
		//			
		//		}
		//		if(flag==false)
		//			System.out.println("element not found at Index ");


		//===============Remove junk or Special Character from string====================
		//		
		//		String str="#$@#$(^(@243555357rgrrgherh2323578#%325@#";
		//		String str1=str.replaceAll("[^a-zA-Z0-9]","");
		//		System.out.println(str1);


		//========================Occurance of any Character in given String=====================		
		//		String str="Java Kama";
		//		String str3=str.replaceAll("a","");
		//		
		//		System.out.println(str.length());
		//		System.out.println(str3.length());
		//		
		//		int  result=str.length()-str3.length();
		//		System.out.println("Occurance of 'a' in given String is :"+result);



		//===========================Find Duplicate============================		

		//				int []arr= {1,5,8,6,4,4,4};
		//				HashMap<Integer,Integer> hp=new HashMap<Integer,Integer>();
		//				
		//				for(Integer num:arr) {
		//					if(hp.containsKey(num)) {
		//						hp.put(num,hp.get(num)+1);
		//					}
		//					else {
		//						hp.put(num,1);
		//					}
		//				}
		//				System.out.println("key and Value in HashSet :"+hp);
		//				
		//				for(Map.Entry<Integer, Integer> num :hp.entrySet()) {
		//					
		//					if(num.getValue()>1) {
		//						System.out.println("Duplicate Element is :"+num.getKey());
		//						
		//					}
		//					
		//				}





		//========Find elements which are present in first array and not in second==========


		//		Input : a[] = {1, 2, 3, 4, 5, 10};
		//	    b[] = {2, 3, 1, 0, 5};
		//	Output : 4 10    
		//	4 and 10 are present in first array, but
		//	not in second array.



		//		int a[] = {1, 2, 3, 4, 5, 10};
		//		int b[] = {2, 3, 1, 0, 5};
		//		int count=0;
		//
		//		HashSet<Integer> set=new HashSet<Integer>();
		//		for(Integer num: b) {
		//			set.add(num);
		//
		//		}
		//
		//		for(Integer num : a) {
		//
		//			if(!set.contains(num)) {
		//
		//				System.out.print(num+" ");
		//
		//			}
		//		}
		//		


		//===================Reverse Number Recursion========================
		//		int result=reverse(1234);
		//
		//		System.out.println(result);
		//
		//    	 }
		//
		//	   private static int reverse(int num) {
		//		if(num<10) {
		//
		//			return num;
		//		}
		//		else {
		//			System.out.print(num%10);
		//			return reverse((num/10));
		//
		//		}

		//===================Reverse String Recursion========================
		//		String str="Sandy";
		//		String result=reverse(str);
		//		System.out.println(result);
		//		
		//		
		//	}
		//
		//	private static String reverse(String str) {
		//		
		//		if(str==null || str.length()<=1) {
		//			return str;
		//		}
		//		else {
		//			return reverse(str.substring(1)) + str.charAt(0);
		//		}

		//==============Reverse A Number=============

		//		int num=1234;
		//		String str =String.valueOf(num);
		//		char ch []= str.toCharArray();
		//		
		//		int first=0;
		//		int last=ch.length-1;
		//		
		//		while(first<last) {
		//			char temp=ch[first];
		//			ch[first]=ch[last];
		//			ch[last]=temp;
		//			first++;
		//			last--;
		//		}
		//		System.out.println(ch);
		//		

		//============================Two Sum================================		
		//		   input:int arr[]= {2,5,8,4,1};
		//			output:[0,3]   //return index

		//		int arr[]= {1,2,3,4,5,6,7};
		//		int target=9;
		//		
		//		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//		
		//		int count=0;
		//		for(Integer num :arr) {
		//			
		//			if(hm.containsKey(target-num)) {
		//				hm.put(num, count++);
		//				
		//				System.out.println(hm.get(target-num)+" "+hm.get(num));
		//			}
		//			else {
		//				hm.put(num, count++);
		//			}
		//		}

		//=================Dupliacte-II (leetcode)=====================		
		//		int nums []= {1,0,1,1};
		//		int k=1;
		//		  Set<Integer> set = new HashSet<Integer>();
		//	        for(int i = 0; i < nums.length; i++){
		//	        	
		//	            if(i > k) 
		//	            	{
		//	            	set.remove(nums[i-k-1]);
		//	            	System.out.println("remove "+nums[i]+" ");
		//	            	
		//	            	}
		//	        	
		//
		//	            if(!set.add(nums[i])) {
		//	            	System.out.println("true");
		//
		//	            }
		//	            System.out.println("added"+nums[i]);
		//	        }

		//=========================================================	        


		//		
		//			int arr1[]= {2 ,6, 1, 9, 4, 5, 3};
		//			int N=arr1.length;
		//		   Arrays.sort(arr1);
		//		   System.out.println(Arrays.toString(arr1));
		//		   int count=0;
		//		   for(int i=1;i<=N;i++){
		//		       if(arr1[i]==i)
		//		       count++;
		//		       else
		//				   System.out.println(count);
		//		   }
		//		   System.out.println(count);

		//==================Find duplicate (distinct array contains only one duplicate) ==========================
		//		int nums[]= {1,2,3,4,3};
		//		int sum=0;
		//		  int len=nums.length-1;
		//		 int realSum=(len*(len+1))/2;
		//	  
		//	     for(int i=0;i<nums.length;i++){
		//	         sum=sum+nums[i];
		//	         
		//	     }
		//	    
		//	      int result=sum-realSum;


		//===========================================

		//	     String word1 = "abcd";
		//	     String word2 = "pq";
		//	     String res="";
		//            int count=0;
		//	        int first=0;
		//	        int second=0;
		//	     while(count<10) {
		//	     if(first<word1.length()){
		//	            res=res+word1.charAt(first);
		//	            first++;
		//	        }
		//	         if(second<word2.length()){
		//	            res=res+word2.charAt(second);
		//	            second++;
		//	           
		//	        }
		//	         count++;
		//	         System.out.println(res);
		//	     }
		//	         


		//===================================================
		//		int arr[]= {100,4,200,1,3,2};
		//
		//	     TreeSet<Integer> ts=new TreeSet<Integer>();
		//	     for(int i=0;i<arr.length;i++){
		//	         ts.add(arr[i]);
		//	     }
		//	    int max=0;
		//	    int count=0;
		//	    int j=0;
		//	     for(Integer i : ts){
		//	         if(i-j==1){
		//	             count++;
		//	             j=i;
		//	         }
		//	         else{
		//	             count=1;
		//	             j=i;
		//	         }
		//	         max=Math.max(max,count);
		//	     }
		//System.out.println(max);


		//==============Triplet Sum in Array(Geeks For Geeks)========================
		//		 int A[]= {1,2,4,3,6};
		//		 int X=10;
		//		Set<Integer> set=new HashSet<Integer>();
		//	       for(Integer i :A){
		//	           set.add(i);
		//	       }
		//	       
		//	       for(int i=0;i<A.length;i++){
		//	          int sum=A[i];
		//	          for(int j=i+1;j<A.length;j++){
		//	              int tempSum=sum+A[j];
		//	              System.out.println("tempsum   "+tempSum);
		//	              int k=X-tempSum;
		//	              System.out.println("k "+k);
		//	              System.out.println("************");
		//	              if(set.contains(k) ){
		//	                 System.out.println("true");
		//	              }
		//	          }//&& k!=A[i] && k!=A[j]
		//	       }
		//	        System.out.println("nahi mila ");

		//======================Trapping rainwater Geeksfor geeks======================	     

		//		int arr[]= {3,0,0,2,0,4};
		//		int n=arr.length;
		//		int maxleft=0;
		//        int maxrigth=0;
		//        int leftarr []=new int[n];
		//        int rigtharr[]=new int [n];
		//        int sum=0;
		//        for(int i=0;i<n;i++){
		//           maxleft=Math.max(maxleft, arr[i]);
		//           leftarr[i]=maxleft;
		//        }
		//        System.out.println(Arrays.toString(leftarr));
		//
		//        for(int i=n-1;i>=0;i--){
		//           maxrigth=Math.max(maxrigth, arr[i]);
		//           
		//        		   rigtharr[i]=maxrigth;
		//        }
		//        System.out.println(Arrays.toString(rigtharr));
		//
		//        
		//        for(int i=0;i<n;i++){
		//            sum=sum+Math.min(leftarr[i],rigtharr[i])-arr[i];
		//        }
		//        System.out.println(sum);


		//===========================================
		//		int arr[]= {1,2,3,5,4,6,8};
		//		int res=0;
		//		int sum=Integer.MIN_VALUE;
		//		int prevSum=Integer.MIN_VALUE;
		//		for(int i=0;i<arr.length-2;i++) {
		//			
		//			for(int j=i;j<i+3;j++) {
		//				sum=sum+arr[j];
		//				
		//			}
		//			  prevSum=Math.max(sum,prevSum);
		//				System.out.println(sum+" "+prevSum);
		//
		//		       
		//		}
		//	System.out.println(prevSum);

		//============Max Sum Subarray of size K(geeks for geeks -sliding window=========
		//		int arr[]= {1,2,3,5,4,6,8};
		//		int N=arr.length;
		//		int K=3; //subarray size
		//		    int i=0; //start point
		//	        int j=0; //end point
		//	        long  currSum=0;
		//	        long prevSum=0;
		//	        while(j<N){
		//	            prevSum=prevSum+arr[j];
		//	            if(j-i+1<K){
		//	                j++;
		//	            }
		//	            else if(j-i+1==K){
		//	                currSum=Math.max(currSum,prevSum);
		//	                prevSum=prevSum-arr[i];
		//	                i++;
		//	                j++;
		//	            }
		//	            
		//	        }
		//	        System.out.println(currSum);

		//=======================================
		//int arr[]= {1,2,3,4,5,5,5};
		//		String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
		//		Arrays.sort(arr);
		//		System.out.println(Arrays.toString(arr));

		//===========================(HeroMotoCorp 2023)==============================
		//		String str="bAAAtteEeeeej";
		//		String ans="";
		//		for(int i=0;i<str.length();i++) {
		//			char ch=str.charAt(i);
		//			System.out.println(ch);
		//			if((ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') || (ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')){
		//				if(str.charAt(i)==str.charAt(i+1)) {
		//					ans=ans+str.charAt(i)+str.charAt(i+1)+'$';
		//					i++;
		//				}
		//				else {
		//					ans=ans+str.charAt(i);
		//				}
		//				
		//			}
		//			
		//			else {
		//				ans=ans+str.charAt(i);
		//			}
		//		}
		//	System.out.println("Final Ans :"+ans);




		//========================trutleWork 2023======================	


		//		int arr[]= {3,4,9,2};
		//		int target=16;
		//		int i=0;
		//		int j=2;
		//
		//		
		//		int res=find(arr,target,i,j);
		//		if(res==1)
		//			System.out.println("true");
		//		else
		//			System.out.println("false");
		//			
		//}
		//
		//	private static int  find(int[] arr, int target, int i, int j) {
		//			
		//		if(  j<arr.length && i<arr.length) {
		//			if(arr[i]+arr[j]==target) {
		//				return 1;
		//			}
		//			
		//			else {
		//				i++;
		//				j++;
		//			}
		//			}
		//		else {
		//			return 0;
		//			
		//			
		//		}
		//		return find(arr,target,i,j);
		//	}





		//=================trutleWork 2023====================	
		//		int arr[]= {1,4,1,5,4,4,5,5};
		//		ArrayList<Integer> lst =new ArrayList<Integer>();
		//		
		//		for(int i=0;i<arr.length;i++)
		//		{
		//			if(arr[i]!=5)
		//			lst.add(arr[i]);
		//		}
		//		
		//		for(int i=0;i<lst.size();i++) {
		//			if(lst.get(i)==4) {
		//				lst.add(i+1, 5);
		//			}
		//		}
		//		
		//		System.out.println(lst);
		//		System.out.println(lst.size()==arr.length);
		//		
		//		


		//======================find majority dupicate element ================
		//		int a[]= {1,3,2,3,4,3};
		//		int size=a.length;
		//		int count=0;
		//		int maxCount = 0;
		//		int maxElement=0;
		//	    /* Frequency of each element is counted and checked.If it's greater than the utmost count element we found till now, then it is updated accordingly  */  
		//	    for(int i = 0; i< size; i++)   //For loop to hold each element
		//	    {
		//	        count = 1;
		//	        for(int j = i+1; j < size; j++)  //For loop to check for duplicate elements
		//	        {
		//	            if(a[j] == a[i])
		//	            {
		//	                count++;     //Increment  count
		//	                /* If count of current element is more than 
		//	                maxCount, then update maxElement */
		//	                if(count > maxCount)
		//	                {
		//	                    maxElement = a[j];
		//	                }
		//	            }
		//	        }
		//	        
		//	    }
		//System.out.println(maxElement);	        

		//===============================================

		//		
		//		String arr[]= {"flower", "flow", "flight"};		
		//		String prefix = arr[0];
		//		
		//		
		//        for(int i=1;i<arr.length;i++){
		//        	System.out.println("12345");
		//            while(arr[i].indexOf(prefix)!=0){
		//                prefix=prefix.substring(0,prefix.length()-1);
		//                
		//                
		//                System.out.println("prefix>>>>>"
		//                		+ "   "+prefix);
		//                if(prefix.isEmpty())
		//               System.out.println("result -1");
		//            }
		//        }
		//        System.out.println("result   "+prefix);



		//====================================

		//		
		//		int arr[]= {6,3,4,1,2};
		//				
		//		int size=arr.length;
		//		
		//	    int temp[]=new int [2];
		//	      Set<Integer> hs=new HashSet<Integer>();
		//	      int realSum=(n*(n+1))/2;
		//	      int currSum=0;
		//	      int res=0;
		//	        for(int i=0;i<arr.length;i++){
		//	            currSum=currSum+arr[i];
		//	            if(hs.contains(arr[i]))
		//	            temp[0]=arr[i];
		//	            else
		//	            hs.add(arr[i]);
		//	            
		//	        }
		//	        System.out.println(currSum+"fsedfsd "+realSum);
		//	        res=realSum-(currSum-temp[0]);
		//	        temp[1]=res;
		//	       System.out.println(Arrays.toString(temp));


		//==========Find Dupliacte using extra (space) array=============		
		//		int arr[]= {1,2,3,2,4,4,1};
		//		int size=arr.length;
		//
		//		int temp[]=new int [10000];
		//	       for(int i=0;i<size;i++){
		//	    	   if(temp[arr[i]]>=0)
		//	    	   {
		//	    		   temp[arr[i]]=arr[i]*-1;
		//	    		   System.out.println(Arrays.toString(temp));
		//	    	   }
		//	    	   else {
		//	    		   System.out.println("Dupliacte Value is :"+arr[i]);
		//	    	   }
		//	    	}

		//==========================Two sum ======================		

		//	      int nums[]= {1,2,3,4,5};
		//	      int target=5;
		//	      
		//	      for (int i = 0; i < nums.length; i++) {
		//            for (int j = i + 1; j < nums.length; j++) {
		//            	
		//                if (nums[i] + nums[j] == target) {
		//                	System.out.println(Arrays.toString(new int[] {nums[i],nums[j]}));
		//                }
		//            }
		//	      }

		//=======================Largest Subarray of Sum K (Variable size Slinding Window)=================================	

//		int arr[]= {1,1,2,5,1,6,1,2,2,1,1,1,5,7,9};
//		int N=arr.length;
//		int k=7;
//		int i=0,j=0,max=0;
//		int sum=0;
//		while(j<N){
//			sum=sum+arr[j];
//
//			
//
//			if(sum<k){
//				j++;
//			}
//			else if(sum==k){
//				max=Math.max(max, j-i+1);
//				j++;
//			}else if(sum>k){
//				while(sum>k) {
//					sum=sum-arr[i];
//					i++;
//				}
//				j++;
//			}  
//
//			
//
//		}
//		System.out.println(max);
		
//====================Three Sum====================================
		 
		
		int arr[]= {1, 3, 4, 5, 2, 6  };
		int sum=10;
		for (int i=0;i<arr.length;i++) {
			int target=sum-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int newtarget=target-arr[j];
				for(int k=j+1;k<arr.length;k++) {
					
					if(arr[k]==newtarget) {
						
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		
//===========================================================		

	}
}









































