package JavaBasic;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public static String reformatDate(String date) {
    	
    	StringBuilder sb = new StringBuilder();
        // Define month mapping
        Map<String, String> monthMapping = new HashMap<>();
        monthMapping.put("Jan", "01");
        monthMapping.put("Feb", "02");
        monthMapping.put("Mar", "03");
        monthMapping.put("Apr", "04");
        monthMapping.put("May", "05");
        monthMapping.put("Jun", "06");
        monthMapping.put("Jul", "07");
        monthMapping.put("Aug", "08");
        monthMapping.put("Sep", "09");
        monthMapping.put("Oct", "10");
        monthMapping.put("Nov", "11");
        monthMapping.put("Dec", "12");

        // Split the date string into components
        String[] dateComponents = date.split(" ");

        // Extract day, month, and year
        String day = dateComponents[0];
        String month = monthMapping.get(dateComponents[1]);
        String year = dateComponents[2] + "-";

        // Remove "st", "nd", "rd", or "th" from the day
        if(day.length()==3) {
        	day = "-" + "0" + day.charAt(0);
        } else if(day.length()==4) {
        	day = "-" + day.substring(0,2);
        }

        sb.append(year);
        sb.append(month);
        sb.append(day);

        return sb.toString();
    }

    public static void main(String[] args) {
        String date = "1st Aug 2023";
        String formattedDate = reformatDate(date);
        System.out.println(formattedDate); 
    }
}
