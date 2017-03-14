/**
 * Created by Fachril Zulfidar on 12/03/2017.
 */
public class Pacman {
    public int score;
    public int dot=5;
    public int step;
    public String icoPac;
    public int baris;
    public int kolom;

    public void setScore(int p){
        score = p;
    }
    public void getScore(){
        score +=1;
        dot -=1;
    }
    public void setStep(int s){
        step = s;
    }
    public void getStep(){
        step -= 1;
        System.out.println("Step left : " + step);
    }
    public void arrow(char a){
        if(a=='w'){
            baris -=1;
            icoPac = "v";
        }
        else if(a=='s'){
            baris +=1;
            icoPac = "^";
        }
        else if(a=='a'){
            kolom -=1;
            icoPac = ">";
        }
        else if(a=='d') {
            kolom += 1;
            icoPac = "<";
        }
        else{
            step += 1;
        }
    }
    public void blockedWall(char a){
        if(a=='w'){
            baris +=1;
            icoPac = "v";
        }
        if(a=='s'){
            baris -=1;
            icoPac = "^";
        }
        if(a=='a'){
            kolom +=1;
            icoPac = ">";
        }
        if(a=='d') {
            kolom -= 1;
            icoPac = "<";
        }
    }
    public void displayScore(){
        System.out.println("Score : "+score);
        System.out.println("Dot Left : "+ dot);
    }


}
