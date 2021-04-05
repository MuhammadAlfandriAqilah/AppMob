package com.example.tugas31;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class school extends ListActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listhospital = new String[] {"SMA Handayani Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listhospital));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilpilihan(pilihan);
    }

    private void tampilpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMA Handayani Pekanbaru}")) {
                a = new Intent(this,Smahand.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
