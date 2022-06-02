import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2)
    {
    	Map<Integer,Integer> a = new HashMap<Integer, Integer>();
    	Map<Integer,Integer> b = new HashMap<Integer, Integer>();
    	String m1="NO";
    	a.put(x1, v1+x1);//0,3
    	b.put(x2, v2+x2);//4,6
    	int key1 = x1;//0
    	int value1=v1+key1;//0+3=3
    	int key2 = x2;//4
    	int value2=v2+key2;//4+2=6
    	
  	for (int i=2;i<=10000;i++)
    	{
    		key1=value1;//ke1=3,6,,9
    		value1=key1+v1;//v1=6,9,12
    		
    		//a.put(key1, value1);
    		
    		key2=value2;//ke2=6,8,10
    		value2=key2+v2;//v2=8,10,12
    		//a.put(key2, value2);
    		if(value1==value2)
    		{
    			m1="YES";
    			break;
    		}
    			
    	}
    	
    	return m1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
