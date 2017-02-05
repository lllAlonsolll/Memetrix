package com.lpaulino.memetrix.presentation.common;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * @author Luis Alonso Paulino Flores on 3/02/17.
 */

public interface MemetrixFragmentListener {

    void replaceFragment(Fragment fragment);

    void replaceFragment(Fragment fragment, boolean addToBackStack);

    void replaceFragment(int frameId, Fragment fragment);

    void replaceFragment(int frameId, Fragment fragment, boolean addToBackStack);

    void showLoader();

    void dismissLoader();

    void setDefaultToolbar();

    void setDefaultToolbar(boolean homeEnabled);

    void setDefaultToolbar(boolean homeEnabled, boolean backActionEnabled);

    void setCustomToolbar(Toolbar toolbar);

    void setCustomToolbar(Toolbar toolbar, boolean homeButtonEnabled);

    void setCustomToolbar(Toolbar toolbar, boolean homeButtonEnabled, boolean backActionEnabled);

    void setToolbarTitle(String title);

    void showErrorMessage(Exception exception);

    void showSuccessMessage(String message);

    void dismissActivity();
}
