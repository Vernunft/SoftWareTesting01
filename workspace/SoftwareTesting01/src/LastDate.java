import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class LastDate {

	public static void main(String[] args) {
		int year = 0, month, day;
		Scanner in = new Scanner(System.in);
		System.out.println("如果要终止程序请输入-1,并且程序只允许输入整数，否则程序抛出异常并终止");
		while (year != -1) {
			System.out.println("请输入年 月  日");
			year = in.nextInt();
			if (year == -1)
			{
				break;
			}
			month = in.nextInt();
			day = in.nextInt();
			try {
				System.out.println(lastDay(year, month, day));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static String lastDay(int year, int month, int day) throws ParseException {
		if (year < 1912 || year > 2050) {
			return "年份超出范围";
		}

		if (month < 1 || month > 12) {
			return "月份超出范围";
		}

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			if (month == 2) {
				if (month < 1 || month > 29) {
					return "日期超出范围";
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (day < 1 || day > 31) {
					return "日期超出范围";
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					return "日期超出范围";
				}
			}

		} else {
			if (month == 2) {
				if (day < 1 || day > 28) {
					return "日期超出范围";
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (day < 1 || day > 31) {
					return "日期超出范围";
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					return "日期超出范围";
				}
			}

		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar c = Calendar.getInstance();
		c.setTime(sf.parse(year + "年" + month + "月" + day + "日"));
		c.add(Calendar.DATE, -1);

		return sf.format(c.getTime());
	}

}
