package com.animation2_23rd;

import in.WsCubeTech.controls.Carousel;
import in.WsCubeTech.controls.CarouselAdapter;
import in.WsCubeTech.controls.CarouselAdapter.OnItemClickListener;
import in.WsCubeTech.controls.CarouselAdapter.OnItemSelectedListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends Activity {

	Carousel c;
	TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        c=(Carousel)findViewById(R.id.carousel);
        txtV=(TextView)findViewById(R.id.tv1);
        c.setOnItemClickListener(new OnItemClickListener(){
        	 
			public void onItemClick(CarouselAdapter<?> parent, View view,
					int position, long id) {	
				/*Intent ints=new Intent(getApplicationContext(), TicTacToe.class);
				ints.putExtra("num", position);
				startActivity(ints);*/
				
				/*Toast.makeText(MainActivity.this, 
						String.format("%s has been clicked", 
						((CarouselItem)parent.getChildAt(position)).getName()), 
						Toast.LENGTH_SHORT).show();	*/			
			}
        	
        });
 
        c.setOnItemSelectedListener(new OnItemSelectedListener(){

			public void onItemSelected(CarouselAdapter<?> parent, View view,
					int position, long id) {
			

		        
				switch(position){
				case 0:
					txtV.setText("Blic");
					break;
				case 1:
					txtV.setText("facebook");
					break;
				case 2:
					txtV.setText("Gallery");
					break;
				case 3:
					txtV.setText("Gmail");
					break;
				case 4:
					txtV.setText("Ebuddy");
					break;
				
				}
				
			}

			public void onNothingSelected(CarouselAdapter<?> parent) {
			}
        	
        }
        );
        
    }
    
}
