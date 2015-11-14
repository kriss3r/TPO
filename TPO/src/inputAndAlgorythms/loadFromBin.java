package inputAndAlgorythms;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Random;

public class loadFromBin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		int k = Integer.parseInt(args[0]) - 1;
		System.out.println("returning solution for k value of: " + (k + 1));
		int algNum = 0;
		double beforeValue = 0, changedValue = 0, checkValue = 0;
		Random r = new Random();
		algNum = (int) (1 + (4 - 1) * r.nextDouble());

		System.out.println("using algorythm number: " + algNum);
		Thread.sleep(2000);
		int iter = 0;
		int hop = 0;
		int index=0;
		RandomAccessFile file = new RandomAccessFile("MyBinaryFile.txt", "rw");

		FileChannel channel = file.getChannel();
		MappedByteBuffer buf;
		MappedByteBuffer bufdoub;
		buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, (int) channel.size());
		IntBuffer ibuf = buf.asIntBuffer();
		
		int num = ibuf.get(k);
		
		while (ibuf.hasRemaining()) {
			index = ibuf.get();
			iter++;
			if (index == 0) {
				break;
			}
		}
		long bufSize=Double.BYTES*num;
		long bufStart=Integer.BYTES*(iter)+num*Double.BYTES;
		for (int j = 0; j < k; j++) {
			hop = hop + ibuf.get(j);
		}
		bufdoub=channel.map(FileChannel.MapMode.READ_WRITE, bufStart, bufSize);
		DoubleBuffer dBuffer = bufdoub.asDoubleBuffer();
		for (int i = 0; i < num; i++) {
			
			
			beforeValue = dBuffer.get(i);
			System.out.println("double value before being processed: " + beforeValue);
			switch (algNum) {
			case 1: {
				changedValue = Algorythms.frstAlg(beforeValue);
				checkValue = Algorythms.revFrstAlg(changedValue);
				break;
			}
			case 2: {
				changedValue = Algorythms.scndAlg(beforeValue);
				checkValue = Algorythms.revScndAlg(changedValue);
				break;
			}
			case 3: {
				changedValue = Algorythms.thrdAlg(beforeValue);
				checkValue = Algorythms.revThrdAlg(changedValue);
				break;
			}
			}
			System.out.println("double value after being processed: " + changedValue);
			System.out.println("double value after being processed by reverse algorythm: " + checkValue);
		}

		channel.close();

	}

}
