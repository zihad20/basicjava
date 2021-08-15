package do_while_loop_and_String;

public class Problem_3{
    public static void main(String[] args) {

        //String str2 = "2 piece shirt 2000 tk";
        //String str3 = "1 piece pant 750 tk";

        String str1 = "1 piece sharee 3500 tk";
        str1 = str1.replaceAll("[^\\d]", " ");
        str1 = str1.trim();
        str1 = str1.replaceAll(" +", " ");
        String[] arr1=(str1.split(" "));
        double quantity1=Double.parseDouble(arr1[0]);
        double price1=Double.parseDouble(arr1[1]);

        String str2 = "2 piece shirt 2000 tk";
        str2 = str2.replaceAll("[^\\d]", " ");
        str2 = str2.trim();
        str2 = str2.replaceAll(" +", " ");
        String[] arr2=(str2.split(" "));
        double quantity2=Double.parseDouble(arr2[0]);
        double price2=Double.parseDouble(arr2[1]);

        String str3 = "1 piece pant 750 tk";
        str3 = str3.replaceAll("[^\\d]", " ");
        str3 = str3.trim();
        str3 = str3.replaceAll(" +", " ");
        String[] arr3=(str3.split(" "));
        double quantity3=Double.parseDouble(arr3[0]);
        double price3=Double.parseDouble(arr3[1]);

        double price=price1+price2+price3;
        double quantity=quantity1+quantity2+quantity3;

        System.out.println("Total Price "+price);
        System.out.println("Total Quantity "+quantity);
    }
}
