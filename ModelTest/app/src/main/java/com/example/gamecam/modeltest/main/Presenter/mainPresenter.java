package com.example.gamecam.modeltest.main.Presenter;

import android.view.View;
import android.widget.TextView;

/**
 * Created by gamecam on 12.2.2018.
 */
import com.example.gamecam.modeltest.main.Model.Calculations;
import com.example.gamecam.modeltest.R;

public class mainPresenter {
    private View mView;
    private Calculations modelCalc;
    private TextView tx;

    public mainPresenter() {
        modelCalc = new Calculations();
    }


    public void onClick (View view) {
        mView=view;
        calculate();
    }


    public View getmView() {
        return mView;
    }

    public void setmView(View mView) {
        this.mView = mView;
    }

    public void updateView (String str) {
    tx=(TextView) mView.findViewById(R.id.text);
    tx.setText(str);
    }

    public void calculate () {
    int ret = modelCalc.plus(1,1);
    updateView(String.valueOf(ret));
    }
}
