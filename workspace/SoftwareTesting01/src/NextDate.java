
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class NextDate {
	public static String nextdate(int m, int d, int y) throws ParseException
	{
		if (m < 1 || m > 12) {
			return "�·ݳ�����Χ";
		}

		if (d < 1 || d > 31) {
			return "���ڳ�����Χ";
		}

		if (y < 1912 || y > 2050) {
			return "��ݳ�����Χ";
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��MM��dd��");
		Calendar c = Calendar.getInstance();
		c.setTime(sf.parse(y + "��" + m + "��" + d + "��"));
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
		System.out.printf("��������������������ÿո������");
		
		while(true)
		{
			// ���������յĴ���
			month = in.nextInt();
			if (month == -1)
			{
				break;
			}
			day = in.nextInt();
			year = in.nextInt();
			// �������
			try {
				result = nextdate(month, day, year);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(result);
			//System.out.print(month + "��");
			//System.out.print(day + "��");
			//System.out.print(year + "��");
			//System.out.printf("");
		}
		
		System.out.printf("���������");
		
		
	}
	
	
}
