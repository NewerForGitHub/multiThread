package com.myPipe.stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

    public static void main(String[] args) throws IOException,
            InterruptedException {
        WriteData write = new WriteData();
        ReadData read = new ReadData();

        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream in = new PipedInputStream();

//		out.connect(in);
        in.connect(out);

        ThreadRead threadRead = new ThreadRead(read, in);
        threadRead.start();

        Thread.sleep(2000);

        ThreadWrite threadWrite = new ThreadWrite(write, out);
        threadWrite.start();
    }

}
