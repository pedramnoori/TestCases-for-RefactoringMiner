import java.util.ArrayList;
import java.util.List;

public class TestStream {

public static void main(String[] args) {
		List movies=new ArrayList<>();
		
		movies.add("Zero");
        movies.add("Sultan");
		movies.add("Tanhaji");
        movies.add("Robot");
		movies.add("Wanted");
		
		for(int i=0;i<movies.size();i++)
		{
				System.out.println(movies.get(i));
		}
	}
}