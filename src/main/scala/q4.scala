object ticket_price{
     def attendence(ticketPrice:Double):Double = {
         var attendence = 120 - ( (ticketPrice - 15) * 4);
         attendence
     }
     def Profit(ticketPrice:Double):Double = {
         var profit = (attendence(ticketPrice)*ticketPrice) - (500+ 3 * attendence(ticketPrice));
         profit
     }
     def main(args:Array[String]):Unit = {
         val profit = Profit(15)
         println(profit)
     }
}