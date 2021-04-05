package com.example.tugas31;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Smahand extends ListActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center", "SMS Center", "Driving Direction", "Website", "Info Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Call Center")){
                String notel = "tel:0761 31274";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notel));
            } else if (pilihan.equals("SMS Center")){
                String smsText = "M. Alfandri Aqilah/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761 31274"));
                a.putExtra("sms_body", smsText );
            } else if (pilihan.equals("Driving Direction")){
                String lokasirs = "https://goo.gl/maps/xMyCpFYEwR9eDuQH7";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            } else if (pilihan.equals("Website")) {
                String website = "https://www.smahandayanipekanbaru.sch.id/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            } else if (pilihan.equals("Info Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"SMA Handayani Pekanbaru");
            } else {
                a = new Intent(this,hospital.class);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
