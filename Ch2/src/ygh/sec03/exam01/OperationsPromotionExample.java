package ygh.sec03.exam01;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2;
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);
        
        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; 
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드 : " + intValue2);
        System.out.println("출력문자 : " + (char)intValue2);
        
        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);
        
        int intValue5 = 10;
        //int intValue6 = 10 / 4.0; 
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);
        
        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);
	}

}
