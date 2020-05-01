package domain;

/** Содержит реализацию методов для посчёта Числа Судьбы и проверки правильности набора*/
public class Exercise {
    /** Подсчитать Число Судьбы
     * @param day День рождения
     * @param month Месяц рождения
     * @param year Год рождения
     * @return answer*/
    public static byte Calculate(byte day, byte month, short year){
        if(check(day,month,year)==false)
            return -1;
        else{
            byte answer = 0;
            byte a = 0;
            
            do{
                a = (byte) (a + (year%10));
                year = (short) (year / 10);
            }while(year!=0);
            
            do{
                a = (byte) (a + (month%10));
                month = (byte) (month / 10);
            }while(month!=0);
            
            do{
                a = (byte) (a + (day%10));
                day = (byte) (day / 10);
            }while(day!=0);
            
            if(a>10){
                do{
                    do{
                        answer = (byte) (answer + (a%10));
                        a = (byte) (a / 10);
                    }while(a!=0);
                    if (answer>9){
                        a = answer;
                        answer = 0;
                       }
                    else
                        break;
                }while(true);
            }
            return answer;
        }
    }
    
    private static boolean check(byte day, byte month, short year)
    {
        if(year<0)
            return false;
        else
        switch(month){
            case 1:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 2:
                if(year%4 == 0)
                    if (day>0 && day<=29)
                        return true;
                    else
                        return false;
                else
                    if (day>0 && day<=28)
                        return true;
                    else
                        return false;
            case 3:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 4:
                if (day>0 && day<=30)
                    return true;
                else
                    return false;
            case 5:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 6:
                if (day>0 && day<=30)
                    return true;
                else
                    return false;
            case 7:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 8:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 9:
                if (day>0 && day<=30)
                    return true;
                else
                    return false;
            case 10:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            case 11:
                if (day>0 && day<=30)
                    return true;
                else
                    return false;
            case 12:
                if (day>0 && day<=31)
                    return true;
                else
                    return false;
            default:
                return false;
        }         
    }
    
}
