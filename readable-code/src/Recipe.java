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

	// spec6: ID��main���\�b�h�̈����Ŏw�肷��B
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
			System.out.println("�t�@�C����������܂���ł����B");
		}
		catch (IOException e) {
			System.out.println("�t�@�C�����ǂݍ��߂܂���ł����B");
		}

		// spec6: args�̗v�f���ŏꍇ�����B
		if (args.length == 0)
		{
			// spec6: ID���w�肳��Ȃ������ꍇ�̋�����spec5�Ɠ����B
			for (int loop = 0; loop < recipeList.size(); loop++) {
				System.out.println(loop + ": " + recipeList.get(loop));
			}
		}
		else if (args.length == 1)
		{
			// spec6: ID���w�肳�ꂽ�ꍇ�͂��̃��V�s�����o�͂ł��邱�ƁB
			int reservedId = Integer.parseInt(args[0]);
			for (int loop = 0; loop < recipeList.size(); loop++) {
				if (loop == reservedId){
					System.out.println(loop + ": " + recipeList.get(loop));
					return;
				}
			}
			System.out.println("�w�肵��ID�͑��݂��܂���B");
		}
		else
		{
			System.out.println("ID�̎w�萔������������܂���B");
		}



	}



}
