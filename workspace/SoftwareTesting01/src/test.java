public class test {
  
	
	 public static void main(String[] args) {
	        
	        int a,b,c;
	        a= 10;
	        b=20;
	        c=30;
	       
	         String s= triangle(a,b,c);
	        System.out.println("边长为abc" + s);
	    }
	    
	    public static String  triangle(int a,int b, int c)
	    {
	    	int x,y,z;
	    	String r ="null";
	    	x=a;
	    	y=b;
	    	z=c;
	    	if(a<1 || a>100){
	    	 r="边长a不满足要求";
	    	 return r;}
	    	 if(b<1 || b>100)
	    	 { r = "边长a不满足要求";
	    	 return r;}
	    	 if(c<1 || c>100)
	    	 {r="边长c不满足要求";
	    	 return r;}
	    	 if(a>(b+c))
	    	 	{r= "两边之和小于第三边,不构成三角形";
	    	 	return r;}
	    	 if(b>(a+c))
	    	 	{r="两边之和小于第三边，不构成三角形";
	    	     return r;}
	    	 	if(c>(a+b))
	    	 		{r="两边之和小于第三边，不构成三角形";
	    	 	return r;}
	    	 if(a==b || b==c || a==c)
	    	 {
	    	 	if(a==b && b==c)
	    	 		{
	    	 			r="是等边三角形";
	    	 		}
	    	 		else
	    	 		{
	    	 			r="是等腰三角形";
	    	 		}
	    	 		
	    	 	}
	    	 	else
	    	 	{
	    	 		r ="是普通三角形";
	    	 		
	    	 		}
	         return r;
	    }
}
