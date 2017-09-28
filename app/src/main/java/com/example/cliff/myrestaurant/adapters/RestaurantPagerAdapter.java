package com.example.cliff.myrestaurant.adapters;

/**
 * Created by cliff on 9/19/17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cliff.myrestaurant.models.Restaurant;
import com.example.cliff.myrestaurant.ui.RestaurantDetailFragment;

import java.util.ArrayList;

public class RestaurantPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Restaurant> mRestaurants;

    public RestaurantPagerAdapter(FragmentManager fm, ArrayList<Restaurant> restaurants) {
        super(fm);
        mRestaurants = restaurants;
    }

    @Override
    public Fragment getItem(int position) {

        Object Parcels = null;
        return RestaurantDetailFragment.newInstance(mRestaurants.get(position), Parcels);
    }

    @Override
    public int getCount() {
        return mRestaurants.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mRestaurants.get(position).getName();
    }
}