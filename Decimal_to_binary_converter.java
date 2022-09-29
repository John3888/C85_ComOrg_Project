public static boolean is_Decimal(float num){
     String number = Float.toString(num);

         if ((num % 1)!= 0){
             return true;
             }
     return false;       
    }

public static String reverse(String to_be_reversed){
    String reversed = "";
    for (int i=to_be_reversed.length()-1; i > -1 ;i-- ){
        reversed += to_be_reversed.charAt(i);
    }
    return reversed;    
}   
public static float Get_whole(float num){
    return num - Get_decimal_val(num);
}


    public static String Get_binary(float num){
        String binary = "";
        while (num != 0){
            num /= 2;
            if (is_Decimal(num) == true){
                binary += "1";
                num = Get_whole(num);
                }
                else{
                    binary += "0";
                    }
            }
            return reverse(binary);
        }