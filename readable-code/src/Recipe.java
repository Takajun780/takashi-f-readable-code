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

	// spec6: IDはmainメソッドの引数で指定する。
	public static void main(String[] args) {
		List<String> recipeList = new ArrayList<String>();
		try {
			File recipeFile = new File("readable-code/src/recipe-data.txt");
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

		// spec6: argsの要素数で場合分け。
		if (args.length == 0)
		{
			// spec6: IDを指定されなかった場合の挙動はspec5と同じ。
			for (int loop = 0; loop < recipeList.size(); loop++) {
				System.out.println(loop + ": " + recipeList.get(loop));
			}
		}
		else if (args.length == 1)
		{
			// spec6: IDが指定された場合はそのレシピだけ出力できること。
			int reservedId = Integer.parseInt(args[0]);
			for (int loop = 0; loop < recipeList.size(); loop++) {
				if (loop == reservedId){
					System.out.println(loop + ": " + recipeList.get(loop));
					return;
				}
			}
			System.out.println("指定したIDは存在しません。");
		}
		else
		{
			System.out.println("IDの指定数が正しくありません。");
		}



	}



}
