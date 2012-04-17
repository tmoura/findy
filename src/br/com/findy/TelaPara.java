package br.com.findy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class TelaPara extends Activity {
    private EditText et;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_para);
        
        et = (EditText) findViewById(R.id.editText1);
        
        Intent i = getIntent();
        Bundle params = i.getExtras();
        et.setText(params.getString("valor"));
       
    }
}
