package JavaStrings;

public class Receipt {
    public static void main(String[] args) {

        System.out.println(String.valueOf('-').repeat(75));
        System.out.print(String.format("%-40s", "Date: 01-Apr-26"));
        System.out.println(String.format("%35s", "GST-No: 835489IVHER342"));
        System.out.println(String.valueOf('-').repeat(75));
        System.out.print(String.format("%-10s %-20s %10s %15s %15s%n","S.No", "Item", "Qty", "Rate", "Price"));
        System.out.println(String.valueOf('-').repeat(75));

        int sncount = 1;
        String itemarr[] = {"Mouse", "Keyboard"};
        int qtyarr[] = {2, 1};
        double ratearr[] = {300.50, 1234.45};
        double total = 0;

        for (int i = 0; i < itemarr.length; i++) {
            double price = qtyarr[i] * ratearr[i];
            total += price;

            System.out.print(String.format("%-10d %-20s %10d %15.2f %15.2f%n",
                    sncount++, itemarr[i], qtyarr[i], ratearr[i], price));
        }

        System.out.println(String.valueOf('-').repeat(75));
        double gst = total * 0.18;
        double finalAmount = total + gst;

        System.out.print(String.format("%58s %15.2f%n", "Total :", total));
        System.out.print(String.format("%58s %15.2f%n", "IGST @ 18% :", gst));
        System.out.println(String.valueOf('-').repeat(75));
        System.out.print(String.format("%-58s %15.2f%n", "Total Amount to be paid : Rs.", finalAmount));
        System.out.println(String.valueOf('-').repeat(75));
    }
}