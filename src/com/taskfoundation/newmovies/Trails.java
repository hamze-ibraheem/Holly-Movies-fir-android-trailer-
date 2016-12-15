package com.taskfoundation.newmovies;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.webkit.WebView;

public class Trails extends Activity{

	WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trails);
		webView= (WebView)findViewById(R.id.webView1);
    	webView.getSettings().setJavaScriptEnabled(true);
    	
   	 runOnUiThread(new Runnable() {
         
         public void run() {

            if(!isFinishing()){
              new AlertDialog.Builder(Trails.this)
               .setTitle("Open With You Tube Better")
               .setMessage("Your Trailer Will Start After Few Seconds")
               .setCancelable(false)
               .setPositiveButton("ok", new OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                   // whatever...    
                	   
                	   if (MyFragment1.screen == 1){

               	        try{	
               	 	       
               	        	
               	        	webView.loadUrl("https://www.youtube.com/watch?v=tmeOjFno6Do");
               	        	}
               	        	catch (Exception e)
               	        	{
               	        	e.printStackTrace();
               	        	}

               		}
                	   
                	   if (MyFragment2.screen == 1){

                  	        try{	
                  	 	       
                  	        	
                  	        	webView.loadUrl("https://www.youtube.com/watch?v=Skpu5HaVkOc");
                  	        	}
                  	        	catch (Exception e)
                  	        	{
                  	        	e.printStackTrace();
                  	        	}

                  		}
                	   
                	   if (MyFragment3.screen == 1){

                 	        try{	
                 	 	       
                 	        	
                 	        	webView.loadUrl("https://www.youtube.com/watch?v=RFinNxS5KN4");
                 	        	}
                 	        	catch (Exception e)
                 	        	{
                 	        	e.printStackTrace();
                 	        	}

                 		}
                	   
                	   if (MyFragment4.screen == 1){

                	        try{	
                	 	       
                	        	
                	        	webView.loadUrl("https://www.youtube.com/watch?v=S3AVcCggRnU");
                	        	}
                	        	catch (Exception e)
                	        	{
                	        	e.printStackTrace();
                	        	}

                		}
                	   
                	   
                	   if (MyFragment5.screen == 1){

                	        try{	
                	 	       
                	        	
                	        	webView.loadUrl("https://www.youtube.com/watch?v=62E4FJTwSuc");
                	        	}
                	        	catch (Exception e)
                	        	{
                	        	e.printStackTrace();
                	        	}

                		}
                	   
                	   if (MyFragment6.screen == 1){

               	        try{	
               	 	       
               	        	
               	        	webView.loadUrl("https://www.youtube.com/watch?v=gOW_azQbOjw");
               	        	}
               	        	catch (Exception e)
               	        	{
               	        	e.printStackTrace();
               	        	}

               		}
                	   
                   }
               }).create().show();                        
           }
         }
     });
   	 
		
	}
	
}
