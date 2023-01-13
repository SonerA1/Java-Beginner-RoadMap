public class Main {
    /*
    java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }

}
