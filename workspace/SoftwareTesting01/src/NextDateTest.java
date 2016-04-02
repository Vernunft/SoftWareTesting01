import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

/** 
* @author 李冰冰
* @date 创建时间：2016年3月28日 上午11:36:48 
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
			
			Assert.assertEquals(nextDate.nextdate(24, 1, 1223), "月份超出范围");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test2(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 34, 1223), "日期超出范围");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test3(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 1, 9999), "年份超出范围");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test4(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(2, 28, 2016), "2016年2月29日");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test5(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(2, 29, 2015), "2015年2月没有29日");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test6(){
		try {
			
			Assert.assertEquals(nextDate.nextdate(12, 31, 2015), "2016年1月1日");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

