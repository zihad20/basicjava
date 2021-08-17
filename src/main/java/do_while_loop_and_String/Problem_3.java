package do_while_loop_and_String;
// 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression

public class Problem_3{
    public static void main(String[] args) {

        String str1 = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str1 = str1.replaceAll("[^\\d]", " ");
        str1 = str1.trim();
        str1 = str1.replaceAll(" +", " ");
        String[] arr1=(str1.split(" "));
        double price=Double.parseDouble(arr1[1])+Double.parseDouble(arr1[3])+Double.parseDouble(arr1[5]);
        double quantity=Double.parseDouble(arr1[0])+Double.parseDouble(arr1[2])+Double.parseDouble(arr1[4]);

        System.out.println("Total Price "+price);
        System.out.println("Total Quantity "+quantity);
    }
}
