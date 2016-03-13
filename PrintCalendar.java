//U10416005林建宇

//import all
import java.util.*;

public class PrintCalendar{
	//main method
	public static void main(String[] args){
		//new PrintCalendar
		PrintCalendar og = new PrintCalendar();
		//call mCalendar
		og.mCalendar();
	}
	public void mCalendar(){
		//new GregorianCalendar
		GregorianCalendar g = new GregorianCalendar();
		///Show month and year
		System.out.println("                   " + g.get(GregorianCalendar.MONTH)  + ",  " + g.get(GregorianCalendar.YEAR));
		System.out.println("---------------------------------------------------");
		//make the form for day
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//set the GregorianCalendar day number is 1
		g.set(Calendar.DAY_OF_MONTH, 1);
		int week = g.get(Calendar.DAY_OF_WEEK);
		int month = g.get(Calendar.MONTH);
		//fill the Sunday to the month of first day by blank
		for (int i = Calendar.SUNDAY; i < week; i++) {
		System.out.print("\t");
		}
		//make the calendar date
		while (g.get(Calendar.MONTH) == month) {
			int day = g.get(Calendar.DAY_OF_MONTH);
			//when day number is one digit fill a blank
			if (day < 10) {
				System.out.print(" " + day + "\t");
			} 
			else {
				System.out.print("" + day + "\t");
			}
			//turn the next line after Saturday
			if (week == Calendar.SATURDAY) {
				System.out.println();
			}
			//add the number of the day
			g.add(Calendar.DAY_OF_MONTH, 1);
			week = g.get(Calendar.DAY_OF_WEEK);
		}
	}
}