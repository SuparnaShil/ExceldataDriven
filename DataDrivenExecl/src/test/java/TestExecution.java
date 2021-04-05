import java.io.IOException;
import java.util.ArrayList;

public class TestExecution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataDriven dataset = new DataDriven();
		//PracticeColum dataset = new PracticeColum();
		
		ArrayList<String> data = dataset.GetData("Add Profile");
		//ArrayList<String> data = dataset.GetData("Value2","TestCase2");
		
		System.out.println("ghg");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		

	}

}
