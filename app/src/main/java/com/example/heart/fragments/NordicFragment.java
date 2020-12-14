package com.example.heart.fragments;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.heart.R;
import com.example.heart.model.NordicViewModel;

import java.util.UUID;

public class NordicFragment extends Fragment {

    public static String LBS_SERVICE_CONFIG = "00001810-0000-1000-8000-00805f9b34fb";
    public static String LBS_BTN_RX_CHARACTERISTIC_CONFIG = "00002A35-0000-1000-8000-00805f9b34fb";
    public static String LBE_CHARACTERISTIC_DESCRPT = "00002902-0000-1000-8000-00805f9b34fb" ;//0x2902;

    public final static UUID LBS_UUID_SERVICE =
            UUID.fromString(LBS_SERVICE_CONFIG);
    public final static UUID LBS_UUID_BUTTON_CHAR =
            UUID.fromString(LBS_BTN_RX_CHARACTERISTIC_CONFIG);
    public final static UUID UUID_LEDBTN_CHARACTERISTIC_DESCRPT =
            UUID.fromString(LBE_CHARACTERISTIC_DESCRPT);

    private NordicViewModel mViewModel;

    public static NordicFragment newInstance() {
        return new NordicFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.nordic_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NordicViewModel.class);
        // TODO: Use the ViewModel
    }

}