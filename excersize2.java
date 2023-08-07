import java.util.Scanner;

public class excersize2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String msg1 = "Invalid Entry";
        String msg2 = "Invalid Age Entry";
        String msg3 = "Invalid Subject";
        String msg4 = "Invalid Mark";
        String status;
        String colurCode;
        String StatusSub1,StatusSub2,StatusSub3;
        String colourRed = "\033[31;1m";

        myBlock:
        {
            System.out.print("Enter your name:");
            String name = scanner.nextLine();
            if(name.length()==0){
                System.out.printf(colourRed +"%s \n",msg1); 
                break myBlock ;
            }
            else if(name.startsWith(" ")) {
                System.out.printf(colourRed +"%s \n",msg1);
                break myBlock;
            }
            else{
                System.out.print("Enter your age:");
                int age = scanner.nextInt(); 
                if (age<10){
                    System.out.printf(colourRed +"%s \n",msg2);
                    break myBlock;
                }
                else if(age>18){
                    System.out.printf(colourRed +"%s \n",msg2);
                    break myBlock;
                }
                else{
                    System.out.print("Enter you subject-1:");
                    String sub1 = scanner.next();
                    if (sub1.length()==0){
                        System.out.printf(colourRed +"%s \n",msg3);
                        break myBlock;
                    }
                    else if(!sub1.startsWith("SE-1")){
                        System.out.printf(colourRed +"%s \n",msg3);
                        break myBlock;
                    }
                    else if (sub1.length()>4){
                        System.out.printf(colourRed +"%s \n",msg3);
                        break myBlock;
                    }
                
                    else{
                        System.out.print("Enter your mark-1:");
                        double mark1 = scanner.nextDouble();
                        if (mark1<0){
                            System.out.printf(colourRed +"%s \n",msg4);
                            break myBlock;
                        }
                        else if (mark1>100){
                            System.out.printf(colourRed +"%s \n",msg4);
                            break myBlock;
                        }
                        else{
                           System.out.print("Enter you subject-2:"); 
                           String sub2 = scanner.next();
                           if (sub2.startsWith("SE-1")){
                            System.out.printf(colourRed+"Subject already exist");
                            break myBlock;
                           }
                           else if(!sub2.startsWith("SE-2")){
                            System.out.printf(colourRed +"%s \n",msg3);
                            break myBlock;
                           }
                           else if (sub2.length()>4){
                            System.out.printf(colourRed +"%s \n",msg3);
                            break myBlock;
                           }
                           else{
                            System.out.print("Enter your mark-2:");
                            double mark2 = scanner.nextDouble();
                            if (mark2<0){
                                System.out.printf(colourRed +"%s \n",msg4);
                                break myBlock;
                            }
                            else if(mark2>100){
                                System.out.printf(colourRed +"%s \n",msg4);
                                break myBlock;
                            }
                            else{
                                System.out.print("Enter you subject-3:");
                                String sub3 = scanner.next();
                                if(sub3.startsWith("SE-1")){
                                    System.out.printf(colourRed+"Subject already exist");
                                    break myBlock;
                                }
                                else if(sub3.startsWith("SE-2")){
                                    System.out.printf(colourRed+"Subject already exist");
                                    break myBlock;
                                }
                                else if (!sub3.startsWith("SE-3")){
                                    System.out.printf(colourRed +"%s \n",msg3);
                                    break myBlock;
                                }
                                else if(sub3.length()>4){
                                    System.out.printf(colourRed +"%s \n",msg3);
                                    break myBlock;
                                }
                                else{
                                   System.out.print("Enter your mark-3:"); 
                                   double mark3 = scanner.nextDouble();
                                   if (mark3<0){
                                    System.out.printf(colourRed +"%s \n",msg4);
                                    break myBlock;
                                   }
                                   else if(mark3>100){
                                    System.out.printf(colourRed +"%s \n",msg4);
                                    break myBlock;
                                   }
                                   else{
                                    Double total = mark1+mark2+mark3;
                                    Double avg = total/3;
                                    if (avg<55){
                                         status = "Fail";
                                         colurCode = "\033[31;1m";
                                    }
                                    else if(avg<65){
                                         status = "Pass";
                                         colurCode = "\033[33;1m";
                                    }
                                    else if (avg<75){
                                         status = "Credit Pass";
                                         colurCode = "\033[32;1m";
                                    }
                                    else {
                                         status = "Distinguished Pass";
                                         colurCode = "\033[34;1m";
                                    }
                                    if (mark1<55) StatusSub1="\033[31m Fail \033[0m";
                                    else if(mark1<65) StatusSub1 = "\033[33m Pass \033[0m";
                                    else if (mark1<75) StatusSub1 ="\033[32m Credt Pass \033[0m";
                                    else StatusSub1="\033[34m Distinguished Pass \033[0m";

                                    if(mark2<55) StatusSub2="\033[31m Fail \033[0m";
                                    else if(mark2<65) StatusSub2 ="\033[33m Pass \033[0m";
                                    else if(mark2<75) StatusSub2 = "\033[32m Credit Pass \033[0m";
                                    else StatusSub2="\033[34m Distinguished Pass \033[0m";

                                    if(mark3<55) StatusSub3="\033[31m Fail \033[0m";
                                    else if(mark3<65) StatusSub3 ="\033[33m Pass \033[0m";
                                    else if(mark3<75) StatusSub3 = "\033[32m Credit Pass \033[0m";
                                    else StatusSub3="\033[34m Distinguished Pass \033[0m";
                                    System.out.println("+------------------------------------------------+");
                                    System.out.printf("|  Name: \033[34;1m %-37s \033[0m |\n",name.toUpperCase());
                                    System.out.printf("|  Age : %d  years old %26s| \n",age," ");
                                    System.out.printf("|  Status: %1$s %2$-35s \033[0m | \n",colurCode,status);
                                    System.out.printf("|  Total: %-16.2f   Avg: %-14.2f |\n",total,avg);
                                    System.out.println("+------------------------------------------------+");
                                    System.out.printf("| Subject %1$s | Mark %1$8s | Status %1$12s| \n"," ");
                                    System.out.println("+------------------------------------------------+");
                                    int subName1 = Integer.valueOf(sub1.substring(3));
                                    int subName2 = Integer.valueOf(sub2.substring(3));
                                    int subName3 = Integer.valueOf(sub3.substring(3));
                                    System.out.printf("| SE- %1$03d   | %2$-11.2f  | %3$28s |\n",subName1,mark1,StatusSub1);
                                    System.out.printf("| SE- %1$03d   | %2$-11.2f  | %3$28s |\n",subName2,mark2,StatusSub2);
                                    System.out.printf("| SE- %1$03d   | %2$-11.2f  | %3$28s |\n",subName3,mark3,StatusSub3);
                                    System.out.println("+------------------------------------------------+");
                                   }

                                }


                            }

                           }

                           
                        }
                    }
                    
                        
                        

                        
                            
            
                    

                }
            }

        }
        
    }
    
}
