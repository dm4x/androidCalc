package com.example.kiselev.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class calc extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout mRelativeLayout;
    private TextView m_input;
    private TextView m_store;
    private TextView mmemory;
    private double result = 0;
    private int oper;
    private double mMemory = 0;
    private int m = 0;


    /*
    division 1
    multiple 2
    plus 3
    minus 4
    sqr 5
    sqrt 6
     */

    protected CharSequence mCalculate(CharSequence num1, CharSequence num2, int oper, int m) {
        try {Double.parseDouble(num1.toString());
        } catch (NumberFormatException num) {
            if (m == 0) {};
            if (m == 1) {mMemory = mMemory + Double.parseDouble(num2.toString());}
            if (m == 2) {mMemory = mMemory - Double.parseDouble(num2.toString());}
            oper = 0;
            return String.valueOf(mMemory);
        }
        try {Double.parseDouble(num2.toString());
        } catch (NumberFormatException num) {
            oper = 0;
            return String.valueOf(mMemory);
        }

            double prom_result = 0;
            double counter = 1;
            Double operand1 = Double.parseDouble(num1.toString());
            Double operand2 = Double.parseDouble(num2.toString());
            counter = operand2;


            switch (oper) {
                case (0): {
                    break;
                }

                case (1): {
                    result = operand1 / operand2;
                    oper = 0;
                    break;
                }
                case (2): {
                    result = operand1 * operand2;
                    oper = 0;
                    break;
                }
                case (3): {
                    result = operand1 + operand2;
                    oper = 0;
                    break;
                }
                case (4): {
                    result = operand1 - operand2;
                    oper = 0;
                    break;
                }
                case (5): {
                    result = prom_result = operand1;
                    for (int i = 1; i < counter; ++i) {
                        result = result * prom_result;
                    }
                    oper = 0;
                    break;
                }
                case (6): {
                    result = Math.sqrt(operand1);
                    oper = 0;
                    break;
                }
                case (13): {
                    result = (operand1 / 100 * operand2);
                    oper = 0;
                    break;
                }
            }


            switch (m) {
                case (0): {
                    result = mMemory;
                    break;
                }
                case (1): {
                    mMemory = mMemory + result;
                    break;
                }
                case (2): {
                    mMemory = mMemory - result;
                    break;
                }
                case (3): {
                    break;
                }
            }

            //преобразовываем в long если нет дробной части
            if ((double) result - (long) result == 0) {
                return String.valueOf((long) result);
            } else {
                return String.valueOf(result);
            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        m_input = (TextView) findViewById(R.id.input);
        m_store = (TextView) findViewById(R.id.store);
        mmemory = (TextView) findViewById(R.id.memory);

        Button btn_1 = (Button) findViewById(R.id.btn_1);
        Button btn_2 = (Button) findViewById(R.id.btn_2);
        Button btn_3 = (Button) findViewById(R.id.btn_3);
        Button btn_4 = (Button) findViewById(R.id.btn_4);
        Button btn_5 = (Button) findViewById(R.id.btn_5);
        Button btn_6 = (Button) findViewById(R.id.btn_6);
        Button btn_7 = (Button) findViewById(R.id.btn_7);
        Button btn_8 = (Button) findViewById(R.id.btn_8);
        Button btn_9 = (Button) findViewById(R.id.btn_9);
        Button btn_0 = (Button) findViewById(R.id.btn_0);
        Button btn_00 = (Button) findViewById(R.id.btn_00);
        Button btn_M_plus = (Button) findViewById(R.id.btn_M_plus);
        Button btn_M_minus = (Button) findViewById(R.id.btn_M_minus);
        Button btn_RM = (Button) findViewById(R.id.btn_M_rm);
        Button btn_sqr = (Button) findViewById(R.id.btn_sqr);
        Button btn_sqrt = (Button) findViewById(R.id.btn_sqrt);
        Button btn_percent = (Button) findViewById(R.id.btn_percent);
        Button btn_division = (Button) findViewById(R.id.btn_division);
        Button btn_clear = (Button) findViewById(R.id.btn_clear);
        Button btn_plus = (Button) findViewById(R.id.btn_plus);
        Button btn_minus = (Button) findViewById(R.id.btn_minus);
        Button btn_backspace = (Button) findViewById(R.id.btn_backspace);
        Button btn_multiple = (Button) findViewById(R.id.btn_multiple);
        Button btn_dot = (Button) findViewById(R.id.btn_dot);
        Button btn_equal = (Button) findViewById(R.id.btn_equal);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_00.setOnClickListener(this);
        btn_M_plus.setOnClickListener(this);
        btn_M_minus.setOnClickListener(this);
        btn_RM.setOnClickListener(this);
        btn_sqr.setOnClickListener(this);
        btn_sqrt.setOnClickListener(this);
        btn_percent.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_backspace.setOnClickListener(this);
        btn_multiple.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
    }


     @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_1: {
                m_input.append("1");
                break;
            }
            case R.id.btn_2: {
                m_input.append("2");
                break;
            }
            case R.id.btn_3: {
                m_input.append("3");
                break;
            }
            case R.id.btn_4: {
                m_input.append("4");
                break;
            }
            case R.id.btn_5: {
                m_input.append("5");
                break;
            }
            case R.id.btn_6: {
                m_input.append("6");
                break;
            }
            case R.id.btn_7: {
                m_input.append("7");
                break;
            }
            case R.id.btn_8: {
                m_input.append("8");
                break;
            }
            case R.id.btn_9: {
                m_input.append("9");
                break;
            }
            case R.id.btn_0: {
                m_input.append("0");
                break;
            }
            case R.id.btn_00: {
                m_input.append("00");
                break;
            }

            case R.id.btn_dot: {
                m_input.append(".");
                break;
            }
            case R.id.btn_M_plus: {
                m_input.setText(mCalculate(m_store.getText(), m_input.getText(), oper, 1));
                mmemory.setText(String.valueOf(mMemory));
                m_store.setText(" ");
                break;
            }
            case R.id.btn_M_minus: {
                m_input.setText(mCalculate(m_store.getText(), m_input.getText(), oper, 2));
                mmemory.setText(String.valueOf(mMemory));
                m_store.setText(" ");
                break;
            }
            case R.id.btn_M_rm: {
                m_input.setText(String.valueOf(mMemory));
                break;
            }
            case R.id.btn_sqr: {
                oper = 5;
                m_store.setText(m_input.getText());
                m_input.setText(" ");
                break;
            }
            case R.id.btn_sqrt: {
                m_store.setText(m_input.getText());
                m_input.setText(mCalculate(m_input.getText(), m_store.getText(), 6, 3));
                break;
            }
            case R.id.btn_percent: {
                m_input.setText(mCalculate(m_store.getText(), m_input.getText(), 13, 3));
                break;
            }
            case R.id.btn_division: {
                oper = 1;
                m_store.setText(m_input.getText());
                m_input.setText(" ");
                break;
            }
            case R.id.btn_multiple: {
                oper = 2;
                m_store.setText(m_input.getText());
                m_input.setText(" ");
                break;
            }
            case R.id.btn_plus: {
                oper = 3;
                m_store.setText(m_input.getText());
                m_input.setText(" ");
                break;
            }
            case R.id.btn_minus: {
                oper = 4;
                m_store.setText(m_input.getText());
                m_input.setText(" ");
                break;
            }

            case R.id.btn_clear: {
                m_input.setText(" ");
                m_store.setText(" ");
                oper = 0;
                break;
            }

            case R.id.btn_backspace: {
                m_input.setText(" ");
                break;
            }
            case R.id.btn_equal: {
                m_input.setText(mCalculate(m_store.getText(), m_input.getText(), oper, 3));
                break;
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
