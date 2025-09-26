package com.example.androidjavatutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidjavatutorial.databinding.ExampleFragmentBinding;

public class ExampleFragment extends Fragment {

    private ExampleFragmentBinding fragmentBinding;

    public ExampleFragment() {
        super(R.layout.example_fragment);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentBinding = ExampleFragmentBinding.inflate(inflater, container, false);
        View view = fragmentBinding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentBinding.button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = fragmentBinding.editText1.getText().toString();

                Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
