import java.io.*;
class cricket
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name; 
        int aa=0,ii=0,bb=0,cheat=0,score1=0,score2=0,c=0,choice=1,infinity=1; 
        double rr=0; 
        while(choice==1)
        {
            name=" ";

            choice=1;
            infinity=1;
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("| WELCOME TO THE GAME MADE BY RAJ GUPTA |");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("");
            System.out.print("Enter Your Name: ");
            name=br.readLine();
            for(c=0;c<=2;c++)
            {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            System.out.println("Hello "+name+",");
            System.out.println(".");
            System.out.println("WELCOME TO THE HAND CRICKET GAMES");
            System.out.println(".");
            System.out.println("Instructions:");
            System.out.println(".");
            System.out.println("You Will First Bat. \t Enter Any Number From 1 To 10.");
            System.out.println(".");
            System.out.println("But If You Enter A Number Same As The Number Entered By The Computer, You Will Lose The Game!");
            System.out.println(".");

            for(c=0;c<=2;c++)
            {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }

            System.out.println("YOU ARE BATTING:");

            for(c=0;c<=2;c++) { System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); } 
            for(ii=1;ii>0;ii++)
            {
                System.out.println("");
                System.out.print("Enter Your Number: ");
                bb=Integer.parseInt(br.readLine());
                rr=((Math.random())*10);
                rr=rr+1;
                aa=(int)(rr);
                System.out.println("");
                System.out.println("Computer's Number: "+aa);
                System.out.println("");
                System.out.println("**********");
                System.out.println("");

                if(bb==aa)
                {
                    System.out.println(" ");
                    System.out.println("OPPS!!!!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("YOUR FINAL SCORE = "+score1);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                else if(bb>0&&bb<=10) { score1=score1+bb; } else if(bb>10||bb<=0)
                {
                    for(c=0;c<=2;c++)
                    {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }
                    System.out.println("You have either tried to cheat or entered a wrong input. Game Over!");
                    cheat++;
                    break;
                }

                System.out.println("Your Current Score Is "+score1);
                System.out.println("");
                System.out.println("**********");
            }

            for(c=0;c<=2;c++) { if(cheat>0)
                {
                    break;
                }
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
            }

            for(c=0;c<1;c++) { if(cheat>0)
                {
                    break;
                }
                System.out.println("YOU ARE BOWLING:");
            }

            for(c=0;c<=2;c++) { if(cheat>0)
                {
                    break;
                }   
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }

            for(ii=1;ii>0;ii++)
            {
                if(cheat>0)
                {
                    break;
                }

                System.out.println("");
                System.out.print("Enter Your Number: ");
                bb=Integer.parseInt(br.readLine());
                rr=((Math.random())*10);
                rr=rr+1;
                aa=(int)(rr);
                System.out.println("");
                System.out.println("Computer's Number: "+aa);
                System.out.println("");
                System.out.println("**********");
                System.out.println("");

                if(aa==bb)
                {
                    System.out.println(" ");
                    System.out.println("COMPUTER IS OUTT!!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                else if(bb>0&&bb<=10) { score2=score2+aa; } else if(bb>10||bb<=0)
                {
                    for(c=0;c<=2;c++) { System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"); } 
                    System.out.println("You have either tried to cheat or entered a wrong input. Game Over!"); cheat++; break; }
                if(score2>score1)
                {
                    System.out.println(" ");
                    System.out.println("THE COMPUTER HAS SCORED MORE THAN YOUU!!!");
                    System.out.println(" ");
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                    System.out.println("################");
                    System.out.println("################");
                    System.out.println(" ");
                    break;
                }

                System.out.println("Computer's Current Score Is "+score2);
                System.out.println("");
                System.out.println("**********");
            }

            for(c=0;c<=2;c++) { if(cheat>0)
                {
                    break;
                }

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
            }

            for(ii=0;ii<1;ii++) { if(cheat>0)
                {
                    break;
                }

                System.out.println(" ");
                System.out.println("################");
                System.out.println("################");
                System.out.println("YOUR FINAL SCORE = "+score1);
                System.out.println("COMPUTER'S FINAL SCORE = "+score2);
                System.out.println("################");
                System.out.println("################");
                System.out.println(" ");

                if((score1)>(score2))
                {
                    System.out.println("Congratulations "+name+"!! You Have Defeated The Almighty, Computer!!");
                }

                else if((score1)<(score2))
                {
                    System.out.println("Sorry "+name+", But The Computer Has Defeated You..!");
                }

                else
                {
                    System.out.println("It's a Tie..! :(");
                }

            }

            for(c=0;c<=2;c++)
            {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }

            System.out.println("");
            System.out.println("Enter 1 To Play This Game Again.");
            System.out.println("");
            System.out.println("Enter 0 Or Any Other Number To Quit.");
            System.out.println("");
            choice=Integer.parseInt(br.readLine());
            if(choice==0)
                break;
        }
    }
}

