import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author takashi-f
 */
public class Recipe {

	public static void main(String[] args) {
		List<String> recipeList = new ArrayList<String>();
		try {
			File recipeFile = new File("src/recipe-data.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(recipeFile));

			String row;
			while((row = bufferedReader.readLine()) != null) {
				recipeList.add(row);
			}
			bufferedReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
		}
		catch (IOException e) {
			System.out.println("ファイルが読み込めませんでした。");
		}
		
		for (int loop = 0; loop < recipeList.size(); loop++) {
			System.out.println(loop + ": " + recipeList.get(loop));
		}
		
	}

}
