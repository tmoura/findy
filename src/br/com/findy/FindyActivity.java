package br.com.findy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
    	/*
    	menu.add(Menu.NONE, 0, Menu.NONE, getString(R.string.opt1));
    	menu.add(Menu.NONE, 1, Menu.NONE, getString(R.string.opt2));
    	menu.add(Menu.NONE, 2, Menu.NONE, getString(R.string.opt3));
    	menu.add(Menu.NONE, 3, Menu.NONE, getString(R.string.opt4));
       */
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.layout.menu, menu);

    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
        switch (item.getItemId()) {
            case R.id.download:
            	chamaTelaDownload();
            	break;
            case R.id.opt2:
            	chamaTela();
            	break;
            case R.id.opt3:
            	chamaTela();
                break;
            case R.id.opt4:
            	chamaTela();
                break;
        }
        return true;
    }
    
	private void chamaTelaDownload(){
	    Intent i = new Intent(this,AndroidFileDownloader.class);
		startActivity(i);
	}
	private void chamaTela(){
	    Intent i = new Intent(this,TelaOpt.class);
		startActivity(i);
	}
}