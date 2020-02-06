package kr.co.chience.accex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import kr.co.chience.accex.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setLifecycleOwner(this);
        final CounterViewModel viewModel = ViewModelProviders.of(this).get(CounterViewModel.class);
        binding.setViewModel(viewModel);

        //binding.countTextView.setText(viewModel.count.getValue() + "");

        binding.fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.increase();
            }
        });

        binding.fabRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.decrease();
            }
        });
//
//        viewModel.count.observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                // UI 업데이트
//                binding.countTextView.setText(viewModel.count.getValue() +"");
//            }
//        });
    }
}
