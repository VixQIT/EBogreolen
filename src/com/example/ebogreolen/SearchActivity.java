package com.example.ebogreolen;

import java.util.ArrayList;

import com.example.ebogreolen.Adapter.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;

public class SearchActivity extends Activity {
    /** Called when the activity is first created. */
    private ExpandListAdapter ExpAdapter;
    private ArrayList<ExpandListGroup> ExpListItems;
    private ExpandableListView ExpandList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        ExpandList = (ExpandableListView) findViewById(R.id.ExpList);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter(SearchActivity.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);

        ExpandList.setOnChildClickListener(new OnChildClickListener()

        {

            @Override
            public boolean onChildClick(ExpandableListView Parent, View v,
                    int groupPosition, int childPosition, long id) {
                Intent intent = new Intent(SearchActivity.this, YourBooks.class);
                startActivity(intent);;
                return false;
            }
        });
    }

    public ArrayList<ExpandListGroup> SetStandardGroups() {
        ArrayList<ExpandListGroup> list = new ArrayList<ExpandListGroup>();
        ArrayList<ExpandListChild> list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru1 = new ExpandListGroup();
        gru1.setName("Skønlitteratur");
        ExpandListChild ch1_1 = new ExpandListChild();
        ch1_1.setName("Alle");
        ch1_1.setTag(null);
        list2.add(ch1_1);
        ExpandListChild ch1_2 = new ExpandListChild();
        ch1_2.setName("Krimier og spænding");
        ch1_2.setTag(null);
        list2.add(ch1_2);
        ExpandListChild ch1_3 = new ExpandListChild();
        ch1_3.setName("Biografier");
        ch1_3.setTag(null);
        list2.add(ch1_3);
        ExpandListChild ch1_4 = new ExpandListChild();
        ch1_4.setName("Sci-fi og fantasy");
        ch1_4.setTag(null);
        list2.add(ch1_4);
        ExpandListChild ch1_5 = new ExpandListChild();
        ch1_5.setName("Digte");
        ch1_5.setTag(null);
        list2.add(ch1_5);
        ExpandListChild ch1_6 = new ExpandListChild();
        ch1_6.setName("Tegneserier");
        ch1_6.setTag(null);
        list2.add(ch1_6);
        ExpandListChild ch1_7 = new ExpandListChild();
        ch1_7.setName("Humor");
        ch1_7.setTag(null);
        list2.add(ch1_7);
        ExpandListChild ch1_8 = new ExpandListChild();
        ch1_8.setName("Årbøger");
        ch1_8.setTag(null);
        list2.add(ch1_8);
        gru1.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru2 = new ExpandListGroup();
        gru2.setName("Studie og erhverv");
        ExpandListChild ch2_1 = new ExpandListChild();
        ch2_1.setName("Alle");
        ch2_1.setTag(null);
        list2.add(ch2_1);
        ExpandListChild ch2_2 = new ExpandListChild();
        ch2_2.setName("Sygepleje");
        ch2_2.setTag(null);
        list2.add(ch2_2);
        ExpandListChild ch2_3 = new ExpandListChild();
        ch2_3.setName("Love");
        ch2_3.setTag(null);
        list2.add(ch2_3);
        ExpandListChild ch2_4 = new ExpandListChild();
        ch2_4.setName("Økonomi");
        ch2_4.setTag(null);
        list2.add(ch2_4);
        ExpandListChild ch2_5 = new ExpandListChild();
        ch2_5.setName("Sprog og grammatik");
        ch2_5.setTag(null);
        list2.add(ch2_5);
        ExpandListChild ch2_6 = new ExpandListChild();
        ch2_6.setName("Matematik");
        ch2_6.setTag(null);
        list2.add(ch2_6);
        ExpandListChild ch2_7 = new ExpandListChild();
        ch2_7.setName("Fysik og Kemi");
        ch2_7.setTag(null);
        list2.add(ch2_7);
        ExpandListChild ch2_8 = new ExpandListChild();
        ch2_8.setName("Biologi");
        ch2_8.setTag(null);
        list2.add(ch2_8);
        ExpandListChild ch2_9 = new ExpandListChild();
        ch2_9.setName("Geografi");
        ch2_9.setTag(null);
        list2.add(ch2_9);
        ExpandListChild ch2_10 = new ExpandListChild();
        ch2_10.setName("Teknologi");
        ch2_10.setTag(null);
        list2.add(ch2_10);
        ExpandListChild ch2_11 = new ExpandListChild();
        ch2_11.setName("IT");
        ch2_11.setTag(null);
        list2.add(ch2_11);
        gru2.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru3 = new ExpandListGroup();
        gru3.setName("Krop og Sjæl");
        ExpandListChild ch3_1 = new ExpandListChild();
        ch3_1.setName("Alle");
        ch3_1.setTag(null);
        list2.add(ch3_1);
        ExpandListChild ch3_2 = new ExpandListChild();
        ch3_2.setName("Medicin, sundhed og sygdom");
        ch3_2.setTag(null);
        list2.add(ch3_2);
        ExpandListChild ch3_3 = new ExpandListChild();
        ch3_3.setName("Astrologi og drømme");
        ch3_3.setTag(null);
        list2.add(ch3_3);
        ExpandListChild ch3_4 = new ExpandListChild();
        ch3_4.setName("Naturvidenskab");
        ch3_4.setTag(null);
        list2.add(ch3_4);
        gru3.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru4 = new ExpandListGroup();
        gru4.setName("Børn og unge");
        ExpandListChild ch4_1 = new ExpandListChild();
        ch4_1.setName("Alle");
        ch4_1.setTag(null);
        list2.add(ch4_1);
        ExpandListChild ch4_2 = new ExpandListChild();
        ch4_2.setName("Billedbøger");
        ch4_2.setTag(null);
        list2.add(ch4_2);
        ExpandListChild ch4_3 = new ExpandListChild();
        ch4_3.setName("Fagbøger");
        ch4_3.setTag(null);
        list2.add(ch4_3);
        gru4.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru5 = new ExpandListGroup();
        gru5.setName("Madog vin");
        ExpandListChild ch5_1 = new ExpandListChild();
        ch5_1.setName("Alle");
        ch5_1.setTag(null);
        list2.add(ch5_1);
        ExpandListChild ch5_2 = new ExpandListChild();
        ch5_2.setName("Kogebøger");
        ch5_2.setTag(null);
        list2.add(ch5_2);
        ExpandListChild ch5_3 = new ExpandListChild();
        ch5_3.setName("Grøn mad og slankekost");
        ch5_3.setTag(null);
        list2.add(ch5_3);
        ExpandListChild ch5_4 = new ExpandListChild();
        ch5_4.setName("Vin, spiritus og øl");
        ch5_4.setTag(null);
        list2.add(ch5_4);
        gru5.setItems(list2);
        ExpandListChild ch5_5 = new ExpandListChild();
        ch5_5.setName("Fester og gæster");
        ch5_5.setTag(null);
        list2.add(ch5_5);
        gru5.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru6 = new ExpandListGroup();
        gru6.setName("Hus, Have, Dyr og Natur");
        ExpandListChild ch6_1 = new ExpandListChild();
        ch6_1.setName("Alle");
        ch6_1.setTag(null);
        list2.add(ch6_1);
        ExpandListChild ch6_2 = new ExpandListChild();
        ch6_2.setName("Have, drivhus og stueplanter");
        ch6_2.setTag(null);
        list2.add(ch6_2);
        ExpandListChild ch6_3 = new ExpandListChild();
        ch6_3.setName("Husdyr og kæledyr");
        ch6_3.setTag(null);
        list2.add(ch6_3);
        ExpandListChild ch6_4 = new ExpandListChild();
        ch6_4.setName("Huset, reperation og vedligehold");
        ch6_4.setTag(null);
        list2.add(ch6_4);
        gru6.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        list.add(gru1);
        list.add(gru2);
        list.add(gru3);
        list.add(gru4);
        list.add(gru5);
        list.add(gru6);

        return list;

    }

}
