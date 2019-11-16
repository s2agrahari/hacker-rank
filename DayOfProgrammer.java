package rank;


/**
 * created by @author suraj on 15/11/19
 */
public class DayOfProgrammer {

    public static void main(String[] args) {
        System.out.println(timeInWords(5,01).toLowerCase());
    }

    static String timeInWords(int h, int m) {

        if (m == 0) {
            return convert(h) + " o' clock";
        } else if (m >= 1 && m <= 30) {
            if (m == 15) {
                return "quarter past " + convert(h);
            } else if (m == 30) {
                return "half past " + convert(h);
            } else if (m == 1){
                return convert(m) + " minute past " + convert(h);
            } else {
                return convert(m) + " minutes past " + convert(h);
            }
        } else {
            if (60 - m == 15) {
                return "quarter to " + convert(h + 1);
            } else {
                return convert(60 - m) + " minutes to " + convert(h + 1);
            }
        }

    }

    public static final String[] units = { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    public static final String[] tens = {
            "", 		// 0
            "",		// 1
            "Twenty", 	// 2
            "Thirty", 	// 3
            "Forty", 	// 4
            "Fifty", 	// 5
            "Sixty", 	// 6
            "Seventy",	// 7
            "Eighty", 	// 8
            "Ninety" 	// 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 10000000) {
            return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
        }

        return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
    }
}
