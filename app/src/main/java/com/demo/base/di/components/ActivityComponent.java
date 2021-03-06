package com.demo.base.di.components;


import com.demo.base.BaseActivity;
import com.demo.base.di.modules.ActivityModule;
import com.demo.base.di.scope.PerActivity;
import com.demo.ui.activity.SearchActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(BaseActivity baseActivity);
    void inject(SearchActivity searchActivity);
}
