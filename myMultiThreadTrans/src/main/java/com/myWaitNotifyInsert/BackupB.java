package com.myWaitNotifyInsert;

public class BackupB extends Thread {

    private DBTools dbtools;

    public BackupB(DBTools dbtools) {
        this.dbtools = dbtools;
    }

    @Override
    public void run() {
        this.dbtools.backupB();
    }

}
