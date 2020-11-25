/**
 * 小赛很想到外面的世界看看，于是收拾行装准备旅行。背了一个大竹筐，竹筐里装满了路上吃的，这些吃的够它走N公里。为了规划路线，它查看了地图，
 * 沿途中有若干个村庄，在这些村庄它都可以补充食物。但每次补充食物都需要花费时间，在它竹筐的食物足够可以走到下一个村庄的时候它就不用补充，这样背起来不累而且不花费时间。
 * 地图上可以看到村庄之间的距离，现在它要规划一下它的路线，确定在哪些村庄补充食物可以使沿途补充食物的次数最少。你能帮帮小赛吗？
 * 输入
 * 第一行有两个数字，第一个数字为竹筐装满可以走的公里数，即N值；第二个数字为起点到终点之间的村庄个数。
 * 第二行为起点和村庄、村庄之间、村庄和终点之间的距离。
 * 这些数字都为整数，且范围不能超过一个int型表达的范围。
 * 输出
 * 程序输出为至少需要补充食物的次数。
 * 样例输入
 * 7 4
 * 5  6  3  2  2
 * 样例输出
 * 2
 */
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//        int village=sc.nextInt();
//        int[] cost=new int[village+1];
//        for(int i=0;i<village+1;i++){
//            cost[i]=sc.nextInt();
//        }
//        sc.close();
//        int curr=N;
//        int res=0;
//        for(int i=0;i<village+1;i++){
//            if(cost[i]>N){
//                System.out.print(0);
//                return;
//            }
//            int left=curr-cost[i];
//            if(i+1<village+1&&left<cost[i+1]){
//                left=N;
//                res++;
//            }
//            curr=left;
//        }
//        System.out.print(res);
//    }
//}


/**
 * 有股神吗？
 *
 * 有，小赛就是！
 *
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 *
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 *输入
 * 输入包括多组数据；
 *
 * 每行输入一个n，1<=n<=10^9
 * 输出
 * 请输出他每股股票多少钱，对于每组数据，输出一行
 * 样例输入
 * 1
 * 2
 * 3
 * 4
 * 5
 * 样例输出
 * 1
 * 2
 * 1
 * 2
 * 3
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextInt()){
//            System.out.println(getPrice(sc.nextInt()));
//        }
//    }
//    public static int getPrice(int day){
//        if(day==1)return 1;
//        int res=0;
//        int start=3;
//        int add=3;
//        while(start<=day){
//            res--;
//            start+=add;
//            add++;
//        }
//        res+=(day-1-(-res))+1;
//        return res;
//    }
//}
/**
 * 给定一个长度为n的整数数组a，元素均不相同，问数组是否存在这样一个片段，只将该片段翻转就可以使整个数组升序排列。其中数组片段[l,r]表示序列a[l], a[l+1], ..., a[r]。原始数组为
 *
 * a[1], a[2], ..., a[l-2], a[l-1], a[l], a[l+1], ..., a[r-1], a[r], a[r+1], a[r+2], ..., a[n-1], a[n]，
 *
 * 将片段[l,r]反序后的数组是
 *
 * a[1], a[2], ..., a[l-2], a[l-1], a[r], a[r-1], ..., a[l+1], a[l], a[r+1], a[r+2], ..., a[n-1], a[n]。
 * 输入
 * 第一行数据是一个整数：n (1≤n≤105)，表示数组长度。
 *
 * 第二行数据是n个整数a[1], a[2], ..., a[n] (1≤a[i]≤109)。
 * 输出
 * 输出“yes”，如果存在；否则输出“no”，不用输出引号。
 * 样例输入
 * 4
 *
 * 2 1 3 4
 * 样例输出
 * yes
 */
//
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int len=sc.nextInt();
//        int[] nums=new int[len];
//        for(int i=0;i<len;i++){
//            nums[i]=sc.nextInt();
//        }
//        sc.close();
//        int start=nums[0];
//        if(len==1){
//            System.out.print("yes");
//            return;
//        }
//        int i=1;
//        boolean beforeIncrease=false;
//        int beforeEnd=0;
//        int middleBig=0;
//        for(;i<len;i++){
//            if(nums[i]>=start){
//                start=nums[i];
//                beforeIncrease=true;
//            }else break;
//        }
//        if(beforeIncrease==true)beforeEnd=nums[i-2];
//        if(i==len){
//            System.out.print("yes");
//            return;
//        }
//        middleBig=start;
//        int middleSmall=0;
//        boolean middleDecrease=false;
//        for(;i<len;i++){
//            if(nums[i]<=start){
//                start=nums[i];
//                middleDecrease=true;
//                middleSmall=nums[i];
//            }else break;
//        }
//        if(beforeIncrease==true&&beforeEnd>middleSmall){
//            System.out.print("no");
//            return;
//        }
//        if(i==len&&beforeIncrease==true&&beforeEnd<=middleSmall){
//            System.out.print("yes");
//            return;
//        }
//        if(i<len&&middleBig>nums[i]){
//            System.out.print("no");
//            return;
//        }
//
//        for(;i<len;i++){
//            if(nums[i]>start)continue;
//            else {
//                System.out.print("no");
//                return;
//            }
//        }
//        System.out.print("yes");
//        return;
//
//    }
//}

/**
 * 兰博和提莫闲聊之后，回归到了他们的正题，约德尔人的未来。
 *
 * 说起约德尔人的未来，黑默丁格曾经提出了一个约德尔测试，将约德尔人的历史的每个阶段都用一个字符表达出来。(包括可写字符,不包括空格。)。然后将这个字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。相似率越高,则约德尔的未来越光明。
 *
 * 请问:相似率为多少？
 * 输入
 * 每组输入数据为两行，第一行为有关约德尔人历史的字符串，第二行是黑默丁格观测星空得到的字符串。
 *
 * (两个字符串的长度相等,字符串长度不小于1且不超过1000。)
 * 输出
 * 输出一行，在这一行输出相似率。用百分数表示。(相似率为相同字符的个数/总个数,精确到百分号小数点后两位。printf("%%");输出一个%。)
 * 样例输入
 * @!%12dgsa
 *
 * 010111100
 * 样例输出
 * 66.67%
 */
























