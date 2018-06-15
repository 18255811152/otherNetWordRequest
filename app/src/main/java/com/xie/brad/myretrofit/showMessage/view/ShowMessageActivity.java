package com.xie.brad.myretrofit.showMessage.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.xie.brad.myretrofit.R;
import com.xie.brad.myretrofit.base.BaseActivity;
import com.xie.brad.myretrofit.showMessage.preserter.IShowMessageImpl;

public class ShowMessageActivity extends BaseActivity implements IShowMessageView {
    private IShowMessageImpl iShowMessage;
    private Button BTNsearch_Msg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        iShowMessage = new IShowMessageImpl(ShowMessageActivity.this);
        BTNsearch_Msg = (Button) findViewById(R.id.search_Msg);

        BTNsearch_Msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iShowMessage.onClick();
            }
        });


    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(ShowMessageActivity.this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPrg(String msg) {

    }
}
