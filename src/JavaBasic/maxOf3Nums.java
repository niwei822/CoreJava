package JavaBasic;

public class maxOf3Nums {
	
	public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int numList[]={num1, num2, num3};
        int maxNum=num1;
        for(int i=1;i<numList.length;i++) {
            if(numList[i]>num1) {
                maxNum=numList[i];
            }
        }
        return maxNum;
        /*
         if (num1 >= num2 && num1 >= num3) {
        return num1;
    } else if (num2 >= num1 && num2 >= num3) {
        return num2;
    } else {
        return num3;
    } */


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
