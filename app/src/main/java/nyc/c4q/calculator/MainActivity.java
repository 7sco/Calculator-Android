package nyc.c4q.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean isInverse = false;

    private CalculatorActivity mCalculator;

    private Button buttonZero,buttonOne,buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    private Button buttonRest,buttonTimes, buttonDivision,buttonClear, buttonEquals, buttonDot, buttonPlus, buttonPercentage, closeParenthesis;
    private Button buttonDeg, buttonSin, buttonLn,buttonCos, buttonLog, buttonTan, buttonSquareRoot,  buttonXSquare, buttonYPowerX,
            buttonRad, buttonCosInverse, buttonSinInverse, buttonTanInverse, buttonPi, buttonAbs;

    TextView edtNumber;

    double mValueOne, mValueTwo;
    boolean addition, subtract, multiplication, division;

    int sign;
    private String displayedInput;
    private String inputToBeParsed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalculator= new CalculatorActivity();
//        getRotation(Context mCalculator);

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
        buttonTimes = (Button) findViewById(R.id.times);;
        buttonDivision= (Button) findViewById(R.id.division);;
        buttonClear = (Button) findViewById(R.id.clear);
        buttonEquals = (Button) findViewById(R.id.equals);
        buttonDot = (Button) findViewById(R.id.dot);
        buttonPercentage = (Button) findViewById(R.id.percentage);
        closeParenthesis = (Button) findViewById(R.id.parenthesis);
        buttonSin = (Button) findViewById(R.id.sin);
        buttonRad = (Button) findViewById(R.id.rad);
        buttonDeg = (Button) findViewById(R.id.nn);
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
        closeParenthesis.setOnClickListener(this);


//        buttonSin.setOnClickListener(this);
//        buttonRad.setOnClickListener(this);
//        buttonDeg.setOnClickListener(this);
//        buttonSquareRoot.setOnClickListener(this);
//        buttonCos.setOnClickListener(this);
//        buttonTan.setOnClickListener(this);
//        buttonCosInverse.setOnClickListener(this);
//        buttonSinInverse.setOnClickListener(this);
//        buttonTanInverse.setOnClickListener(this);
//        buttonYPowerX.setOnClickListener(this);
//        buttonXSquare.setOnClickListener(this);
//        buttonPi.setOnClickListener(this);
//        buttonAbs.setOnClickListener(this);
//        buttonLn.setOnClickListener(this);
//        buttonLog.setOnClickListener(this);

    }

    public String getRotation(Context context){
        final int rotation = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getOrientation();
        switch (rotation) {
            case Surface.ROTATION_0:
                return "portrait";
            case Surface.ROTATION_90:
                buttonSin.setOnClickListener(this);
            buttonRad.setOnClickListener(this);
            buttonDeg.setOnClickListener(this);
            buttonSquareRoot.setOnClickListener(this);
            buttonCos.setOnClickListener(this);
            buttonTan.setOnClickListener(this);
            buttonCosInverse.setOnClickListener(this);
                buttonSinInverse.setOnClickListener(this);
            buttonTanInverse.setOnClickListener(this);
            buttonYPowerX.setOnClickListener(this);
            buttonXSquare.setOnClickListener(this);
            buttonPi.setOnClickListener(this);
            buttonAbs.setOnClickListener(this);
                buttonLn.setOnClickListener(this);
            buttonLog.setOnClickListener(this);
                return "landscape";
            case Surface.ROTATION_180:
                return "reverse portrait";
            default:
                buttonSin.setOnClickListener(this);
                buttonRad.setOnClickListener(this);
                buttonDeg.setOnClickListener(this);
                buttonSquareRoot.setOnClickListener(this);
                buttonCos.setOnClickListener(this);
                buttonTan.setOnClickListener(this);
                buttonCosInverse.setOnClickListener(this);
                buttonSinInverse.setOnClickListener(this);
                buttonTanInverse.setOnClickListener(this);
                buttonYPowerX.setOnClickListener(this);
                buttonXSquare.setOnClickListener(this);
                buttonPi.setOnClickListener(this);
                buttonAbs.setOnClickListener(this);
                buttonLn.setOnClickListener(this);
                buttonLog.setOnClickListener(this);
                return "reverse landscape";


        }
    }


    public void reset(){
        if(sign ==1){
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

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Double.parseDouble(edtNumber.getText() + "");
                    addition = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.rest:

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    subtract = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.times:

                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    multiplication = true;
                    edtNumber.setText(null);
                }

                break;

            case R.id.division:
                if (edtNumber.getText().equals("")) {
                    edtNumber.setText("");
                } else {
                    mValueOne = Float.parseFloat(edtNumber.getText() + "");
                    division = true;
                    edtNumber.setText(null);
                }
                break;

            case R.id.equals:

                mValueTwo = Double.parseDouble(edtNumber.getText() + "");

                if (addition == true) {
                    edtNumber.setText(mValueOne + mValueTwo + "");
                    addition = false;
                    sign=1;
                    break;
                }

                if (subtract == true) {
                    edtNumber.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                    sign=1;
                    break;
                }

                if (multiplication == true) {
                    edtNumber.setText(mValueOne * mValueTwo + "");
                    multiplication = false;
                    break;
                }
                if (division == true) {
                    edtNumber.setText(mValueOne / mValueTwo + "");
                    division = false;

                }

//                String enteredInput = outputResult.getText().toString();
//                // call a function that will return the result of the calculate.
//                String resultObject = mCalculator.getResult(currentDisplayedInput, inputToBeParsed);
//                outputResult.setText(removeTrailingZero(resultObject));

                break;

            case R.id.clear:
                edtNumber.setText("");
                break;
            case R.id.percentage:
                if(isInverse){
                    edtNumber.setText("1÷");
//                    inputToBeParsed += "1÷";
                }else{
                    edtNumber.setText("1÷");
//                    displayedInput += "%";
//                    inputToBeParsed += "%";
                }
                break;
//                toggleInverse();
            case R.id.natural_log:
                if(isInverse){
                    displayedInput += "e^";
                    inputToBeParsed += "e^";
                }else{
                    displayedInput += "ln(";
                    inputToBeParsed += "ln(";
                }
                break;
            case R.id.log:
                if(isInverse){
                    displayedInput += "10^";
                    inputToBeParsed += "10^";
                }else{
                    displayedInput += "log(";
                    inputToBeParsed += "log(";
                }
                break;
            case R.id.sqrt:
                if(isInverse){
                    displayedInput += "3√(";
                    inputToBeParsed += "crt(";
                }else{
                    displayedInput += "√(";
                    inputToBeParsed += "sqrt(";
                }
                break;
            case R.id.e_to_x:
                displayedInput += "^";
                inputToBeParsed += "^";
                break;
            case R.id.sin:
                if(isInverse){
                    displayedInput += "asin(";
                    inputToBeParsed += "asin(";
                }else{
                    displayedInput += "sin(";
                    inputToBeParsed += "sin(";
                }
                break;
            case R.id.cos:
                if(isInverse){
                    displayedInput += "acos(";
                    inputToBeParsed += "acos(";
                }else{
                    displayedInput += "cos(";
                    inputToBeParsed += "cos(";
                }
                break;
            case R.id.tan:
                if(isInverse){
                    displayedInput += "atan(";
                    inputToBeParsed += "atan(";
                }else{
                    displayedInput += "tan(";
                    inputToBeParsed += "tan(";
                }
                break;
            case R.id.e_to_square:
                if(isInverse){
                    displayedInput += "^3";
                    inputToBeParsed += "^3";
                }else{
                    displayedInput += "^2";
                    inputToBeParsed += "^2";
                }
                break;
            case R.id.absolute_value:
                displayedInput += "abs(";
                inputToBeParsed += "abs(";
                break;

            default:
                break;
        }
//        edtNumber.setText(currentDisplayedInput);


    }
}
