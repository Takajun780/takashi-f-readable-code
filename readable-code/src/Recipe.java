import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author takashi-f
 */
public class Recipe {

	public static void main(String[] args) {
		try{
			File recipeFile = new File("src/recipe-data.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(recipeFile));

			String row;
			while((row = bufferedReader.readLine()) != null){
				System.out.println(row);
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

}
