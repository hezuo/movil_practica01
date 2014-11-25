package edu.upc.practica01.view;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import edu.upc.practica01.R;

public class Menu  extends Activity implements OnClickListener{
	Button btnformulario, btnsimple, btncompuesta, btninternet, btnpaint, btntabs;
	EditText correoUsuario, claveUsuario; 
	 @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       
       btnformulario = (Button)findViewById(R.id.btningreso);
       btnformulario.setOnClickListener(this);
       
       correoUsuario = (EditText)findViewById(R.id.correoUsuario);
       claveUsuario = (EditText)findViewById(R.id.claveUsuario);
        
      
   }
	 
	 @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i;
		if (v.equals(btnformulario)){
			
			if (!correoUsuario.getText().toString().equals("") 
                    && !claveUsuario.equals("") ){
		        Intent intent = new Intent(Menu.this,InicioDiaActivity.class);
		        startActivity(intent);
			}
		
		}else if(v.equals(btnpaint)){
			//i = new Intent(this, ListadoCompuesto.class);
			//startActivity(i);
		}else if(v.equals(btntabs)){
			//i = new Intent(this, ListadoCompuesto.class);
			//startActivity(i);
		}
	}
}
