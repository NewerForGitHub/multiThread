package com.myWaitNotifyInsert;

public class BackupA extends Thread {

    private DBTools dbtools;

    public BackupA(DBTools dbtools) {
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        this.dbtools.backupA();
    }

}
