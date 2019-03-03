package com.example.screen;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import java.util.Calendar;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PickerDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        DateSettings dateSettings = new DateSettings(getActivity());
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog;
        dialog = new DatePickerDialog(getActivity(),dateSettings,year,month,day);
        return dialog;
    }
}
