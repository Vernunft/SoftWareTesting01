
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class NextDate {
	public static String nextdate(int m, int d, int y) throws ParseException
	{
		if (m < 1 || m > 12) {
			return "月份超出范围";
		}

		if (d < 1 || d > 31) {
			return "日期超出范围";
		}

		if (y < 1912 || y > 2050) {
			return "年份超出范围";
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar c = Calendar.getInstance();
		c.setTime(sf.parse(y + "年" + m + "月" + d + "日"));
		c.add(Calendar.DATE, 1);
		
		return sf.format(c.getTime());
	}
	
	
	public NextDate() {
	}


	public static void main(String[] args)
	{
		int year = 0;
		int month = 0;
		int day = 0;
		String result = null;
		
		Scanner in = new Scanner(System.in);
		System.out.printf("请输入月日年的整数，用空格隔开：");
		
		while(true)
		{
			// 输入年月日的代码
			month = in.nextInt();
			if (month == -1)
			{
				break;
			}
			day = in.nextInt();
			year = in.nextInt();
			// 输入结束
			try {
				result = nextdate(month, day, year);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(result);
			//System.out.print(month + "月");
			//System.out.print(day + "日");
			//System.out.print(year + "年");
			//System.out.printf("");
		}
		
		System.out.printf("程序结束！");
		
		
	}
	
	
}
