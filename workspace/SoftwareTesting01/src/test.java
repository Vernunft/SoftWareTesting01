
import java.util.Scanner;
public class test {
  
	
 public static void main(String[] args) 
 {
		Scanner in = new Scanner(System.in);
	    int a,b,c;// 定义三边变量
	    while(true)
	    {
		      System.out.println("请输入三角形的三边,输入-1退出程序");
		      //输入三边的值
		      a=in.nextInt();
		      b=in.nextInt();
		      c=in.nextInt();
	          if(a == -1)
	          {
	        	  System.out.println("程序已退出");
	        	  break;
	          }
	         String s= triangle(a,b,c);//调用方法
	         System.out.println( s);
	     }
	        
}
public static String  triangle(int a,int b, int c)
{
	    int x,y,z;
	    String r ="null";
	    x=a;
	    y=b;
	    z=c;
	    //判断边的范围
	    if(a<1 || a>100)
	    {
	    	 r="边长a不满足要求";
	    	 return r;
	    }
	    
	    else if(b<1 || b>100)
	    { 
	    	r = "边长b不满足要求";
	    	 return r;
	    }
	    else if(c<1 || c>100)
	    {
	    	r="边长c不满足要求";
	    	return r;
	    }
	    //判断三边是否构成三角形
	    if(a>=(b+c))
	    {
	    	r= "两边之和小于等于第三边,不构成三角形";
	    	return r;
	    }
	    else if(b>=(a+c))
	    {
	    	   r="两边之和小于等于第三边，不构成三角形";
	    	     return r;
	    }
	    else if(c>=(a+b))
	    {
	    	    r="两边之和小于等于第三边，不构成三角形";
	    	 	return r;
	    }
	    //判断三角形属于什么类型
	    
	    if(a*a+b*b== c*c || a*a+c*c==b*b || b*b+c*c==a*a)
	    {
	    	r="边长为abc的三角形是直角三角形";
	    	
	    }
	    else if(a==b || b==c || a==c)
	    {
	    	 	
	    	if(a==b && b==c)
	    	 {
	    	 			
	    		r="边长为abc的三角形是等边三角形";
	    	 		
	    	 }
	    	 		
	    	 else		
	    	 {
	    	 			
	    		 r="边长为abc的三角形是等腰三角形";
	    	 }
	    	 		
	    }
	    else
	    {
	    	 		
	    	r ="边长为abc的三角形是普通三角形";
	    	 		
	    }
	         return r;
}
}
