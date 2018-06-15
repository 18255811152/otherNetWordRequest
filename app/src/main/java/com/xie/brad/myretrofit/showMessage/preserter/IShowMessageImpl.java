package com.xie.brad.myretrofit.showMessage.preserter;

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
    public void onClick() {
        iShowMessageView.showMsg("ssssssssssssss");
    }

    @Override
    public void showPrg() {
        iShowMessageView.showPrg("正在加载");
    }


}
