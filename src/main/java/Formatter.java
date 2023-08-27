public class Formatter {

    public String getFormatSum(double sum) {

        return String.format("%.2f %s", sum, getFormattedRub(sum));

    }

    String getFormattedRub(double sum) {

        if(((sum % 100) >= 11) & ((sum % 100) <=19)) {
            return "рублей";
        }

        Double s = new Double(sum);
        String sumAsString = String.valueOf(s.intValue());
        char lastNum = sumAsString.charAt(sumAsString.length() - 1);
        String ending = "";
        switch (lastNum) {
            case ('1'):
                return  "рубль";
            case ('2'):
            case ('3'):
            case ('4'):
                return  "рубля";
            default:
                return  "рублей";
        }

    }

}
