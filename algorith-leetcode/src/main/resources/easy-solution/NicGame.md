## Solution

### Originally:
You can always win a Nim game if the number of stones nn in the pile is not divisible by 44.
Reasoning
Let us think of the small cases. It is clear that if there are only one, two, or three stones in the pile, and it is your turn, 
you can win the game by taking all of them.Like the problem description says, if there are exactly four stones in the pile, 
    you will lose. Because no matter how many you take, you will leave some stones behind for your opponent to take and win the game. 
So in order to win, you have to ensure that you never reach the situation where there are exactly four stones on the pile on your turn.
Similarly, if there are five, six, or seven stones you can win by taking just enough to leave four stones for your opponent so that they lose. 
But if there are eight stones on the pile, you will inevitably lose, because regardless whether you pick one, 
two or three stones from the pile, your opponent can pick three, two or one stone to ensure that, again, 
four stones will be left to you on your turn.
It is obvious that the same pattern repeats itself for n=4,8,12,16,…, basically all multiples of 4.

### Translate && Mine:
如果你的石子的数量不能被4整除，那么你就可以获胜。
我们思考一下这个小例子，很肯定的是如果这堆石子只有1 || 2 || 3个，并且从你开始。那么你一次拿走他们就可以获得胜利，
就像这个问题描述的那样，如果这堆石子有四个，那么你就会输掉，因为无论你第一次拿走多少，剩下的石子都可以被你的对手拿完，并且他获得胜利。
所以，为了赢得胜利，你必须确保在轮到你的时候桌面上的石子不能有4个。同意，如果有5 || 6||7个石子，那么你必须保证你要留到4个石子给你的对手。
很明显，同样的模式重复的:4,8,12,16... 只要是4的倍数，你都会输。