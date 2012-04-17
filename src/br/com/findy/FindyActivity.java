package br.com.findy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FindyActivity extends Activity implements OnClickListener{
    private EditText et;
    private Button b;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de);
        
        et = (EditText) findViewById(R.id.editText1);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(this);
        
    }
    
    public void onClick(View v){
    	Intent i = new Intent(this,TelaPara.class);
    	Bundle params = new Bundle();
    	params.putString("valor", et.getText().toString());
    	i.putExtras(params);
    	startActivity(i);
    }
}