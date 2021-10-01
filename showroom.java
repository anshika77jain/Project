import java.io.*;
class showroom
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ch=0,quan,date,month,year;
int suits=0,tshirts=0,shirts=0,jeans=0,trouser=0,shoes=0,socks=0,belts=0,googles=0,watches=0;
double tax,price=0.0;
double ttax=0.0,amt=0.0;
String name,address,phone,email,bill;
char surity;


System.out.println("*****************************************WELCOME TO OUR**********************************************************");   
System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("************************************ALL IN ONE ACCESSARIES SHOWROOM**********************************************");
System.out.println("");
System.out.println("The owner of the showroom is RAJ GUPTA");
System.out.println("NOTE!!!!! ALL YOUR ACCESSARIES ARE FOR 15 YEARS OF AGE BOYS");
System.out.println("");
System.out.println("                                 Enter your choice for ");
System.out.println("                     |-------------------------------------------------|");
System.out.println("                     |        ENTER  1 FOR OUR BEST SUITS BRANDS!      |");
System.out.println("                     |        ENTER  2 FOR OUR T-SHIRTS BRANDS         |");
System.out.println("                     |        ENTER  3 FOR OUR SHIRTS BRANDS           |");
System.out.println("                     |        ENTER  4 FOR OUR JEANS BRANDS            |");
System.out.println("                     |        ENTER  5 FOR OUR TROUSER BRANDS          |");
System.out.println("                     |        ENTER  6 FOR OUR SHOES BRANDS            |");
System.out.println("                     |        ENTER  7 FOR OUR SOCKS BRANDS            |");
System.out.println("                     |        ENTER  8 FOR OUR BELTS BRANDS            |");
System.out.println("                     |        ENTER  9 FOR OUR GOOGLES BRANDS          |");
System.out.println("                     |        ENTER 10 FOR OUR WATCHES BRANDS          |");
System.out.println("                     |-------------------------------------------------|");

ch=Integer.parseInt(br.readLine());


switch (ch)
{
case 1:

System.out.println("ENTER  1 FOR BLACK COLOURSUIT 'it costs rs'=1100 ");
System.out.println("ENTER  2 FOR WHITE COLOUR SUIT'it costs rs'=1200");
System.out.println("ENTER  3 FOR GREY COLOUR SUIT'it costs rs'=1150");
System.out.println("ENTER  4 FOR BLUE COLOUR SUIT'it costs rs'=1380");
System.out.println("ENTER  5 FOR RED COLOUR SUIT'it costs rs'=1500");
System.out.println("ENTER  6 FOR PINK COLOUR SUIT'it costs rs'=1000");
System.out.println("ENTER  7 FOR ORANGE COLOUR SUIT'it costs rs'=1070");
System.out.println("ENTER  8 FOR GREEN COLOUR SUIT'it costs rs'=890");
System.out.println("ENTER  9 FOR BROWN COLOUR SUIT'it costs rs'=1250");
System.out.println("ENTER 10 FOR YELLOW COLOUR SUIT'it costs rs'=1300");
suits=Integer.parseInt(br.readLine());


switch (suits)
{
case 1:
System.out.println("You have chosen BLACK COLOUR SUIT, our one of the best SUITS");
price=1100;
break;

case 2:
System.out.println("You have chosen WHITE COLOUR SUIT, our one of the best SUITS");
price=1200;
break;

case 3:
System.out.println("You have chosen GREY COLOUR SUIT, our one of the best SUITS");
price=1150;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR SUIT, our one of the best SUITS");
price=1380;
break;

case 5:
System.out.println("You have chosen RED COLOUR SUIT, our one of the best SUITS");
price=1500;
break;

case 6:
System.out.println("You have chosen PINK COLOUR SUIT, our one of the best SUITS");
price=1000;
break;

case 7:
System.out.println("You have chosen ORANGE COLOUR SUIT, our one of the best SUITS");
price=1070;
break;

case 8:
System.out.println("You have chosen GREEN COLOUR SUIT, our one of the best SUITS");
price=890;
break;

case 9:
System.out.println("You have chosen BROWN COLOUR SUIT, our one of the best SUITS");
price=1250;
break;

case 10:
System.out.println("You have chosen YELLOW COLOUR SUIT, our one of the best SUITS");
price=1300;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;
case 2:
System.out.println("You have chosen our T-SHIRTS BRANDS");
System.out.println("ENTER  1 FOR BLACK COLOUR T-SHIRT which COSTS=750");
System.out.println("ENTER  2 FOR RED COLOUR T-SHIRT which COSTS=800");
System.out.println("ENTER  3 FOR GREEN COLOUR T-SHIRT which COSTS=540");
System.out.println("ENTER  4 FOR BLUE COLOUR T-SHIRT which COSTS=800");
System.out.println("ENTER  5 FOR MULTI COLOUR T-SHIRT which COSTS=980");

tshirts=Integer.parseInt(br.readLine());

switch (tshirts)

{
case 1:
System.out.println("You have chosen BLACK COLOUR T-SHIRTS ,our one of the best T-SHIRTS BRAND");
price=750;
break;

case 2:
System.out.println("You have chosen RED COLOUR T-SHIRTS ,our one of the best T-SHIRTS BRAND");
price=800;
break;

case 3:
System.out.println("You have chosen GREEN COLOUR T-SHIRTS ,our one of the best T-SHIRTS BRAND");
price=540;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR T-SHIRTS ,our one of the best T-SHIRTS BRAND");
price=800;
break;

case 5:
System.out.println("You have chosen MULTI COLOUR T-SHIRTS ,our one of the best T-SHIRTS BRAND");
price=980;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 3:
System.out.println("You have chosen our SHIRTS BRANDS");
System.out.println("ENTER  1 FOR BLACK COLOUR SHIRT which COSTS=750");
System.out.println("ENTER  2 FOR RED COLOUR SHIRT which COSTS=800");
System.out.println("ENTER  3 FOR GREEN COLOUR SHIRT which COSTS=540");
System.out.println("ENTER  4 FOR BLUE COLOUR SHIRT which COSTS=800");
System.out.println("ENTER  5 FOR MULTI COLOUR SHIRT which COSTS=980");

shirts=Integer.parseInt(br.readLine());
switch (shirts)
{
case 1:
System.out.println("You have chosen BLACK COLOUR SHIRTS ,our one of the best SHIRTS BRAND");
price=750;
break;

case 2:
System.out.println("You have chosen RED COLOUR SHIRTS ,our one of the best SHIRTS BRAND");
price=800;
break;

case 3:
System.out.println("You have chosen GREEN COLOUR SHIRTS ,our one of the best SHIRTS BRAND");
price=540;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR SHIRTS ,our one of the best SHIRTS BRAND");
price=800;
break;

case 5:
System.out.println("You have chosen MULTI COLOUR SHIRTS ,our one of the best SHIRTS BRAND");
price=980;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 4:
System.out.println("You have chosen our JEANS BRANDS");
System.out.println("ENTER  1 FOR BLACK COLOUR JEANS which COSTS=750");
System.out.println("ENTER  2 FOR RED COLOUR JEANS which COSTS=800");
System.out.println("ENTER  3 FOR GREEN COLOUR JEANS which COSTS=540");
System.out.println("ENTER  4 FOR BLUE COLOUR JEANS which COSTS=800");
System.out.println("ENTER  5 FOR MULTI COLOUR JEANS which COSTS=980");

jeans=Integer.parseInt(br.readLine());
switch (jeans)
{
case 1:
System.out.println("You have chosen BLACK COLOUR JEANS ,our one of the best JEANS BRAND");
price=750;
break;

case 2:
System.out.println("You have chosen RED COLOUR JEANS ,our one of the best JEANS BRAND");
price=800;
break;

case 3:
System.out.println("You have chosen GREEN COLOUR JEANS ,our one of the best JEANS BRAND");
price=540;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR JEANS ,our one of the best JEANS BRAND");
price=800;
break;

case 5:
System.out.println("You have chosen MULTI COLOUR JEANS ,our one of the best JEANS BRAND");
price=980;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 5:
System.out.println("You have chosen our JEANS BRANDS");
System.out.println("ENTER  1 FOR BLACK COLOUR TROUSER which COSTS=750");
System.out.println("ENTER  2 FOR RED COLOUR TROUSER which COSTS=800");
System.out.println("ENTER  3 FOR GREEN COLOUR TROUSER which COSTS=540");
System.out.println("ENTER  4 FOR BLUE COLOUR TROUSER which COSTS=800");
System.out.println("ENTER  5 FOR MULTI COLOUR TROUSER which COSTS=980");

trouser=Integer.parseInt(br.readLine());
switch (trouser)
{
case 1:
System.out.println("You have chosen BLACK COLOUR TROUSER ,our one of the best TROUSER BRAND");
price=750;
break;

case 2:
System.out.println("You have chosen RED COLOUR TROUSER ,our one of the best TROUSER BRAND");
price=800;
break;

case 3:
System.out.println("You have chosen GREEN COLOUR TROUSER ,our one of the best TROUSER BRAND");
price=540;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR TROUSER ,our one of the best TROUSER BRAND");
price=800;
break;

case 5:
System.out.println("You have chosen MULTI COLOUR TROUSER ,our one of the best TROUSER BRAND");
price=980;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 6:

System.out.println("You have chosen our SHOES BRANDS");
System.out.println("ENTER  1 FOR SPORT SHOES which COSTS=3500");
System.out.println("ENTER  2 FOR LEATHER SHOES which COSTS=1900");
System.out.println("ENTER  3 FOR CASUAL SHOES which COSTS=1500");
System.out.println("ENTER  4 FOR SPIKES SHOES which COSTS=5000");
System.out.println("ENTER  5 FOR FASHIONABLE SHOES which COSTS=1700");

shoes=Integer.parseInt(br.readLine());
switch (shoes)
{
case 1:
System.out.println("You have chosen SPORT SHOES ,our one of the best SHOES BRAND");
price=3500;
break;

case 2:
System.out.println("You have chosen LEATHER SHOES ,our one of the best SHOES BRAND");
price=1900;
break;

case 3:
System.out.println("You have chosen CASUAL SHOES ,our one of the best SHOES BRAND");
price=1500;
break;

case 4:
System.out.println("You have chosen SPIKES SHOES ,our one of the best SHOES BRAND");
price=5000;
break;

case 5:
System.out.println("You have chosen FASHIONABLE SHOES ,our one of the best SHOES BRAND");
price=1700;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 7:

System.out.println("You have chosen our SOCKS BRANDS");
System.out.println("ENTER  1 FOR BLACK COLOUR SOCKS which COSTS=60");
System.out.println("ENTER  2 FOR RED COLOUR SOCKS which COSTS=80");
System.out.println("ENTER  3 FOR GREEN COLOUR SOCKS which COSTS=45");
System.out.println("ENTER  4 FOR BLUE COLOUR SOCKS which COSTS=90");
System.out.println("ENTER  5 FOR MULTI COLOUR SOCKS which COSTS=135");

socks=Integer.parseInt(br.readLine());
switch (socks)
{
case 1:
System.out.println("You have chosen BLACK COLOUR SOCKS ,our one of the best SOCKS BRAND");
price=60;
break;

case 2:
System.out.println("You have chosen RED COLOUR SOCKS ,our one of the best SOCKS BRAND");
price=80;
break;

case 3:
System.out.println("You have chosen GREEN COLOUR SOCKS ,our one of the best SOCKS BRAND");
price=45;
break;

case 4:
System.out.println("You have chosen BLUE COLOUR SOCKS ,our one of the best SOCKS BRAND");
price=90;
break;

case 5:
System.out.println("You have chosen MULTI COLOUR SOCKS ,our one of the best SOCKS BRAND");
price=135;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 8:

System.out.println("You have chosen our BELTS BRANDS");
System.out.println("ENTER  1 FOR SPORT BELTS which COSTS=680");
System.out.println("ENTER  2 FOR LEATHER BELTS which COSTS=410");
System.out.println("ENTER  3 FOR CASUAL BELTS which COSTS=250");
System.out.println("ENTER  4 FOR TRANSPIRANT BELTS which COSTS=800");
System.out.println("ENTER  5 FOR FASHIONABLE BELTS which COSTS=560");

belts=Integer.parseInt(br.readLine());
switch (belts)
{
case 1:
System.out.println("You have chosen SPORT BELTS ,our one of the best BELTS BRAND");
price=680;
break;

case 2:
System.out.println("You have chosen LEATHER BELTS ,our one of the best BELTS BRAND");
price=410;
break;

case 3:
System.out.println("You have chosen CASUAL BELTS ,our one of the best BELTS BRAND");
price=250;
break;

case 4:
System.out.println("You have chosen TRANSPIRANT BELTS ,our one of the best BELTS BRAND");
price=800;
break;

case 5:
System.out.println("You have chosen FASHIONABLE BELTS ,our one of the best BELTS BRAND");
price=560;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 9:

System.out.println("You have chosen GOOGLES BRANDS");
System.out.println("ENTER  1 SUNGLASSES FOR which COSTS=900");
System.out.println("ENTER  2 BLACKGLASSES FOR which COSTS=520");
System.out.println("ENTER  3 FASHINABLE GLASSES FOR which COSTS=600");
System.out.println("ENTER  4 GOO-GOO GLASSES FOR which COSTS=750");
System.out.println("ENTER  5 TRANSPIRANT GLASSES FOR which COSTS=490");

googles=Integer.parseInt(br.readLine());
switch (googles)
{
case 1:
System.out.println("You have chosen SUNGLASSES ,our one of the best GOOGLES BRAND");
price=900;
break;

case 2:
System.out.println("You have chosen BLACKGLASSES ,our one of the best GOOGLES BRAND");
price=520;
break;

case 3:
System.out.println("You have chosen FASHINABLE GLASSES ,our one of the best GOOGLES BRAND");
price=600;
break;

case 4:
System.out.println("You have chosen GOO-GOO GLASSES ,our one of the best GOOGLES BRAND");
price=750;
break;

case 5:
System.out.println("You have chosen TRANSPIRANT GLASSES ,our one of the best GOOGLES BRAND");
price=490;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
break;

case 10:

System.out.println("You have chosen our WATCHES BRANDS");
System.out.println("ENTER  1 MAXIMA WATCHES FOR which COSTS=6000");
System.out.println("ENTER  2 TITAN WATCHES FOR which COSTS=5900");
System.out.println("ENTER  3 FASTRACK WATCHES FOR which COSTS=4500");
System.out.println("ENTER  4 REEBOOK WATCHES FOR which COSTS=4700");
System.out.println("ENTER  5 CASIO WATCHES FOR which COSTS=8000");

watches=Integer.parseInt(br.readLine());
switch (watches)
{
case 1:
System.out.println("You have chosen MAXIMA WATCHES ,our one of the best WATCHES BRAND");
price=6000;
break;

case 2:
System.out.println("You have chosen TITAN WATCHES ,our one of the best WATCHES BRAND");
price=5900;
break;

case 3:
System.out.println("You have chosen FASTRACK WATCHES ,our one of the best WATCHES BRAND");
price=4500;
break;

case 4:
System.out.println("You have chosen REEBOOK WATCHES ,our one of the best WATCHES BRAND");
price=4700;
break;

case 5:
System.out.println("You have chosen CASIO WATCHES ,our one of the best WATCHES BRAND");
price=8000;
break;

default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}


break;


default:
System.out.println("SORRY!! YOU HAVE ENTERED WRONG CHOICE");
System.out.println("PLEASE TRY AGAIN!!"); 
}
if(((ch<=10)&&(ch>=1))&&(((tshirts<=5)&&(tshirts>=1))||((shirts<=5)&&(shirts>=1))||((jeans<=5)&&(jeans>=1))||((trouser<=5)&&(trouser>=1))||((shoes<=5)&&(shoes>=1))||((socks<=5)&&(socks>=1))||((belts<=5)&&(belts>=1))||((googles<=5)&&(googles>=1))||((watches<=5)&&(watches>=1))||((suits<=10)&&(suits>=1))))

{
System.out.println("If you are confirmed with your choice ");
System.out.println("Type Y if you want to proceed with the accessaries and pay the bill");
System.out.println("Type N if you want to leave");
surity=(char)(br.read());


if((surity=='Y')||(surity=='y'))
{

System.out.println("Dear Customer");
bill=br.readLine();
System.out.println("ENTER YOUR NAME");
name=br.readLine();
System.out.println("ENTER THE DATE, MONTH and YEAR respectively");
System.out.println("Please see the date's FORMAT DD/MM/YYYY ");
date=Integer.parseInt(br.readLine());
month=Integer.parseInt(br.readLine());
year=Integer.parseInt(br.readLine());
System.out.println("Enter your residence address");
address=br.readLine();
System.out.println("Enter your E-mail ID");
email=br.readLine();
System.out.println("Enter your contact number");
phone=br.readLine();
System.out.println("Enter the quantity of your chosen accessaries(no. of accessaries you want to purchase)");
quan=Integer.parseInt(br.readLine());
tax=price*2/100;
ttax=tax*quan;
amt=(quan*price)+ttax;
System.out.println(" ");
System.out.println(" ");        
System.out.println(" ");                                           
System.out.println("This is your bill.");                                                                      
System.out.println("     */////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("     */////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("     **CUSTOMER'S NAME    : "+name+"");
System.out.println("     **DATE               : "+date+"/"+month+"/"+year+"");
System.out.println("     **CUSTOMER'S ADDRESS : "+address+"");
System.out.println("     **CUSTOMER'S E-mail  : "+email+"");
System.out.println("     **CONTACT NUMBER     : "+phone+"");
System.out.println("     **QUANTITY           : "+quan+"");
System.out.println("     **TAX                : Rs."+tax+"x"+quan+"");
System.out.println("     **TOTAL TAX          : Rs."+ttax+"");
System.out.println("     **PRICE              : Rs."+price+"x"+quan+"");
System.out.println("     **TOTAl AMOUNT       : Rs."+amt+"");
System.out.println("     **////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("     */////////////////////////////////////////////////////////////////////////////////////////////");
System.out.println("     **********************************************************************************************");
System.out.println("Please get your bill amount and pay it in the counter");
System.out.println("If any complaints, contact us from 9:00 a.m. to 8:p.m.");
System.out.println("If any damage found to the accessaries please contact us at this number.-9827984862 / 7987767262");
System.out.println("Thankyou for the visit");
System.out.println("Your Pleasure Our Comfort!!!!!");
System.out.println("Please come again later");


}
if((surity=='N')||(surity=='n'))
{
System.out.println("Thankyou for the visit");
System.out.println("Please come again later");
}

else

{
System.out.println("You have entered ANY OTHER CHARACTER except Y or N .");
System.out.println("Please restart if you want and enter correctly");
}
}

else
System.out.println(" ");

}
}

