package com.example.mli25782.michaelifragmentstest;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment{
    @Nullable
    private static TextView outputText;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment, container, false);
        outputText = (TextView)view.findViewById(R.id.outputText);
        return view;
    }
    public void setOutputText(String text) {
        outputText.setText(text);
    }
}
