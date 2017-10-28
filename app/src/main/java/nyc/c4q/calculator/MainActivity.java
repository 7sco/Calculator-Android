package nyc.c4q.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import mathjs.niltonvasques.com.mathjs.MathJS;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean isInverse = false;
    private Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    private Button buttonRest, buttonTimes, buttonDivision, buttonClear, buttonEquals, buttonDot, buttonPlus, buttonPercentage, closeParenthesis;
    private Button buttonDeg, buttonSin, buttonLn, buttonCos, buttonLog, buttonTan, buttonSquareRoot, buttonXSquare, buttonYPowerX,
            buttonRad, buttonCosInverse, buttonSinInverse, buttonTanInverse, buttonPi, buttonAbs;

    TextView edtNumber;

    int sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = (Button) findViewById(R.id.zero);
        buttonOne = (Button) findViewById(R.id.one);
        buttonTwo = (Button) findViewById(R.id.two);
        buttonThree = (Button) findViewById(R.id.three);
        buttonFour = (Button) findViewById(R.id.four);
        buttonFive = (Button) findViewById(R.id.five);
        buttonSix = (Button) findViewById(R.id.six);
        buttonSeven = (Button) findViewById(R.id.seven);
        buttonEight = (Button) findViewById(R.id.eight);
        buttonNine = (Button) findViewById(R.id.nine);
        buttonPlus = (Button) findViewById(R.id.plus);
        buttonRest = (Button) findViewById(R.id.rest);
        buttonTimes = (Button) findViewById(R.id.times);

        buttonDivision = (Button) findViewById(R.id.division);

        buttonClear = (Button) findViewById(R.id.clear);
        buttonEquals = (Button) findViewById(R.id.equals);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonPercentage = (Button) findViewById(R.id.percentage);
        buttonSin = (Button) findViewById(R.id.sin);
        buttonSquareRoot = (Button) findViewById(R.id.sqrt);
        buttonCos = (Button) findViewById(R.id.cos);
        buttonTan = (Button) findViewById(R.id.tan);
        buttonCosInverse = (Button) findViewById(R.id.cos_inverse);
        buttonSinInverse = (Button) findViewById(R.id.sin_inverse);
        buttonTanInverse = (Button) findViewById(R.id.tan_inverse);
        buttonYPowerX = (Button) findViewById(R.id.e_to_x);
        buttonXSquare = (Button) findViewById(R.id.e_to_square);
        buttonPi = (Button) findViewById(R.id.pi);
        buttonAbs = (Button) findViewById(R.id.absolute_value);
        buttonLn = (Button) findViewById(R.id.natural_log);
        buttonLog = (Button) findViewById(R.id.log);

        edtNumber = (TextView) findViewById(R.id.text);
        buttonZero.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonRest.setOnClickListener(this);
        buttonTimes.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonPercentage.setOnClickListener(this);


    }

    public void reset() {
        if (sign == 1) {
            edtNumber.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;

        switch (b.getId()) {
            case R.id.zero:
                reset();
                edtNumber.setText(edtNumber.getText() + "0");
                break;
            case R.id.one:
                reset();
                edtNumber.setText(edtNumber.getText() + "1");
                break;
            case R.id.two:
                reset();
                edtNumber.setText(edtNumber.getText() + "2");
                break;
            case R.id.three:
                reset();
                edtNumber.setText(edtNumber.getText() + "3");
                break;
            case R.id.four:
                reset();
                edtNumber.setText(edtNumber.getText() + "4");
                break;
            case R.id.five:
                reset();
                edtNumber.setText(edtNumber.getText() + "5");
                break;
            case R.id.six:
                reset();
                edtNumber.setText(edtNumber.getText() + "6");
                break;
            case R.id.seven:
                reset();
                edtNumber.setText(edtNumber.getText() + "7");
                break;
            case R.id.eight:
                reset();
                edtNumber.setText(edtNumber.getText() + "8");
                break;
            case R.id.nine:
                reset();
                edtNumber.setText(edtNumber.getText() + "9");
                break;
            case R.id.dot:
                reset();
                edtNumber.setText(edtNumber.getText() + ".");
                break;
            case R.id.plus:
                edtNumber.setText(edtNumber.getText() + "+");
                break;
            case R.id.rest:
                edtNumber.setText(edtNumber.getText() + "-");
                break;
            case R.id.times:
                edtNumber.setText(edtNumber.getText() + "*");
                break;
            case R.id.division:
                edtNumber.setText(edtNumber.getText() + "/");
                break;
            case R.id.equals:
                MathJS mathJS = new MathJS();
                String answer = mathJS.eval(edtNumber.getText().toString());
                System.out.println(answer);
                edtNumber.setText(answer);
                break;
            case R.id.clear:
                edtNumber.setText("");
                break;
            case R.id.percentage:;
                edtNumber.setText(edtNumber.getText() + "%");
                break;
            case R.id.natural_log:
                edtNumber.setText(edtNumber.getText() + "ln(");
                break;
            case R.id.parenthesis_right:
                edtNumber.setText(edtNumber.getText() + ")");
                break;
            case R.id.parenthesis_left:
                edtNumber.setText(edtNumber.getText() + "(");
                break;
            case R.id.absolute_value:
                edtNumber.setText(edtNumber.getText() + "abs(");
                break;
            case R.id.log:
                edtNumber.setText(edtNumber.getText() + "log(");
                break;
            case R.id.sqrt:
                edtNumber.setText(edtNumber.getText() + "√(");
                break;
            case R.id.e_to_x:
                edtNumber.setText(edtNumber.getText() + "^");
                break;
            case R.id.sin:
                edtNumber.setText(edtNumber.getText() + "sin(");
                break;
            case R.id.cos:
                edtNumber.setText(edtNumber.getText() + "cos(");
                break;
            case R.id.tan:
                edtNumber.setText(edtNumber.getText() + "tan(");
                break;
            case R.id.e_to_square:
                edtNumber.setText(edtNumber.getText() + "^2");
                break;
            case R.id.pi:
                edtNumber.setText(edtNumber.getText() + "\u03c0");
                break;
            case R.id.sin_inverse:
                edtNumber.setText(edtNumber.getText() + "asin");
                break;
            case R.id.cos_inverse:
                edtNumber.setText(edtNumber.getText() + "acos");
                break;
            case R.id.tan_inverse:
                edtNumber.setText(edtNumber.getText() + "atan");
                break;
            case R.id.rad:
                edtNumber.setText(edtNumber.getText() + "√(");
                break;

            default:
                break;
        }



    }
}
