import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class abc {
    public static  void main(String[] args){
        //helloworld教程 输出一个a字符
        System.out.println('a');
    }
}

public class a1变量声明 {
    public static  void main(String[] args){
        //变量声明 同一个大括号内不允许有重复面变量名 byte数据类型后面的是变量名
        byte num;
        byte a;
        int b;
        //赋值
        num =100;
        System.out.println(num);//此时 num是byte类型的数据 100
    }
}

public class a2遍历声明赋值使用 {
    public static  void main(String[] args){
        //遍历声明 赋值 使用
        byte b1;
                b1=100;
        System.out.println(b1);
                short b2;
                b2=200;
                int i;
                i=100000;
                long l;
                l=1000000;
    }
}

public class a3大数据转小数据 {
    public static  void main(String[] args){
        //
        int i=10;
        String name="123";
        //大数据转小数据
        byte b=(byte) i;
        //数据取整的时候才能用不然会数据丢失 就是说不能有小数点的数据 除非不要小数点
        System.out.println(b);
    }
}
public class a4不同数据类型只能拿大的取接收小的布尔值不参与运算 {
    public static  void main(String[] args){
       int a=10;
       int b=20;
       int i=a+b;
       System.out.println(i);//结果：30

       int e=10;
       double d=20.1;
       double j=e+d;
       //不同数据类型只能拿大的取接收小的

        System.out.println(j);
        int q=10;
        char f='a';//码值97
        int r=q+f;
        System.out.println(r);

        int n=10;
        boolean m=true;
        int k=n+m;//布尔值不参与运算
        System.out.println(k);

        int o=10;
        String str="20";
        System.out.println(str+o);//2010 这里是先用字符加数字 所以字符在前面 结果是2010如果字符在后面是1020

        int y=10;
        int u=20;
        System.out.println("y+u="+y+u);//先乘除后加减    结果是1020
        System.out.println("y+u="+(y+u));//先乘除后加减   结果是30
    }
}
public class abc {
    public static  void main(String[] args){
        //
        int a=10;
        int b=5;
        int c=a-b;
        System.out.println(c);

        int d=10;
        double e=1.5;
        double f=d-e;
        System.out.println(f);

        int g=10 ;
        char h='a';//97
        int i=g-h;
        System.out.println(i);

        String str="40";
        //加减法不能作为数值 +可以作为连接符

        int j=10;
        int k=3;
        int l=j*k;
        System.out.println(l);

        double n=1.5;
        double m=n*k;
        System.out.println(m);

        char o='a';
        int p=o*k;
        System.out.println(p);
        //乘法也不能有字符串
        System.out.println(5+3*2);//先乘除后加减
        System.out.println((5+3)*2);//加括号提升优先级


        System.out.println(((5+3)+5)*2);//让这里等于26
        /*
        想先让5+3然后8+5再乘以2
         5+3
         8+5*2 8+5*2
         */

//java ()小括号永远是优先级 []中括号数组 {}大括号是代码块main方法等


    }
}

public class abc {
    public static  void main(String[] args){
        //除法 “/”整形数据之间的除法 有浮点数据参与的

        int a=10;
        int b=4;
        int c=a/b;//得到的是商数
        int d=a&b;
        System.out.println(c);
        System.out.println(d);

        double e=3;
        double f=a/e;
        System.out.println(f);//3.333...


        double g=-2;
        double h=a/g;
        System.out.println(h);

    }
}

public class abc {
    public static  void main(String[] args){
        //除法百分号取模取(取余数)
        int a=10;
        double b=-3;
        double c=a%b;
        System.out.println(c);//1

    }
}

public class abc {
    public static  void main(String[] args){
       //运算符号++自身+1
        //--自身-1
        int i=10;
        i++;
        int o=10;
        o--;
        System.out.println(i);//11
        System.out.println(o);//9
    }
}
public class abc {
    public static  void main(String[] args){
        //运算符号++自身+1
        //--自身-1
        int i=10;
        int o=i++;//除了++运算还有赋值运算
        //1 肯定是运算i++
        System.out.println(i);//11
        //将i的值赋值给i++这个整体
        System.out.println(o);//10
        //第二个是把i++赋值给o所以o的结果是10
        //++在后面是先赋值再自增
        //++再前面是先自增再赋值
        //将i赋值给i++ 2.i进行自增 3将i++的值赋给j
        int a=10;
        int b=++a;
        //++i会进行a的自增 2将a的值赋值给++a 3.将++a的值赋值给b
        System.out.println(a);//11
        System.out.println(b);//11
    }
}

public class abc {
    public static  void main(String[] args){
        //赋值运算符
        int a=10;//10赋值给a；
        int b=a;//a的值赋给b
        b=20;//把;20赋值给b
        System.out.println(b);//20
        b+=5;
        System.out.println(b);//25
        b-=3;
        System.out.println(b);//22
        b*=2;
        System.out.println(b);//40
        b/=2;
        System.out.println(b);//10(商数)
        b%=2;
        System.out.println(b);//0(余数)
    }
}
public class abc {
    public static  void main(String[] args){
        //关系运算符（比较运算）
        int a=10;
        boolean flag=a>10;
        System.out.println(flag);//结果是falase
        boolean flagg=a<10;
        System.out.println(flagg);//结果是true

        double b=12.5;
        boolean flag1=a>=b;
        System.out.println(flag1);//结果是falase flag1是比较a是否大于等于b b是12.5 所以a比b小 结果不成立
        char c='a';//97
        boolean flag2=a<c;
        System.out.println(flag2);//结果是true因为char a 赋值给c是97 然后int a=10；97比10大
        boolean flag3=b>c;
        System.out.println(flag3);//结果是flase 因为b=12.5 c=97 所以b小于c
        boolean flag4=true;
        System.out.println(flag3);//布尔值布参与运算
        //string也不能比较
        //可以进行比较的只有 byte short int long float double char
    }
}
public class abc {
    public static void main(String[] args) {
        //==判断相等！=判断不相等
        int a=10;
        int b=10;
        boolean c=a==b;
        System.out.println(c);//true 因为a和b相等 所以a和b的结果是true
        int d=11;
        int e=10;
        boolean f=d==e;
        System.out.println(f);//false 因为d是11e是10所以d不和e不相等

        double g=10;//double类型等于10.0
        boolean h=g==a;
        System.out.println(g);//true 值一样就可以跟数据类型无关 如果是10.1就是false 包括char

         boolean flag8=true;
         boolean flag9=true;
         boolean flag10=flag8==flag9;
         System.out.println(flag10);

         String str ="java";
         String str2 ="java";
        boolean str3=str==str2;
        System.out.println(str3);//true

        boolean str4 =a==flag8;//类型要相一致或者兼容
        //不等于同理
    }
}

public class abc {
    public static void main(String[] args) {
        //并且
        //或者
        //非
        //逻辑运算符
        int a=50;
        int b=30;
        boolean flag=a>40&&b>=20;
        //这里用的是双与如果第一个条件不成立就不判断
        System.out.println(flag);//true
        //a大于40并且b大于20返回true 要满足两个条件
        int c=50;
        int d=10;
        boolean flag1=c>40&&d>=20;
        //这里用的是双与如果第一个条件不成立就不判断
        //如果是单与的话第一个不成立第二个也要判断
        System.out.println(flag1);//false
        //d是10不大于20所以是false
    }
}

public class abc {
    public static void main(String[] args) {
        //并且
        //或者
        //非
        //逻辑运算符
        int a =50;
        int b=10;
        boolean c=a++>50&&b++>5;
        System.out.println(c);//flase 因为&&短路了b不执行 所以是10 如果是&b执行等于11
    }
}

public class abc {
    public static void main(String[] args) {
        //或者 ||双或 和单或|
        int d=20;
        int e=30;
        boolean f=d>50||e>10;
        System.out.println(f);//true 只要成立一个酒返回出 或者两个都成立 第一个不成立第二个成立了

        System.out.println(!(d>10));//这个是取反 原来的结果是true返回false 原来结果是false返回true
//        亦或
//                ^相同为false 不相同为true
//            false ^false相同
//                    false^true不相同
        System.out.println(d>10^e>20);//flase因为两个都是true是相同的
        System.out.println(d>100^e>20);//true因为d是false一个是true所以返回true
    }
}
public class abc {
    public static void main(String[] args) {
        //三元运算符 条件？值1：值2 条件成立返回1 不成立返回2
        int a =10;
        String str= a>10?"1":"2";
        System.out.println(str);//a小于等于10所以a不大于10返回2
        String str1= a>=10?"1":"2";
        System.out.println(str1);//a大于等于10就返回1因为a=10
        // 接收类型要兼容
         }
}
public class abc {
    public static void main(String[] args) {
        //位运算符 跟二进制有关 左移<<:相当于乘以2的几次方 右移>>相当于除以2的几次方 无符号右移>>>
        System.out.println(5<<3);//等于5*2的三次方
        System.out.println(10<<4);//等于10*4的四次方
        /*
        00001010
        10100000
        */
        //二进制2的三次方和2的四次方
        //然后乘以5或10
        System.out.println(5>>3);//5除以2的三次方 5/8
        System.out.println(10>>3);//10除以2的三次方
        /*
        00000101
        00000101
        */
    }
}


//分支和选择分支
//单分支
public class 单分支 {
    public static  void main(String[] args){
        //
        java.util.Scanner xiaoming=new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji=xiaoming.nextDouble();

        if(chengji>90){
            System.out.println("奖励一百亿");
        }
    }
}

public class 双分支判断 {
    public static  void main(String[] args){
        //
        //当你其中一个条件成立 是不会往下执行代码的 这是按顺序执行代码的
        java.util.Scanner xiaoming=new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji=xiaoming.nextDouble();
        //如果上面输入的成绩大于90就进入第一个判断
        //（）小括号是条件 大括号是代码块
         if(chengji>90)
         {
             System.out.println("奖励网红一位");
         }
         //如果是90分以下就进入第二个判断
         else{
             System.out.println("奖励少妇一位");
         }
    }
}
public class 多分支判断 {
    public static  void main(String[] args){
        //
        java.util.Scanner xiaoming=new java.util.Scanner(System.in);
        System.out.println("请输入小明的java成绩");
        double chengji=xiaoming.nextDouble();
//当你其中一个条件成立 是不会往下执行代码的 这是按顺序执行代码的
        if(chengji==100){
            System.out.println("奖励九百九十九百亿");
        } else if (chengji>90)
        {
            System.out.println("奖励网红一名");
        }else if (chengji>70){
            System.out.println("奖励少妇一名");
        }else if (chengji>60){
            System.out.println("奖励空气");
        }

    }
}

public class 流程控制 {
    public static  void main(String[] args){
        //输入
        int a = 10;
        //a=20;
        System.out.println(a);
        //1准备输入工具
        java.util.Scanner mingzidingyi = new java.util.Scanner(System.in);
        //2.准备输入入口
        //a.整型数据
        System.out.println("请输入一个数字");
        //mingzidingyi.nextInt();//将这个代码看作用户输入的数据
        //nextInt是整数型数据
        int num = mingzidingyi.nextInt();
        System.out.println(num);//用户输入的这个可以用来做其他的运算
        //例如
        System.out.println(num+10);
        //这个就是当int a =10；执行完之后还没有结束 要再这里输入一个东西才能运行结束 这里是int输入数字
        System.out.println("带小数的数据");
        double num1=mingzidingyi.nextDouble();
        System.out.println(num1+10);
        System.out.println("字符");
        String name=mingzidingyi.next();
        String name1=(name+10);
        System.out.println(name1);
        //nextLine是读取一整行的数据
        String name2=mingzidingyi.nextLine();
        System.out.println(name2);
        //nextLine有缺点 点击空格的时候会直接结束
    }
}



public class while循环 {
    public static  void main(String[] args){
        /*循环的类型分别有：
        while
            for
                do-while
                    foreach*/
        //作用提高复用性和拓展性
        //语法 while（循环条件）{代码块}
        //原理：循环条件成立，则执行代码块。执行完代码块，会再次回到循环条件判断的位置
        //如果条件依然成立，则再次执行代码块，直到循环条件不成立为止 寻呼那条件结束
        /*控制循环次数
        1循环因子
            2循环条件
                3循环因子值的改变*/
        int i=0;//这个就是循环因子 执行这一行的时候i=0
         while (i<5){ //执行这一行的时候i<5是成立的因为i等于0
             System.out.println("奖励九百九十九百亿"+i);//这里有一个+i的情况下 结果里面会从0开始循环01234依次循环出来
         i++;//循环银子值的改变 执行这个代码的时候这个i会++成1 因为0+1 1再回到461行 1小于5成立直到加到5停止条件不成立
         }
//这里会把sou输出五遍
    }
}
public class while循环嵌套 {
    public static  void main(String[] args){

        /*
            三行四列
        *   ****
        *   ****
        *   ****
        * */
        int i =0;
        while (i<3){//控制行数 i是行数的循环因子
            //System.out.println("****");
            //再写一个循环控制每行的星号数量
            int j=0;
            while (j<4){
                System.out.print("*");//这里不用ln因为*号输出不能换行 要在同一行输出
                j++;//这里循环四次就是****
            }
            System.out.println("*");//这个加ln是换行用的 当里面的 j 打印完了一行之后换行
            i++;//这里循环三次就是*
                //             *
                //             *
        }

        }
}
//for循环和while循环什么时候用？ 确定循环次数得情况加用for循环不确定循环次数的情况下用while循环
public class for循环 {
    //for循环对比while循环的优势是：将while循环的控制循环次数的三个要素总结到一个地方（循环因子; 循环条件; 循环因子值得改变 小括号就是循环因子得声明包括前面得东西要加;;）
    public static  void main(String[] args) {

        // 1->2->4->3这里是一次循环 循环结束后继续从 2->4->3 直到结束
     //执行顺序  1、     2、  3
        for (int i =0;i<10;i++){

            System.out.println(+i);//4//循环十次 十条0-9
//也可以把i++写在代码里
            //i++;
            //如果代码里和条件里都写i++就会自增两次 得到得结果就是02468
        }

    }
}


//do-while语法：do{代码块} while(循环条件)
//原理：先执行代码块，然后判断循环条件。如果条件成立则继续执行代码块。如果条件不成立，则循环结束。
//特点 dowhile循环至少执行一次
//使用场景 不确定循环次数的情况
public class dowhile循环 {
    //for循环对比while循环的优势是：将while循环的控制循环次数的三个要素总结到一个地方（循环因子; 循环条件; 循环因子值得改变 小括号就是循环因子得声明包括前面得东西要加;;）
    public static  void main(String[] args) {
            int i =0;
        do{
            System.out.println("hello java"+i); //结果是01234五条sou
        i++;
        } while(i<5);

    }
}
//跳转结构 break & continue
//switch 不支持long、float double、boolean类型 浮点类型都不可以
//用于结束当前switch
public class switch用在结束前的break {
    public static  void main(String[] args){
        int i =1;
        switch(i){
            case 1:
                System.out.println("字符");
                break;//现在int是等于1 在这里break 但是 没写break的情况下会有case12两个结果
            case 2:
                System.out.println("字符2");
                break;
            case 3:
                System.out.println("字符3");
                break;
            case 4:
                System.out.println("字符4");
                break;
            default:
                System.out.println("字符5");
                break;

        }
    }
}
//用在循环内while，for，do-while,foreach
//用于结束当前循环
public class 用在循环内的break {
    public static  void main(String[] args){
        //老方法 需求输入-1的时候结束
    /*java.util.Scanner input=new java.util.Scanner(System.in);//输入入口
    boolean flag=true;//布尔值
    while(flag){
        System.out.println("请输入一个整数");
        int num=input.nextInt();
        if(num==-1)
            flag=false;
    }*/
        while(true){
            java.util.Scanner input=new java.util.Scanner(System.in);
            System.out.println("请输入一个整数");
            int num=input.nextInt();
            if(num==-1)
                break;//可以直接用break结束循环
        }
        //嵌套里有break的情况
        //执行顺序 先执行 i=0 再执行i<3 然后大括号 然后i++
        for(int i=0;i<3;i++){
            for (int j=0;j<5;j++) { //i=0的情况 j会从0-4走一遍 等于1一遍 2一遍
                System.out.println(j);//输出结果是三遍01234
                if(j==3){
                    break;//立即结束当前（break外层的）循环 家上这个的情况下循环走到3就立即结束 不会走到4
                //此时结果是0123
                //如果把上面的sou放在break下面的话 结果就是012 因为j==3没来得及执行
                }
            }
        }




        //如果有需求 j==3结束外循环
        for(int i=0;i<3;i++){
            for (int j=0;j<5;j++) {
                System.out.println(j);
                if(j==3){
                    i=4;
                    break;//这是简单的方式结束外循环
                }
            }
        }
        //另外的方式结束外循环
        boolean flag=false;
        for(int i=0;i<3;i++){
            for (int j=0;j<5;j++) {
                System.out.println(j);//0123
                if(j==3){
                    flag=true;
                break;
                }
            }
            if(flag)
                break;
        }
    }
}



