package com.asif.listview;

import java.util.ArrayList;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewExampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_listviewexampleactivity);
//		final ListView listview = (ListView) findViewById(R.id.listview);
		
//		String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
//		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//		        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
//		        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
//		        "Android", "iPhone", "WindowsMobile" };
//		
//		 final ArrayList<String> list = new ArrayList<String>();
//		 
//		 for(int i = 0; i < values.length; i++)
//		 {
//			 list.add(values[i]);
//		 }
		 
		 //final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1 , list);
		 //final MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
		 
		 //listview.setAdapter(adapter);
		MyListFragment mlf = new MyListFragment();
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(android.R.id.content, mlf);
		ft.addToBackStack(null);
		ft.commit();
//		 if (fm.findFragmentById(android.R.id.content) == null) {
//			 MyListFragment mlf = new MyListFragment();
//			 fm.beginTransaction().add(android.R.id.content, mlf).commit();
//		 }
		 //ft.add(mlf, "List_Fragment");
		 //ft.add(android.R.layout.simple_list_item_1, mlf).commit();
		 //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		 
//		 listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, final View view, int position,
//					long id) {
//				// TODO Auto-generated method stub
//				
//				final String item = (String) parent.getItemAtPosition(position);
//				view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
//					
//					@Override
//					public void run() {
//						// TODO Auto-generated method stub
//						list.remove(item);
//						adapter.notifyDataSetChanged();
//						view.setAlpha(1);
//					}
//				});
				
//				Toast.makeText(getApplicationContext(),
//					      "Click ListItem Number " + position, Toast.LENGTH_LONG)
//					      .show();
				
//			}
//		});
		 
	}
	
	
}
