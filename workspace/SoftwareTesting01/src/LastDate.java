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
			month = in.nextInt();
			day = in.nextInt();
			System.out.println(lastDay(year, month, day));
		}

	}

	public static String lastDay(int year, int month, int day) {
		String lastDay = "";
		int flag = 0;
		if (!(year >= 1912 && year <= 2050)) {
			flag = 1;
			lastDay += "年份超出范围";
		} else if (!(month >= 1 && month <= 12)) {
			flag = 1;
			lastDay += "月份超出范围";
		} else if (!(day >= 1 && day <= 31)) {
			flag = 1;
			lastDay += "日期超出范围";
		}
		if (flag == 0) {
			if (month == 2 && day >= 28) {
				flag = 3;
				if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && day > 29) {
					lastDay += year + "年2月只有到29号";
				} else {
					lastDay += year + "年2月只有到28号";
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				flag = 3;
				if (day == 31) {
					lastDay += year + "年" + month + "月只有到30号";
				}
			}
		}
		if (flag != 3 && flag != 1) {
			if (day != 1) {
				day -= 1;
			} else {
				if (month == 3) {
					month -= 1;
					if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
						day = 29;
					} else {
						day = 28;
					}
				} else if (month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					month -= 1;
					day = 30;
				} else if (month == 1) {
					year -= 1;
					month = 12;
					day = 31;
				} else {
					month -= 1;
					day = 31;
				}
			}
			lastDay += year + "年" + month + "月" + day + "日";
		}
		return lastDay;
	}

}
