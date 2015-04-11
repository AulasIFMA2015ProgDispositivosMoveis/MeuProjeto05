package com.aula.meuprojeto05;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class Principal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Recuperamos a ActionBar dispon�vel na Activity
        ActionBar barra = getSupportActionBar();
        //Habilita o Up Navigation (aquela setinha ao lado do �cone da aplica��o)
        barra.setDisplayHomeAsUpEnabled(true); 
        //Inclu�mos o �cone da nossa aplica��o na ActionBar
        barra.setHomeAsUpIndicator(R.drawable.ic_launcher);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //Inflamos o menu, adicionamos os nosso itens disponibilizados no arquivo
    	//XML do menu (principal.xml) em nossa ActionBar e neste momento o Java
    	//passa a reconhec�-los. A ideia � uma a��o semelhante ao que o findviewById realiza
    	getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //Este item representa o item criado no arquivo de Menu (principal.xml)
    	//Podemos a partir dele recuperar as v�rias propriedades informadas nesta
    	//tag <item /> no arquivo XML do menu.
    	//Verifique por exemplo o case da op��o SAIR
    	int id = item.getItemId();
        
        switch (id) {
			case R.id.museu:
				Toast.makeText(this, "Clicou no museu", Toast.LENGTH_SHORT).show();
				break;
			
			case R.id.nuvem:	
				Toast.makeText(this, "Clicou na nuvem", Toast.LENGTH_SHORT).show();
				break;
			
			case R.id.sair:
				Toast.makeText(this, "Clicou em " + item.getTitle() , Toast.LENGTH_SHORT).show();
				break;
			
			default:
				return super.onOptionsItemSelected(item);
		}
        
        return true;        
        
    }
}
