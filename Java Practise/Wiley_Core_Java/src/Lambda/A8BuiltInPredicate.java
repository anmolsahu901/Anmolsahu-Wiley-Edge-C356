package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class A8BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checkLength = (s)->s.length()>4 || s.endsWith("a");
		
		List<String> fi = Arrays.asList("Java","Python","Jira","Angular");
		fi.forEach(l->{
			if(checkLength.test(l)) {
				System.out.println(l);
			}
		});
		
		
		
		
	}

}
