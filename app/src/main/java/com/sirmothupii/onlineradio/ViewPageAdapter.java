package com.sirmothupii.onlineradio;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**created by sirmothupii 2018-03-15
 *
 */
public class ViewPageAdapter extends PagerAdapter
{
    //declaring my variables
    Activity activity;
    String images[];
    LayoutInflater inflater;

    public ViewPageAdapter(Activity activity, String[] images)
    {
        this.activity = activity;
        this.images = images;
    }

    @Override
    public int getCount()
    {
        return 0;
        return images.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        inflater =(LayoutInflater) activity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate().ViewPagerItem, Container.false);

        //Infating the images into viewpager box

        ImageView image;
        image = (ImageView) itemView.findViewById(R.Id.imageView);
        DisplayMetrics dis = new DisplayMetrics();
        activity.getWindow().getDefaulDisplay().getMetrics(dis);

        //image scale
        int height = dis.heightPixels;
        int width = dis.widthPixels;

        //scaling the images for the slides
        image.setMinimumHeight(height); //undo qualifier method if project crushes
        image.setMinimumWidth(width); // the above statement

        //Handle exceptins here
        try
        {
            Picasso.with(activity.getApplicationContext())
            .load(images[position])
            .placeholder(R.mipmap.ic_launcher)
            .into(image);
        }
        catch (Exception exc)
        {

        }
        container.addView(itemView);
        return itemView;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return false;
    }
}