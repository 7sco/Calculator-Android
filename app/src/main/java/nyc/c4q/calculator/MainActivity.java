package nyc.c4q.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

import static nyc.c4q.calculator.R.id.display;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    private static final String INPUT_KEY = "key";
    private static String input = "";


    private Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonClear, buttonDivide, buttonMultiply, buttonMinus,
            buttonAdd, closeParenthesis, buttonEqual, buttonDecimal, openParenthesis, buttonMakeNegative;

    private Button buttonExp, buttonSin, buttonCosh, buttonCos, buttonE, buttonLn, tanh, buttonXTo2,
            buttonXTo3, x_y, buttonSqrt, buttonTan, buttonPi, buttonLog, sinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            input = savedInstanceState.getString(INPUT_KEY);
        }

        textView = (TextView) findViewById(display);

        button0 = (Button) findViewById(R.id.zero);
        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);

        buttonClear = (Button) findViewById(R.id.clear);
        openParenthesis = (Button) findViewById(R.id.openParenthesis);
        closeParenthesis = (Button) findViewById(R.id.closeParenthesis);
        buttonDivide = (Button) findViewById(R.id.division);
        buttonMultiply = (Button) findViewById(R.id.times);
        buttonAdd = (Button) findViewById(R.id.plus);
        buttonEqual = (Button) findViewById(R.id.equals);
        buttonDecimal = (Button) findViewById(R.id.dot);
        buttonMakeNegative = (Button) findViewById(R.id.make_negative);
        buttonMinus = (Button) findViewById(R.id.minus);

        buttonSin = (Button) findViewById(R.id.sin);
        buttonExp = (Button) findViewById(R.id.exp);
        buttonCosh = (Button) findViewById(R.id.cosh);
        buttonCos = (Button) findViewById(R.id.cos);
        x_y = (Button) findViewById(R.id.x_y);
        buttonSqrt = (Button) findViewById(R.id.sqrt);
        buttonTan = (Button) findViewById(R.id.tan);
        buttonPi = (Button) findViewById(R.id.pi);
        buttonLog = (Button) findViewById(R.id.log);
        sinh = (Button) findViewById(R.id.sinh);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonLn = (Button) findViewById(R.id.ln);
        tanh = (Button) findViewById(R.id.tanh);
        buttonXTo2 = (Button) findViewById(R.id.x_to_2);
        buttonXTo3 = (Button) findViewById(R.id.x_to_3);


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMakeNegative.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        openParenthesis.setOnClickListener(this);
        closeParenthesis.setOnClickListener(this);


        if (buttonPi != null) {
            buttonPi.setOnClickListener(this);
        }
        if (buttonSin != null) {
            buttonSin.setOnClickListener(this);
        }
        if (buttonCos != null) {
            buttonCos.setOnClickListener(this);
        }
        if (sinh != null) {
            sinh.setOnClickListener(this);
        }
        if (buttonTan != null) {
            buttonTan.setOnClickListener(this);
        }
        if (buttonLog != null) {
            buttonLog.setOnClickListener(this);
        }
        if (buttonExp != null) {
            buttonExp.setOnClickListener(this);
        }
        if (buttonCosh != null) {
            buttonCosh.setOnClickListener(this);
        }
        if (x_y != null) {
            x_y.setOnClickListener(this);
        }
        if (buttonSqrt != null) {
            buttonSqrt.setOnClickListener(this);
        }
        if (buttonE != null) {
            buttonE.setOnClickListener(this);
        }
        if (tanh != null) {
            tanh.setOnClickListener(this);
        }
        if (buttonXTo2 != null) {
            buttonXTo2.setOnClickListener(this);
        }
        if (buttonXTo3 != null) {
            buttonXTo3.setOnClickListener(this);
        }
        if (buttonLn != null) {
            buttonLn.setOnClickListener(this);
        }


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INPUT_KEY, input);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.equals) {
            try {
                if (input.contains("/0")) {
                    textView.setText("can't divide by 0");
                } else {
                    Double result = new ExtendedDoubleEvaluator().evaluate(input);
                    Log.d("Murad", result + "");
                    String value = String.valueOf(result);
                    Log.d("murad", value);

                    DecimalFormat format = new DecimalFormat();
                    String withNoZero = format.format(result);
                    textView.setText(withNoZero);
                    input = withNoZero;
                }
            } catch (Exception e) {
                textView.setText("error");
            }
        } else if (v.getId() == R.id.zero) {
            input += "0";
        } else if (v.getId() == R.id.one) {
            input += "1";
        } else if (v.getId() == R.id.two) {
            input += "2";
        } else if (v.getId() == R.id.three) {
            input += "3";
        } else if (v.getId() == R.id.four) {
            input += "4";
        } else if (v.getId() == R.id.five) {
            input += "5";
        } else if (v.getId() == R.id.six) {
            input += "6";
        } else if (v.getId() == R.id.seven) {
            input += "7";
        } else if (v.getId() == R.id.eight) {
            input += "8";
        } else if (v.getId() == R.id.nine) {
            input += "9";
        } else if (v.getId() == R.id.plus) {
            input += "+";
        } else if (v.getId() == R.id.minus) {
            input += "-";
        } else if (v.getId() == R.id.division) {
            input += "/";
        } else if (v.getId() == R.id.times) {
            input += "*";
        } else if (v.getId() == R.id.openParenthesis) {
            input += "(";
        } else if (v.getId() == R.id.closeParenthesis) {
            input += ")";
        } else if (v.getId() == R.id.dot) {
            input += ".";
        } else if (v.getId() == R.id.make_negative) {
            input = "-";
        } else if (v.getId() == R.id.clear) {
            input = "";
        } else if (v.getId() == R.id.exp) {
            input += "E";
        } else if (v.getId() == R.id.buttonE) {
            input += "*e";
        } else if (v.getId() == R.id.cos) {
            input += "cos(";
        } else if (v.getId() == R.id.sin) {
            input += "sin(";
        } else if (v.getId() == R.id.pi) {
            input += "*pi";
        } else if (v.getId() == R.id.cos) {
            input += "cos(";
        } else if (v.getId() == R.id.tan) {
            input += "tan(";
        } else if (v.getId() == R.id.x_to_2) {
            input += "^2";
        } else if (v.getId() == R.id.x_to_3) {
            input += "^3";
        } else if (v.getId() == R.id.log) {
            input += "log(";
        } else if (v.getId() == R.id.ln) {
            input += "ln(";
        } else if (v.getId() == R.id.cosh) {
            input += "cosh(";
        } else if (v.getId() == R.id.sqrt) {
            input += "sqrt(";
        } else if (v.getId() == R.id.x_y) {
            input += "^";
        } else if (v.getId() == R.id.tanh) {
            input += "tanh(";
        } else if (v.getId() == R.id.sinh) {
            input += "sinh";
        }
        textView.setText(input);



}
}

