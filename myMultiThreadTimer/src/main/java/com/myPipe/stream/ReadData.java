package com.myPipe.stream;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

	public void readMethod(PipedInputStream in) {
		try {
			System.out.println("read :");
			byte[] byteArray = new byte[20];
			int length = in.read(byteArray);
			while(length != -1) {
				String newData = new String(byteArray, 0, length);
				System.out.print(newData);
				length = in.read(byteArray);
			}
			System.out.println();
			in.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
