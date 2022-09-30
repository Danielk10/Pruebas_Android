package com.diamon.pruebas;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.graphics.*;
import java.util.*;
import android.opengl.*;


public class MainActivity extends Activity 
{

	


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


		// setContentView(R.layout.main);


		setContentView(new Lienzo(this));


		
    }




	class Lienzo extends View
	{
		Lienzo(Activity actividad)
		{
			super(actividad);


			setBackgroundColor(Color.BLACK);

		}

		@Override
		public void draw(Canvas canvas)
		{

			super.draw(canvas);
			Paint pincel = new Paint();

			Random r = new Random();

			pincel.setARGB(255, r.nextInt(255), r.nextInt(255), r.nextInt(255));



			canvas.drawRect(r.nextInt(200), r.nextInt(200), r.nextInt(200), r.nextInt(200), pincel);

			invalidate();


		}



	}




}
