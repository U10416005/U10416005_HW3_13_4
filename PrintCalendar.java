//U10416005林建宇
import java.util.*;

public class PrintCalendar{
	public static void main(String[] args){
		PrintCalendar og = new PrintCalendar();
		og.mCalendar();
	}
	public void mCalendar(){
		GregorianCalendar g = new GregorianCalendar();
		System.out.println("          " + g.get(GregorianCalendar.MONTH) + ",  " + g.get(GregorianCalendar.YEAR));
		System.out.println("---------------------------------------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		g.set(Calendar.DAY_OF_MONTH, 1);
		int week = g.get(Calendar.DAY_OF_WEEK);
	}
}