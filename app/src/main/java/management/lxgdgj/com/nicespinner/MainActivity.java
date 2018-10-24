package management.lxgdgj.com.nicespinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.angmarch.views.NiceSpinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private NiceSpinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        List<String> dataset = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));

        mSpinner = (NiceSpinner) findViewById(R.id.spinner);

        mSpinner.attachDataSource(dataset);
    }


}
