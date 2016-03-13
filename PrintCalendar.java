//U10416005林建宇
import java.util.*;

public class PrintCalendar{
	public static void main(String[] args){
		PrintCalendar og = new PrintCalendar();
		og.mCalendar();
	}
	public void mCalendar(){
		GregorianCalendar g = new GregorianCalendar();
		System.out.println("                   " + g.get(GregorianCalendar.MONTH) + ",  " + g.get(GregorianCalendar.YEAR));
		System.out.println("---------------------------------------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		g.set(Calendar.DAY_OF_MONTH, 1);
		int week = g.get(Calendar.DAY_OF_WEEK);
		int month = g.get(Calendar.MONTH);
		for (int i = Calendar.SUNDAY; i < week; i++) {
		System.out.print("\t");
		}
		while (g.get(Calendar.MONTH) == month) {
			int day = g.get(Calendar.DAY_OF_MONTH);
			if (day < 10) {
				System.out.print(" " + day + "\t");
			} 
			else {
				System.out.print("" + day + "\t");
			}
			if (week == Calendar.SATURDAY) {
				System.out.println();
			}
			g.add(Calendar.DAY_OF_MONTH, 1);
			week = g.get(Calendar.DAY_OF_WEEK);
		}
	}
}