public class test {
  
	
	 public static void main(String[] args) {
	        
	        int a,b,c;
	        a= 10;
	        b=20;
	        c=30;
	       
	         String s= triangle(a,b,c);
	        System.out.println("�߳�Ϊabc" + s);
	    }
	    
	    public static String  triangle(int a,int b, int c)
	    {
	    	int x,y,z;
	    	String r ="null";
	    	x=a;
	    	y=b;
	    	z=c;
	    	if(a<1 || a>100){
	    	 r="�߳�a������Ҫ��";
	    	 return r;}
	    	 if(b<1 || b>100)
	    	 { r = "�߳�a������Ҫ��";
	    	 return r;}
	    	 if(c<1 || c>100)
	    	 {r="�߳�c������Ҫ��";
	    	 return r;}
	    	 if(a>(b+c))
	    	 	{r= "����֮��С�ڵ�����,������������";
	    	 	return r;}
	    	 if(b>(a+c))
	    	 	{r="����֮��С�ڵ����ߣ�������������";
	    	     return r;}
	    	 	if(c>(a+b))
	    	 		{r="����֮��С�ڵ����ߣ�������������";
	    	 	return r;}
	    	 if(a==b || b==c || a==c)
	    	 {
	    	 	if(a==b && b==c)
	    	 		{
	    	 			r="�ǵȱ�������";
	    	 		}
	    	 		else
	    	 		{
	    	 			r="�ǵ���������";
	    	 		}
	    	 		
	    	 	}
	    	 	else
	    	 	{
	    	 		r ="����ͨ������";
	    	 		
	    	 		}
	         return r;
	    }
}
