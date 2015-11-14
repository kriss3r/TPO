package generateAndOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.util.Arrays;

public class saveToBin {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int begin = 5;
		int iter = 0;
		int count = 0;
		int countArr[] = new int[begin];

		DataOutputStream out = new DataOutputStream(new FileOutputStream("MyBinaryFile.txt"));
		while (iter < begin) {
			count = intGen.generate();
			out.writeInt(count);
			System.out.println(count);
			countArr[iter] = count;
			iter++;
		}
		out.writeInt(0);
		try {

			for (int i = 0; i < begin; i++) {
				System.out.println("countArr value: " + countArr[i]);
				for (int j = 0; j < countArr[i]; j++) {
					doubleGen.generate(countArr[i]);
					out.writeDouble(doubleGen.arr[j]);
					System.out.println(doubleGen.arr[j]);

				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("i got it papa! the error which is not an error is mine!!!");
		}
		out.flush();
		out.close();

	}

}
