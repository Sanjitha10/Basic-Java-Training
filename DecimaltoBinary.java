    // public class DecimaltoBinary {
    //     public static void main(String[] args) {
    //         int decimalNumber = 25; // Example decimal number

    //         // Convert decimal to binary string
    //         String binaryString = Integer.toBinaryString(decimalNumber);

    //         System.out.println("Decimal: " + decimalNumber);
    //         System.out.println("Binary: " + binaryString);
    //     }
    // }

        public class DecimaltoBinary {
        public static void main(String[] args) {
            int decimalNumber = 25; // Example decimal number
            StringBuilder binaryResult = new StringBuilder();

            if (decimalNumber == 0) {
                binaryResult.append("0");
            } else {
                int tempDecimal = decimalNumber;
                while (tempDecimal > 0) {
                    int remainder = tempDecimal % 2;
                    binaryResult.insert(0, remainder); // Insert at the beginning to reverse the order
                    tempDecimal /= 2;
                }
            }

            System.out.println("Decimal: " + decimalNumber);
            System.out.println("Binary: " + binaryResult.toString());
        }
    }