package horgan.gerard.adapters;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
	
	
	String[] days = {"monday", "tuesday","wednesday","thursday","friday","saturday","sunday"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
		setListAdapter(adapter);
		
	}
	@Override
	public void onListItemClick(ListView l, View v, int pos, long id) {
		TextView temp=(TextView) v;
		Toast.makeText(this,temp.getText()+""+id,Toast.LENGTH_SHORT).show();
		
	}

	
}
