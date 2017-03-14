/**
 * Created by Fachril Zulfidar on 14/03/2017.
 */
import java.util.Scanner;
public class mainPacman {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String[][] maze = {{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
                           {"#", " ", " ", " ", " ", "o", " ", " ", ">", "#"},
                           {"#", "#", " ", " ", " ", "#", "#", "#", "#", "#"},
                           {"#", " ", "o", " ", " ", " ", " ", " ", " ", "#"},
                           {"#", "#", " ", " ", " ", "#", " ", " ", " ", "#"},
                           {"#", "o", " ", " ", "o", "#", "#", "#", "#", "#"},
                           {"#", " ", " ", " ", " ", " ", " ", " ", "#", "#"},
                           {"#", " ", " ", "#", "#", " ", " ", " ", " ", "#"},
                           {"#", " ", " ", " ", "#", "#", " ", " ", "o", "#"},
                           {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"}};
        Pacman pacChar=new Pacman();
        pacChar.baris= 1;
        pacChar.kolom= 8;
        pacChar.setStep(31);
        pacChar.setScore(0);
        char k;
        int r=pacChar.baris , c=pacChar.kolom;
        boolean x = true;
        do{
            for(int baris=0 ; baris<=9 ; baris++){
                for(int kolom=0 ; kolom<=9 ; kolom++){
                    System.out.print(maze[baris][kolom]);
                }
                System.out.println();
            }
            pacChar.getStep();
            pacChar.displayScore();
            System.out.println("w,a,s,d for move");
            System.out.println("q for quit ");
            System.out.print(">> ");
            k = in.next().charAt(0);
            pacChar.arrow(k);
            if(maze[pacChar.baris][pacChar.kolom]=="o"){
                maze[r][c] = " ";
                r = pacChar.baris;
                c = pacChar.kolom;
                maze[pacChar.baris][pacChar.kolom] = pacChar.icoPac;
                pacChar.getScore();
            }else if(maze[pacChar.baris][pacChar.kolom]=="#"){
                pacChar.blockedWall(k);
                maze[pacChar.baris][pacChar.kolom] = pacChar.icoPac;
            }else if(maze[pacChar.baris][pacChar.kolom]==" "){
                maze[r][c] = " ";
                r = pacChar.baris;
                c = pacChar.kolom;
                maze[pacChar.baris][pacChar.kolom] = pacChar.icoPac;
            }
            if(pacChar.step==1 && pacChar.score !=5){
                for(int baris=0 ; baris<=9 ; baris++){
                    for(int kolom=0 ; kolom<=9 ; kolom++){
                        System.out.print(maze[baris][kolom]);
                    }
                    System.out.println();
                }
                System.out.println("*****************************************");
                System.out.println("YOU LOSE");
                pacChar.displayScore();
                System.out.println("*****************************************");
                x = false;
            }else if(pacChar.score==5){
                for(int baris=0 ; baris<=9 ; baris++){
                    for(int kolom=0 ; kolom<=9 ; kolom++){
                        System.out.print(maze[baris][kolom]);
                    }
                    System.out.println();
                }
                System.out.println("*****************************************");
                System.out.println("YOU WIN");
                pacChar.displayScore();
                System.out.println("*****************************************");
                x = false;
            }
            if(k=='q'){
                x = false;
            }
        }while(x);
    }
}
