package com.asif.listview;

import android.app.ListFragment;
import android.content.ContentUris;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyListFragment extends ListFragment {
	
	public String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
			"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
			"Linux", "OS/2" };
	OnArticleSelectedListener mListener;

//	@Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onActivityCreated(savedInstanceState);
//
//		
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
//				android.R.layout.simple_list_item_1, values);
//		setListAdapter(adapter);
//	}

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(  
			     inflater.getContext(), android.R.layout.simple_list_item_1,  
			     values);  
			   setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
	}



	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}
	
	
	 public interface OnArticleSelectedListener {
	        public void onArticleSelected(Uri articleUri);
	 }
	

}
