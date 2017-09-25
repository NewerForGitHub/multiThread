package com;

public class TestThreadLocal {

    public static void main(String[] args) {
        TestThreadLocal sn = new TestThreadLocal();
        // �� 3���̹߳���sn�����Բ������к�
        TestClient t1 = new TestClient(sn);
        TestClient t2 = new TestClient(sn);
        TestClient t3 = new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();
    }

    // ��ͨ�������ڲ��า��ThreadLocal��initialValue()������ָ����ʼֵ
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    // �ڻ�ȡ��һ������ֵ
    public int getNextNum() {
        TestThreadLocal.seqNum.set(TestThreadLocal.seqNum.get() + 1);
        return TestThreadLocal.seqNum.get();
    }

    private static class TestClient extends Thread {
        private TestThreadLocal sn;

        public TestClient(TestThreadLocal sn) {
            this.sn = sn;
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                // ��ÿ���̴߳��3������ֵ
                System.out.println("thread[" + Thread.currentThread().getName()
                    + "] --> sn[" + this.sn.getNextNum() + "]");
            }
        }
    }

}
