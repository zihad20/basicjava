package do_while_loop_and_String;
// <html>
//<body>
//<div>
//<p>Transaction Successful</p>
//<p>Trnx ID: TXN5164870</p>
//</div>
//
//
//</body>
//</html>
//
//
//Extract only transaction ID from the HTML
public class Problem_4{
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        int indexNumberStart=str.indexOf("TXN5164870");//57,66,76
        int indexNumberEnd=str.indexOf("0");
        System.out.println(str.substring(indexNumberStart,indexNumberEnd+1));
    }
}
