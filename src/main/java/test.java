import java.util.*;

/**
 * Project name(项目名称)：Character类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/1
 * Time(创建时间)： 21:45
 * Version(版本): 1.0
 * Description(描述)：
 * Character 类是字符数据类型 char 的包装类。Character 类的对象包含类型为 char 的单个字段，这样能把基本数据类型当对象来处理
 * Character类的常用方法
 * 方法	                       描述
 * void Character(char value)	构造一个新分配的 Character 对象，用以表示指定的 char 值
 * char charValue()	返回此 Character 对象的值，此对象表示基本 char 值
 * int compareTo(Character anotherCharacter)	根据数字比较两个 Character 对象
 * boolean equals(Character anotherCharacter)	将此对象与指定对象比较，当且仅当参数不是 null，而 是一个与此对象
 * 包含相同 char 值的 Character 对象时， 结果才是 true
 * boolean isDigit(char ch)	确定指定字符是否为数字，如果通过 Character. getType(ch) 提供的字
 * 符的常规类别类型为 DECIMAL_DIGIT_NUMBER，则字符为数字
 * boolean isLetter(int codePoint)	确定指定字符（Unicode 代码点）是否为字母
 * boolean isLetterOrDigit(int codePoint)	确定指定字符（Unicode 代码点）是否为字母或数字
 * boolean isLowerCase(char ch)	确定指定字符是否为小写字母
 * boolean isUpperCase(char ch)	确定指定字符是否为大写字母
 * char toLowerCase(char ch)	使用来自 UnicodeData 文件的大小写映射信息将字符参数转换为小写
 * char toUpperCase(char ch)	使用来自 UnicodeData 文件的大小写映射信息将字符参数转换为大写
 */

@SuppressWarnings("all")
public class test
{
    public static int getIntRandom(int min, int max)         //空间复杂度和时间复杂度更低
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static int getIntRandom1(int min, int max)          //获取int型的随机数
    {
        if (min > max)
        {
            min = max;
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Character ch = new Character('d');
        Character ch1 = 'q';
        System.out.println(ch1.charValue());
        System.out.println(ch);
        //根据数字比较两个 Character 对象
        System.out.println(ch.compareTo(ch1));
        System.out.println(ch.compareTo('e'));
        System.out.println(ch.compareTo('a'));
        System.out.println(ch.compareTo('d'));
        //将此对象与指定对象比较，当且仅当参数不是 null，而 是一个与此对象
        //包含相同 char 值的 Character 对象时， 结果才是 true
        System.out.println(ch.equals(ch1));
        System.out.println(ch.equals('d'));
        //确定指定字符是否为数字，如果通过 Character. getType(ch) 提供的字
        //符的常规类别类型为 DECIMAL_DIGIT_NUMBER，则字符为数字
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isDigit('3'));
        //确定指定字符（Unicode 代码点）是否为字母
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isLetter('5'));
        //确定指定字符（Unicode 代码点）是否为字母或数字
        System.out.println(Character.isLetterOrDigit('4'));
        System.out.println(Character.isLetterOrDigit('o'));
        //确定指定字符是否为小写字母
        System.out.println(Character.isLowerCase('e'));
        System.out.println(Character.isLowerCase('E'));
        //确定指定字符是否为大写字母
        System.out.println(Character.isUpperCase('p'));
        System.out.println(Character.isUpperCase('P'));
        //使用来自 UnicodeData 文件的大小写映射信息将字符参数转换为小写
        System.out.println(Character.toLowerCase('B'));
        System.out.println(Character.toLowerCase('b'));
        //使用来自 UnicodeData 文件的大小写映射信息将字符参数转换为大写
        System.out.println(Character.toUpperCase('B'));
        System.out.println(Character.toUpperCase('b'));
        LinkedList<Character> p = new LinkedList<>();
        Character ch2;
        for (int i = 0; i < 50; i++)
        {
            ch2 = (char) getIntRandom(97, 122);
            p.add(ch2);
        }
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);
        Collections.sort(p, (ch11, ch22) -> ch22 - ch11);
        System.out.println(p);
        Collections.sort(p, Character::compareTo);
        System.out.println(p);
        System.out.println("小于等于h：");
        System.out.println("数量：" + p.stream().filter(ch11 -> ch11 <= 'h').count());
        System.out.println(Arrays.stream(p.stream().filter(ch11 -> ch11 <= 'h').toArray()).toList());
        System.out.println("转大写：");
        for (int i = 0; i < p.size(); i++)
        {
            p.addLast(Character.toUpperCase(p.removeFirst()));
        }
        System.out.println(p);

        boolean con;
        con = Register.validateUser("1254", "5ui6", "12");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("sfr3t", "456", "16");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("weqrui", "~", "16");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("sfrrtt", "456", "123");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("sfrrtt", "456", "0");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("", "", "");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        con = Register.validateUser("sfrrtt", "456", "18");
        if (con)
        {
            System.out.println("验证成功！");
        }
        else
        {
            System.out.println("验证失败！");
        }
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
