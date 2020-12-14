package com.example.heart.model;

import android.bluetooth.BluetoothDevice;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<List<BluetoothDevice>> devices;

    public LiveData<List<BluetoothDevice>> getBluetoothDevices() {
        if (devices == null) {
            devices = new MutableLiveData<List<BluetoothDevice>>();
            devices.setValue(new ArrayList<BluetoothDevice>());
        }
        return devices;
    }

    public void addDevice(BluetoothDevice device) {
        List<BluetoothDevice> l = devices.getValue();
        if (!isDeviceInList(l,device)){
            l.add(device);
            devices.postValue(l);
        }
    }

    public void clearAll()
    {
        devices.getValue().clear();
    }
    public void addAll(List<BluetoothDevice> l){
        this.devices.getValue().addAll(l);
    }

    private boolean isDeviceInList(List<BluetoothDevice> liste,BluetoothDevice device) {
        if (liste != null && liste.size()> 0) {
            return liste.contains(device);
        } else {
            return false;
        }
    }
}