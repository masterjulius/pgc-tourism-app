package ph.gov.cagayan.tourismappv10;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import ph.gov.cagayan.tourismappv10.R;

/**
 * Created by dev on 10/3/17.
 */

public class CustomGeneralComponents extends AppCompatActivity {

    public void setupSidebar(Context context, int drawerLayout_ID) {

        final DrawerLayout mDrawerLayout;
        final ActionBarDrawerToggle mToggle;

        mDrawerLayout = (DrawerLayout) findViewById(drawerLayout_ID);
        mToggle = new ActionBarDrawerToggle((Activity) context, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
