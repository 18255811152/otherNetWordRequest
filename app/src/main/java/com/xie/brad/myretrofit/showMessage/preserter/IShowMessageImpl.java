package com.xie.brad.myretrofit.showMessage.preserter;

import android.view.View;

import com.xie.brad.myretrofit.showMessage.view.IShowMessageView;
import com.xie.brad.myretrofit.showMessage.view.ShowMessageActivity;

public class IShowMessageImpl implements IShowMessagePreserter {

    private IShowMessageView iShowMessageView;
    private ShowMessageActivity showMessageActivity;

    public IShowMessageImpl(IShowMessageView iShowMessageView) {
        this.iShowMessageView = iShowMessageView;
        this.showMessageActivity = (ShowMessageActivity) iShowMessageView;

    }

    @Override
    public void onClick(View View) {
        iShowMessageView.showMsg("ssssssssssssss");
    }


}
