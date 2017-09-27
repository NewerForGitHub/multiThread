package com.myWaitNotifyInsert;

public class Run {
    public static void main(String[] args) {
        DBTools dbtools = new DBTools();
        for (int i = 0; i < 200; i++) {
            BackupA backupA = new BackupA(dbtools);
            backupA.start();
            BackupB backupB = new BackupB(dbtools);
            backupB.start();
        }
    }
}
