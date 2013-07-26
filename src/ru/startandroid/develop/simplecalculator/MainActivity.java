package ru.startandroid.develop.simplecalculator;

import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
	  EditText etNum1;
	  EditText etNum2;

	  Button btnAdd;
	  Button btnSub;
	  Button btnMult;
	  Button btnDiv;

	   
	  TextView tvResult;

	  String oper = "";

	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);

	    // find the elements
	    etNum1 = (EditText) findViewById(R.id.etNum1);
	    etNum2 = (EditText) findViewById(R.id.etNum2);

	    btnAdd = (Button) findViewById(R.id.btnAdd);
	    btnSub = (Button) findViewById(R.id.btnSub);
	    btnMult = (Button) findViewById(R.id.btnMult);
	    btnDiv = (Button) findViewById(R.id.btnDiv);

	    tvResult = (TextView) findViewById(R.id.tvResult);
	  }
	  @Override
	    public void onClick(View v) {
	      // TODO Auto-generated method stub
	      float num1 = 0;
	      float num2 = 0;
	      float result = 0;

	   
	  

	      // read EditText and fill variables with numbers
	      // defines the button that has been clicked and performs the corresponding operation
	      // write operation into oper, we will use it later for output
	      switch (v.getId()) {
	      case R.id.btnAdd:
	        oper = "+";
	        result = num1 + num2;
	        break;
	      case R.id.btnSub:
	        oper = "-";
	        result = num1 - num2;
	        break;
	      case R.id.btnMult:
	        oper = "*";
	        result = num1 * num2;
	        break;
	      case R.id.btnDiv:
	        oper = "/";
	        result = num1 / num2;
	        break;
	      default:
	        break;
	      }

	      // form the output line
	      tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
	    }
}
