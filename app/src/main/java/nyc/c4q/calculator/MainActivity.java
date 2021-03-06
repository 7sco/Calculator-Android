package nyc.c4q.calculator;

        import android.content.Context;
        import android.content.res.Configuration;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Surface;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.TextView;

        import com.squareup.duktape.DuktapeException;

        import mathjs.niltonvasques.com.mathjs.MathJS;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean isInverse = false;
    private Button buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    private Button buttonRest, buttonTimes, buttonDivision, buttonClear, buttonEquals, buttonDot, buttonPlus, buttonPercentage, buttonMakeNegative, buttonAnsrecord, buttontanInverse, fcloseParenthesis;
    private Button buttonDeg, buttonSin, buttonLn, buttonCos, buttonLog, buttonTan, buttonSquareRoot, buttonXSquare, buttonYPowerX,
            buttonRad, buttonCosInverse, buttonSinInverse, buttonTanInverse, buttonPi, buttonAbs;

    TextView edtNumber;

    int sign;
    int parenthesis;
    int parenthesisClose=0;

    boolean ansRecord;
    String value;

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
        buttonMakeNegative = (Button) findViewById(R.id.make_negative);
        buttonAnsrecord = (Button) findViewById(R.id.ansRecord);


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
        buttonDot.setOnClickListener(this);
        buttonMakeNegative.setOnClickListener(this);
        buttonPi.setOnClickListener(this);
//        buttonAnsrecord.setOnClickListener(this);
//        buttontanInverse.setOnClickListener(this);


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
                sign=0;
                break;
            case R.id.one:
                reset();
                edtNumber.setText(edtNumber.getText() + "1");
                sign=0;
                break;
            case R.id.two:
                reset();
                edtNumber.setText(edtNumber.getText() + "2");
                sign=0;
                break;
            case R.id.three:
                reset();
                edtNumber.setText(edtNumber.getText() + "3");
                sign=0;
                break;
            case R.id.four:
                reset();
                edtNumber.setText(edtNumber.getText() + "4");
                sign=0;
                break;
            case R.id.five:
                reset();
                edtNumber.setText(edtNumber.getText() + "5");
                sign=0;
                break;
            case R.id.six:
                reset();
                edtNumber.setText(edtNumber.getText() + "6");
                sign=0;
                break;
            case R.id.seven:
                reset();
                edtNumber.setText(edtNumber.getText() + "7");
                sign=0;
                break;
            case R.id.eight:
                reset();
                edtNumber.setText(edtNumber.getText() + "8");
                sign=0;
                break;
            case R.id.nine:
                reset();
                edtNumber.setText(edtNumber.getText() + "9");
                sign=0;
                break;
            case R.id.dot:
                reset();
                edtNumber.setText(edtNumber.getText() + ".");
                sign=0;
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

            case R.id.make_negative:

                if(edtNumber.getText().toString().contains("-") && edtNumber.getText().toString().charAt(0) == '-'){
                    break;
                }
                edtNumber.setText(edtNumber.getText() + "-");
                break;

            case R.id.equals:

                if(edtNumber.getText().equals("")){
                    edtNumber.setText("");
                    edtNumber.setHint("0");
                    break;
                }


                String par=")";
                String newS="";



                if(parenthesis > 0 && parenthesisClose < 1){
                    for(int i=0;i<parenthesis;i++){

                        newS=newS+par;
                    }
                    edtNumber.setText(edtNumber.getText()+ newS);
                }

                MathJS mathJS = new MathJS();
                try{
                    String answer = mathJS.eval(edtNumber.getText().toString());

                    edtNumber.setText(answer);

                    value= answer;
                    ansRecord =true;



                }catch (DuktapeException e){
                    edtNumber.setText("Error");
                }


                sign=1;
                parenthesis=0;
                parenthesisClose=0;


                break;

            case R.id.clear:
                edtNumber.setText("");
                sign=0;
                break;
            case R.id.percentage:;
                edtNumber.setText(edtNumber.getText() + "%");
                break;
            case R.id.natural_log:
                edtNumber.setText(edtNumber.getText() + "ln(");
                parenthesis++;
                break;
            case R.id.parenthesis_right:
                edtNumber.setText(edtNumber.getText() + ")");

                parenthesisClose++;
                break;
            case R.id.parenthesis_left:
                edtNumber.setText(edtNumber.getText() + "(");
                parenthesis++;
                break;
            case R.id.absolute_value:
                edtNumber.setText(edtNumber.getText() + "abs(");

                parenthesis++;
                break;
            case R.id.log:
                edtNumber.setText(edtNumber.getText() + "log(");
                parenthesis++;
                break;
            case R.id.sqrt:
                edtNumber.setText(edtNumber.getText() + "sqrt(");
                parenthesis++;
                break;
            case R.id.e_to_x:
                edtNumber.setText(edtNumber.getText() + "^");
                break;
            case R.id.sin:
                edtNumber.setText(edtNumber.getText() + "sin(");
                parenthesis++;
                break;
            case R.id.cos:
                edtNumber.setText(edtNumber.getText() + "cos(");
                parenthesis++;
                break;
            case R.id.tan:
                edtNumber.setText(edtNumber.getText() + "tan(");
                parenthesis++;
                break;
            case R.id.e_to_square:
                edtNumber.setText(edtNumber.getText() + "^2");
                break;
            case R.id.pi:
                edtNumber.setText(edtNumber.getText() + "pi");
                break;
            case R.id.sin_inverse:
                edtNumber.setText(edtNumber.getText() + "asin(");
                parenthesis++;
                break;
            case R.id.cos_inverse:
                edtNumber.setText(edtNumber.getText() + "acos(");
                parenthesis++;
                break;
            case R.id.tan_inverse:
                edtNumber.setText(edtNumber.getText() + "atan(");
                parenthesis++;
                break;

            case R.id.ansRecord:
                if (ansRecord){
                    edtNumber.setText(value);
                    sign=0;

                }
                else{
                    break;
                }


                break;

            default:
                break;
        }



    }
}
