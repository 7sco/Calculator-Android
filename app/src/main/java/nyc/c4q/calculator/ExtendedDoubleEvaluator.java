//package nyc.c4q.calculator;
//
//
//import java.util.Iterator;
//
//public class ExtendedDoubleEvaluator extends DoubleEvaluator {
//
//    private static final Function SQRT = new Function("sqrt", 1);
//    private static final Parameters PARAMS;
//
//
//    static {
//        PARAMS = DoubleEvaluator.getDefaultParameters();
//        PARAMS.add(SQRT);
//    }
//
//    public ExtendedDoubleEvaluator() {
//        super(PARAMS);
//    }
//
//    @Override
//    protected Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
//        if (function == SQRT) {
//            return Math.sqrt(arguments.next());
//        } else {
//            return super.evaluate(function, arguments, evaluationContext);
//        }
//    }
//
//    public static double factorial(double n) {
//        if (n == 0) {
//            return 1;
//        }
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//}