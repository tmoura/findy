package br.com.findy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	menu.add(Menu.NONE, 0, Menu.NONE, getString(R.string.opt1));
    	menu.add(Menu.NONE, 1, Menu.NONE, getString(R.string.opt2));
    	menu.add(Menu.NONE, 2, Menu.NONE, getString(R.string.opt3));
    	menu.add(Menu.NONE, 3, Menu.NONE, getString(R.string.opt4));
       
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
 
        switch (item.getItemId()) {
            case 0:
            	chamaTela();
                return true;
            case 1:
            	chamaTela();
                return true;
            case 2:
            	chamaTela();
                return true;
            default:
            	chamaTela();
                return true;
        }
    }
    
	private void chamaTela(){
	    Intent i = new Intent(this,TelaOpt.class);
		startActivity(i);
	}
}