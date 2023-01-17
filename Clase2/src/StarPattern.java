import java.util.Scanner;

public class StarPattern {

    private int dim1;
    private int dim2;

    public StarPattern(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void draw(){
        String s = "";
        int i;
        for(i=0;i<(dim2-dim1)+1;i++){
            if(i<((dim2-dim1)/2)){
                int spaces = ((dim2-dim1)/2)-i;
                for(int j=0;j<spaces;j++){
                    s+=" ";
                }
                for(int j=0;j<dim1+i*2;j++){
                    s+="+";
                }
                s+="\n";
            } else if (i == ((dim2-dim1)/2)) {
                for(int j=0;j<dim2;j++){
                    s+="+";
                }
                s+="\n";
            }else{
                int spaces = i-((dim2-dim1)/2);
                for(int j=0;j<spaces;j++){
                    s+=" ";
                }
                for(int j=0;j<dim2-spaces*2;j++){
                    s+="+";
                }
                s+="\n";
            }
        }
        System.out.print(s);
    }
}
