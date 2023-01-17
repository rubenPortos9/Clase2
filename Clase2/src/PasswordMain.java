import java.util.Scanner;

public class PasswordMain {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Indique el numero de contraseñas: ");
        int num = s.nextInt();
        System.out.print("Indique la longitud de las contraseñas: ");
        int len = s.nextInt();

        Password[] passArray= new Password[num];
        for(int i=0; i<num; i++){
            passArray[i]= new Password(len);
        }

        Password[] passArray2= new Password[num];
        for(int i=0; i<num; i++){
            passArray2[i]= new Password(passArray[i]);
        }

        for(int i=0; i<num-1; i++){
            for(int j=i+1; j<num; j++){
                if(passArray2[j].getContraseña().compareTo(passArray2[i].getContraseña())<0){
                    Password aux = passArray2[i];
                    passArray2[i] = passArray2[j];
                    passArray2[j] = aux;
                }
            }
        }
        System.out.println("Contraseñas ordenadas:");
        for(int i=0; i<num; i++){
            System.out.print(passArray2[i].getContraseña() + "\t");
        }
        System.out.println("\n");

        boolean[] fuerte = new boolean[num];
        System.out.println("Todas las contraseñas:");
        for(int i=0; i<num; i++){
            fuerte[i] = passArray[i].esFuerte();
            System.out.println(passArray[i].getContraseña() + "\t" + fuerte[i]);
        }
    }
}
