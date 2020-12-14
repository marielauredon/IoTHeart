package com.example.heart.model;


import android.bluetooth.BluetoothAdapter;

public class BLEHelper {

    private BluetoothAdapter bluetoothAdapter=null ;

    private static BLEHelper uniqueInstance;
    private BLEHelper() {

    }
    public static synchronized BLEHelper getInstance() {
        if (getUniqueInstance() == null) {
            setUniqueInstance(new BLEHelper());
        }
        return getUniqueInstance();
    }

    public static BLEHelper getUniqueInstance() {
        return uniqueInstance;
    }

    public static void setUniqueInstance(BLEHelper uniqueInstance) {
        BLEHelper.uniqueInstance = uniqueInstance;
    }

    public BluetoothAdapter getBluetoothAdapter() {
        return bluetoothAdapter;
    }

    public void setBluetoothAdapter(BluetoothAdapter bluetoothAdapter) {
        this.bluetoothAdapter = bluetoothAdapter;
    }
}
