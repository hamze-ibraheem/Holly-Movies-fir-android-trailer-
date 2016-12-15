package com.taskfoundation.newmovies;

import com.taskfoundation.newmovies.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment3 extends Fragment {

	static int screen;
	public static final String ARG_SECTION_NUMBER = "section_number";

	public MyFragment3() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment3, null);
			
			 v.setOnTouchListener(new View.OnTouchListener() {
		            public boolean onTouch(View v, MotionEvent event) {

		                if(event.getAction() == MotionEvent.ACTION_DOWN){
		                    //do something
		                	Intent goUrl=new Intent(getActivity(),Trails.class);
		                	startActivity(goUrl);
		                	screen=1;
		                }
		                return true;
		            }
		    });
			 
			 
			return v;
	}
}
