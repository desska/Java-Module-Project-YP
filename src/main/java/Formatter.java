public class Formatter {

    public String getFormatSum(double sum) {

        return String.format("%.2f %s", sum, getFormattedRub(sum));

    }

    String getFormattedRub(double sum) {

        Double s = new Double(sum);
        String sumAsString = String.valueOf(s.intValue());
        char lastNum = sumAsString.charAt(sumAsString.length() - 1);
        String ending = "";
        switch (lastNum) {
            case ('1'):
                ending = "ль";
                break;
            case ('2'):
            case ('3'):
            case ('4'):
                ending = "ля";
                break;
            default:
                ending = "лей";
                break;
        }

        return "руб" + ending;

    }

}
