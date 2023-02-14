public class Main {
    public static void main(String[] args) {

        /*
         * Дано четное число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
         */

        System.out.println(buildString(4, 'a', 'b')); // ababab


        /*
         * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. результат - a4b3cd2
         */

        System.out.println(compress("aaaabbbcdd")); // a4b3cd2

    }


//    private static String buildString(int n, char first, char second) {
//        String str = "";
//        while (str.length() < n) {
//            str += first;
//            str += second;
//        }
//        return str;
//    }

    private static String buildString(int n, char first, char second) {
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.
        String result = "";
        int flag = 0;
        while (flag < n) {
            result = result + first + second;
            flag += 2;
        }
        return result;
    }


    private static String compress(String source) {
        String compressed = "";
        int count = 1;
        char currentChar = ' ';

        for (int index = 0; index < source.length() - 1; index++) {
            currentChar = source.charAt(index);
            if (currentChar == source.charAt(index + 1)) {
                count++;
            } else {
                compressed += currentChar;
                compressed += count;
                count = 1;
            }
        }
        compressed += currentChar;
        compressed += count;

        return compressed;
    }

}