package com.myPipe.readerAndWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
    public static void main(String[] args) throws IOException,
            InterruptedException {
        ReadData read = new ReadData();
        WriteData write = new WriteData();

        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();

//        in.connect(out);
        out.connect(in);

        ThreadRead readThread = new ThreadRead(read, in);
        readThread.start();

        Thread.sleep(2000);

        ThreadWrite writeThread = new ThreadWrite(write, out);
        writeThread.start();
    }
}
