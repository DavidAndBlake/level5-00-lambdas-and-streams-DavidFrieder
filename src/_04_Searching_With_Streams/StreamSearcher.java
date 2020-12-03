package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class StreamSearcher {
	// 1. This method takes an array of Strings and a String. The method returns the number
	// of times the String parameter appears in the String array. This method will
	// use Streams to help us out.
	public long containsCount(String[] strArr, String strToCount) {
		//2. Convert the String array to a stream
		Stream<String> longStream = Arrays.stream(strArr);
//		longStream.forEach(x -> System.out.println(x));
		//3. Use the filter method with a lambda to extract all the String
		//   elements that match the String parameter.
//		longStream.filter((String s) -> {
//			if (s.equals(strToCount))
//			{
//				return true;
//			}
//			return false;
//		});//TODO: go over this in class to understand it better.
		longStream = longStream.filter(s -> s.equals(strToCount));//TODO: go over this in class to understand it better.
		//4. Return the count of the filtered stream.

		long streamer = longStream.count();
		
		return streamer;
	}
}
