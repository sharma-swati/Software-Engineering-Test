import java.util.*;
public class HelloWorld
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for(int i=0;i<8;i++){
			list.add(i);
		}
		int firstElement = list[0];
	}
}
