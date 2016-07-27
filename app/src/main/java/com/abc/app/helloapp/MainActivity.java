package com.abc.app.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText et_first_num, et_second_num;
    Button bt_plus, bt_ninus, bt_multi, bt_devide, bt_rest, bt_equal;
    TextView tv_result;
    private int result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_first_num = (EditText) findViewById(R.id.et_first_num);
        et_second_num = (EditText) findViewById(R.id.et_second_num);
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_ninus = (Button) findViewById(R.id.bt_ninus);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_devide = (Button) findViewById(R.id.bt_devide);
        bt_rest = (Button) findViewById(R.id.bt_rest);
        bt_equal = (Button) findViewById(R.id.bt_equal);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_plus.setOnClickListener(this);
        bt_ninus.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_devide.setOnClickListener(this);
        bt_rest.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_plus:
                Toast.makeText(MainActivity.this, et_first_num.getText().toString(), Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, et_second_num.getText().toString(), Toast.LENGTH_LONG).show();
                this.setResult(
                        Integer.parseInt(et_first_num.getText().toString()) + Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_ninus:
                this.setResult(
                        Integer.parseInt(et_first_num.getText().toString()) - Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_multi :
                this.setResult(
                Integer.parseInt(et_first_num.getText().toString()) * Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_devide :
                this.setResult(
                Integer.parseInt(et_first_num.getText().toString()) / Integer.parseInt(et_second_num.getText().toString()));
            case R.id.bt_rest :
                this.setResult(
                Integer.parseInt(et_first_num.getText().toString()) % Integer.parseInt(et_second_num.getText().toString()));
                break;

            case R.id.bt_equal :
                this.tv_result.setText("계산결과 : " + this.getResult3());
                break;
        }
    }

    public int getResult3() {
        return result3;
    }

    public void setResult3(int result3) {
        this.result3 = result3;
    }
}

