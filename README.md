MakeChangeProject

**Project Description**
This is a simple program that takes user input for the price of an item and the amount tendered for the item. The program then gives you the change and lists the currency to make the change. 

**How To Run**
The user is first prompted for the price of an item. 

Enter the price and then enter the amount tendered. 

User MUST enter a numeric value for both amounts 
EXAMPLE: ( 4 | 4.50 | 4.00 | .44)

The program will then calculate the change and list the required currency. (Amount of bills and coins needed) 

If the amount tendered is lower than the price, you will get an error and will have the option to try again or exit.

You also have the option to ring up another item or exit, if the item is paid in full or after the change has been listed.

**Lessons Learned**
Aside from Skill Distillery, I don’t have any coding experience.
I come from an audio engineering background where I was always ready to troubleshoot and tackle the situation at hand. The first lesson I learned was the importance of stepping away and refreshing the mind instead of just being STUCK.

Once I got an idea of how to complete this project, I realized  there could be many different ways of doing this. The most important thing is to find the most efficient way. In my initial code, I didn’t convert everything down into cents so I could use Ints. I was using Doubles, and I think it was throwing off the calculations. This lead me to another lesson learned.

Just because the program doesn’t crash, it does not mean that everything is accurate and working properly. At first, I saw the results for the change and everything seemed fine. I then realized, the results were wrong! I learned the value of really testing the program and paying attention to the details.

I would say the final lesson learned is that once the priorities are taking care of, coding just becomes more fun and creative. Once I had everything working, I wanted to just keep trying different things with the formatting and organization of the code. Somehow what started off as a stressful project for a beginner like myself, transformed into something enjoyable!


**BUGS**
Anytime the amount tendered is 19.99, the Pennies are short by 1.

Enter the price of the item: $1
Enter the amount tendered: $19.99

Your change is $18.99

Currency needed for change:
Ten Dollar Bill: 1
Five Dollar Bill:  1
One Dollar Bill: 3
Quarters: 3
Dimes: 2
Pennies: 3 **Should be 4 pennies**



Enter the price of the item: $2.41
Enter the amount tendered: $19.99

Your change is $17.58

Currency needed for change:
Ten Dollar Bill: 1
Five Dollar Bill:  1
One Dollar Bill: 2
Quarters: 2
Nickels: 1
Pennies: 2 **Should be 3 pennies**
