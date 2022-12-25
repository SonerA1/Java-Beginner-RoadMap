import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Ödev
        Aynı örneği switch-case kullanmadan yapınız.*/
        
        
        int month, day;
        String horoscope = "";
        boolean isError = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Which month were you born in ? : ");
        month = scan.nextInt();
        System.out.print("which day were you born in ? : ");
        day = scan.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Aquarius ";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces ";
                    } else {
                        horoscope = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Aries ";
                    } else {
                        horoscope = "Taurus ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Taurus ";
                    } else {
                        horoscope = "Gemini ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Gemini ";
                    } else {
                        horoscope = "Cancer  ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Cancer  ";
                    } else {
                        horoscope = "Leo ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Leo ";
                    } else {
                        horoscope = "Virgo  ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Virgo ";
                    } else {
                        horoscope = "Libra  ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Libra ";
                    } else {
                        horoscope = "Scorpio ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Scorpio ";
                    } else {
                        horoscope = "Sagittarius  ";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Sagittarius  ";
                    } else {
                        horoscope = "Capricorn ";
                    }
                } else {
                    isError = true;
                }
                break;

            default:
        }
        if (isError) {
            System.out.println("Incorrect Date... Please Try Again!.");
        } else {
            System.out.println("Your Horoscope : " + horoscope);
        }


    }
}
