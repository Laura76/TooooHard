/**
 * #1
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
 * #2股神
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
 * #3翻转数组
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
 * #4约德尔测试
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
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String historyStr=sc.next();
//        String skyStr=sc.next();
//        sc.close();
//        char[] chars=historyStr.toCharArray();
//        int len=chars.length;
//        for(int i=0;i<len;i++){
//            char c=chars[i];
//            if((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z'))chars[i]='1';
//            else chars[i]='0';
//        }
//        double temp=0;
//        for(int i=0;i<len;i++){
//            if(skyStr.charAt(i)==chars[i])temp++;
//        }
//        double res=temp/len*100.0;
//        System.out.print(String.format("%.2f",res)+"%");
//    }
//}
/**
 * #5路灯
 * V先生有一天工作到很晚，回家的时候要穿过一条长l的笔直的街道，这条街道上有n个路灯。假设这条街起点为0，终点为l，第i个路灯坐标为ai。路灯发光能力以正数d来衡量，其中d表示路灯能够照亮的街道上的点与路灯的最远距离，所有路灯发光能力相同。为了让V先生看清回家的路，路灯必须照亮整条街道，又为了节省电力希望找到最小的d是多少？
 * 输入
 * 输入两行数据，第一行是两个整数：路灯数目n (1≤n≤1000)，街道长度l (1 ≤l≤109)。第二行有n个整数ai (0 ≤ ai≤ l)，表示路灯坐标，多个路灯可以在同一个点，也可以安放在终点位置。
 * 输出
 * 输出能够照亮整个街道的最小d，保留两位小数。
 * 样例输入
 * 7 15
 *
 * 15 5 3 7 9 14 0
 * 样例输出
 * 2.50
 */
//import java.util.Scanner;
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int len=sc.nextInt();
//        int roadLen=sc.nextInt();
//        int[] lights=new int[len];
//        for(int i=0;i<len;i++){
//            lights[i]=sc.nextInt();
//        }
//        sc.close();
//        Arrays.sort(lights);
//        double bigDis=0;
//        for(int i=1;i<len;i++){
//            if(lights[i]==lights[i-1])continue;
//            else {
//                if((lights[i]-lights[i-1])/2.0>bigDis)bigDis=(lights[i]-lights[i-1])/2.0;
//            }
//        }
//        if(lights[0]-0>bigDis)bigDis=lights[0];
//        if((roadLen-lights[len-1])>bigDis)bigDis=(roadLen-lights[len-1]);
//        System.out.println(String.format("%.2f",bigDis));
//    }
//}

/**
 * #6公交车乘客
 * 一个公交车经过n个站点，乘客从前门上车，从后门下车。
 *
 * 现在统计了在第i个站，下车人数a[i]，以及上车人数b[i]。
 *
 * 问公交车运行时候车上最多有多少乘客
 * 输入
 * 第一行读入一个整数n(1<=n<=100)，表示有n个站点
 *
 * 接下来n行，每行两个数值，分别表示在第i个站点下车人数和上车人数
 * 输出
 * 每组输出车上最多的乘客数目
 * 样例输入
 * 4
 *
 * 0 3
 *
 * 2 5
 *
 * 4 2
 *
 * 4 0
 * 样例输出
 * 6
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int res=0;
//        int max=0;
//        for(int i=0;i<n;i++){
//            res-=sc.nextInt();
//            res+=sc.nextInt();
//            if(res>max)max=res;
//        }
//        System.out.print(max);
//    }
//}


/**
 * #7分苹果
 * 果园里有堆苹果，N（1＜N＜9）只熊来分。第一只熊把这堆苹果平均分为N份，多了一个，它把多的一个扔了，拿走了一份。第二只熊把剩下的苹果又平均分成N份，又多了一个，它同样把多的一个扔了，拿走了一份，第三、第四直到第N只熊都是这么做的，问果园里原来最少有多少个苹果？
 * 输入
 * 输入1个整数，表示熊的个数。它的值大于1并且小于9。
 * 输出
 * 为1个数字，表示果园里原来有的苹果个数。
 * 样例输入
 * 5
 * 样例输出
 * 3121
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] aargs){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int x=1;
//        while(true){
//            int left=(n*x+1)%(n-1);
//            if(left==0){
//                int nextX=(n*x+1)/(n-1);
//                int i=0;
//                for(;i<n-2;i++){
//                    if((n*nextX+1)%(n-1)!=0)break;
//                    else nextX=(n*nextX+1)/(n-1);
//                }
//                if(i==n-2){
//                    System.out.print(n*nextX+1);
//                    return;
//                }
//            }
//            x++;
//        }
//    }
//}

/**
 * #8日期倒计时
 * 在经济、科技日益发达的今天，人们对时间的把握越来越严格，对于一个一定影响力的公司的高管来说，他可能要将自己的行程提前安排到下个月。对于普通人来说，他也可能将几天之后的安排已经提前做好。
 *
 * 请设计一个程序计算出今天距离未来的某一天还剩多少天。
 *
 * 假设今天是2015年10月18日。
 * 输入
 * 输入一个日期格式为yyyy-MM-dd，不考虑日期是否小于今天。
 * 输出
 * 输出一个数字表示今天（2015年10月18日）距离该日期还剩多少天
 * 样例输入
 * 2015-10-19
 * 样例输出
 * 1
 */

//import java.util.Scanner;
//import java.util.Calendar;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String date1=sc.next();
//        String[] temp=date1.split("-");
//        Calendar c1=Calendar.getInstance();
//        c1.set(Integer.valueOf(temp[0]),Integer.valueOf(temp[1]),Integer.valueOf(temp[2]),0,0,0);
//        Calendar c2=Calendar.getInstance();
//        c2.set(2015,10,18,0,0,0);
//        long mills=Math.abs(c1.getTimeInMillis()-c2.getTimeInMillis());
//        System.out.print(Math.round(mills/(24.0*60*60*1000)));
//
//    }
//}

/**
 * #9马路上的路灯
 * 城市E的马路上有很多路灯，每两个相邻路灯之间的间隔都是1公里。小赛是城市E的领导，为了使E城市更快更好的发展，需要在城市E的一段长度为M的主干道上的一些区域建地铁。这些区域要是建了地铁，就需要挪走相应的路灯。可以把长度为M的主干道看成一个数轴，一端在数轴0的位置，另一端在M的位置；数轴上的每个整数点都有一个路灯。要建地铁的这些区域可以用它们在数轴上的起始点和终止点表示，已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。现在要把这些区域中的路灯（包括区域端点处的两个路灯）移走。你能帮助小赛计算一下，将这些路灯移走后，马路上还有多少路灯？
 * 输入
 * 输入文件的第一行有两个整数M（1 <= M <= 10000）和 N（1 <= N <= 100），M代表马路的长度，N代表区域的数目，M和N之间用一个空格隔开。接下来的N行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。
 *
 * 所有输入都为整数。且M和N的范围为上面提示范围。
 * 输出
 * 输出文件包括一行，这一行只包含一个整数，表示马路上剩余路灯的数目。
 * 样例输入
 * 500 3
 *  100 200
 *  150 300
 *  360 361
 *  样例输出
 * 298
 */

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Comparator;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int M=sc.nextInt();
//        int N=sc.nextInt();
//        int[][] areas=new int[N][2];
//        for(int i=0;i<N;i++){
//            areas[i][0]=sc.nextInt();
//            areas[i][1]=sc.nextInt();
//        }
//        sc.close();
//        Arrays.sort(areas,new Comparator<int[]>(){
//            @Override
//            public int compare(int[] a,int[] b){
//                if(a[0]==b[0])return a[1]-b[1];
//                else return a[0]-b[0];
//            }
//        });
//        int start=areas[0][0];
//        int end=areas[0][1];
//        int res=start-0;
//        int i=1;
//        while(i<N){
//            for(;i<N;i++){
//                if(areas[i][0]<=end){
//                    if(areas[i][1]>end)end=areas[i][1];
//                }else break;
//            }
//            if(i>=N)break;
//            res+=areas[i][0]-1-end;
//            start=areas[i][0];
//            end=areas[i][1];
//            i++;
//        }
//        res+=M-end;
//        System.out.print(res);
//    }
//}

/**
 * #10比大小
 * 现在有"abcdefghijkl”12个字符，将其所有的排列中按字典序排列，给出任意一种排列，说出这个排列在所有的排列中是第几小的？
 *
 输入
 第一行有一个整数n（0＜n＜=10000）;

 随后有n行，每行是一个排列；
 输出
 输出一个整数m，占一行，m表示排列是第几位；
 样例输入
 3

 abcdefghijkl

 hgebkflacdji

 gfkedhjblcia
 样例输出
 1

 302715242

 260726926
 */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String[] strs=new String[n];
//        for(int i=0;i<n;i++){
//            strs[i]=sc.next();
//        }
//        sc.close();
//        for(int i=0;i<n;i++)System.out.println(getNumber(strs[i]));
//    }
//    public static int getNumber(String str){
//        int res=0;
//        char[] basic=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l'};
//        int start=(1*2*3*4*5*6*7*8*9*10*11*12);
//        int divide=12;
//        int len=str.length();
//        for(int i=0;i<len;i++){
//            start/=divide;
//            char c=str.charAt(i);
//            int sum=0;
//            for(int j=0;j<len;j++){
//                if(basic[j]!='-'){
//                    if(basic[j]<c)
//                        sum++;
//                    else if(basic[j]==c){
//                        basic[j]='-';
//                        break;
//                    }
//                }
//            }
//            res+=(sum*start);
//            divide--;
//        }
//        return res+1;
//    }
//}

/**
 * #11约会
 * Bob和Alice有个约会，一大早Bob就从点(0,0)出发，前往约会地点(a,b)。Bob没有一点方向感，因此他每次都随机的向上下左右四个方向走一步。简而言之，如果Bob当前在(x,y)，那么下一步他有可能到达(x+1,y),
 * (x-1,y),
 * (x,y+1),
 * (x,y-1)。很显然，当他到达目的地的时候，已经很晚了，Alice早已离去。第二天，Alice质问Bob为什么放她鸽子，Bob说他昨天花了s步到达了约会地点。Alice怀疑Bob是不是说谎了。你能否帮她验证一下？
 * 输入
 * 输入三个整数a,b,s (-109
 * 输出
 * 输出“Yes”，如果Bob可能用s步到达(a,b)；否则输出“No”，不需要输出引号。
 * 样例输入
 * 5 5 11
 * 样例输出
 * No
 */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int s=sc.nextInt();
//        sc.close();
//        int minRoad=Math.abs(a)+Math.abs(b);
//        if(s<minRoad||(s-minRoad)%2==1)System.out.print("No");
//        else System.out.print("Yes");
//    }
//}

/**
 * #12研究生考试
 */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][] grades=new int[n][4];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<4;j++){
//                grades[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=0;j<4;j++)sum+=grades[i][j];
//            if(grades[i][0]<60||grades[i][1]<60||grades[i][2]<90||grades[i][3]<90||sum<310){
//                System.out.println("Fail");
//            }else{
//                if(sum>=350)System.out.println("Gongfei");
//                else System.out.println("Zifei");
//            }
//        }
//    }
//}


/**
 * #13文艺青年爱文学
 * 小赛是一名文艺的程序员，他十分热爱文学。乘车去公司应聘的路上，小赛又在构想自己的诗歌了——
 *
 *
 *
 * "啊！小赛啊小赛！帅啊很帅可帅了！
 *
 *  啊！小赛啊小赛！棒啊很棒可棒了！
 *
 *  啊！小赛啊小赛！啊啊啊啊啊啊啊！"
 *
 *
 *
 * 尽管小赛的诗歌——额……有那么一点——（啊啊别拦我——让我掐死这只小赛！）……
 *
 * 但是，小赛自己还是深深陶醉其中的。
 *
 *
 *
 * 小赛现在想要创作一首恰好为一定字数（共有n个能满足要求的字数，达到任一皆可）的新诗歌……
 *
 * 他会构想m种长度的短句（如上面那首“诗歌”，有长度为1和7的短句），构想每种长度的短句所耗费的时间是相同的。
 *
 * 现在让你帮忙算下，小赛最少需要多少时间，才能达成自己的目标呢？如果没有办法实现，请输出"It is not true!"（没有引号）。
 */
//
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a=new int[n];
//        int max=0;
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//            if(a[i]>max)max=a[i];
//        }
//        n=sc.nextInt();
//        int[] b=new int[n];
//        int[] c=new int[n];
//        for(int i=0;i<n;i++){
//            b[i]=sc.nextInt();
//            c[i]=sc.nextInt();
//        }
//        sc.close();
//        int[] dp=new int[max+1];
//        dp[0]=0;
//        for(int i=1;i<max+1;i++){
//            int min=0;
//            for(int j=0;j<n;j++){
//                if(i-b[j]<0||dp[i-b[j]]==-1)continue;
//                else{
//                    if(min==0)min=dp[i-b[j]]+c[j];
//                    else if(dp[i-b[j]]+c[j]<min)min=dp[i-b[j]]+c[j];
//                }
//            }
//            if(min==0)dp[i]=-1;
//            else dp[i]=min;
//        }
//        int minTime=-1;
//        for(int i=0;i<a.length;i++){
//            if(dp[a[i]]==-1)continue;
//            if(minTime==-1)minTime=dp[a[i]];
//            else if(dp[a[i]]<minTime)minTime=dp[a[i]];
//        }
//        if(minTime!=-1)System.out.println(minTime);
//        else System.out.println("It is not true!");
//    }
//}

/**
 * #14喷水装置
 *小赛家有一块草坪，长为20米，宽为2米，妈妈要他给草坪浇水，在草坪上放置半径为Ri的喷水装置，每个喷水装置可以给以它为中心的半径为实数Ri(1＜Ri＜15)的圆形区域浇水。他家有充足的喷水装置i（1＜i＜600)个，并且一定能把草坪全部湿润。你能帮他计算一下，把整个草坪全部湿润，最少需要几个喷水装置。
 *
 */
//import java.util.Scanner;
//import java.util.Arrays;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String temp=sc.next();
//        int n=Integer.parseInt(temp.substring(0,1));
//        double[] a=new double[n];
//        int j=0;
//        if(temp.length()>1){
//            a[0]=Integer.parseInt(temp.substring(1));
//            j=1;
//        }
//        //测试用例有问题，暂以数量都是个位数来达到AC
//        for(;j<n;j++){
//            a[j]=sc.nextDouble();
//        }
//        sc.close();
//        Arrays.sort(a);
//        int width=20;
//        double sum=0;
//        for(int i=n-1;i>=0;i--){
//            if(sum>=width){
//                System.out.println(n-1-i);
//                break;
//            }
//            sum+=Math.sqrt(a[i]*a[i]-1)*2;
//        }
//    }
//}


/**
 * #15拦截导弹
 * 某国进行军事演戏，研发一种导弹拦截系统。但是这种导弹拦截系统有一个缺陷：虽然它的第一发炮弹能够到达任意的高度，但是以后每一发炮弹都不能高于等于前一发的高度。某天，雷达捕捉到敌国导弹来袭。由于该系统还在试用阶段，所以只用一套系统，因此有可能不能拦截所有的导弹。请你帮忙选择一套系统，根据测试的导弹数量和每次导弹飞来的高度，计算出最多能拦截导弹的数目。
 */

//import java.util.Scanner;
//import java.util.List;
//import java.util.LinkedList;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        List<Integer> res=new LinkedList<>();
//        for(int i=0;i<n;i++){
//            int m=sc.nextInt();
//            int[] a=new int[m];
//            for(int j=0;j<m;j++){
//                a[j]=sc.nextInt();
//            }
//            res.add(getLIS(m,a));
//        }
//        for(int i=0;i<res.size();i++){
//            System.out.println(res.get(i));
//        }
//    }
//    public static int getLIS(int len,int[] a){
//        if(len==0)return 0;
//        int[] dp=new int[len];
//        dp[0]=1;
//        int maxLength=1;
//        for(int i=1;i<len;i++){
//            int j=i-1;
//            for(;j>=0;j--){
//                if(a[j]>a[i]){
//                    dp[i]=dp[j]+1;
//                    break;
//                }
//            }
//            if(j==-1){
//                dp[i]=1;
//            }
//            if(dp[i]>maxLength)maxLength=dp[i];
//        }
//        return maxLength;
//    }
//}


/**
 * #15字符判断
 * 判断字符串b的所有字符是否都在字符串a中出现过，a、b都是可能包含汉字的字符串。b中重复出现的汉字，那么a中也要至少重复相同的次数。汉字使用gbk编码（简单的说，用两个字节表示一个汉字，高字节最高位为1的代表汉字，低字节最高位可以不为1）。
 *
 *         int is_include(char *a, char *b);
 *
 *      返回0表示没有都出现过，返回1表示都出现过。
 *
 * 请设计一个算法。
 * 测试数据和中文完全没关系
 */

//import java.util.Scanner;
//import java.util.HashMap;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String str1=sc.next();
//        String str2=sc.next();
//        sc.close();
//        HashMap<Character,Integer> map1=new HashMap<>();
//        for(int i=0;i<str1.length();i++){
//            char c=str1.charAt(i);
//            map1.put(c,map1.getOrDefault(c,0)+1);
//        }
//        int j=0;
//        for(;j<str2.length();j++){
//            char c=str2.charAt(j);
//            if(!map1.containsKey(c)){
//                System.out.println(0);
//                break;
//            }else{
//                map1.put(c,map1.get(c)-1);
//            }
//        }
//        if(j==str2.length())System.out.println(1);
//    }
//}

/**
 * #16击鼓传花
 * 学校联欢晚会的时候，为了使每一个同学都能参与进来，主持人常常会带着同学们玩击鼓传花的游戏。游戏规则是这样的：n个同学坐着围成一个圆圈，指定一个同学手里拿着一束花，主持人在旁边背对着大家开始击鼓，鼓声开始之后拿着花的同学开始传花，每个同学都可以把花传给自己左右的两个同学中的一个（左右任意），当主持人停止击鼓时，传花停止，此时，正拿着花没传出去的那个同学就要给大家表演一个节目。
 聪明的小赛提出一个有趣的问题：有多少种不同的方法可以使得从小赛手里开始传的花，
 传了m次以后，又回到小赛手里。对于传递的方法当且仅当这两种方法中，
 接到花的同学按接球顺序组成的序列是不同的，才视作两种传花的方法不同。比如有3个同学1号、2号、3号，并假设小赛为1号，花传了3次回到小赛手里的方式有1->2->3->1和1->3->2->1，共2种。
 */
//import java.util.Scanner;
//public class Main {
// public static void main(String[] args) {
//  Scanner sc=new Scanner(System.in);
//  int n=sc.nextInt();
//  int m=sc.nextInt();
//  sc.close();
//  int[][] dp=new int[m+1][n+1];
//  dp[1][2]=1;dp[1][n]=1;
//  for(int i=2;i<m+1;i++) {
//   for(int j=1;j<n+1;j++) {
//    if(j==1) {
//     dp[i][j]=dp[i-1][2]+dp[i-1][n];
//    }else if(j==n){
//     dp[i][j]=dp[i-1][j-1]+dp[i-1][1];
//    }else {
//     dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1];
//    }
//   }
//  }
//  System.out.println(dp[m][1]);
// }
//}

/**
 * #17小赛的升级之路
 * 小赛经常沉迷于网络游戏。有一次，他在玩一个打怪升级的游戏，他的角色的初始能力值为a。在接下来的一段时间内，他将会依次遇见n个怪物，每个怪物的防御力为b1,b2,b3,…bn。如果遇到的怪物防御力bi小于等于小赛的当前能力值c，那么他就能轻松打败怪物，并且使得自己的能力值增加bi；如果bi大于c，那他也能打败怪物，但他的能力值只能增加bi与c的最大公约数。那么问题来了，在一系列的锻炼后，小赛的最终能力值为多少？
 * 有部分测试未通过的原因是类型太短，改成long即可
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNextInt()) {
//            int n=sc.nextInt();
//            long a=sc.nextInt();
//            int[] b=new int[n];
//            for(int i=0;i<n;i++) {
//                b[i]=sc.nextInt();
//            }
//            for(int i=0;i<n;i++) {
//                if(b[i]<=a) {
//                    a+=b[i];
//                }else {
//                    a+=getNumber(a,b[i]);
//                }
//            }
//            System.out.println(a);
//        }
//        sc.close();
//    }
//    public static long getNumber(long a,long b) {
//        if(a<b)return getNumber(b,a);
//        long c=a%b;
//        if(c==0)return b;
//        else return getNumber(b,c);
//    }
//}











