package com.example.preference;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class MainActivity extends PreferenceActivity {
    PreferenceManager pm;
    CheckBoxPreference checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.activity_main);
        pm = getPreferenceManager();
        checkbox = (CheckBoxPreference) pm.findPreference("checkbox");
        boolean n = checkbox.isChecked();
        Toast.makeText(getApplicationContext(), "now" + n, Toast.LENGTH_SHORT).show();
    }
}