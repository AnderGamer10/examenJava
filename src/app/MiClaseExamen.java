package app;

public class MiClaseExamen {
    public String Multiplos(int x) {
        if (x % 3 == 0 && x % 5 == 0){
            return "Facebook";
        }else if (x % 3 == 0){
            return "Face";
        }else if (x % 5 == 0){
            return "Book";
        }else{
            return String.valueOf(x);
        }
    }
    public String array(int[] valores){
        String s="";
        for(int i = 0; i < valores.length;i++){

            s+=Multiplos(valores[i]) + " ";
            // if(valores[i] = 1 && valores[i] == 2 && valores[i] == 3)
            //     return "1 2 Face";
        }
        return s;
    }

}
