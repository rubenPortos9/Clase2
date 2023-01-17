import java.util.Random;
import java.util.UUID;

public class Password {

    private int longitud;
    private String contraseña;

    public Password(){
        this.longitud=8;
    }
    public Password(int l){
        this.longitud = l;
        this.contraseña = generarPassword(l);
    }
    public Password(Password p){
        this.longitud = p.longitud;
        this.contraseña = p.contraseña;
    }

    public String generarPassword(int l){
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

        StringBuilder s = new StringBuilder(l);

        int i;

        for ( i=0; i<l; i++) {
            int ch = (int)(AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }
    public void generarPassword(){
        this.contraseña = generarPassword(this.longitud);
    }


    public boolean esFuerte(){
        int len = contraseña.length();
        int up=0;
        int low=0;
        int num=0;
        for(int i=0;i<len;i++){
            char ch = contraseña.charAt(i);
            if(Character.isUpperCase(ch)){
                up+=1;
            }
            if(Character.isLowerCase(ch)){
                low+=1;
            }
            if(Character.isDigit(ch)){
                num+=1;
            }
        }
        if((up>2)&&(low>1)&&(num>5)){
            return true;
        }else{
            return false;
        }
    }

    public String getContraseña() {
        return contraseña;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


}
