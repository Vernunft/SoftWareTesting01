
import java.util.Scanner;
public class test {
  
	
 public static void main(String[] args) 
 {
		Scanner in = new Scanner(System.in);
	    int a,b,c;// �������߱���
	    while(true)
	    {
		      System.out.println("�����������ε�����,����-1�˳�����");
		      //�������ߵ�ֵ
		      a=in.nextInt();
		      b=in.nextInt();
		      c=in.nextInt();
	          if(a == -1)
	          {
	        	  System.out.println("�������˳�");
	        	  break;
	          }
	         String s= triangle(a,b,c);//���÷���
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
	    //�жϱߵķ�Χ
	    if(a<1 || a>100)
	    {
	    	 r="�߳�a������Ҫ��";
	    	 return r;
	    }
	    
	    else if(b<1 || b>100)
	    { 
	    	r = "�߳�a������Ҫ��";
	    	 return r;
	    }
	    else if(c<1 || c>100)
	    {
	    	r="�߳�c������Ҫ��";
	    	return r;
	    }
	    //�ж������Ƿ񹹳�������
	    if(a>(b+c))
	    {
	    	r= "����֮��С�ڵ�����,������������";
	    	return r;
	    }
	    else if(b>(a+c))
	    {
	    	   r="����֮��С�ڵ����ߣ�������������";
	    	     return r;
	    }
	    else if(c>(a+b))
	    {
	    	    r="����֮��С�ڵ����ߣ�������������";
	    	 	return r;
	    }
	    //�ж�����������ʲô����	 
	    if(a==b || b==c || a==c)
	    {
	    	 	
	    	if(a==b && b==c)
	    	 {
	    	 			
	    		r="�߳�Ϊabc���������ǵȱ�������";
	    	 		
	    	 }
	    	 		
	    	 else		
	    	 {
	    	 			
	    		 r="�߳�Ϊabc���������ǵ���������";
	    	 }
	    	 		
	    }
	    else
	    {
	    	 		
	    	r ="�߳�Ϊabc������������ͨ������";
	    	 		
	    }
	         return r;
}
}
