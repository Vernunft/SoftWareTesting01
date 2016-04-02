import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

/** 
* @author �����
* @date ����ʱ�䣺2016��3��28�� ����11:36:48 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/

public class NextDateTest {
	private static NextDate nextDate=new NextDate();
	
	@Test
	public void test1(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(24, 1, 1223), "�·ݳ�����Χ");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test2(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 34, 1223), "���ڳ�����Χ");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test3(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 1, 9999), "��ݳ�����Χ");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test4(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(2, 28, 2016), "2016��2��29��");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test5(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(2, 29, 2015), "2015��2��û��29��");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test6(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 31, 2015), "2016��1��1��");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

