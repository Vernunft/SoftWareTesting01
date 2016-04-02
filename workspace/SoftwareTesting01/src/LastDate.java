import java.util.Calendar;
import java.util.Scanner;

public class LastDate {

	public static void main(String[] args) {
		int year = 0, month, day;
		Scanner in = new Scanner(System.in);
		System.out.println("���Ҫ��ֹ����������-1,���ҳ���ֻ����������������������׳��쳣����ֹ");
		while (year != -1) {
			System.out.println("�������� ��  ��");
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
			lastDay += "��ݳ�����Χ";
		} else if (!(month >= 1 && month <= 12)) {
			flag = 1;
			lastDay += "�·ݳ�����Χ";
		} else if (!(day >= 1 && day <= 31)) {
			flag = 1;
			lastDay += "���ڳ�����Χ";
		}
		if (flag == 0) {
			if (month == 2 && day >= 28) {
				flag = 3;
				if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && day > 29) {
					lastDay += year + "��2��ֻ�е�29��";
				} else {
					lastDay += year + "��2��ֻ�е�28��";
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				flag = 3;
				if (day == 31) {
					lastDay += year + "��" + month + "��ֻ�е�30��";
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
			lastDay += year + "��" + month + "��" + day + "��";
		}
		return lastDay;
	}

}
