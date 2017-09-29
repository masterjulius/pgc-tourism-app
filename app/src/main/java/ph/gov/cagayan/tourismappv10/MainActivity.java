package ph.gov.cagayan.tourismappv10;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Call custom methods here.
         */
        this.__init_sidebar();

    }

    /**
     * =====================================================================================================
     * Custom methods in here.
     * =====================================================================================================
     */

    /**
     * Initialization of Sidebar
     */

    private void __init_sidebar() {

        this.mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout_home);
        this.mToggle = new ActionBarDrawerToggle(this, this.mDrawerLayout, R.string.open, R.string.close);

        this.mDrawerLayout.addDrawerListener(this.mToggle);
        this.mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    /** Sidebar Events */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(this.mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
