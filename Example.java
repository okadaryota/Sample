package example;

/**
 * 例題プログラム：この例題を改変して大きなプログラムを作る足がかりにしてください。
 */
public class Example extends Object
{
	/**
	 * 例題のメインプログラム。
	 * @param arguments 引数の文字列の配列
	 */
	public static void main(String[] arguments)
	{
		String aString = "Hello world.%n";
		String tooLongString;
		Integer howMany = 10000;
		Long start;
		Long end;

		// 文字列の連結に「+」を用いる場合
		start = System.currentTimeMillis();
		tooLongString = "";
		for (Integer index = 1; index <= howMany; index++)
		{
			tooLongString = tooLongString + String.valueOf(index) + ": " + aString;
		}
		end = System.currentTimeMillis();
		System.out.printf("実行にかかった時間は「%4sミリ秒」です。%n", (end - start));

		// 文字列の連結に「StringBuffer」を用いる場合
		start = System.currentTimeMillis();
		StringBuffer aBuffer = new StringBuffer();
		for (Integer index = 1; index <= howMany; index++)
		{
			aBuffer.append(String.valueOf(index));
			aBuffer.append(": ");
			aBuffer.append(aString);
		}
		tooLongString = aBuffer.toString();
		end = System.currentTimeMillis();
		System.out.printf("実行にかかった時間は「%4sミリ秒」です。%n", (end - start));

		// 文字列の連結に「StringBuilder」を用いる場合
		start = System.currentTimeMillis();
		StringBuilder aBuilder = new StringBuilder();
		for (Integer index = 1; index <= howMany; index++)
		{
			aBuilder.append(String.valueOf(index));
			aBuilder.append(": ");
			aBuilder.append(aString);
		}
		tooLongString = aBuilder.toString();
		end = System.currentTimeMillis();
		System.out.printf("実行にかかった時間は「%4sミリ秒」です。%n", (end - start));

		return;
	}
}

/*******************************************************************************
 
以上のことから、文字列の結合（連結）には「+」を用いることは得策ではない、ということがわかる。
StringBufferを用いなさい、マルチスレッド下でも、高速に文字列の連結を行います。
StringBuilderは、シングルスレッドのときにかぎり用いなさい。
 
*******************************************************************************/

