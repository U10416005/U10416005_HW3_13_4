//U10416005�L�ئt
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
		System.out.println("��\t�@\t�G\t�T\t�|\t��\t��");
		g.set(Calendar.DAY_OF_MONTH, 1);
		int week = g.get(Calendar.DAY_OF_WEEK);
	}
}