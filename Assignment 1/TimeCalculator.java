import java.util.Scanner; //program uses class Scanner

public class TimeCalculator {
   
   //instance variables. 
   private DateTime todaysDate;
   private DateTime eventDate;
   private String message;
   
   //constructor
   public TimeCalculator() {
     todaysDate = new DateTime();
     eventDate = new DateTime();
   }

   //set datetime for each day.
   public void enterDates(){
     System.out.println("Enter today's date and time");
     setDateTime(todaysDate);
     System.out.println(" ");
     System.out.println("Enter event's date and time");
     setDateTime(eventDate);
     System.out.println(" ");}
   
   //helper method as perscribed by assignment instructions. 
   private void setDateTime(DateTime date) {
     date.inputMonth();
     date.inputDay();
     date.inputHours();
     date.inputMinutes();
     date.inputSeconds();}
   
   //calculates difference between given dates. 
   public void calculateDifference() {
     
     int difference;
     //assuming the event is always in the present or future. Otherwise, will recieve -input.
     difference = eventDate.calcTotalSeconds()-todaysDate.calcTotalSeconds();
     

     
     
     if (difference<0) {
       //changes value of difference to positive so calcuations can continue. 
       difference= -difference;
       message = "in the past.";}
     else if (difference == 0){
       message = "Now.";
       return;}
     else {
       message = "away.";}
     
     //assigns values to each variable
     int seconds = difference%60;
     difference = difference/60;
     int minutes = difference%60;
     difference = difference/60;
     int hours = difference%24;
     difference = difference/24;
     int days = difference%30;
     int months = difference/30;
     
     
     if (months>0) {
       if (months==1) {
         message = months+" Month "+message;}
       else {
         message = months+" Months "+message;}} 
     else if (days>0) {
       if (days>13) {
         message = (days/7)+" Weeks "+message;}
       else if (days>6) {
         message = (days/7)+" week"+message;}
       else if (days>1) {
         message = days+" Days "+message;}
       else {
         message = days+" Day "+message;}}
     else if (hours>0) {
       if (hours==1) {
         message = hours+" Hour "+message;}
       else {
         message = hours+" Hours "+message;}}
     else if (minutes>0) {
       if(minutes==1) {
         message = minutes+" Minute "+message;}
       else {
         message = minutes+" Minutes "+message;}}
     else if (seconds>0) {
       if (seconds==1) {
         message = seconds+" Second "+message;}
       else {
         message = seconds+" Seconds "+message;}}
     
     
   }
   
   public void display() {
     System.out.println("Today: "+todaysDate.displayDate());
     System.out.println("Event: "+eventDate.displayDate());
     System.out.println(" ");
     System.out.println("The event is "+message);}
  
   
   
   
 } // end of main
