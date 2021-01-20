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
    public String array(int[] valores, int x){
        for(int i = 0; i < valores.length;i++){
            if(valores[i] == x && valores[i] == x && valores[i] == x)
                return "1 2 Face";
        }
    }

}
