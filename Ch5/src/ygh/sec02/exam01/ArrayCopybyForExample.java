package ygh.sec02.exam01;

public class ArrayCopybyForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = { 1, 2 ,3 };
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.println(newIntArray[i] + ", ");
        }
	}

}
