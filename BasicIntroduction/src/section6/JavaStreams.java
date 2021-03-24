package section6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names =new ArrayList<String>();
		
		names.add("Rithesh");
		names.add("Rithi");
		names.add("Sada");
		names.add("abc");
		names.add("akil");
		names.add("man");
		names.add("Abhi");
		int count=0;
		
		
		for(int i=0; i<names.size();i++)
		{
			String nameWithA=names.get(i);
			if(nameWithA.startsWith("a")|| nameWithA.startsWith("A"))
			{
				count++;
				
				
			}
					 
				
			}
		System.out.println("names start with A are " +count);
		
		//execute same scenario with Streams
		
		//1)convert collection into stream 
		//2)Then create lambda expression by using one operation  -->it is like for each loop
		//3)filter(s->s.startWith("A))
		//4)Then use terminal operation to perform that step 
		//5).count();
		
		
		//names.stream().filter(s->s.startsWith("a")|| s.startsWith("A")).count();
		//----1--------  ----3-- ----2----------------------------------   ---5---
		
			
		//names.stream().filter(s->s.startsWith("a")|| s.startsWith("A")).count();
		//----1--------  ----3-- ----2----------------------------------   ---5---
		
		Long c=names.stream().filter(s->s.startsWith("a")|| s.startsWith("A")).count();
		
		
		
		System.out.println(c);
		
		Stream.of("Akil","abhi","surya","anand","anil").filter(s->s.startsWith("A")).count();
		
			//if you want to continue in second line
		
		
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		String s1=names.stream().filter(s->s.length()>4).findFirst().get();
		System.out.println(s1);
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		
		streamMap();
		System.out.println("-------------------");
		sort();
		System.out.println("-------------------");
		mergeArrays();
		
		sortIntegers();
		
		
		
		
		
	}
	
	public static void streamMap()
	{
		//sorting names with last letter end with i and print them in uppercase
		Stream.of("Abhi","anjali", "anand","Avenash").filter(s->s.endsWith("i")).map(s->s.toUpperCase()).forEach(a->System.out.println(a));
	}
	
	public static void sort()
	{
		Stream.of("Don","King","Queen","enjoy","anand","abhi").map(a->a.toUpperCase()).sorted().forEach(a->System.out.println(a));
	}
	
	public static void mergeArrays()
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("ab");
		a.add("Zy");
		a.add("nm");
		
		String[] ab = {"ben","ZZ","cd"};
		List<String> abc =Arrays.asList(ab);
		
		Stream<String> sarr=Stream.concat(a.stream(), abc.stream());
		sarr.map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		//boolean b =sarr.anyMatch(se->se.equalsIgnoreCase("nm"));
		
		//Assert.assertTrue(b);
	}
	
	
		public static void sortIntegers()
		{
			//print unique numbers and sort it out
			//int[] numb = {1,2,3,5,8,4,2,1,8,0};
			List<Integer> num = Arrays.asList(1,2,4,3,4,1,6,5,9);
	         num.stream().distinct().sorted().forEach(s->System.out.println(s));
	        List<Integer> li = num.stream().distinct().sorted().collect(Collectors.toList());
	         
	         System.out.println(li.get(2));
	         
	         
			
		}
		
		
		
	}
	

