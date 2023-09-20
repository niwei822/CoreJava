package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class printX {
	
	public static List<String> printX(int n) {
        // write your code here
		/*For each line (from 0 to n-1):
Create a line of characters (an array of characters) of length n.
Set 'X' at the current position i (from the left).
Set 'X' at the position (n - i - 1) (from the right).
Fill all other positions in the line with spaces.
Add the line as a string to the list of lines.*/
        List<String> ls = new ArrayList<String>();
        char[] line=new char[n];//创建一个长度为n的字符型数组line
        for(int i=0;i<n;i++){//外循环遍历正整数n的次数
            for(int j=0;j<n;j++){//该循环为了辅助初始化字符型数组中的每个属性
                line[j]=' ';//初始化字符型数组中的每个属性
            }
            line[i]='X';//左边对应位置赋值"X“
            line[n-i-1]='X';//右边对应位置赋值“X”
            ls.add(String.valueOf(line));//将得到的line转换成字符串的形式增加到ArrayList
        }
        return ls;//返回ArrayList
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printX(3));
	}

}
