package com.example.mli25782.michaelifragmentstest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TopSectionFragment extends Fragment{
    private static EditText textInput;


    topSectionListener activityCommander;
    public interface topSectionListener{
        public void createText(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (topSectionListener) activity;
        } catch(ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);
        textInput = (EditText) view.findViewById(R.id.textInput);
        final Button button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }
    public void buttonClicked(View view){
        activityCommander.createText(textInput.getText().toString());
    }
}
