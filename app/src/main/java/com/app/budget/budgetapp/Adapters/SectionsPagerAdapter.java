package com.app.budget.budgetapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.app.budget.budgetapp.Fragments.CalenderFragment;
import com.app.budget.budgetapp.Fragments.CardFragment;

/**
 * Created by Hitesh on 26/03/17.
 */



/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private CalenderFragment calenderFragment;
    private CardFragment cardFragment;
    public SectionsPagerAdapter(FragmentManager fm,CardFragment cardFragment,CalenderFragment calenderFragment) {
        super(fm);
        this.cardFragment=cardFragment;
        this.calenderFragment=calenderFragment;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if(position==1)
        {
            return cardFragment;
        }else {
            return calenderFragment;
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "CALENDER";
            case 1:
                return "HOME";
        }
        return null;
    }


}

