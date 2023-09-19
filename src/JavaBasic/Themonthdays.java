package JavaBasic;

public class Themonthdays {
	
	public int getTheMonthDays(int year, int month) {
        // write your code here
        if((year%4==0 && year%100!=0 || year%400==0) && (month==2)) {
            return 29;
        }
        else if(month%2!=0 && month<8 || (month%2==0 && (month>7 && month<=12))) {
            return 31;
        }
        else if(month==2) {
            return 28;
        }
        else {
            return 30;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
