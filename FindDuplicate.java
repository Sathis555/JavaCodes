package payilagam;
/*This is one of the strategy to find the odd member among a team of 12 members with same weight
 * (but one of them is not as same weight as other members 
   using only three chances with see-saw weight calculation */

public class FindDuplicate {
	
	public static void main(String[] args) {
		/* You can change any one of the values of n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12 and 
		 * check whether this code works or not but other variable values should be same.
		 * otherwise this code wont work
		 * */
		int n1=5;
		int n2=5;
		int n3=5;
		int n4=5;
		int n5=5;
		int n6=8;
		int n7=5;
		int n8=5;
		int n9=5;
		int n10=5;
		int n11=5;
		int n12=5;

	int members[]={n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12};
	       int one=chance1(members);
	       int two= chance2(members);
	       int three= chance3(members);
	           result(one,two,three);
		}
	 public static int chance1(int[] values){
		 int result1=0;
	int left=values[0]+values[1]+values[2]+values[3];
		 int right=values[4]+values[5]+values[6]+values[7];
		 if(right==left){ result1=0;  }
		 if(right<left){ result1=-1;  }
		 if(right>left){ result1=1;  }
	
		
		 return result1;
	 }
	 public static int chance2(int[] values){
		 int result1=0;
		 int left=values[0]+values[1]+values[8]+values[9];
		 int right=values[2]+values[3]+values[4]+values[10];
		 
		
		 if(right==left){ result1=0;  }
		 if(right<left){ result1=-1;  }
		 if(right>left){ result1=1;  }
	     return result1;
		
	 }
	 public static int chance3(int[] values){
		 int result1=0;
		 int left=values[0]+values[2]+values[6]+values[8];
		 int right=values[1]+values[7]+values[9]+values[11];
		
		 if(right==left){ result1=0;  }
		 if(right<left){ result1=-1;  }
		 if(right>left){ result1=1;  }
	     return result1;
		
	 }
	 public static void result(int one,int two,int three){
		 if(one==-1&&two==-1&&three==-1){
	        	System.out.println("n1 is the suspect and he is heavy weight");
	        }
	         if(one==1&&two==1&&three==1){
	        	System.out.println("n1 is the suspect and he is light weight");
	        }
	         if(one==-1&&two==-1&&three==1){
	        	System.out.println("n2 is the suspect and he is heavy weight");
	        }
	         if(one==1&&two==1&&three==-1){
	        	System.out.println("n2 is the suspect and he is light weight");
	        }
	        if(one==-1&&two==1&&three==-1){
	        	System.out.println("n3 is the suspect and he is heavy weight");
	        }
	        if(one==1&&two==-1&&three==1){
	        	System.out.println("n3 is the suspect and he is light weight");
	        }
	        if(one==-1&&two==1&&three==0){
	        	System.out.println("n4 is the suspect and he is Heavy weight");
	        }
	        if(one==1&&two==-1&&three==0){
	        	System.out.println("n4 is the suspect and he is light weight");
	        }
	        if(one==1&&two==1&&three==0){
	        	System.out.println("n5 is the suspect and he is Heavy weight");
	        }
	         if(one==-1&&two==-1&&three==0){
	        	System.out.println("n5 is the suspect and he is light weight");
	        }
	         if(one==1&&two==0&&three==0){
	        	System.out.println("n6 is the suspect and he is Heavy weight");
	        }
	         if(one==-1&&two==0&&three==0){
	        	System.out.println("n6 is the suspect and he is light weight");
	        }
	         if(one==-1&&two==0&&three==1){
		        System.out.println("n7 is the suspect and he is Heavy weight");
		    }
		     if(one==1&&two==0&&three==-1){
		        System.out.println("n7 is the suspect and he is light weight");
		    }

	         if(one==1&&two==0&&three==1){
		        System.out.println("n8 is the suspect and he is Heavy weight");
		    }
		     if(one==-1&&two==0&&three==-1){
		        System.out.println("n8 is the suspect and he is light weight");
		    }   

	         if(one==0&&two==-1&&three==-1){
		        System.out.println("n9 is the suspect and he is Heavy weight");
		    }
		     if(one==0&&two==1&&three==1){
		        System.out.println("n9 is the suspect and he is light weight");
		    }

	         if(one==0&&two==-1&&three==1){
		        System.out.println("n10 is the suspect and he is Heavy weight");
		    }
		     if(one==0&&two==1&&three==-1){
		        System.out.println("n10 is the suspect and he is light weight");
		    }

	         if(one==0&&two==1&&three==0){
		        System.out.println("n11 is the suspect and he is Heavy weight");
		    }
		     if(one==0&&two==-1&&three==0){
		        System.out.println("n11 is the suspect and he is light weight");
		    }

	         if(one==0&&two==0&&three==1){
		        System.out.println("n12 is the suspect and he is Heavy weight");
		    }
		     if(one==0&&two==0&&three==-1){
		        System.out.println("n12 is the suspect and he is light weight");
		    }
	 }

}
